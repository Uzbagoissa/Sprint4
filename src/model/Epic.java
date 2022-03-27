package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Epic extends Task {
    private HashMap<Integer, Subtask> subTaskMap = new HashMap<>();
    ;

    public Epic(String name, String description, Status status) {
        super(name, description, status);
    }

    public List<Subtask> getSubTasksList() {
        return new ArrayList<>(subTaskMap.values());
    }

    @Override
    public Status getStatus() {
        ArrayList<Status> statuses = new ArrayList<>();
        for (Subtask task : subTaskMap.values()) {
            Subtask subtask = task;
            statuses.add(subtask.getStatus());
        }
        if (subTaskMap.isEmpty()) {
            return Status.NEW;
        } else if (!statuses.contains(Status.NEW) && statuses.contains(Status.DONE)) {
            return Status.DONE;
        } else if (statuses.contains(Status.NEW) && !statuses.contains(Status.DONE)) {
            return Status.NEW;
        }
        return Status.IN_PROGRESS;

    }

    public void addSubTask(Subtask subtask) {
        subTaskMap.put(subtask.getId(), subtask);
    }

    public void clearAllSubTasks() {
        subTaskMap.clear();
    }
}


