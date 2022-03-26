package manager;

import model.Task;

import java.util.ArrayList;

public interface HistoryManager {

    ArrayList<Task> getHistory();

    void add(Task task);

    void remove(Task task);

    void linkLast(Task task);

    MyLinkedList<Task> getHistory1();

}
