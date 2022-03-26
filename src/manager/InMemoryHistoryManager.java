package manager;

import model.Task;

import java.util.ArrayList;

public class InMemoryHistoryManager implements HistoryManager{
    ArrayList<Task> history = new ArrayList<>();
    MyLinkedList<Task> linkedHystory = new MyLinkedList<>();

    @Override
    public ArrayList<Task> getHistory() {
        while (true){
            if (history.size() > 10){
                history.remove(0);
            } else if (history.size() <= 10){
                break;
            }
        }
        return history;
    }

    @Override
    public MyLinkedList<Task> getHistory1() {
        return linkedHystory;
    }

    @Override
    public void add(Task task){
        history.add(task);
    }

    @Override
    public void remove(Task task) {
        history.remove(task);
    }

    @Override
    public void linkLast(Task task) {
        linkedHystory.linkLast(task);
    }

}
