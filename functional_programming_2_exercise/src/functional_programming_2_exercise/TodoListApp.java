package functional_programming_2_exercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Task {
	private int taskId;
	private String description;
	private int priority;
	private boolean completed;

	public Task(int taskId, String description, int priority) {
		this.taskId = taskId;
		this.description = description;
		this.priority = priority;
		this.completed = false;
	}

	public int getTaskId() {
		return taskId;
	}

	public String getDescription() {
		return description;
	}

	public int getPriority() {
		return priority;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void markAsCompleted() {
		this.completed = true;
	}

	@Override
	public String toString() {
		return "\nTask ID: " + taskId + "\n- Description: " + description + "\n- Priority: " + priority
				+ "\n- Completed: " + completed;
	}

}

class TodoListManager {
	List<Task> tasks;
	Scanner scanner = new Scanner(System.in);

	public TodoListManager() {
		this.tasks = new ArrayList<>();
	}

	public void addTask() {
		System.out.print("\nEnter task description: ");
		String newDescription = scanner.nextLine();
		System.out.print("Enter task priority: ");
		int newPriority = scanner.nextInt();
		scanner.nextLine();
		Task newTask = new Task(tasks.size() + 1, newDescription, newPriority);
		tasks.add(newTask);
	}

	public void displayTasks() {
		if (!tasks.isEmpty()) {
			System.out.println("\nTask List:");
			tasks.forEach(System.out::println);
		} else {
			System.out.println("\nThere are no Tasks. List is still empty.");
		}
	}

	public List<Task> findTasksByPriority() {
		System.out.print("\nEnter priority to find tasks: ");
		int priorityToFind = scanner.nextInt();
		Predicate<Task> predicate = task -> task.getPriority() == priorityToFind;
		List<Task> result = tasks.stream().filter(predicate).collect(Collectors.toList());
		if (!tasks.isEmpty()) {
			System.out.println("Tasks with Priority " + priorityToFind + ":");
			result.forEach(System.out::println);
		} else {
			System.out.println("\nThere are no Tasks. List is still empty.");
		}
		return result;
	}

	public void markTaskAsCompleted() {
		System.out.print("\nEnter task ID to mark as completed: ");
		int taskIdToComplete = scanner.nextInt();
		tasks.stream().filter(task -> task.getTaskId() == taskIdToComplete).forEach(Task::markAsCompleted);
		/*
		 * for (Task task : tasks) { if (task.getTaskId() == taskIdToComplete) {
		 * task.markAsCompleted(); break; }
		 */
		tasks.forEach(System.out::println);
		System.out.println("\nTask marked as completed");
	}
}

class Menu {
	public void displayMenu() {
		Scanner scanner = new Scanner(System.in);
		TodoListManager todoListManager = new TodoListManager();
		int choice = 0;
		do {
			try {
				System.out.println();
				System.out.println("1. Display Initial Task List.");
				System.out.println("2. Add a new Task.");
				System.out.println("3. Display Task by Priority");
				System.out.println("4. Mark Task as completed");
				System.out.println("5. Exit the program.");
				System.out.print("Your choice: ");
				choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					System.out.println("\n1. Display Initial Task List.");
					todoListManager.displayTasks();
					break;

				case 2:
					System.out.println("\n2. Add a new Task.");
					todoListManager.addTask();
					System.out.println("\nUpdated Task List:");
					todoListManager.displayTasks();
					break;

				case 3:
					System.out.println("\n3. Display Task by Priority");
					todoListManager.findTasksByPriority();
					break;

				case 4:
					System.out.println("\n4. Mark Task as completed");
					todoListManager.markTaskAsCompleted();
					System.out.println("\nUpdated Task List after marking a task as completed:");
					todoListManager.displayTasks();
					break;

				case 5:

					System.out.println("\n5. Exit the program.");
					System.out.println("Exiting the program....");
					break;

				default:
					System.out.println("Wrong option. Choose a right one.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nWrong input. Enter a right number.");
				scanner.next();
				choice = 0;
			}
		} while (choice != 5);

		scanner.close();
	}
}

public class TodoListApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Menu menu = new Menu();
		menu.displayMenu();

		scanner.close();
	}
}