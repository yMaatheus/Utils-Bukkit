package dev.matheus.apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

	/*
	 * public static void main(String[] args) {
	 * 
	 * int distance = 100; boolean find = false;
	 * 
	 * int _x = 0; int _z = 0;
	 * 
	 * for (int x = 0; ; x+=distance){ if (find)break; for (int z = 0; ; z+=
	 * distance){ if( find)break; if (verifica se tem ilha){ find = true; _x =
	 * x; _z = z; } } } }
	 */

	public static void main(String[] args) {
		String num = "22,33,44,55,66,77";
		String str[] = num.split(",");
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for(String s: al){
		   System.out.println(s);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(al);
		
	}
}