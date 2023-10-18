package Servicio;

import Entidad.TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    Scanner read = new Scanner(System.in);
    TaskManager tm = new TaskManager();
    ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task){
        tasks.add(task);
    }

    public void deleteTask(String task){
        tasks.remove(task);

    }

    public ArrayList<String> taskPending() {
        return tasks;
    }
}
