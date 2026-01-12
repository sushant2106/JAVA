package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;


    @Test
    void testSendMail(){
        emailService.sendEmail("sushantgupta2106@gmail.com","Testing Java mail Sender","Hi, aap kaise hain ?");
    }

}
