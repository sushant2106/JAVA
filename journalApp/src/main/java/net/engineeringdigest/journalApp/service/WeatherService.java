package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.cache.AppCache;
import net.engineeringdigest.journalApp.constants.PlaceHolders;
import net.engineeringdigest.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Component
@Service
public class WeatherService {
//    private  static  final String apiKey="1f92c99c850e2f2dda04eeaddc9846ec";

    @Value("${weather.api.key}")
    private   String apiKey;
//    Query Parameter
  //  private  static  final String API="http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    @Autowired
    private  RedisService redisService;


    public  WeatherResponse getWeather(String city){

//        String requestBody = """
//       {
//         "userName": "vipul",
//         "password": "vipul"
//        }
//      """;
//
//        HttpEntity<String>httpEntity=new HttpEntity<>(requestBody);
//        ResponseEntity<WeatherResponse>response=restTemplate.exchange(finalAPI, HttpMethod.GET,httpEntity, WeatherResponse.class);


        //Another way to send by creating Object
//        User user = User.builder().userName("Vipul").password("Vipul").build();
//
//        HttpHeaders httpHeaders=new HttpHeaders();
//        httpHeaders.set("key","value");
//
//        HttpEntity<User> httpEntity = new HttpEntity<>(user,httpHeaders);
//


      WeatherResponse weatherResponse=redisService.get("weather_of_"+city,WeatherResponse.class);
      if(weatherResponse !=null) {
          return weatherResponse;
      }
      else{
          String finalAPI=appCache.appCache.get(AppCache.keys.WEATHER_API.toString()).replace(PlaceHolders.CITY,city).replace(PlaceHolders.API_KEY,apiKey);
          ResponseEntity<WeatherResponse>response=restTemplate.exchange(finalAPI, HttpMethod.GET,null, WeatherResponse.class);
          WeatherResponse body= response.getBody();
          if(body !=null){
              redisService.set("weather_of_"+city,body,300l);
          }
          return  body;
      }


    }

}
