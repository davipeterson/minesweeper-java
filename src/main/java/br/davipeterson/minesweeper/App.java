package br.davipeterson.minesweeper;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		CampoMinado c = new CampoMinado();
		Scanner s = new Scanner(System.in);
		while(c.getFimJogo()==false) {
			c.imprime();
			System.out.print("lin:");
			int lin=s.nextInt();
			System.out.print("col:");
			int col=s.nextInt();
			c.desarme(lin, col);
		}
		c.imprime();
		s.close();
	}
}
