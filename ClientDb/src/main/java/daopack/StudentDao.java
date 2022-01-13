package daopack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	
	@Autowired
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	public void addStudent(int id, String fname, String lname) {
		try {
			Connection cc = ds.getConnection();
			String sql = "insert into student values(?,?,?)";
			PreparedStatement ps = cc.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
