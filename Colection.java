package PortoSeguro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> minhaLista = new ArrayList<Integer>();

		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(5);
		for (Integer listaElemento: minhaLista)
		{
		 System.out.println(listaElemento);
		}
		System.out.println("\n removendo um item da lista ...");
		System.out.println();
		minhaLista.remove(0);
		
		for (Integer listaElemento: minhaLista)
		{
		 System.out.println(listaElemento);
		 
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\n primeiro elemento da minha  lista ...");
		System.out.println();
		
		for(int i=0; i<minhaLista.size();i++) 
		{
			System.out.println("\n primeiro elemento da minha  lista ...");
		}
		
		Set<Integer> meuSet = new HashSet<Integer> ();
		
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(2);
		
		
	}
}


