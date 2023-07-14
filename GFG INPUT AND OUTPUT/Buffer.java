/*package whatever //do not write package name here */

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Buffer {
	public static void main(String[] args)
	{
		// creating the instance of class BufferedReader
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		String name;
		try {
			System.out.println("Enter your name");
			name = reader.readLine(); // taking string input
			System.out.println("Name=" + name);
		}
		catch (Exception e) {
		}
	}
}
