/*
 *  Copyright (c) 2B2TMCBE™ - All Rights Reserved
 *  Licensed under the MIT License. See LICENSE in the project root for more information
 */
package bedrockrmval.Main.Main.Main;

import bedrockrmval.Main.Main.Main.Events.CloseEvent;
import bedrockrmval.Main.Main.Main.Events.OnPlace;
import bedrockrmval.Main.Main.Main.Events.OpenEvent;

import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

  public static Main plugin;

  /**
   * Create an instance of the Main class
   * @return Main plugin
   */
  public static Main getInstance() {
    return plugin;
  }

  // CODE STARTS HERE.
  @Override
  public void onLoad() {
    plugin = this;
  }
  
  @Override
  public void onEnable() {
    regEvents();
  }

  @Override
  public void onDisable() {

  }

  /**
   * Register all the events
   */
  public void regEvents() {
    // Register the EventListener
    this.getServer().getPluginManager().registerEvents(new OpenEvent(), this);
    this.getServer().getPluginManager().registerEvents(new CloseEvent(), this);
    this.getServer().getPluginManager().registerEvents(new OnPlace(), this);
  }
}
