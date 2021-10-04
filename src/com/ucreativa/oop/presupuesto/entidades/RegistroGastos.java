package com.ucreativa.oop.presupuesto.entidades;

import java.util.ArrayList;
import java.util.List;

public class RegistroGastos {

    List<Gasto> gastos;

    // Constructor
    public RegistroGastos(){
        this.gastos = new ArrayList<>();
    }

    // Método 1
    public List<Gasto> getGastos(){
        return this.gastos;
    }

    // Método 2
    public void addGastos(Gasto item){
        this.gastos.add(item);

    }
}
