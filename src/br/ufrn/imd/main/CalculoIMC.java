package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.dominio.Pessoa;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o nome da pessoa: ");
			p.setNome(sc.nextLine());
			
			System.out.println("Digite o peso de " + p.getNome());
			p.setPeso(sc.nextDouble());
			
			System.out.println("Digite a altura de " + p.getNome());
			p.setAltura(sc.nextDouble());

			double IMC = p.getPeso()/Math.pow(p.getAltura(), 2);
			
			System.out.println("O IMC de " + p.getNome() + " é " + IMC);
			
			//Implementar as regras do IMC
			
		} finally {
			sc.close();
		}
		
		
	}
	
}
