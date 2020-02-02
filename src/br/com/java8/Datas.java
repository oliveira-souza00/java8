package br.com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		
		
	LocalDate hoje =  LocalDate.now();
	System.out.println(hoje);
	
	LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 20);
	
	int anos = (olimpiadasRio.getYear() - hoje.getYear());
	//1
	System.out.println("Qual o Ano: " + anos);
	//2
	Period perido = Period.between(hoje, olimpiadasRio);
	//3
	System.out.println(perido.getDays());
	
	olimpiadasRio.plusYears(4);
	//4
	System.out.println(olimpiadasRio);
	
	
	LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
	
	//5
	System.out.println(proximasOlimpiadas);
	
	DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
	String dataFormatada = proximasOlimpiadas.format(formatador);
		//6
	System.out.println(dataFormatada);
	
	
	LocalDateTime agora1 = LocalDateTime.now();
	System.out.println(agora1.format(formatador));
	
	
	DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
	LocalDateTime agora = LocalDateTime.now();
	System.out.println(agora.format(formatadorComHora));
	
	YearMonth mes= YearMonth.now();
	System.out.println(mes);
	
	LocalDateTime data3 = LocalDateTime.now();
	System.out.println(data3);
	
	
	
		
	}

}
