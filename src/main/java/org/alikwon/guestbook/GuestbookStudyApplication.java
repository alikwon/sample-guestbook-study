package org.alikwon.guestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GuestbookStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestbookStudyApplication.class, args);
    }

}
