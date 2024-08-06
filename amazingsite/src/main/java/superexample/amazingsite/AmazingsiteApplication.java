package superexample.amazingsite;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazingsiteApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.load();
//        System.out.println("Secret");
//        System.out.println(dotenv.get("DB_USERNAME"));
        SpringApplication.run(AmazingsiteApplication.class, args);
    }

}
