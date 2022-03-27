package manager;

public class Managers {
    private Managers(){};

    public TaskManager getDefault(){
        return null;//new InMemoryTaskManager ();
    }

    public static HistoryManager getDefaultHistory(){
        return new InMemoryHistoryManager();
    }
}
