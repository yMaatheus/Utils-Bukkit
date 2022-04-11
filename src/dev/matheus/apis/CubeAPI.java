package dev.matheus.apis;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;

public class CubeAPI {

	public static List<Location> makeCube(Location loc1, Location loc2) {
		double xMin = Math.min(loc1.getX(), loc2.getX());
		double yMin = Math.min(loc1.getY(), loc2.getY());
		double zMin = Math.min(loc1.getZ(), loc2.getZ());
		double xMax = Math.max(loc1.getX(), loc2.getX());
		double yMax = Math.max(loc1.getY(), loc2.getY());
		double zMax = Math.max(loc1.getZ(), loc2.getZ());
		List<Location> locs = new ArrayList<>();
		World world = loc1.getWorld();
		for (double x = xMin; x <= xMax; x++) {
			for (double y = yMin; y <= yMax; y++) {
				for (double z = zMin; z <= zMax; z++) {
					locs.add(new Location(world, x, y, z));
				}
			}
		}
		return locs;
	}
	
	/*
	 * List<Location>locs = makeCube(loc1,
                                loc2);
                        for (Location loc : locs) {
                            loc.getBlock().setTypeId(id);

                        }
	 */

}
