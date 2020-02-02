package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Java Script", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		// cursos.forEach(c -> System.out.println(c.getNome()));

		// cursos.forEach(c -> System.out.println( "Nome :" + c.getNome() + " Número: "
		// + c.getAlunos()));

//		cursos.stream()
//			.filter(c -> c.getAlunos() >=100)
//			.map(c -> c.getAlunos())
//		    .forEach(c -> System.out.println(c));
//	
//
//		int soma = cursos.stream()
//				.filter(c -> c.getAlunos() >= 100)
//				.mapToInt(Curso::getAlunos).sum();
//
//				System.out.println(soma);

		// .forEach(c -> System.out.println(c));
		
		
				//Optional<Curso> optional = cursos.stream()
				//.filter(c -> c.getAlunos()>=100)
				//.findAny();
				//Curso curso = optional.get();
					
				//optional.ifPresent(c -> System.out.println(c.getNome()));
				
				cursos.stream()
					.filter(c -> c.getAlunos() > 100)
					.findAny()
					.ifPresent(c -> System.out.println(c.getNome()));
				
					
					
					
					
				 
					
				

	}
}