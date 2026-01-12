package net.engineeringdigest.journalApp.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.extern.slf4j.Slf4j;
import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import net.engineeringdigest.journalApp.service.UserService;
import net.engineeringdigest.journalApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
//
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WeatherService weatherService;



//    @GetMapping
//    public List<User> getAllUsers(){
//        return userService.getAll();
//    }



    @PutMapping
    public  ResponseEntity<?>updateUser(@RequestBody User user){
        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
        String userName=authentication.getName();
         User userInDb=userService.findByUserName(userName);
         if(userInDb != null){
             userInDb.setUserName(user.getUserName());
             userInDb.setPassword(user.getPassword());
             userService.saveNewUser(userInDb);

         }
         return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public  ResponseEntity<?>deleteUserById(@RequestBody User user){
        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();

        userRepository.deleteByUserName(authentication.getName());
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<?> greeting(){
        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
        WeatherResponse weatherResponse=weatherService.getWeather("Mumbai");
        String greeting="";
        if(weatherResponse !=null){
          greeting=", Weather feels like "+ weatherResponse.getCurrent().getFeelslike();
        }

        return  new ResponseEntity<>("Hi " +authentication.getName()+ greeting,HttpStatus.OK);
    }


}
