package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionRegistro;
import com.ucreativa.oop.presupuesto.logicaNegocio.ImplementacionSuperDummy;
import com.ucreativa.oop.presupuesto.logicaNegocio.InterfaceRegistro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        System.out.println("Que quiere usar? Fake? (F):");
        InterfaceRegistro registro;
        if (consola.nextLine().equals("F")) {
            registro = new ImplementacionSuperDummy();
        }else {
            registro = new ImplementacionRegistro();
        }

        while (siga) {
            System.out.println("Digite el nombre de su Movimiento:");

            System.out.println("Digite el monto de su Movimiento:");
            String montoStr = consola.nextLine();

            System.out.println("Indique si es un Gasto (S)");
            if (consola.nextLine().equals("S")){
                registro.addGasto = new Gasto(nombre, moneda, categoria, montoStr);
            } else {
                System.out.println("Especifique la Periodicidad: ");
                String periodicidad = consola.nextLine();

                registro.addIngreso(nombre, moneda, categoria, montoStr, periodicidad);
            }

            System.out.println("Todos los movimientos:");

            registro.getGastos();

            System.out.println("Quiere Seguir?(`S`)");
            siga = consola.nextLine().equals("S");
            }
        }
    }

}
