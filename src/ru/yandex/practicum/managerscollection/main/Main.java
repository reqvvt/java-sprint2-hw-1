package ru.yandex.practicum.managerscollection.main;


import ru.yandex.practicum.managerscollection.Managers;
import ru.yandex.practicum.managerscollection.interfaces.TaskManager;
import ru.yandex.practicum.servers.HTTPTaskServer;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        TaskManager taskManager  = Managers.getDefault();


            new HTTPTaskServer(taskManager).start();

    }
}