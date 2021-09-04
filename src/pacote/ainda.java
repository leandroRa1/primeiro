package pacote;

import java.util.Scanner;

public class ainda {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("escreva um numero");
		 int x;
		 int y;
		 int v;
		 x =ler.nextInt();
		 System.out.println("proximo numero");
		  y = ler.nextInt();
		  v = x + y;
		  System.out.println("resultado é " + v);
		  
		  ler.close();
		
	}
}
