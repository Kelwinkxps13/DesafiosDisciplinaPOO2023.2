/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.figurasespaciais;

/**
 *
 * @author Alunos
 */
public class Prisma extends FigurasEspaciais{
    private double ladoBase;
    private double altura;

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void calcularAreaBase(){
        areaBase = (Math.pow(altura, 2)*Math.sqrt(3))/4;
    }public void calcularAreaSuperficie(){
        areaSuperficie = (3*(ladoBase*altura)+2*areaBase);
    }public void calcularVolume(){
        volume = areaBase*altura;
    }
}
