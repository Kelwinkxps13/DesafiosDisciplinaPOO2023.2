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
public class Losango {
    private double diagonalMaior;
    private double diagonalMenor;
    private double area;

    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getArea() {
        return area;
    }
    
    public void calcularArea(){
        area = (diagonalMaior+diagonalMenor)/2;
    }
}
