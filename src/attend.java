
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshit
 */
public class attend {
    public static int entry()
    {
     try {
            Class.forName("java.sql.DriverManager");
            Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/RETAIL","root","QWERTY");
            Statement S = C.createStatement();
            LocalDateTime myDateObj1 = LocalDateTime.now();
            DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
             String Entry_date = myDateObj1.format(myFormatObj1);
            LocalDateTime myDateObj2 = LocalDateTime.now();
             DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("HH:mm:ss");
            String Entry_time = myDateObj2.format(myFormatObj2);
            String uid=String.valueOf(user_id.u_id());
            String query="INSERT INTO ATTENDANCE VALUES("+uid+",'"+Entry_date+"','"+Entry_time+"',null,null);"; 
            S.executeUpdate(query);
            }

        catch(ClassNotFoundException e) {
           
        } catch (SQLException e) {
            
        }
        return 0;
    }
    
}
