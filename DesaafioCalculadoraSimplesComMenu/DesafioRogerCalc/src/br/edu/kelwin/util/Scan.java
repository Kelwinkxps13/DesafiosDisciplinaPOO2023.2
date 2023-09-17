package br.edu.kelwin.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
	private static Scanner scanner = new Scanner(System.in);
	public static double nextDouble() {
		double a=0;
		while(true) {
			try {
				a = scanner.nextDouble();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Caractere Inválido");
				scanner.nextLine();
			}
		}
		return a;
		
	}
}
