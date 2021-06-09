import java.sql.*;

public class JdbcDAODemo {

	public static void main(String[] args) throws Exception {
		StudentDAO dao= new StudentDAO();
//		dao.connect();
//		Student s1 = dao.getStudent(15); // for fetching
//		System.out.println(s1.sname);
		
		Student s2 = new Student();
		s2.rollno = 16;
		s2.sname = "naveena";
		dao.connect();
		dao.addStudent(s2);
	}

}

class StudentDAO{
	
	Connection con = null;
	public void connect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/arun", "root", "123");
	}
	
	public Student getStudent(int rollno) throws Exception {
 
		String query = "select sname from student where rollno="+rollno ;
		Student s = new Student();
		s.rollno = rollno;
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/arun", "root", "123");		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString(1);
		
		s.sname = name;	
		
		return s;
	}
	
	public void addStudent(Student s) throws Exception{
		String query = "insert into student values(?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, s.rollno);
		pst.setString(2, s.sname);
		pst.executeUpdate();
	}
}


class Student{
	int rollno;
	String sname;
}