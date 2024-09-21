package mosbach.dhbw.de.cftestbackend.controller;

import mosbach.dhbw.de.cftestbackend.model.MessageAnswer;
import mosbach.dhbw.de.cftestbackend.model.TokenTask;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class Controller {

    // private final PersonRepository personRepository;

    public Controller(
    ) {}

    @GetMapping("/auth")
    public String getAuth() {
        return "I am alive.";
    }



    @PostMapping(
            path = "/tasks",
            consumes = {MediaType.A}
    )
    public MessageAnswer createTasks(@RequestBody TokenTask tokentask){

       

        Double gradeDouble = Double.parseDouble(tokentask.getTask().getGrade());
        String answer = "You were lazy";
        if(gradeDouble < 2.3) answer = "Ok, you have learned";


        return
                new MessageAnswer("Ta" + tokentask.getTask().getModule() + answer);

    }
}