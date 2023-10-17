package org.example;

import Servicio.Servicio;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        Servicio servivio = new Servicio();

        System.out.println("Welcome to our Task Manager");

        servivio.addTask(tasks);

        servivio.deleteTask(tasks);

        servivio.getTasks(tasks);

    }
}