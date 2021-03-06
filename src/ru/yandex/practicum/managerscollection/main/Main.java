package ru.yandex.practicum.managerscollection.main;

import ru.yandex.practicum.managerscollection.Managers;
import ru.yandex.practicum.managerscollection.interfaces.TaskManager;
import ru.yandex.practicum.servers.HttpTaskServer;
import ru.yandex.practicum.servers.KVServer;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        KVServer kvServer = new KVServer();
        kvServer.start();
        TaskManager manager = Managers.getDefault();
        HttpTaskServer server = new HttpTaskServer(manager);
        server.start();

    }
}