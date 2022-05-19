package ru.yandex.practicum.managerscollection.interfaces;

import ru.yandex.practicum.tasks.Task;

import java.util.Collection;
import java.util.List;

public interface HistoryManager {

    void add(Task task);

    void remove(Long id);

    List<Task> getHistory();
}

