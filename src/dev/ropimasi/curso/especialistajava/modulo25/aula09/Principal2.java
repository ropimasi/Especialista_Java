package dev.ropimasi.curso.especialistajava.modulo25.aula09;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Principal2 {

	public static void main(String[] args) {
		IntPredicate predicate = num -> num > 10;
		IntFunction<String> function = num -> "Número: " + num;
		IntSupplier supplier = () -> 10;
		IntConsumer consumer = num -> System.out.println("Número: " + num);
		
		
		System.out.println(predicate.test(9));
		System.out.println(function.apply(10));
		System.out.println(supplier.getAsInt());
		consumer.accept(11);
		
	}

}
