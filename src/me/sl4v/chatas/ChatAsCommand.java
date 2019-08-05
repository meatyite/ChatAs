package me.sl4v.chatas;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatAsCommand implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (sender instanceof Player)
        {
            Player player = (Player) sender;
            ChatAsUtils utils = new ChatAsUtils(player);
            if (!player.isOp())
            {
                utils.showErrorToPlayer(ChatAsUtils.noOPError);
                return true;
            }
            if (command.getName().equals("chatas"))
            {
                if (args.length >= 2)
                {
                    try
                    {
                        Player playerToChatAs = Bukkit.getPlayer(args[0]);
                        String toChat = ChatAsUtils.concentrateFromIndex(args, 1);
                        playerToChatAs.chat(toChat);

                    } catch (Exception e)
                    {
                        utils.showErrorToPlayer(ChatAsUtils.invalidArgumentsError);
                        // throw (e); // Debug stuff, i'll comment this later
                        return false;
                    }

                } else
                {
                    utils.showErrorToPlayer(ChatAsUtils.notEnoughArgumentsError);
                    return false;
                }
            }
        }
        return true;
    }
}
