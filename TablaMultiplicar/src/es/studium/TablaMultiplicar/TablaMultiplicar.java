package es.studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {


	public static void main(String[] args)
	{
		int numero;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número:");
		numero= teclado.nextInt();

		for(int i=0; i<=10; i++) 
		{
			System.out.println(i+ "x" + numero + "="+ i*numero);
		}
		teclado.close();
	}

}
