package mosbach.dhbw.de.task.data.api;

import java.util.List;

public interface TaskManager {

    void addTask(Task newTask);
    List<Task>getAllTAsks();
}
