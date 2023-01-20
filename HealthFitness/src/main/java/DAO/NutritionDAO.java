/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.UserDetails.Nutrition;
import java.sql.*;
import project.UserDetails.User;

/**
 *
 * @author Sohail Kazmi
 */
public class NutritionDAO {

    public static ArrayList<Nutrition> getAllData() {
        ArrayList<Nutrition> nutList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("Select * from Nutrition");
            while (rs.next()) {
                Nutrition nut = new Nutrition();
                nut.setId(rs.getInt("ID"));
                nut.setName(rs.getString("Name"));
                nut.setQuantity(rs.getString("Quantity"));
                nut.setCal(rs.getString("Calories"));
                nut.setUnit(rs.getString("Unit"));
                nutList.add(nut);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nutList;
    }

    public static ArrayList<Nutrition> filterAllDataByName(String name) {
        ArrayList<Nutrition> nutList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("Select * from Nutrition where Name like '%" + name + "%'");
            while (rs.next()) {
                Nutrition nut = new Nutrition();
                nut.setId(rs.getInt("ID"));
                nut.setName(rs.getString("Name"));
                nut.setQuantity(rs.getString("Quantity"));
                nut.setCal(rs.getString("Calories"));
                nut.setUnit(rs.getString("Unit"));
                nutList.add(nut);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nutList;
    }

    public static Nutrition getNutritionByName(String name) {
        Nutrition n = new Nutrition();
        try {
            ResultSet rs = DbOperations.getData("Select * from Nutrition where Name = '" + name + "'");
            while (rs.next()) {
                n.setName(rs.getString(2));
                n.setCal(rs.getString(3));
                n.setQuantity(rs.getString(4));
                n.setUnit(rs.getString(5));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, name);
        }
        return n;
    }

    public static void save(User user,Nutrition nutrition) {
        String query = "INSERT INTO UserNutrition(User_Id,Calories,Date) values('" + user.getId() + "','" + nutrition.getCal() + "','"+nutrition.getDate()+"')";
        DbOperations.setDataOrDelete(query, "Added Successfully!");
    }
    
    public static ArrayList<Nutrition> filterAllDataByDate(String date) {
        ArrayList<Nutrition> nutList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("Select * from UserNutrition where Date like '%" + date + "%'");
            while (rs.next()) {
                Nutrition nut = new Nutrition();
                nut.setDate(rs.getString("Date"));
                nut.setCal(rs.getString("Calories"));
                nutList.add(nut);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nutList;
    }
    
    public static ArrayList<Nutrition> getCalIntakeData(User user) {
        ArrayList<Nutrition> nutList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("Select Date,SUM(Calories) from UserNutrition WHERE User_Id='"+user.getId()+"' GROUP BY Date");
            while (rs.next()) {
                Nutrition nut = new Nutrition();
                nut.setDate(rs.getString("Date"));
                nut.setCal(rs.getString(2));
                nutList.add(nut);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nutList;
    }
}
