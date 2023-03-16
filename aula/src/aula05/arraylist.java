package aula05;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(3);
		numeros.add(5);
		numeros.add(6);
			
		System.out.println("antes " + numeros.size());
		System.out.println(numeros.toString());
		numeros.add(10);
		System.out.println("depois " + numeros.size());
		System.out.println(numeros.toString());
		
		for(int i = 0; i<numeros.size(); i++) {
			System.out.println("["+i+"]: " + numeros.get(i));
		}
		
		numeros.remove(2);
		System.out.println("pos remoção " + numeros.toString());
		
		
		Integer obj_num = 5;
		numeros.remove(obj_num);
		System.out.println("pos remoção " + numeros.toString());
		
		numeros.contains(3);
		System.out.println(	numeros.contains(3));
		
		numeros.set(0, 4);
		System.out.println("pos alteração " + numeros.toString());
		
		
		numeros.add(0);
		numeros.add(20);
		numeros.add(7);
		System.out.println("antes ordenação " + numeros.toString());
		Collections.sort(numeros);
		System.out.println("pos ordenação " + numeros.toString());

		
		
		
		
	}
}
