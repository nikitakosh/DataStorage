package com.nikitaandrey.DataStorage;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendDocument;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SendVideo;
import com.pengrad.telegrambot.response.BaseResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StorageAdministratorBot implements Bot{
    @Value("${bot.token}")
    private String telegramToken;

    private TelegramBot bot;
    @Override
    public <T extends BaseRequest<T, R>, R extends BaseResponse> void execute(BaseRequest<T, R> request) {
        bot.execute(request);
    }

    @Override
    public int process(List<Update> list) {
        return 0;
    }

    @Override
    public void start() {
        bot = new TelegramBot(telegramToken);
        bot.setUpdatesListener(this);
        File file;
        file = new File("C:\\Users\\nikita\\Downloads\\IMG_6308.MP4");
        bot.execute(new SendVideo(
                -1002099220535L,
                file
        ));

    }

    @Override
    public void close() {

    }
}
