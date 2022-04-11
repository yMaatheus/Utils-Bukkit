package dev.matheus.apis;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkAPI {
	
	public static Firework newFirework(Location local, int altura, Color cor, Color fade, boolean trail,
            boolean flicker, FireworkEffect.Type tipo) {
        Firework firework = local.getWorld().spawn(local, Firework.class);
        FireworkMeta meta = firework.getFireworkMeta();
        meta.setPower(altura);
        meta.addEffect(FireworkEffect.builder().with(tipo).trail(trail).flicker(flicker).withColor(cor).withFade(fade)
                .build());
        firework.setFireworkMeta(meta);

        return firework;
    }
	
	// newFirework(p.getLocation(), 10, Color.Blue, Color.Black, true, true, Type.BALL_LARGE);

}
