package Cab_Booking;
import java.sql.*; 


public class ConnectionClass
{
    
     Connection c;
    Statement s;
    public ConnectionClass()
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/CabBooking_system?zeroDateTimeBehavior=CONVERT_TO_NULL","root","shivani3299");
            s =c.createStatement();
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }
     public static void main(String args[]){
        new ConnectionClass();
    }
}  
