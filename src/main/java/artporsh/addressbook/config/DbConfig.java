package artporsh.addressbook.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Configuration
public class DbConfig {
	@Bean
	public DataSource getDataSource() {
		final String DB_URL = "jdbc:mysql://localhost:3306/address_book_data"; // DB file will appear in C:/Users/userName/address_book.mv.db
		final String DB_USER = "sqluser";
		final String DB_PASSWORD = "sqluserpw";		
		
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL(DB_URL);
		dataSource.setUser(DB_USER);
		dataSource.setPassword(DB_PASSWORD);
		
		return dataSource;
	}
}
