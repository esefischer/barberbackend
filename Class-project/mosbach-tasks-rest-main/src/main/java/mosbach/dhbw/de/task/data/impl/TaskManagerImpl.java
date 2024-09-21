package mosbach.dhbw.de.task.data.impl;

import mosbach.dhbw.de.task.data.api.Task;
import mosbach.dhbw.de.task.data.api.TaskManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Math.log;

public class TaskManagerImpl implements TaskManager {


    private String fileName = "/src/main/resource/tasks.properties";

    //Single-Idee, die ich eigentlich schon weiß, weil ich in Java2 war
    public static TaskManagerImpl taskManagerImpl = null;
    private TaskManagerImpl() {}
    public static TaskManagerImpl getTaskManagerImpl() {
        if (taskManagerImpl == null) taskManagerImpl = new TaskManagerImpl();
        return taskManagerImpl;
    }

    @Override
    public void addTask(Task newTask) {
        List<Task> temp = getAllTAsks();
        temp.add(newTask);
        setAllTasks(temp);

    }

    @Override
    public List<Task> getAllTAsks() {

        Properties properties = new Properties();
        List<Task>tasks = new ArrayList<>();
        int i = 1;
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            try (InputStream resourceStream = loader.getResourceAsStream(fileName)){
                properties.load(resourceStream);

            }
            properties.store(new FileInputStream(fileName), "Writing all tasks to file.");

        } catch (IOException e) {
            Logger
                    .getLogger("GetAllTaskReader")
            .log(Level.INFO, "File is not avaiable.");


        }

        // Datei holem
        //öffnen, laden
        // durchgehen und in einer Liste speichern
        //Liste zurückgehen

        return
                tasks;
    }

    public void setAllTasks(List<Task>tasks){


            Properties properties = new Properties();
            int i = 1;
            for (Task t : tasks){

            properties.setProperty("Task."+ i + ".Module",t.getModule());
            properties.setProperty("Task."+ i + ".Grade", t.getGrade()+"");
            properties.setProperty("Task."+ i + ".DateAsNumber", t.getDateAsNumber() + "");
            properties.setProperty("Task."+ i + ".StudentId", t.getStudentId());
        }
            try {
                properties.store(new FileOutputStream(fileName), "Writting all tasks to file,");
            }

            catch (IOException e){

                Logger
                .getLogger("GetAllTaskReader")
                .log(Level.INFO, "File is not avaiable.");
            }



    }



}
