package saibhanuk;
import java.io.IOException;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/smart")
public class pvk extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("success");
		String a = req.getParameter("un").toString();
		String b = req.getParameter("pw").toString();
		String sql = "insert into details values(?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123");
			PreparedStatement st  = con.prepareStatement(sql);
			st.setString(1, a);
			st.setString(2, b);
			int rs = st.executeUpdate();
			System.out.println("success");
			RequestDispatcher rd = req.getRequestDispatcher("m1.html");
			rd.forward(req, res);
		}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
