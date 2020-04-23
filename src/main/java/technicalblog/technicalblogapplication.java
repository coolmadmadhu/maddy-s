package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class technicalblogapplication {
    public static void main (String args[]) {
        SpringApplication.run(technicalblogapplication.class, args);
    }
}
