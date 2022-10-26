package unibh.EDAA.Prova.A1;

import unibh.EDAA.Prova.A1_1.A.Lista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Lista a = new Lista(4);
		
		
		if (!a.cheio()) {
			a.adicionar(50, 2);
		} else {
			System.out.println("Agenda cheia");
		}
		
		System.out.println(a.top());

	}

}
