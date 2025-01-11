package com.alura.conversordemoneda.principal;

import com.alura.conversordemoneda.consultas.ConsultaApi;
import com.alura.conversordemoneda.modelos.Conversor;
import com.alura.conversordemoneda.modelos.ConversorDeMonedas;

import java.io.BufferedReader;
import java.util.Scanner;

public class Principal  {

    
    public static void main(String[] args) {
        int opcion;
        double monto;

        Scanner lecturaPorTeclado = new Scanner(System.in);
        ConsultaApi tipoDeCambio = new ConsultaApi();


        do {

            System.out.println("---------------------------------------------------------");
            System.out.println("|                                                       |");
            System.out.println("|                  Conversor de moneda                  |");
            System.out.println("|                                                       |");
            System.out.println("---------------------------------------------------------");
            System.out.println("|                      Bienvenido                       |");
            System.out.println("---------------------------------------------------------");
            System.out.println("|#|Elija una opción                                     |");
            System.out.println("|1|Dólar          >> Peso Argentino                     |");
            System.out.println("|2|Peso Argentino >> Dólar                              |");
            System.out.println("|3|Dólar          >> Real Brasileño                     |");
            System.out.println("|4|Real Brasileño >> Dólar                              |");
            System.out.println("|5|Dólar          >> Peso Colombiano                    |");
            System.out.println("|6|Peso Colombiano>> Dólar                              |");
            System.out.println("|7|Salír                                                |");
            System.out.println("---------------------------------------------------------");
            System.out.println("|#|Su Opción es:                                        |");
            opcion = lecturaPorTeclado.nextInt();


            System.out.println("---------------------------------------------------------");
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que desae convertir: ");
                    monto = lecturaPorTeclado.nextDouble();
                    System.out.println("Usted ingresó: " + monto + "(USD)");
                    tipoDeCambio.consultaTipoDeCambio("USD","ARS",monto);
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desae convertir: ");
                    monto = lecturaPorTeclado.nextDouble();
                    System.out.println("Usted ingresó: " + monto + "(ARS)");
                    tipoDeCambio.consultaTipoDeCambio("ARS","USD",monto);
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desae convertir: ");
                    monto = lecturaPorTeclado.nextDouble();
                    System.out.println("Usted ingresó: " + monto + "(USD)");
                    tipoDeCambio.consultaTipoDeCambio("USD","BRL",monto);
                    break;
                case 4:
                    System.out.println("Ingrese el valor que desae convertir: ");
                    monto = lecturaPorTeclado.nextDouble();
                    System.out.println("Usted ingresó: " + monto + "(BRL)");
                    tipoDeCambio.consultaTipoDeCambio("BRL","USD",monto);
                    break;
                case 5:
                    System.out.println("Ingrese el valor que desae convertir: ");
                    monto = lecturaPorTeclado.nextDouble();
                    System.out.println("Usted ingresó: " + monto + "(USD)");
                    tipoDeCambio.consultaTipoDeCambio("USD","POLICIA",monto);
                    break;
                case 6:
                    System.out.println("Ingrese el valor que desae convertir: ");
                    monto = lecturaPorTeclado.nextDouble();
                    System.out.println("Usted ingresó: " + monto + "(POLICIA)");
                    tipoDeCambio.consultaTipoDeCambio("POLICIA","USD",monto);

                    break;
                case 7:
                    System.out.println("---------------------------------------------------------");
                    System.out.println("|                                                       |");
                    System.out.println("|                  Conversor de moneda                  |");
                    System.out.println("|                                                       |");
                    System.out.println("---------------------------------------------------------");
                    System.out.println("|                 Finalizando programa...               |");
                    System.out.println("---------------------------------------------------------");
                    break;
                default:
                    System.out.println("El valor ingresado no es valido.Ingrese un número del 1 al 7");
                    break;
            }
        }while (opcion !=7);

    }
}
