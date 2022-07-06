import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class demoClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/vanditadb";
		String usr="root";
		String pass="password";
		String sql="select * from table1";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,usr,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		System.out.println(rs.getString(1)+" "+rs.getString(2));
	}

}