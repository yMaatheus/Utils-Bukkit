package dev.matheus.apis;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ChangeNameAPI {
	
	@SuppressWarnings("unused")
	private static void changeName(Player player, String name) {
	    try {
	        Method getHandle = player.getClass().getMethod("getHandle", (Class<?>[]) null);
	        try {
	            Class.forName("com.mojang.authlib.GameProfile");
	        } catch (ClassNotFoundException e) {
	            return;
	        }
	        Object profile = getHandle.invoke(player).getClass().getMethod("getProfile").invoke(getHandle.invoke(player));
	        Field ff = profile.getClass().getDeclaredField("name");
	        ff.setAccessible(true);
	        ff.set(profile, name);
	        for (Player players : Bukkit.getOnlinePlayers()) {
	            players.hidePlayer(player);
	            players.showPlayer(player);
	        }
	    } catch (Exception e) {
	    }
	}

}
