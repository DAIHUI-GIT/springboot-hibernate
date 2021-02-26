package com.example.springboot.hibernate.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {

	// private Logger logger = LoggerFactory.getLogger(DruidConfig.class);
	//
	// @Value("${spring.datasource.url}")
	// private String dbUrl;
	//
	// @Value("${spring.datasource.username}")
	// private String username;
	//
	// @Value("${spring.datasource.password}")
	// private String password;
	// @Value("${spring.datasource.test-druid.driver-class-name}")
	// private String driverClassName;
	//
	// @Value("${spring.datasource.druid.initial-size}")
	// private int initialSize;
	//
	// @Value("${spring.datasource.druid.min-idle}")
	// private int minIdle;
	//
	// @Value("${spring.datasource.druid.max-active}")
	// private int maxActive;
	//
	// @Value("${spring.datasource.druid.max-wait}")
	// private int maxWait;
	//
	// @Value("${spring.datasource.druid.time-between-eviction-runs-millis}")
	// private int timeBetweenEvictionRunsMillis;
	//
	// @Value("${spring.datasource.druid.min-evictable-idle-time-millis}")
	// private int minEvictableIdleTimeMillis;
	//
	// @Value("${spring.datasource.druid.test-while-idle}")
	// private boolean testWhileIdle;
	//
	// @Value("${spring.datasource.druid.test-on-borrow}")
	// private boolean testOnBorrow;
	//
	// @Value("${spring.datasource.druid.test-on-return}")
	// private boolean testOnReturn;
	//
	// @Value("${spring.datasource.druid.pool-prepared-statements}")
	// private boolean poolPreparedStatements;
	//
	// @Value("${spring.datasource.druid.max-pool-prepared-statement-per-connection-size}")
	// private int maxPoolPreparedStatementPerConnectionSize;
	//
	// @Value("${spring.datasource.druid.filters}")
	// private String filters;

	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	// @Primary
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();

		// datasource.setUrl(this.dbUrl);
		// datasource.setUsername(this.username);
		// datasource.setPassword(this.password);
		// datasource.setDriverClassName(this.driverClassName);
		// // configuration
		// datasource.setInitialSize(this.initialSize);
		// datasource.setMinIdle(this.minIdle);
		// datasource.setMaxActive(this.maxActive);
		// datasource.setMaxWait(this.maxWait);
		// datasource.setTimeBetweenEvictionRunsMillis(this.timeBetweenEvictionRunsMillis);
		// datasource.setMinEvictableIdleTimeMillis(this.minEvictableIdleTimeMillis);
		// datasource.setTestWhileIdle(this.testWhileIdle);
		// datasource.setTestOnBorrow(this.testOnBorrow);
		// datasource.setTestOnReturn(this.testOnReturn);
		// datasource.setPoolPreparedStatements(this.poolPreparedStatements);
		// datasource.setMaxPoolPreparedStatementPerConnectionSize(this.maxPoolPreparedStatementPerConnectionSize);
		// try {
		// datasource.setFilters(this.filters);
		// } catch (SQLException e) {
		// logger.error("druid configuration init fail!");
		// }
		return datasource;
	}

	// @Bean
	// public ServletRegistrationBean statViewServlet(){
	// ServletRegistrationBean bean = new ServletRegistrationBean(new
	// StatViewServlet(),"/druid/*");
	// Map<String,String > initParams = new HashMap<>();
	// initParams.put("loginUsername","admin");
	// initParams.put("loginPassword","123456");
	// initParams.put("allow",""); //ip白名单，默认全部
	// //initParams.put("deny","127.0.0.1"); //ip黑名单
	// bean.setInitParameters(initParams);
	// return bean;
	// }
	//
	// //2.配置一个监控filter
	// @Bean
	// public FilterRegistrationBean webStatFilter(){
	// FilterRegistrationBean bean = new FilterRegistrationBean();
	// bean.setFilter(new WebStatFilter());
	// Map<String,String> initparams = new HashMap<>();
	// initparams.put("exclusions","*.js,*.css,/druid/*");
	// bean.setInitParameters(initparams);
	// bean.setUrlPatterns(Arrays.asList("/*"));
	// return bean;
	// }
}
