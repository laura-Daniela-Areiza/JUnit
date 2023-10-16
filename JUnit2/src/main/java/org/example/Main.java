package org.example;

import Entidad.TemperatureConverter;
import Servicio.Servicio;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Servicio servicio = new Servicio();

        TemperatureConverter t = new TemperatureConverter();

        System.out.println("Ingrese los grados en celcius que desea convertir");
        double gradosC = read.nextDouble();
        t.setGradosC(gradosC);

        System.out.println("Los grados ingresados equivales a: \n" + servicio.convertirGradosF(gradosC) + " °F \n" + servicio.convertirGradosK(gradosC) + " °K");





    }
}