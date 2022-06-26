package kr.irang.practiceweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PracticewebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticewebApplication.class, args);
    }
    @GetMapping
    public String HelloWorld() {
        System.out.println("접속 테스트");
        return "유진 바보\n유진 바보\n유진 바보\n유진 바보\n유진 바보\n유진 바보\n";
    }
}
