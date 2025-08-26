package br.davipeterson.minesweeper;

import java.util.Random;

public class CampoMinado {
	public static final int TOTAL_BOMBAS = 10;
	private char gabarito[][] = new char[10][10];
	private char visual[][] = new char[10][10];
	private int jogadas;
	private boolean fimJogo;
	public CampoMinado() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				gabarito[i][j]=' ';
				visual[i][j]='?';
			}
		}
		Random r = new Random();
		for(int i=0;i<10;i++) {
			int l=r.nextInt(10);
			int c=r.nextInt(10);
			if(gabarito[l][c]==' ') {
				gabarito[l][c]='*';
			}else {
				i--;
			}			
		}
		//contagem dos vizinhos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int conta=0;
                if(gabarito[i][j]==' '){
                    if(i>0 && j>0 && gabarito[i-1][j-1]=='*'){ conta++; }
                    if(i>0 && gabarito[i-1][j]=='*'){ conta++; }
                    if(i>0 && j<9 && gabarito[i-1][j+1]=='*'){ conta++; }
                    if(j>0 && gabarito[i][j-1]=='*'){ conta++; }
                    if(j<9 && gabarito[i][j+1]=='*'){ conta++; }
                    if(i<9 && j>0 && gabarito[i+1][j-1]=='*'){ conta++; }
                    if(i<9 && gabarito[i+1][j]=='*'){ conta++; }
                    if(i<9 && j<9 && gabarito[i+1][j+1]=='*'){ conta++; }
                    if(conta>0){ gabarito[i][j]=(char)('0'+conta); }
                }
            }
        }
	}
	public void desarme(int l, int c) {
		if(fimJogo==false) {
			if(l>=0 && l<=9 && c>=0 && c<=9) {
				if(visual[l][c]=='?') {
					visual[l][c]=gabarito[l][c];
					jogadas++;
					if(jogadas>=90) {
						fimJogo=true;
					}
					if(gabarito[l][c]=='*') {
						fimJogo=true;
					}
				}
			}
		}
	}
	public void imprime() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(visual[i][j]);
			}
			System.out.println();
		}
	}
	public int getJogadas() {
		return jogadas;
	}
	public boolean getFimJogo() {
		return fimJogo;
	}
	
}
