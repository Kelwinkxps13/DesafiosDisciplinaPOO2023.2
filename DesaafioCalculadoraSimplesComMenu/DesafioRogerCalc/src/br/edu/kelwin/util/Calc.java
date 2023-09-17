package br.edu.kelwin.util;
public class Calc {
	public static int escolha() {
		int x=0;
		do {
			System.out.println("Aperte");
			System.out.println("[1]Para Continuar");
			System.out.println("[2]Para Voltar ao menu principal");
			System.out.println("[3]Para Encerrar programa");
			System.out.print(">");
			x = (int) Scan.nextDouble();
			if (x<1 | x>3) {
				System.out.println("Número inválido, tente novamente;");
			}
		}while(x<1 | x>3);
		return x;
	}
	public static int MenuSoma() {
		double a=0, b=0;
		int x=0;
		System.out.print("Digite o num1: ");
		a = Scan.nextDouble();
		System.out.print("Digite o num2: ");
		b = Scan.nextDouble();
		soma(a,b);
		x = escolha();
		return x;
		
	}
	public static int MenuSub() {
		double a=0, b=0;
		int x=0;
		System.out.print("Digite o num1: ");
		a = Scan.nextDouble();
		System.out.print("Digite o num2: ");
		b = Scan.nextDouble();
		sub(a,b);
		x = escolha();
		return x;
		
	}
	public static int MenuProd() {
		double a=0, b=0;
		int x=0;
		System.out.print("Digite o num1: ");
		a = Scan.nextDouble();
		System.out.print("Digite o num2: ");
		b = Scan.nextDouble();
		prod(a,b);
		x = escolha();
		return x;
		
	}
	public static int MenuDiv() {
		double a=0, b=0;
		int x=0;
		System.out.print("Digite o num1: ");
		a = Scan.nextDouble();
		System.out.print("Digite o num2: ");
		b = Scan.nextDouble();
		div(a,b);
		x = escolha();
		return x;
		
	}
	public static int MenuPrincipal() {
		int x=0;
		do {
			System.out.println("Menu Principal, deseja");
			System.out.println("[1]Somar");
			System.out.println("[2]Subtrair");
			System.out.println("[3]Multiplicar");
			System.out.println("[4]Dividir");
			System.out.println("[5]Encerrar programa");
			System.out.print(">");
			x = (int) Scan.nextDouble();
			if (x<1 | x>5) {
				System.out.println("Número inválido, tente novamente;");
			}
		}while(x<1 | x>5);
		return x;
	}
	public static void soma(double a, double b) {
		System.out.println("A soma dos números é: "+(a+b));
	}
	public static void sub(double a, double b) {
		System.out.println("A subtração dos números é: "+(a-b));
	}
	public static void prod(double a, double b) {
		System.out.println("O produto dos números é: "+(a*b));
	}
	public static void div(double a, double b) {
		System.out.println("A divisão dos números é: "+(a/b));
	}
}