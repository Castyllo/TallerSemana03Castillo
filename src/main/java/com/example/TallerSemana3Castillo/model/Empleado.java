/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TallerSemana3Castillo.model;

/**
 *
 * @author casti
 */
public class Empleado {

    private double sueldoBase;
    private int horasExtra;
    private double sueldoTotal;

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
        calcularSueldoTotal(); // Recalcula el sueldo total al actualizar el sueldo base
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
        calcularSueldoTotal(); // Recalcula el sueldo total al actualizar las horas extra
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    // Método para calcular el sueldo total
    private void calcularSueldoTotal() {
        double tarifaPorHora = sueldoBase / 160;
        sueldoTotal = sueldoBase + (horasExtra * tarifaPorHora);
    }
}

