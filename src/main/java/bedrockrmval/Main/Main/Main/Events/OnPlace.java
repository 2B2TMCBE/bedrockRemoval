/*
 *  Copyright (c) 2B2TMCBE™ - All Rights Reserved
 *  Licensed under the MIT License. See LICENSE in the project root for more information
 */
package bedrockrmval.Main.Main.Main.Events;

import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockPlaceEvent;
import cn.nukkit.item.Item;
import cn.nukkit.utils.TextFormat;

public class OnPlace implements Listener {

  // NOT WORKING {WARNING} NOT WORKING

  @EventHandler(priority = EventPriority.LOW, ignoreCancelled = false)
  public void event(BlockPlaceEvent event) { // EVENT

    Player player = event.getPlayer();
    if (!(player.isOp())) {
      Item bedrock = new Item(Item.BEDROCK);
      if (event.getBlock().getId() == Block.BEDROCK) {
        event.setCancelled(true);
        player.getInventory().remove(bedrock);
        player.sendMessage(TextFormat.DARK_RED + "illegal bedrock removed");
      }
    }
  }
}
