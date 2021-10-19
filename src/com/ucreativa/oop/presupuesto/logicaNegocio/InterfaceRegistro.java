package com.ucreativa.oop.presupuesto.logicaNegocio;


public interface InterfaceRegistro {

    boolean addIngreso(String nombre, String moneda, String categoria, String montoStr, String periodicidad);

    void addGasto(String nombre, String moneda, String categoria, String montoStr);

    void getMovimientos();

    void getGastos();

}
