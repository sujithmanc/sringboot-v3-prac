//package tech.suji.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@EnableTransactionManagement
//@EnableJpaRepositories(
//		entityManagerFactoryRef = "entityManagerFactory",
//		basePackages = {
//				"tech.suji.db1.repo"
//		}
//		)
//public class DB1Config {
//	
//	
//	@ConfigurationProperties(prefix = "spring.db1.datasource")
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}
//	
//	
//}
