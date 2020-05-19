package br.com.java8;

public class AlteraClassificacaoArrays {

	public static void main(String[] args) {

		String  strs[] = {"this", "is" , "a" , "test", "of", "a", "string", "sort"};
		
		
		int a , b ;
		String  t ;
		int size;

		
		size = strs.length; // numero  de elemetos s sererm classificados
		
		// Exibe o array original
		
		System.out.println("Original Array is : ");
		for (int i=0 ; i< size; i++)
				System.out.println("" + strs[i]);
		System.out.println();
		
		//Esta é a classificacao por bolha para strings
		
		for(a=1; a<size; a ++)
			for (b = size-1; b >=a; b--) {
				if (strs[b-1].compareTo(strs[b])>0) {//se tiver fora de ordem
					//troca os elementos
					t = strs[b-1];
					strs[b-1]=strs[b];
					strs[b]=t;
					
					//Exibe o array classificado
					
					System.out.println("Sorted array is :");
					for(int i=0; i <size; i++)
						System.out.println(" " + strs[i]);
					
					System.out.println();
					
				// 	
					
				}
			}
			
		
		
		
		
	}

}
