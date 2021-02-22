package com.github.javarushcommunity.jrtb.command;

import com.github.javarushcommunity.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Start {@link Command}.
 */
public class StartCommand  implements  Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE="Привіт! Я JavaRush Telegram Bot. " +
                                             "Моя задача - повідомляти про нові статті тих авторів, " +
                                             "які тобі цікаві. Поки мій функціонал достатньо обмежений.";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
