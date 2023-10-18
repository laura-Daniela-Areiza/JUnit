package org.example;

import Entidad.TaskManager;
import Servicio.Servicio;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        TaskManager tm = new TaskManager();

        Servicio servivio = new Servicio();

        boolean x = true;

        System.out.println("Welcome to our Task Manager");

        do {
            System.out.println("Please, add a task you need to execute");
            String task = read.next();
            servivio.addTask(task);
            tm.setTask(task);

            System.out.println("Do you want to add another task. Please answer YES or NO");
            String ans = read.next();

            if (ans.equalsIgnoreCase("yes")){
                x = true;
            }else{
                x = false;
            }
        }while (x);

        do {
            System.out.println("Please, delete the task you managed to complete");
            String task = read.next();
            servivio.deleteTask(task);
            tm.setTask(task);

            System.out.println("Do you want to delete another task. Please answer YES or NO");
            String ans = read.next();

            if (ans.equalsIgnoreCase("yes")){
                x = true;
            }else{
                x = false;
            }

        }while (x);

        System.out.println("These are the tasks pending to complete: \n" + servivio.taskPending());


    }
}