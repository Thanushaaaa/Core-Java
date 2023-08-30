package com.xworkz.shop.chocolate;

import java.awt.image.ImagingOpException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.NoSuchElementException;
import java.util.concurrent.RejectedExecutionException;

import javax.management.JMRuntimeException;
import javax.print.attribute.UnmodifiableSetException;

public class EventRunner extends RuntimeException {

	public static void main(String[] args) {
		int n = 18;
		if (n == 0) {
			throw new WrongMethodTypeException("Condition 0");
		}
		if (n == 1) {

			throw new ProviderNotFoundException("Condition 1");
		}
		if (n == 2) {

			throw new NegativeArraySizeException("Condition 2");
		}
		if (n == 3) {
			throw new FileSystemNotFoundException("Condition 2");
		}
		if (n == 4) {

			throw new IndexOutOfBoundsException("Condition 4");
		}
		if (n == 5) {

			throw new IllegalStateException("Condition 5");
		}
		if (n == 6) {

			throw new ArithmeticException("Condition 6");
		}
		if (n == 7) {

			throw new ArrayStoreException("Condition 7");
		}
		if (n == 8) {

			throw new BufferOverflowException();
		}
		if (n == 9) {

			throw new BufferUnderflowException();
		}
		if (n == 10) {

			throw new ClassCastException("Condition 10");
		}
		if (n == 11) {

			throw new EmptyStackException();
		}
		if (n == 12) {

			throw new UndeclaredThrowableException(null);
		}
		if (n == 13) {

			throw new UnmodifiableSetException("Condition 13");
		}
		if (n == 14) {

			throw new IllformedLocaleException("Condition 14");
		}
		if (n == 15) {

			throw new NoSuchElementException("Condition 15");
		}
		if (n == 16) {

			throw new JMRuntimeException("Condition 16");
		}
		if (n == 17) {

			throw new SecurityException("Condition 17");
		}
		if (n == 18) {

			throw new RejectedExecutionException("Condition 18");
		}
		if (n == 19) {

			throw new ImagingOpException(null);
		}
	}

}
