package pw.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"role.reposetory","user.reposetory"})
@EntityScan(basePackages = {"business.entity"})
@ComponentScan(basePackages = {"role.reposetory","business.entity","pw.web","pw.sec","user.reposetory"})
public class DemoApp {
    public static void main(String[] args){
        SpringApplication.run(DemoApp.class,args);
    }

}
