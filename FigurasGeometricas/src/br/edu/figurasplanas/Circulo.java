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
public class Circulo extends FigurasPlanas{
    private double raio;
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public void calcularArea(){
        area = (raio*raio*Math.PI);
    }
    
}
