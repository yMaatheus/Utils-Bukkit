package dev.matheus.apis;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class BlockNearbyAPI {

	public static boolean isMaterialNearby(Block block, int maxradius, Material materialToSearchFor) {
		BlockFace[] faces = { BlockFace.UP, BlockFace.NORTH, BlockFace.EAST };
		BlockFace[][] orth = { { BlockFace.NORTH, BlockFace.EAST }, { BlockFace.UP, BlockFace.EAST },
				{ BlockFace.NORTH, BlockFace.UP } };
		for (int r = 0; r <= maxradius; r++) {
			for (int s = 0; s < 6; s++) {
				BlockFace f = faces[s % 3];
				BlockFace[] o = orth[s % 3];
				if (s >= 3) {
					f = f.getOppositeFace();
				}
				if (!(block.getRelative(f, r) == null)) {
					Block c = block.getRelative(f, r);
					for (int x = -r; x <= r; x++) {
						for (int y = -r; y <= r; y++) {
							Block a = c.getRelative(o[0], x).getRelative(o[1], y);
							if (a.getType() == materialToSearchFor) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

}
