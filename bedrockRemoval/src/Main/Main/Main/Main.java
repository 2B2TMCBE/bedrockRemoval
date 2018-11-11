package Main.Main.Main;

import Events.CloseEvent;
import Events.OnPlace;
import Events.OpenEvent;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

  public static Main plugin;

  public static Main getInstance() {
    return plugin;
  }

  // CODE STARTS HERE.
  public void onLoad() {
    plugin = this;
  }

  public void onEnable() {
    regEvents();
  }

  public void onDisable() {

  }

  public void regEvents() {
    // Register the EventListener
    this.getServer().getPluginManager().registerEvents(new OpenEvent(), this);
    this.getServer().getPluginManager().registerEvents(new CloseEvent(), this);
   //this.getServer().getPluginManager().registerEvents(new OnPlace(), this);
  }
}
