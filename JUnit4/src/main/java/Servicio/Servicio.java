package Servicio;

import Entidad.TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    
    TaskManager tm = new TaskManager();
    ArrayList<String> tasks = new ArrayList<>();
    Scanner read = new Scanner(System.in);
    
    public void addTask(ArrayList<String> tasks){

        ArrayList<String> list1 = tasks;
        
        boolean x = true;
        
        do {
            System.out.println("Please, add a task you need to execute");
            String task = read.next();
            list1.add(task);
            tm.setTask(tasks);

            System.out.println("Do you want to add another task. Please answer YES or NO");
            String ans = read.next();
            
            if (ans.equalsIgnoreCase("yes")){
                x = true;
            }else{
                x = false;
            }
            
        }while (x);
    }

    public void deleteTask(ArrayList<String> tasks){

        ArrayList<String> list2 = tasks;

        boolean x = true;

        System.out.println("These are the tasks pending to complete");
        for (String list: list2){
            System.out.println("- " + list);
        }

        do {
            System.out.println("Please, delete the task you managed to complete");
            String task = read.next();
            list2.remove(task);
            tm.setTask(tasks);

            System.out.println("Do you want to delete another task. Please answer YES or NO");
            String ans = read.next();

            if (ans.equalsIgnoreCase("yes")){
                x = true;
            }else{
                x = false;
            }

        }while (x);
    }

    public void getTasks(ArrayList<String> tasks) {

        ArrayList<String> list3 = tasks;

        System.out.println("These are the tasks pending to complete");

        for (String list: list3){
            System.out.println("- " + list);
        }
    }
}
