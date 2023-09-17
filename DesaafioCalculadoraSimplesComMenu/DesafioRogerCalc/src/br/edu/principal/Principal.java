package br.edu.principal;
import br.edu.kelwin.util.*;
public class Principal {

	public static void main(String[] args) {
		int x=0;
		MenuPrincipal: do {
			x = Calc.MenuPrincipal();
			MenuSoma: if(x==1){
				int a = 0;
				System.out.println("Bem vindo a soma");
				do {
					a = Calc.MenuSoma();				
					if(a==2) {
						break MenuSoma;
					}
					else if(a==3) {
						break MenuPrincipal;
					}
				}while(a==1);
			}
			MenuSub: if(x==2){
				int a = 0;
				System.out.println("Bem vindo a subtração");
				do {
					a = Calc.MenuSub();				
					if(a==2) {
						break MenuSub;
					}
					else if(a==3) {
						break MenuPrincipal;
					}
				}while(a==1);
			}
			MenuProd: if(x==3){
				int a = 0;
				System.out.println("Bem vindo ao produto");
				do {
					a = Calc.MenuProd();				
					if(a==2) {
						break MenuProd;
					}
					else if(a==3) {
						break MenuPrincipal;
					}
				}while(a==1);
			}
			MenuDiv: if(x==4){
				int a = 0;
				System.out.println("Bem vindo a Divisão");
				do {
					a = Calc.MenuDiv();				
					if(a==2) {
						break MenuDiv;
					}
					else if(a==3) {
						break MenuPrincipal;
					}
				}while(a==1);
			}
		}while(x!=5);
		System.out.println("Obrigado por usar o programa :)");
		System.exit(0);
	}
}