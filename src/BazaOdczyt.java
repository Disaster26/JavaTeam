import java.sql.*;
public class BazaOdczyt extends Liquidy{

	
	void BazaOdczyt(){
		
		try{
		    Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://serwer1596524.home.pl:3306/17130806_0000005","17130806_0000005","qwertyu12");
			String query = "Select * From Liquidy";
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				Firmaa=rs.getString("Firma");
				Smakk=rs.getString("Smak");
				Kroplaa=rs.getString("Krople");
				MLL=rs.getString("ML");
			}
		}

		catch(Exception e)
		{
			System.err.println(e);
		}
		}
	}
	

