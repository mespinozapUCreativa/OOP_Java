package com.ucreativa.oop.presupuesto.logicaNegocio;

import com.ucreativa.oop.presupuesto.repo.ErrorMuyPocaData;

public interface InterfaceRegistro {

    boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad) throws ErrorMuyPocaData;

    void addGasto(String nombre, String moneda, String categoria, String montoStr) throws ErrorMuyPocaData;

    void getMovimientos();

    void getGastos();

}
