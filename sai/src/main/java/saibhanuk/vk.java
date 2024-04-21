package saibhanuk;
import java.io.IOException;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/db")
public class vk extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String a = req.getParameter("un").toString();
		String b = req.getParameter("pw").toString();
		String sql = "select * from details";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123");
			Statement st  = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String un = rs.getString(1);
				String pw = rs.getString(2);
				if((un.equals(a)) && (pw.equals(b))) {
	
					System.out.println("hii");
					RequestDispatcher rd = req.getRequestDispatcher("m3.html");
					rd.forward(req, res);
					
				}
			}
			System.out.println("bye");
			RequestDispatcher rd = req.getRequestDispatcher("m1.html");
			rd.forward(req, res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
