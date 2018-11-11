package Events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.inventory.InventoryCloseEvent;
import cn.nukkit.item.Item;
import cn.nukkit.utils.TextFormat;

public class CloseEvent implements Listener {

  @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = false)
  public void event(InventoryCloseEvent event) { // EVENT

    Player player = (Player) event.getPlayer();

    Item bedrock = new Item(Item.BEDROCK);
    if (player.getInventory().contains(bedrock)) {
      player.getInventory().remove(bedrock);
      player.sendMessage(TextFormat.DARK_RED + "illegal bedrock removed");
    }
  }
}
