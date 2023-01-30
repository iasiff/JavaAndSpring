package lr.sprngbut.config;
/*
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableJpaRepositories(basePackages = {"lr.sprngbut.repo"},
        entityManagerFactoryRef = "getEntManagerFactory",
        transactionManagerRef = "getTrnxManager")
public class PersistenceDbConfig {

    private static final Logger log = LoggerFactory.getLogger(PersistenceDbConfig.class);
    @Autowired
    private Environment env;
    
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "db.prop")
    public DataSourceProperties getDataSourceProp() {
        log.info("#####-> loaded DataSourceProperties");
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "db.prop.source")
    public DataSource getDataSource() {
        log.info("#####-> loaded DataSource");
        return getDataSourceProp().initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean getEntManagerFactory() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        HibernateJpaVendorAdapter hibrntJpaVendAdapter = new HibernateJpaVendorAdapter();
        HashMap<String, Object> hibrntProp = new HashMap<>();

        emf.setPackagesToScan("lr.sprngbut.entity");
        emf.setPersistenceUnitName("getEntManagerFactory");
        emf.setDataSource(getDataSource());
        emf.setJpaVendorAdapter(hibrntJpaVendAdapter);
        hibrntProp.put("hibernate.dialect", env.getProperty("db.hibernate.dialect"));
        hibrntProp.put("hibernate.hbm2ddl.auto", env.getProperty("db.hibernate.ddl-auto"));
        hibrntProp.put("hibernate.show_sql", env.getProperty("db.hibernate.show_sql"));
        hibrntProp.put("hibernate.format_sql", env.getProperty("db.hibernate.format_sql"));
        hibrntProp.put("hibernate.use_sql_comments", env.getProperty("db.hibernate.sql_comments"));
        emf.setJpaPropertyMap(hibrntProp);

        log.info("### ==> loaded LocalContainerEntityManagerFactoryBean");
        return emf;
    }
    @Bean
    @Primary
    public PlatformTransactionManager getTrnxManager(){
        JpaTransactionManager manager = new JpaTransactionManager();
        manager.setEntityManagerFactory(getEntManagerFactory().getObject());
        log.info("#####-> loaded TransactionManager #####");
        return manager;
    }
}
 */

