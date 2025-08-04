package com.exception;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw  = new FileWriter("Info.txt");

		System.out.println("Hi");

		fw.close();

	}
}