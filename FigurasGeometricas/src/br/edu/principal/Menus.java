/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.principal;

import br.edu.figurasplanas.*;
import java.util.Scanner;

/**
 *
 * @author aj_un
 */
public class Menus {
    private static Scan scanner = new Scan();
    public static int menuPrincipal(){
        int x =0;
        System.out.println("Bem vindo ao menu principal");
        do{
            
            System.out.println("Deseja:");
            System.out.println("[1] Calcular figuras planas");
            System.out.println("[2] Encerrar programa");
            System.out.print(">");
            x = (int) scanner.scanner();
            if(x<1 || x>2){
                System.out.println("Resposta inválida, tente novamente.");
            }
            
        }while(x<1 || x>2);
        return x;
    }
    
    public static int menuEscolha(){
        int x = 0;
        System.out.println("Você deseja");
        do{
            
            System.out.println("[1] Continuar");
            System.out.println("[2] Voltar ao menu de figuras");
            System.out.println("[3] Voltar ao menu Principal");
            System.out.println("[4] Encerrar programa");
            System.out.print(">");
            x = (int) scanner.scanner();
            if(x<1 || x>4){
                System.out.println("Escolha errada, tente novamente.");
            }
            
        }while(x<1 || x>4);
        return x;
    }
    
    public static int menuFigurasPlanas(){
        int x=0;
        System.out.println("Menu figuras planas");
        do{
            
            System.out.println("Deseja");
            System.out.println("[1] Calcular área do círculo");
            System.out.println("[2] Calcular área do losango");
            System.out.println("[3] Calcular área do paralelogramo");
            System.out.println("[4] Calcular área do quadrado");
            System.out.println("[5] Calcular área do retangulo");
            System.out.println("[6] Calcular área do trapezio");
            System.out.println("[7] Calcular área do triãngulo");
            System.out.print(">");
            x = (int) scanner.scanner();
            if(x<1 || x>7){
                System.out.println("Escolha errada, tente novamente.");
            }
            
        }while(x<1 || x>7);
        return x;
    }
    
    public static int menuCirculo(){
        double x=0;
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio: ");
        x = scanner.scanner();
        circulo.setRaio(x);
        circulo.calcularArea();
        circulo.getArea();
        
        return menuEscolha();
        
    }
    
    public static int menuLosango(){
        double dmain = 0;
        double dsec = 0;
        Losango l = new Losango();
        System.out.print("Digite a Diagonal Principal: ");
        dmain = scanner.scanner();
        System.out.print("Digite a Diagonal Secundária: ");
        dsec = scanner.scanner();
        l.setDiagonalMaior(dmain);
        l.setDiagonalMenor(dsec);
        l.calcularArea();
        l.getArea();
        return menuEscolha();
        
    }
    
    public static int menuParalelogramo(){
        double b=0;
        double h=0;
        
        Paralelogramo p = new Paralelogramo();
        
        System.out.print("Digite a base: ");
        b = scanner.scanner();
        System.out.print("Digite a altura: ");
        h = scanner.scanner();
        p.setBase(b);
        p.setAltura(h);
        p.calculaArea();
        p.getArea();
        return menuEscolha();
    }
    
    public static int menuQuadrado(){
        
        double b=0;
        
        Quadrado r = new Quadrado();
        
        System.out.print("Digite a base: ");
        b = scanner.scanner();
        r.setBase(b);
        r.calculaArea();
        r.getArea();
        return menuEscolha();
        
    }
    
    public static int menuRetangulo(){
        double b=0;
        double h=0;
        
        Retangulo r = new Retangulo();
        
        System.out.print("Digite a base: ");
        b = scanner.scanner();
        System.out.print("Digite a altura: ");
        h = scanner.scanner();
        r.setBase(b);
        r.setAltura(h);
        r.calculaArea();
        r.getArea();
        return menuEscolha();
    }
    
    public static int menuTrapezio(){
        double bmaior=0;
        double bmenor=0;
        double h=0;
        
        Trapezio r = new Trapezio();
        
        System.out.print("Digite a base maior: ");
        bmaior = scanner.scanner();
        System.out.print("Digite a base menor: ");
        bmenor = scanner.scanner();
        
        System.out.print("Digite a altura: ");
        h = scanner.scanner();
        r.setBaseMaior(bmaior);
        r.setBaseMenor(bmenor);
        r.setAltura(h);
        r.calculaArea();
        r.getArea();
        return menuEscolha();
    }
    
    public static int menuTriangulo(){
        double b=0;
        double h=0;
        
        Triangulo r = new Triangulo();
        
        System.out.print("Digite a base: ");
        b = scanner.scanner();
        System.out.print("Digite a altura: ");
        h = scanner.scanner();
        r.setBase(b);
        r.setAltura(h);
        r.calculaArea();
        r.getArea();
        return menuEscolha();
    }
}
