
import static Books.BookAction.book;
import User.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author selen
 */
public class ConnectionDB {
    private String kullanıcıAdi="root";
   private String parola="";
   private String host="localhost";
   private int port =3306;
   private String dbAdi="library";
   private Connection con=null;
  
   private PreparedStatement preparedStatement;
   
   public ConnectionDB(){
       
       String url="jdbc:mysql://"+host+":"+port+"/"+dbAdi+"?useUniversalcode=true&characterEncoding=utf8";
       try{  
       Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
         System.out.println("class NOT FOUND");
        } 
       try {
           con=DriverManager.getConnection(url,kullanıcıAdi,parola);
           System.out.println("Successful Connection");
       } catch (SQLException ex) {
           System.out.println("Connection Not Found");
       }
   }
       public void addUser(User user){
         
           String sql="insert into users (Id,Name,Surname,Age,Gender) values(?,?,?,?,?)";
        try {
            preparedStatement=(PreparedStatement)con.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println("ex");
        }
          
          
               try {
                   preparedStatement.setInt(1, user.getId());
                   preparedStatement.setString(2,user.getName());
                   preparedStatement.setString(3,user.getSurname());
                   preparedStatement.setInt(4,user.getAge());
                   preparedStatement.setString(5,user.getGender());
                   
                   
                   preparedStatement.executeUpdate();
                   
                   
               } catch (SQLException ex) {
                   System.out.println(ex);
               }          
       }
       
  }
