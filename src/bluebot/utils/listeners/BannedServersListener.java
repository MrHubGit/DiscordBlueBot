package bluebot.utils.listeners;

import bluebot.MainBot;
import net.dv8tion.jda.entities.Guild;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;
import net.dv8tion.jda.managers.RoleManager;

import javax.management.relation.Role;
import javax.management.relation.RoleList;
import java.lang.reflect.Member;


/**
 * @file BannedServersListener.java
 * @author Blue
 * @version 0.1
 * @brief Make the bot leave the server. Created due to user creating "spam-servers" to overload small bots.
 */
public class BannedServersListener extends ListenerAdapter {



    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(MainBot.getBannedServers().containsKey(event.getGuild().getId())) {
            event.getGuild().getManager().leave();
        } //leaves the banned server
    }
}
