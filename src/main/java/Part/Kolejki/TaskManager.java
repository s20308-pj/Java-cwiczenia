package Part.Kolejki;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class TaskMenager {
    Queue<Task> queue = new PriorityQueue<>(new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
            return -Integer.compare(o1.getPriority().priorityNumber, o2.getPriority().priorityNumber);
        }
    });


    public void add(Task task){
        queue.offer(task);
    }

    public Task firstToDo(){
        return queue.peek();
    }
}
