package dev.matheus.apis;

public class SkullURL {
	
	/*public ItemStack getSkull(String url) {
		  ItemStack skull= new ItemStack(Material.SKULL_ITEM, 1, (short) 3);

		        if (url == null || url.isEmpty())
		            return skull;

		        ItemMeta skullMeta = head.getItemMeta();
		        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
		        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", skinURL).getBytes());
		        profile.getProperties().put("textures", new Property("textures", new String(encodedData)));
		        Field profileField = null;

		        try {
		            profileField = skullMeta.getClass().getDeclaredField("profile");
		        } catch (NoSuchFieldException | SecurityException e) {
		            e.printStackTrace();
		        }

		        profileField.setAccessible(true);

		        try {
		            profileField.set(headMeta, profile);
		        } catch (IllegalArgumentException | IllegalAccessException e) {
		            e.printStackTrace();
		        }

		        skull.setItemMeta(skullMeta);
		        return skull;
		}*/
	
	// https://minecraft-heads.com/custom-heads

}
