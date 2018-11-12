package main.java.bedrockrmval.Main.Main.Main;

import Events.CloseEvent;
import Events.OnPlace;
import Events.OpenEvent;
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
