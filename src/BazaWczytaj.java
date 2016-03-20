import java.sql.*;

 public class BazaWczytaj extends Liquidy{
  
  void Baza(){
       // połączenie z bazą danych 
    String url = "jdbc:mysql://serwer1596524.home.pl:3306/17130806_0000005";
    String username="17130806_0000005";
    String password="qwertyu12"; 
       
      // zapisanie treści zapytania do zmiennej
       
     
     String qwerty= "insert into Liquidy (Firma, Smak, Krople, ML) values ('"+Firma+"','"+Smak+"','"+Kropla+"','"+ML+"')";
      try
       {   
           Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection(url, username, password);
        
        Statement zapytanie = conn.createStatement();
           zapytanie.executeUpdate(qwerty);
           conn.close();
       }
       catch (SQLException e){
         System.out.println("Coś poszło nie tak");
       }
       catch (ClassNotFoundException e){
        System.out.println("Problem ze sterownikiem.");
       }
     }
  }