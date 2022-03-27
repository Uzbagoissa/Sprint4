/*
package manager;

import model.Epic;
import model.Status;
import model.Subtask;
import model.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemoryTaskManager implements TaskManager {
    private HashMap<Integer, Task> taskList;
    private HashMap<Integer, Epic> epicList;
    private int idNumber;
    private HistoryManager inMemoryHistoryManager;

    public InMemoryTaskManager() {
        this.taskList = new HashMap<>();
        this.epicList = new HashMap<>();
        this.idNumber = 0;
        //to constructor
        this.inMemoryHistoryManager = Managers.getDefaultHistory();
    }

    public HashMap getTasksList() {
        return taskList;
    }

    public HashMap getEpicsList() {
        return epicList;
    }

    ArrayList<Task> getHistory() {
        return inMemoryHistoryManager.getHistory();
    }

    @Override
    public HashMap createTask(Task task) {
        idNumber += 1;
        task.setId(idNumber);
        //set ID
        taskList.put(idNumber, task);

        return taskList;
    }

    @Override
    public HashMap createEpic(Epic epic) {
        idNumber += 1;
        epic.setId(idNumber);
        epicList.put(idNumber, epic);
        return epicList;
    }

    @Override
    public HashMap createSubTask(int epicId, Subtask subtask) {
        idNumber += 1;
        subtask.setId(idNumber);
        Epic epic = epicList.get(epicId);
        if (epic == null) {
            System.out.println("...");
            return null;
        }
        epic.addSubTask(subtask);

        //TODO
        return null;
    }

    @Override
    public HashMap clearAllTasks() {
        taskList.clear();
        return taskList;
    }

    @Override
    public HashMap clearAllEpic() {
        epicList.clear();
        return epicList;
    }

    @Override
    public HashMap clearAllSubTasks(int idNumber) {
        Epic epic = epicList.get(idNumber);
        epic.clearAllSubTasks();
        //TODO
        //return epic.getSubTasksList();
        return null;
    }

    @Override
    public Task getAnyTaskById(int idNumber) {
        Task task = null;
        if (taskList.get(idNumber) != null) {
            task = taskList.get(idNumber);
        } else if (epicList.get(idNumber) != null) {
            task = epicList.get(idNumber);
        }
        inMemoryHistoryManager.add(task);
        inMemoryHistoryManager.linkLast(task);
        return task;
    }

    @Override
    public Subtask getSubTaskById(int epicIdNumber, int subtaskIdNumber) {
        Epic epic = epicList.get(epicIdNumber);
        HashMap<Integer, Subtask> subTaskList = epic.getSubTasksList();
        Subtask task = null;
        if (subTaskList.get(subtaskIdNumber) != null) {
            task = subTaskList.get(subtaskIdNumber);
        }
        inMemoryHistoryManager.add(task);
        inMemoryHistoryManager.linkLast(task);
        return task;
    }

    @Override
    public HashMap renewTaskById(Task newTask, int idNumber) {
        newTask.setStatus(Status.NEW);
        taskList.put(idNumber, newTask);
        return taskList;
    }

    @Override
    public HashMap renewEpicById(Epic newEpic, int idNumber) {
        newEpic.setStatus(Status.NEW);
        epicList.put(idNumber, newEpic);
        return epicList;
    }

    @Override
    public HashMap renewSubTaskById(Epic epic, Subtask newSubTask, int idNumber) {
        HashMap<Integer, Subtask> subTaskList = epic.getSubTasksList();
        newSubTask.setStatus(Status.NEW);
        subTaskList.put(idNumber, newSubTask);
        changeEpicStatus(epic);
        return subTaskList;
    }

    @Override
    public HashMap clearTaskById(int idNumber) {
        taskList.remove(idNumber);
        return taskList;
    }

    @Override
    public HashMap clearEpicById(int idNumber) {
        epicList.remove(idNumber);
        return epicList;
    }

    @Override
    public HashMap clearSubTaskById(Epic epic, int idNumber) {
        HashMap<Integer, Subtask> subTaskList = epic.getSubTasksList();
        subTaskList.remove(idNumber);
        changeEpicStatus(epic);
        return subTaskList;
    }

    @Override
    public String getTaskStatusById(int idNumber) {
        Task task = taskList.get(idNumber);
        return String.valueOf(task.getStatus());
    }

    @Override
    public String getEpicStatusById(int idNumber) {
        Epic epic = epicList.get(idNumber);
        return String.valueOf(epic.getStatus());
    }


}*/
