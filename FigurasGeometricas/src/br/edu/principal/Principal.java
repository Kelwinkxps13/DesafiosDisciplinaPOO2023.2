/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.principal;

import br.edu.figurasplanas.*;

/**
 *
 * @author aj_un
 */
public class Principal {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setBase(10);
        t.setAltura(2);
        t.calculaArea();
        t.getArea();
    }
}
