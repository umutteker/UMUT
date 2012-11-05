/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.wicket;
import com.mysql.jdbc.Driver;
import java.sql.Connection;  
import java.sql.DriverManager;

/**
 *
 * @author MSelim
 */
public class DBConnector {
    public String []Errors;
   void connect(String username,String password) {  
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection connection = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306", username, password); 
            }  
         catch (Exception e) {  
            e.printStackTrace();  
        }  
}
   void ErrorHandling(){
       
       
     Errors = new String[20];
     Errors[0]="Cannot Built Connection With Database";
     Errors[1]="Implementation is Failed";
     Errors[2]="Deletion is Failed";
     Errors[3]="Editing is Failed";
     Errors[4]="Some Problems are occured while getting information From Database"; 
     }
   
   void PrintError(int i){
       System.out.println(Errors[i]);
   }
   
}