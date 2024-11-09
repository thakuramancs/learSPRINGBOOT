// Application context and Dependency injection
package learnSpring.study;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StudyApplication.class, args);
        
        padhai obj = context.getBean(padhai.class);
        obj.padhaiMethod();
        obj.maja.mojMethod();
    }
}