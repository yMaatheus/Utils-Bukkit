package dev.matheus.apis;

import java.util.Random;

public class RandomStringAPI {

	public String randomString(int tamanho) {
		StringBuilder sb = new StringBuilder();
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		int i = 0;
		for (int t = 0; t < tamanho; t++) {
			i = new Random().nextInt(a.length());
			sb.append(a.substring(i, i + 1));
		}
		return sb.toString();
	}

}
