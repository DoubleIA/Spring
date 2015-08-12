package springtest2;


import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DatasourceTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("datasource.xml");
		DataSource ds = ctx.getBean("dataSource", DataSource.class);
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("insert into news_inf values(null, ?, ?)");
		pstmt.setString(1, "double1");
		pstmt.setString(2, "blues1");
		pstmt.executeUpdate();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
		System.out.println("Go and see if database is updated");
	}
}
