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
public class Quadrado {
    private double base;
    private double area;

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }
    
    
    public void calculaArea(){
        area = (base*base);
    }
    
}
