package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.*;


public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora do Código");
		palavras.add("Caelum");
		
		
		
		

//		Comparator<String> comparador = new ComparadorPorTamanho();

//		palavras.sort(comparador);

//		palavras.sort((s1,  s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("Primeira Palavra: " + palavras);
		
		
	

		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		System.out.println("Segunda Palavra: " + palavras);
//
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
		
		
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println("Terceira Palavra " + palavras);
		
		
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length()); 
		});
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		

		
		
		 

		
		
		
//			@Override
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length())
//					return -1;
//
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//			}
//		});


//		Consumer<String> consumidor = new Consumer<String>() {
//		@Override
//		public void accept(String s) {
//				System.out.println();
//			}
///		};
//
//		palavras.forEach(consumidor);

//	
//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});
//		
		//

		//palavras.forEach(s -> System.out.println(s));

		palavras.forEach(System.out::println);

	}


	

}



// Collections.sort(palavras,comparador);

//		System.out.println(palavras);

//		for (String p  : palavras) {
//			
//			System.out.println(p);
//		}
//		
//		Consumer<String> consumidor = new ImprimeNalinha();
//		palavras.forEach(consumidor);

//class ImprimeNalinha implements Consumer<String> {
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//
//	}
//
//}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;

		if (s1.length() > s2.length())
			return 1;
		return 0;
	}




}


