package Entidad;

import java.util.ArrayList;

public class TaskManager {

    private String task;

    public TaskManager() {
    }

    public TaskManager(String task) {
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "- \n" + task;
    }
}

