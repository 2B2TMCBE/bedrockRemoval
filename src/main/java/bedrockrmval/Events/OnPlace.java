package Events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockPlaceEvent;
import cn.nukkit.item.Item;
import cn.nukkit.utils.TextFormat;

public class OnPlace implements Listener {

  // NOT WORKING {WARNING} NOT WORKING.

  @EventHandler(priority = EventPriority.LOW, ignoreCancelled = false)
  public void event(BlockPlaceEvent event) { // EVENT

    Player player = event.getPlayer();
    if (!(player.isOp())) {
      Item bedrock = new Item(Item.BEDROCK);
      if (event.getBlock().equals(Item.BEDROCK)) {
        player.getInventory().remove(bedrock);
        event.setCancelled(true);
        player.sendMessage(TextFormat.DARK_RED + "illegal bedrock removed");
      }
    }
  }
}
