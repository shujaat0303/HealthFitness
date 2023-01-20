/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.UserDetails.Sleep;
import project.UserDetails.User;

/**
 *
 * @author perfect solution
 */
public class SleepDAO {

    public static void save(User user, Sleep sleep) {
        

        String query = "INSERT INTO sleep(User_ID,Time,Date) values('" + user.getId() + "','" + sleep.getTime() + "','" + sleep.getDate().toString() + "')";
        DbOperations.setDataOrDelete(query, "Sleep Db Updated!");
    }
    
    public static ArrayList<Sleep> getSleepData(User user)
    {
        ArrayList<Sleep> list = new ArrayList<>();
        try {
            String query = "SELECT Date,SUM(Time) FROM sleep WHERE User_ID = '"+user.getId()+"' GROUP BY Date";
            ResultSet rs = DbOperations.getData(query);
            while(rs.next())
            {
                Sleep obj = new Sleep(rs.getFloat(2));
                obj.setDate(LocalDate.parse(rs.getString("Date")));
                
                list.add(obj);
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
}
