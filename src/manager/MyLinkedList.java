package manager;

import model.Status;
import model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO change to Task
public class MyLinkedList {

    transient Node<Task> first;
    transient Node<Task> last;

    private Map<Integer, Node<Task>> map = new HashMap<>();

    public void linkLast(Task element) {
        Node<Task> newNode = new Node<>(last, element, null);
        map.put(element.getId(), newNode);
        if (first == null) {
            //список пуст, newNode будет и первой и последней нодой в списке
            first = newNode;
            last = newNode;
            return;
        }
        last.next = newNode;
        last = newNode;

    }

    public void remove(Task data){
        Node<Task> taskNode = map.get(data.getId());
        if (taskNode == null){
            System.out.println("no such task in a list");
            return;
        }
        if (first.data.getId() == data.getId()){
            //удаляем самую первую ноду
            first = first.next;
            map.remove(data.getId());
        } else if (last.data.getId() == data.getId()){
            //удаляем самую последнюю ноду
            last.prev.next = null;
            last = last.prev;
            map.remove(data.getId());
        } else {
            //наша нода посередине
            taskNode.prev.next =taskNode.next;
            taskNode.next.prev = taskNode.prev;
            map.remove(data.getId());
        }

    }

    public List<Task> getAll(){
        Node<Task> node = first;
        List<Task> list = new ArrayList<>();
        while (node != null){
            list.add(node.data);
            node = node.next;
        }
        return  list;
    }

    static class Node<R> {
        public R data;
        public Node<R> next;
        public Node<R> prev;

        public Node(Node<R> prev, R data, Node<R> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.getAll());
        Task a = new Task("nameA", "descrA", Status.NEW);
        a.setId(1);
        list.linkLast(a);
        System.out.println(list.getAll());
        Task b = new Task("nameB", "descrB", Status.NEW);
        b.setId(2);
        list.linkLast(b);
        System.out.println(list.getAll());
        Task c = new Task("nameC", "descrC", Status.NEW);
        c.setId(3);
        list.linkLast(c);
        System.out.println(list.getAll());

        //list.remove(a);
        //list.remove(b);
        //list.remove(c);
        System.out.println(list.getAll());

    }
}
