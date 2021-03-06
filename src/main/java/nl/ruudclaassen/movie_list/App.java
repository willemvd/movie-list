package nl.ruudclaassen.movie_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

// TODO: How to create a connection with the h2 database? 

@EnableAutoConfiguration
@ComponentScan
public class App {
	public static void main(String[] args){
		SpringApplication.run(App.class, args);
	}

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactoryBean(){
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("PersistenceUnit");

		return localEntityManagerFactoryBean;
	}

}
