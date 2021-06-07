package dev.is_a.acaiberii.client.client.module.mods.chat;

import dev.is_a.acaiberii.client.BeriiOnToppe;
import dev.is_a.acaiberii.client.client.module.Category;
import dev.is_a.acaiberii.client.client.module.Module;
import dev.is_a.acaiberii.client.client.setting.impl.ModeSetting;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatSuffix extends Module {

    public ChatSuffix() {
        super("ChatSuffix", Category.Chat);
    }

    @SubscribeEvent
    public void onChat(ClientChatEvent event) {
        if (event.getMessage().startsWith("/") || event.getMessage().startsWith(String.valueOf(BeriiOnToppe.commandManager.prefix)))
            return;
        event.setMessage(event.getMessage().concat(" | \uD835\uDE82\uD835\uDE91\uD835\uDE8A\uD835\uDE99\uD835\uDE8E\uD835\uDE9C\uD835\uDE91\uD835\uDE92\uD835\uDE8F\uD835\uDE9D"));
        mc.ingameGUI.getChatGUI().addToSentMessages(event.getOriginalMessage());
    }
}