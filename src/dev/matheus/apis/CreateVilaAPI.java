package dev.matheus.apis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class CreateVilaAPI {
	
	String s =  Main.plugin.getServer().getClass().getName();
	String nms = "net.minecraft.server." + s.replace(".", ",").split(",")[3] + ".";
	String cb = "org.bukkit.craftbukkit." + s.replace(".", ",").split(",")[3] + ".";
	// create(mundo, x, z, tamanho, raio)
	@SuppressWarnings("rawtypes")
	public void create(World w, int i, int j, int k, int r) {
	    try {
	        Class<?> wg = Class.forName(String.valueOf(this.nms) + "WorldGenVillage$WorldGenVillageStart");
	        Class<?> cw = Class.forName(String.valueOf(this.cb) + "CraftWorld");
	        Class<?> sb = Class.forName(String.valueOf(this.nms) + "StructureBoundingBox");
	        Class<Integer> Int = Integer.TYPE;
	        Method cwm = cw.getMethod("getHandle", new Class[0]);
	        Method wgm = wg.getMethod("a", Class.forName(String.valueOf(this.nms) + "World"), Random.class, sb);
	        Constructor sbc = sb.getConstructor(Int, Int, Int, Int);
	        Object sbo = sbc.newInstance(i - r, j - r, i + r, j + r);
	        Constructor wgc = wg.getConstructor(Class.forName(String.valueOf(this.nms) + "World"), Random.class, Int, Int, Int);
	        Object wgo = wgc.newInstance(cwm.invoke(cw.cast((Object)w), new Object[0]), new Random(), i >> 4, j >> 4, k);
	        wgm.invoke(wgo, cwm.invoke(cw.cast((Object)w), new Object[0]), new Random(), sbo);
	    }catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public void create(Player p, int i) {
	    Location l = p.getLocation();
	    this.create(l.getWorld(), l.getBlockX(), l.getBlockZ(), i, 1000);
	}

}
