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
public class Trapezio extends FigurasPlanas{
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
      
    public void calculaArea(){
        area = ((baseMaior+baseMenor)*altura)/2;
    }
    
}
