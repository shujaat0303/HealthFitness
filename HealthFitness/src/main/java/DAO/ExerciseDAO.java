/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.UserDetails.Exercise;
import project.UserDetails.User;

/**
 *
 * @author perfect solution
 */
public class ExerciseDAO {
    public static ArrayList<Exercise> getExercises() {
        ArrayList<Exercise> list=new ArrayList<>();
        try {
            String query = "SELECT * FROM exercises";
            ResultSet rs = DbOperations.getData(query);
            while(rs.next())
            {
                Exercise e = new Exercise();
                e.setId(rs.getInt("ID"));
                e.setName(rs.getString("name"));
                e.setProcedure(rs.getString("procedure"));
                e.setImage(rs.getString("image"));
                list.add(e);           
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
public static Exercise getExercise(int id) {
        Exercise exercise = null;
        try {
            String query = "SELECT * FROM exercises WHERE Id='"+id+"'";
            ResultSet rs = DbOperations.getData(query);
            
            while(rs.next())
            {
                exercise = new Exercise();
                exercise.setId(rs.getInt("ID"));
                exercise.setName(rs.getString("name"));
                exercise.setProcedure(rs.getString("procedure"));
                exercise.setDesc(rs.getString("description"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exercise;
    }    
    
    
    
    public static void saveRoutine(User user,Exercise exercise)
    {
        
        String query = "INSERT INTO routine(UserID,ExerciseID,Reps,Sets) values('" + user.getId()+ "','" + exercise.getId()+ "','" + exercise.getReps()+  "','" 
                + exercise.getSet()+ "')";
        DbOperations.setDataOrDelete(query, "Added to routine");
    
    }
    public static void deleteRoutine(User user)
    {
        
        String query = "DELETE * FROM routine WHERE UserID = '"+user.getId()+"'";
        DbOperations.setDataOrDelete(query, "Routine Deleted");
    
    }
    
    public static ArrayList<Exercise> getRoutine(User user)
    {
        ArrayList<Exercise> list=new ArrayList<>();
        try {
            String query = "SELECT * FROM routine JOIN "
                    + "exercises ON routine.ExerciseId=exercises.ID "
                    + "WHERE routine.UserId = '"+user.getId()+"'";
            ResultSet rs = DbOperations.getData(query);
            while(rs.next())
            {
                Exercise e = new Exercise();
                
                e.setName(rs.getString("exercises.name"));
                e.setProcedure(rs.getString("exercises.procedure"));
                e.setReps(rs.getInt("routine.reps"));
                e.setSet(rs.getInt("routine.sets"));
                e.setImage(rs.getString("exercises.image"));
                list.add(e);           
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    

    
    
    
    public static void main(String[] args) {
        User user= new User();
        user.setId(1);
        ArrayList<Exercise> list = ExerciseDAO.getRoutine(user);
        
        
        for(int i =0 ; i<list.size();i++)
        {
            System.out.println(list.get(i).getName()+": "+ list.get(i).getReps()+list.get(i).getSet());
        }
    }
    
    
}
