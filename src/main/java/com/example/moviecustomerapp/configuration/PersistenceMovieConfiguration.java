/*
 * package com.example.moviecustomerapp.configuration;
 * 
 * import org.hibernate.cfg.Environment; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.context.annotation.Primary; import
 * org.springframework.context.annotation.PropertySource; import
 * org.springframework.data.jpa.repository.config.EnableJpaRepositories; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource; import
 * org.springframework.orm.jpa.JpaTransactionManager; import
 * org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean; import
 * org.springframework.transaction.PlatformTransactionManager;
 * 
 * @Configuration
 * 
 * @PropertySource({ "classpath:persistence-multiple-db.properties" })
 * 
 * @EnableJpaRepositories(basePackages = "com.example.moviecustomerapp.dao",
 * entityManagerFactoryRef = "movieEntityManager", transactionManagerRef =
 * "movieTransactionManager") public class PersistenceMovieConfiguration {
 * 
 * @Autowired private Environment env;
 * 
 * @Bean
 * 
 * @Primary public LocalContainerEntityManagerFactoryBean userEntityManager() {
 * LocalContainerEntityManagerFactoryBean em = new
 * LocalContainerEntityManagerFactoryBean(); em.setDataSource(userDataSource());
 * em.setPackagesToScan( new String[] {
 * "com.example.moviecustomerapp.entity.Movie" });
 * 
 * HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
 * em.setJpaVendorAdapter(vendorAdapter); HashMap<String, Object> properties =
 * new HashMap<>(); properties.put("hibernate.hbm2ddl.auto",
 * env.getProperty("hibernate.hbm2ddl.auto"));
 * properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
 * em.setJpaPropertyMap(properties);
 * 
 * @Primary
 * 
 * @Bean public javax.sql.DataSource userDataSource() {
 * 
 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
 * dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
 * dataSource.setUrl(env.getProperty("user.jdbc.url"));
 * dataSource.setUsername(env.getProperty("jdbc.user"));
 * dataSource.setPassword(env.getProperty("jdbc.pass"));
 * 
 * return dataSource; }
 * 
 * @Primary
 * 
 * @Bean public PlatformTransactionManager userTransactionManager() {
 * 
 * JpaTransactionManager transactionManager = new JpaTransactionManager();
 * transactionManager.setEntityManagerFactory(userEntityManager().getObject());
 * return transactionManager; } }
 * 
 * return em;
 * 
 * }
 */