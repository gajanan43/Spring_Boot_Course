package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public Alien Alien(@Qualifier("desktop") Computer comp) {
//        Alien obj1= new Alien();
//        obj1.setAge(22);
//        obj1.setComp(comp);
//        return obj1;
//    }
//
////    @Bean({"ram","sham","gun","man"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
////    @Primary
//    public Laptop  laptop() {
//        return new Laptop();
//    }
}
