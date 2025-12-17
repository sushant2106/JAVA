package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
@SpringBootTest  //it help to start application context
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;
//
//    @BeforeEach
//    void setup(){
//        System.out.println("It will run before all function..");
//        System.out.println("Help to Initialize funciton..");
//    }
//
//    @BeforeAll
//    void setup(){
//        System.out.println("It will run before all function..");
//        System.out.println("Help to Initialize funciton..");
//    }
//    @AfterAll
//    void setup(){
//        System.out.println("Will run after all test..");
//    }
//    @AfterEach
//    void setup(){
//        System.out.println("Run for Each Test Case...");
//    }



    @Disabled
    @Test
    public void testfindByUserName(){
       assertEquals(4,2+2);
       assertTrue(5>3);
       User user=userRepository.findByUserName("Sachin");
       assertTrue(!user.getJournalEntries().isEmpty());
       assertNotNull(userRepository.findByUserName("Sachin"));

    }

    //Parameterized

    @Disabled
    @ParameterizedTest
    @ValueSource(strings= {
            "Sachin",
            "shyam"
    })
    public  void testFinByUserName2(String name){
        assertNotNull(userRepository.findByUserName(name),"failed for: "+name);
    }


    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,9"
    })
    public void test(int a,int b,int expected){
        assertEquals(expected,a+b);
    }

    @ParameterizedTest
    @ArgumentsSource(UserArgumentProvider.class)
    public  void testSaveNewUser(User user){
        assertTrue(userService.saveNewUser(user));
    }

}
