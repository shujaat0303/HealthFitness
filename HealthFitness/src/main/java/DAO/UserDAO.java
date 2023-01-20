/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import project.UserDetails.User;

/**
 *
 * @author perfect solution
 */
public class UserDAO {
    public static void save(User user) {
        String query = "INSERT INTO user(name,email,password,mobileNumber,age,height,weight,gender,premium) values('" + user.getName() + "','" + user.getEmail()+ "','" + user.getPassword()+  "','" 
                + user.getMobileNumber()+ "','" + user.getAge() + "','"+user.getHeight()+"','"+user.getWeight()+"','"+user.getGender()+"','"+user.isPremium()+"')";
        DbOperations.setDataOrDelete(query, "Registered Successfully!");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            String query = "SELECT * FROM user WHERE email = '"+email+"' AND password = '"+password+"'";
            ResultSet rs = DbOperations.getData(query);
            while(rs.next())
            {
                user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAge(rs.getInt("age"));
                user.setHeight(rs.getInt("height"));
                user.setWeight(rs.getInt("weight"));
                user.setGender(rs.getString("gender"));
                user.setPremium(rs.getBoolean("premium"));
                
                
                        
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static void updatePassword(User user, String password)
    {
        String query = "UPDATE  user SET password = '"+password+"' WHERE ID='"+user.getId()+"'";
        DbOperations.setDataOrDelete(query, "Updated Successfully!");

    }
    
    public static void updateUser(User user)
    {
        String query = "UPDATE user SET name ='"+user.getName()+"',"
                + " password ='"+user.getPassword()+"',"
                + " email ='"+user.getEmail()+"',"
                + " mobileNumber ='"+user.getMobileNumber()+"',"
                + " age ='"+user.getAge()+"',"
                + " height ='"+user.getHeight()+"',"
                + " weight ='"+user.getWeight()+"',"
                + " gender ='"+user.getGender()+"',"
                + " premium ='"+user.isPremium()+"' WHERE ID = '"+user.getId()+"'";
        DbOperations.setDataOrDelete(query, "Updated Successfully!");
    }
}
