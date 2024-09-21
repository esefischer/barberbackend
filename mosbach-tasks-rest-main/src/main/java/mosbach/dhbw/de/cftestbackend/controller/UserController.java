package mosbach.dhbw.de.cftestbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import mosbach.dhbw.de.cftestbackend.model.Logik.User;

import org.springframework.http.MediaType;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")

public class UserController {



    @PostMapping( path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)


    @ResponseStatus(HttpStatus.CREATED)
    public void userRegistrieren(@RequestBody User user){
        user.registrieren();
       // return false;
    }

    @PostMapping(path = "/anmelden", consumes = MediaType.APPLICATION_JSON_VALUE)

    @ResponseStatus(HttpStatus.OK)
    public int userAnmelden(@RequestBody User user){

        return 0;
    }

    @PostMapping( path ="/abmelden/ {token}", consumes = MediaType.APPLICATION_JSON_VALUE)

    @ResponseStatus(HttpStatus.OK)
    public boolean userAbmelden(@RequestBody User user){

        return false;
    }

}
