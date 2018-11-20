/*
 *  Copyright (c) 2B2TMCBE™ - All Rights Reserved
 *  Licensed under the MIT License. See LICENSE in the project root for more information
 */
package bedrockrmval.Main.Main.Main.Events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.inventory.InventoryOpenEvent;
import cn.nukkit.item.Item;
import cn.nukkit.utils.TextFormat;

public class OpenEvent implements Listener {

  @EventHandler(priority = EventPriority.LOW, ignoreCancelled = false)
  public void event(InventoryOpenEvent event) { // EVENT

    Player player = event.getPlayer();
    if (!(player.isOp())) {
      Item bedrock = new Item(Item.BEDROCK);
      if (player.getInventory().contains(bedrock)) {
        player.getInventory().remove(bedrock);
        player.sendMessage(TextFormat.DARK_RED + "illegal bedrock removed");
      }
    }
  }
}
