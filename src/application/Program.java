package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculo calc = new Calculo() ;
		
		double valor1 = 0;
		double valor2 = 0;
		System.out.println("-----------------------------------");
		System.out.println("|            CALCULADORA          |");
		System.out.println("-----------------------------------");
	    System.out.println();
		System.out.println("------- Escolha uma opção -------");
		System.out.println();
	    System.out.println("1 ----------------- Soma");  
	    System.out.println("2 ----------------- Subtracao");  
	    System.out.println("3 ----------------- Multiplicacao");  
	    System.out.println("4 ----------------- Divisao");  
	    System.out.println("0 ----------------- Sair");  
	    System.out.println();
	    System.out.print("Operação: ");
	    int opc = sc.nextInt();
	    
	    if(opc !=0) {
	    	
	    	
	    	switch(opc) {
	    	
	    	case 1:
	    		System.out.println();
	    		System.out.println("Informe o primeiro valor: ");
	    		valor1 = sc.nextDouble();
	    		System.out.println("Informe o segundo valor: ");
	    		valor2 = sc.nextDouble();
	    		double resultado = calc.soma(valor1, valor2);
	    		
	    		System.out.println("Resultado: " + resultado);
	    		
	    		break;
	    		
	    	case 2: 
	    		
	    		System.out.println("Informe o primeiro valor: ");
	    		valor1 = sc.nextDouble();
	    		System.out.println("Informe o segundo valor: ");
	    		valor2 = sc.nextDouble();
	    		resultado = calc.subtracao(valor1, valor2);
	    		
	    		System.out.println("Resultado: " + resultado);
	    		
	    		break;
	    		
	    	case 3:
	    		
	    		System.out.println("Informe o primeiro valor: ");
	    		valor1 = sc.nextDouble();
	    		System.out.println("Informe o segundo valor: ");
	    		valor2 = sc.nextDouble();
	    		resultado = calc.multiplicacao(valor1, valor2);
	    		
	    		System.out.println("Resultado: " + resultado);
	    		
	    		break;
	    		
	    	case 4: 
	    		
	    		System.out.println("Informe o primeiro valor: ");
	    		valor1 = sc.nextDouble();
	    		System.out.println("Informe o segundo valor: ");
	    		valor2 = sc.nextDouble();
	    		resultado = calc.divisao(valor1, valor2);
	    		
	    		System.out.println("Resultado: " + resultado);
	    		
	    		break;
	    			
	    	}
	    } else {
	    	System.out.println("Programa finalizado!!!");
	    }
sc.close();
	} 

}
