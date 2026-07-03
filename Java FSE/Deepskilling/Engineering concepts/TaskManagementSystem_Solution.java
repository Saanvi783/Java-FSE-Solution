/*
QUESTION:
Exercise 5: Task Management System
Scenario: You are developing a task management system where tasks need to be managed efficiently using a Singly Linked List.
Instructions:
1. Define a Task class with taskId, taskName, status.
2. Implement a Singly Linked List to add, search, traverse, and delete tasks.
*/

class TaskNode {
    int taskId;
    String taskName;
    String status;
    TaskNode next;

    public TaskNode(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Task[" + taskId + ": " + taskName + " (" + status + ")]";
    }
}

public class Exercise5_TaskManagementSystem_Solution {
    private TaskNode head;

    public void addTask(int id, String name, String status) {
        TaskNode newNode = new TaskNode(id, name, status);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
    }

    public void traverse() {
        TaskNode curr = head;
        while (curr != null) {
            System.out.println(curr);
            curr = curr.next;
        }
    }

    public void deleteTask(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }
        TaskNode curr = head;
        while (curr.next != null && curr.next.taskId != id) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    public static void main(String[] args) {
        Exercise5_TaskManagementSystem_Solution list = new Exercise5_TaskManagementSystem_Solution();
        list.addTask(101, "Setup DB", "Pending");
        list.addTask(102, "Create REST API", "In Progress");
        list.traverse();
        list.deleteTask(101);
    }
}
