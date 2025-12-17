package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

//
//@SpringBootTest
//public class UserDeatilsServiceImplTest {
//
//
//    @Autowired
//    private UserDeatilsServiceImpl userDeatilsService;
//
//    @MockitoBean
//    private UserRepository userRepository;
//
//    @Test
//    void loadUserByUsernameTest(){
//        when(userRepository.findByUserName(anyString())).thenReturn(User.builder().userName("Ram").password("Ram").roles(new ArrayList<>()).build());
//        UserDetails user=userDeatilsService.loadUserByUsername("Ram");
//        Assertions.assertNotNull(user);
//    }
//}


@Disabled
@ActiveProfiles("prod")
public class UserDeatilsServiceImplTest {


    @InjectMocks  //Automatically ye Instance Create kr deta hai
    private UserDeatilsServiceImpl userDeatilsService;

    @Mock
    private UserRepository userRepository;

    //Mock ko intialize kr rhe hai
    @BeforeEach
    void setUp(){
            MockitoAnnotations.initMocks(this);
    }

    @Disabled
    @Test
    void loadUserByUsernameTest(){
        when(userRepository.findByUserName(anyString())).thenReturn(User.builder().userName("Ram").password("Ram").roles(new ArrayList<>()).build());
        UserDetails user=userDeatilsService.loadUserByUsername("Ram");
        Assertions.assertNotNull(user);
    }
}

