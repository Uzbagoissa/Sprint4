package manager;

import model.Task;

import java.util.List;

public class InMemoryHistoryManager implements HistoryManager{
    MyLinkedList linkedHystory = new MyLinkedList();

    @Override
    public List<Task> getHistory() {
        return linkedHystory.getAll();
    }

    @Override
    public void add(Task task){
        linkedHystory.linkLast(task);
    }

    @Override
    public void remove(Task task) {
        linkedHystory.remove(task);
    }

}
