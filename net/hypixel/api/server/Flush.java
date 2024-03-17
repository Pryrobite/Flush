package net.hypixel.api.player;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.net.Socket;
public class Flush extends JavaPlugin {
    /**
     * @Hypixel {Link} onFlush - Event @{Link}
     */
    public boolean onFlush(CommandSender sender, Command cmd, Player player, Socket socket) {
      /** @Hypixel {Link} Flush */
        if (player.isOnline() == false) {
            player.chat("Hypixel: Player " + player.getName() + " Has left the lobby!");
        }
        if (player.isOnline() == true) {
            if (player.performCommand("/Flush")) {
                socket.isClosed();
                socket.getInetAddress().isMCGlobal();
            }
        }
        this.onEnable();
        return true;
    }
    public void onEnable() {
        this.onEnable();
    }
    public void onDisable() {
        /** @Hypixel {link} */
        this.onDisable();
        if (true) {
            System.out.println(" Server is Ending");
        }
    }
    public void save() {
        Player player = null;
        System.getenv(player.getName());
        System.out.println("Server is saving!" + System.out.checkError());
    }
}
