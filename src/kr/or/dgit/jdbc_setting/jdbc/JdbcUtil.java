package kr.or.dgit.jdbc_setting.jdbc;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	public static void close(Connection con){
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("1");
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement pstmt) {
		if(pstmt != null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("2");
				e.printStackTrace();
			}
		}
		
	}

	public static void close(ResultSet rs) {
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("3");
				e.printStackTrace();
			}
		}
		
	}

	public static void close(OutputStreamWriter dos) {
		if(dos != null){
			try {
				dos.close();
			} catch (IOException e) {
				System.out.println("4");
				e.printStackTrace();
			}
	
		}
	}
}
