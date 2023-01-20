/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author perfect solution
 */
public class DbOperations {
    public static void setDataOrDelete(String Query, String msg)
    {
        try
        {
            Connection con = ConnectionProvider.establishConnection();
            Statement  st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
            {
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String Query)
    {
        try
        {
            Connection con = ConnectionProvider.establishConnection();
            PreparedStatement pstmt = con.prepareStatement(Query);
            ResultSet rs = pstmt.executeQuery();
            return rs;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
