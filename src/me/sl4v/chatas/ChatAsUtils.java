package me.sl4v.chatas;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatAsUtils
{
    Player player;
    public ChatAsUtils(Player player)
    {
        this.player = player;
    }

    public void showErrorToPlayer(String errorMsg)
    {
        this.player.sendMessage(ChatColor.RED + "ERROR" + ChatColor.WHITE + ": " + ChatColor.RED + errorMsg);
    }

    static String noOPError = "You must require OP to run this command";

    static String notEnoughArgumentsError = "Not enough arguments";

    static String invalidArgumentsError = "Invalid arguments";

    static String concentrateFromIndex(String[] stringArray, int index)
    {
        String concentratedString = "";
        for (int i = index; stringArray.length > i; i++)
        {
            concentratedString += stringArray[i] + " ";
        }
        return concentratedString;
    }
}
