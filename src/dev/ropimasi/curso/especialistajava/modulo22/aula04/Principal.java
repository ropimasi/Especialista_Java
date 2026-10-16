package dev.ropimasi.curso.especialistajava.modulo22.aula04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		DateFormat formatador1 = DateFormat.getDateInstance();
        System.out.println(formatador1.format(data));
        
        DateFormat formatador2 = DateFormat.getTimeInstance();
        System.out.println(formatador2.format(data));
        
        DateFormat formatador3 = DateFormat.getDateTimeInstance();
        System.out.println(formatador3.format(data));
        
        DateFormat formatador4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        System.out.println(formatador4.format(data));
        
        DateFormat formatador5 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        System.out.println(formatador5.format(data));
        
        DateFormat formatador6 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        System.out.println(formatador6.format(data));
        
        System.out.println();
        
        SimpleDateFormat formatadorSimple1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatadorSimple1.format(data));
        
        SimpleDateFormat formatadorSimple2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatadorSimple2.format(data));
        
        SimpleDateFormat formatadorSimple3 = new SimpleDateFormat("HH:mm:ss");
        System.out.println(formatadorSimple3.format(data));
        
	}

}
