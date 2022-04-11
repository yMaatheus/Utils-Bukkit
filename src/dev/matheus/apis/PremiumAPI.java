package dev.matheus.apis;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.jsoup.Jsoup;

public class PremiumAPI {

	public static boolean isPremium(Player p) {
		try {

			org.jsoup.nodes.Element e = Jsoup.connect("https://pt.namemc.com/search?q=" + p.getName()).get().getElementById("status-bar");

			if (e.className().contains("alert-warning")) {
				return true;
			} else if (e.className().contains("alert-success"))
				return false;
			return false;

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
