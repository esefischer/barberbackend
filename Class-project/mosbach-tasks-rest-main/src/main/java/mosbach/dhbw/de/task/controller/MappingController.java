package mosbach.dhbw.de.task.controller;

import mosbach.dhbw.de.task.data.api.TaskManager;
import mosbach.dhbw.de.task.data.impl.TaskImpl;
import mosbach.dhbw.de.task.data.impl.TaskManagerImpl;
import mosbach.dhbw.de.task.model.MessageAnswer;
import mosbach.dhbw.de.task.model.SortedTasks;
import mosbach.dhbw.de.task.data.api.Task;
//import mosbach.dhbw.de.task.model.task
import mosbach.dhbw.de.task.model.TokenTask;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class MappingController {

    // private final PersonRepository personRepository;
    TaskManager propertiesTaskManager = TaskManagerImpl.getTaskManagerImpl();


    public MappingController(
    ) {}

    @GetMapping("/auth")

    public String getAuth() {
        return "I am alive.";
    }


    @PostMapping(
           path = "/task",
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public MessageAnswer createTask(@RequestBody TokenTask tokenTask) {

        // TODO check the token
        propertiesTaskManager.addTask(
                new TaskImpl(
                    tokenTask.getTask().getModule(),
                    Double.parseDouble(tokenTask.getTask().getGrade()),
                    tokenTask.getTask().getDateAsNumber(),
                    tokenTask.getToken()
                )
        );

        Double gradeDouble = Double.parseDouble(tokenTask.getTask().getGrade());
        String answer = "You were a bit lazy.";
        if (gradeDouble < 3.0) answer = "Ok,your learned.";

        return
                new MessageAnswer("Task added to your tasklist.");
    }

    @GetMapping("/tasks")
    public SortedTasks getAllTasks(
            @RequestParam(value = "sortorder", defaultValue = "date") String sortorder,
            @RequestParam(value = "token", defaultValue = "no-token") String token
    )
    {

        SortedTasks answerSortedTasks = new SortedTasks();
        answerSortedTasks.setSortOrder("NOT YET SORTED");

        List<mosbach.dhbw.de.task.model.Task> myTasks = new ArrayList<>();
        for (Task t: propertiesTaskManager.getAllTAsks())
            myTasks.add (new mosbach.dhbw.de.task.model.Task(

                    t.getModule(),
                    "portfolio",
                    t.getGrade() + "";
                    t.getDateAsNumber()
                    )
            );
    answerSortedTasks. setTasks(myTasks);
    return
            answerSortedTasks;


}
}
