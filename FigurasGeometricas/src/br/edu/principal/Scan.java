/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.principal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Scan {
    private double x;
    
    private static Scanner scanner = new Scanner(System.in);
    
    public double scanner(){
        
        while(true){
            
            try{
                x = scanner.nextDouble();
                break;
            }catch(InputMismatchException e){
                System.out.println("Caractere Inválido");
                scanner.nextLine();
            }
            
        }
        return x;
    }
    
    public double scannerNum(){
        
        while(true){
            
            try{
                x = scanner.nextDouble();
                break;
            }catch(NumberFormatException e){
                System.out.println("Caractere Inválido");
                scanner.nextLine();
            }
            
        }
        return x;
    }
}
