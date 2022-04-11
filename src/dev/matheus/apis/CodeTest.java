package dev.matheus.apis;

public class CodeTest {
	
	public static void main(String[] args) {
		int radius = 10; //100000
		
		/*int x = 0;
		int y = 0;*/
		int i = 0;
		for (int x = 0; x <= radius; x += 100) {
			for (int z = 0; z <= radius; z += 100) {
				i++;
				System.out.println("X: " + x + " Z: " + z);
			}
		}
		System.out.println("");
		System.out.println("Quantia: " + i);
	}
}