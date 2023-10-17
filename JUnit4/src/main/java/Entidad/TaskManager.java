package Entidad;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<String> task;

    public TaskManager() {
    }

    public TaskManager(ArrayList<String> task) {
        this.task = task;
    }

    public ArrayList<String> getTask() {
        return task;
    }

    public void setTask(ArrayList<String> task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "task=" + task +
                '}';
    }
}
