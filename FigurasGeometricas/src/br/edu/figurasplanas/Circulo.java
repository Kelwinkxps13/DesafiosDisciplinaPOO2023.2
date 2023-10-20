/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.figurasplanas;

/**
 *
 * @author Alunos
 */
public class Circulo {
    private double raio;
    private double area;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }
    
    public void calcularArea(){
        area = (raio*raio*Math.PI);
    }
    
}
