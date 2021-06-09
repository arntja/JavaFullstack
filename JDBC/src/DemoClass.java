import	java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "123";
		int userid = 11;
		String userName = "abhi";
		//String query = "select userName from student where userid = 3;";
		//String query = "select * from student;";
		//String query = "insert into student values(9,'teja');";
		//String query = "insert into student values(" + userid +",'" + userName +"');";
		String query = "insert into student values(?,?);";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, userName);
		//ResultSet rs = st.executeQuery(query);
		int count = st.executeUpdate();
		
//		while(rs.next()) {
//		String name = rs.getInt(1)+ " : "+ rs.getString(2);
//		System.out.println(name);
//		}
		
		System.out.println(count + " rows affected");
		
		st.close();
		con.close();
		
	}

}
