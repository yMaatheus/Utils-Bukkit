package dev.matheus.apis;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.bukkit.entity.Player;

public enum PlayerVersion {

	v1_7, v1_8, v1_9, v1_10, v1_11, v1_12;

	public static PlayerVersion getPlayerVersion(Player player) throws Exception {
		Class<?> craftPlayer = Class.forName("org.bukkit.craftbukkit." + Main.plugin.getServer().getVersion() + ".entity.CraftPlayer");
		Method getHandle = craftPlayer.getMethod("getHandle");
		Object toInvoke = getHandle.invoke(player);
		Field playerConnection = toInvoke.getClass().getDeclaredField("playerConnection");
		Object getConnection = playerConnection.get(toInvoke);
		Field networkManager = getConnection.getClass().getDeclaredField("networkManager");
		Object getManager = networkManager.get(getConnection);
		Method getVersion = getManager.getClass().getDeclaredMethod("getVersion");
		int version = (int) getVersion.invoke(getManager);
		switch (version) {
		case 340:
		case 338:
		case 335:
			return PlayerVersion.v1_12;
		case 316:
		case 315:
			return PlayerVersion.v1_11;
		case 210:
			return PlayerVersion.v1_10;
		case 110:
		case 109:
		case 108:
		case 107:
			return PlayerVersion.v1_9;
		case 47:
			return PlayerVersion.v1_8;
		case 5:
		case 4:
			return PlayerVersion.v1_7;
		default:
			break;
		}
		return null;
	}

}
