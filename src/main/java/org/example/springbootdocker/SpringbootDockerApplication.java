    package org.example.springbootdocker;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @SpringBootApplication
    @RestController
    public class SpringbootDockerApplication {
        @GetMapping("/message")
        public String getMessage(){
            return "Welcome to Spring Boot GITHUB-JENKINS-DOCKER Application";
        }
        public static void main(String[] args) {
            SpringApplication.run(SpringbootDockerApplication.class, args);
        }

    }
