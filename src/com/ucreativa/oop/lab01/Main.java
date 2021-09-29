package com.ucreativa.oop.lab01;

public class Main {

    static String metodo(String variable) {
        variable = variable + " Mundo";
        return variable;
    }

    static String metodo(int variable) {
        variable = variable + 2;
        return String.valueOf(variable);
    }

    public static void main(String[] args) {
        String variable;

        variable = "lo que sea";

        variable = "Hola";

        variable = metodo(variable);

        System.out.println(variable);

        // Texto escrito y que la máquina ignora.

        /*
        Texto escrito
        y que la máquina ignora
         */

        // TODO: Falta por terminar ... de To do pero junto

        // Variables:
        //type nombre = valor;
        int entero = 1;
        entero = entero + 1;
        float flotante = 2.5f;
        String cadenaCaracteres = "entre doble comilla";
        Boolean SioNo = true;
        Integer entero2 = 2;

        // Condicionales
        if (entero == 2) {
            System.out.println("No entro");
        }else if (entero == 3) {
            System.out.println("Si entro");
        } else {
            System.out.println("ok");

        }

        switch (entero){
            case 1:
                System.out.println("Si es uno");
                System.out.println("Que si es uno");
                break;
            default:
                System.out.println("Default");
        }

        // Loops
        int i = 0;
        while (i < 10) {
            System.out.println("Por aquí voy: " + i);
            i = i + 1;
        }

        for (int j = 0; j < 10; j++){
            System.out.println("Por aquí va el otro; " + j);
        }


        // Arrays
        String[] objetos = {"un objeto", "Dos objetos"};
        System.out.println("Que tiene el 0" + objetos[0]);

        System.out.println( Integer.parseInt(cadenaCaracteres) + entero);
    }

}
