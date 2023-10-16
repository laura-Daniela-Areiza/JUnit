package Servicio;

import Entidad.TemperatureConverter;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Servicio {
    Scanner read = new Scanner(System.in);
    TemperatureConverter converter = new TemperatureConverter();
    double gradosC = converter.getGradosC();

    public double convertirGradosF(double gradosC){

        System.out.println(gradosC);

        TemperatureConverter t = converter;

        return (gradosC * 9/5) + 32;

    }

    public double convertirGradosK(double gradosC){

        System.out.println(gradosC);

        TemperatureConverter t = converter;


        return (gradosC + 273.15);

    }













}
