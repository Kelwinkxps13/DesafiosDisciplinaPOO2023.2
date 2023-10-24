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
public class Quadrado extends FigurasPlanas{
    private double base;

    public void setBase(double base) {
        this.base = base;
    }
    
    public void calculaArea(){
        area = (base*base);
    }
    
}
