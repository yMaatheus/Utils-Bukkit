package dev.matheus.apis;

public class Codigos {
	
	
	/*
	 * SortedMap<Integer,String> numeros = new TreeMap<>();
 numeros.put(2000, "Jo�o");
 numeros.put(15, "Alex");    
 numeros.put(200, "Zilda");
    
 NavigableMap d = ((TreeMap<Integer, String>) numeros).descendingMap();
   
          System.out.println("Decrescente: " + d);
	 * 
	 * 
	 * 
	 * Sa�da:
Decrescente: {2000=Jo�o, 200=Zilda, 15=Alex}
	 * 
	 */
	
	
	/*
	 * Modo de uso: 

1� public ETimeData data = ETimeData.get(); Para inicializar a classe
2� voc� usar� 'data'.Aqui_Oque_Deseja_Fazer();
3� Salvar o tempo que foi pego

Exemplo de como fazer o cooldown:

data.getCurrentTime()+data.getDataType(SEU TEMPO(Ex: 5), Tipo(Ex: TimeType.Dia()))
^^ E salva esse valor

Para verificar o cooldown se foi expirado:
if (data.getCurrentTime() =< O VALOR QUE FOI SALVO){
Player.sendMessage(data.getTimeString(data.getCurrentTime()-O VALOR QUE FOI SALVO));
}

Para pegar o tempo em segundos:  data.getCurrentTime()
Transformar long em data: data.getDate(Tempo)

Tipos De TimeType:
Dia(), Mes(), Ano(), Hora(), Minuto(), Segundo();
Uso: TimeType.Mes()
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * /**
 * Procurar o player que se encontra mais proximo
 * da localiza��o especificada.
 * @param baseLoc Localiza��o base para fazer a procura.
 * @return O player mais proximo ou null caso n�o
 * exista nenhum player no mesmo mundo.
 * 
 * @Nullable
public static Player getNearestPlayer(Location baseLoc) {
    Player nearest = null;
    for (Player player : baseLoc.getWorld().getPlayers()) {
        if (nearest == null || player.getLocation().distanceSquared(baseLoc) < nearest.getLocation().distanceSquared(baseLoc))
            nearest = player;
    }
    return nearest;
}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/* Setar bloco rapidamente
	 * @SuppressWarnings("deprecation")
    public void setBlockFast(World world, int x, int y, int z, int blockId, byte data) {
        net.minecraft.server.v1_8_R3.World w = ((CraftWorld) world).getHandle();
        net.minecraft.server.v1_8_R3.Chunk chunk = w.getChunkAt(x >> 4, z >> 4);
        BlockPosition bp = new BlockPosition(x, y, z);
        int combined = blockId + (data << 12);
        IBlockData ibd = net.minecraft.server.v1_8_R3.Block.getByCombinedId(combined);
        chunk.a(bp, ibd);
        world.refreshChunk(chunk.locX, chunk.locZ);
    } 
	 * 
	 * 
	 * setBlockFast(world, block.getX(), block.getY(), block.getZ(), 2, 0);
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/*
	 * Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
 Date data = (Date) c.getTime();

int dia = data.getDay();
int hora = data.getHours();
 int min = data.getMinutes();





TimeZone zone = TimeZone.getTimeZone("GMT-03:00");
Locale local = new Locale("pt", "BR");
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/*
	 * 
	 * Forma correta de usar o Vault Permissions Classe (p = OfflinePlayer)
VaultAPI.getPermission().playerRemoveGroup(null,p, vip.getName());

VaultAPI.getPermission().playerAddGroup(null,p, vipName);
	 * 
	 * 
	 */
	
	
	/*
	 * 
	 * ArmorStand armor = p.getLocation.getWorld().spawn(p.getLocation, ArmorStand.class); 
armor.setPassenger(Player);
	 * 
	 * 
	 * 
	 */

}
