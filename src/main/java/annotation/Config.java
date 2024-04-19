package annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    @Order(3)
    public Dog getAlfaDog() {
        return new Dog("AlfaDog3");
    }

    @Bean(name = "SecondDog")
    @Order(2)
    public Dog getDog() {
        return new Dog("Dog2");
    }

    @Bean
    @Order(1)
    public Dog someDog() {
        return new Dog("Dog1");
    }
}