import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("How many tasks you would like to add");

		String arraySize = sc.nextLine();

		int convertedSize = Integer.parseInt(arraySize);

		TaskPOJO[] array = new TaskPOJO[convertedSize];

		boolean flag = true;

		int counter = 0;

		while(flag) {

			System.out.println("Enter the taskId");

			String taskId = sc.nextLine();
			
			System.out.println("Enter the task Title");

			String taskTitle = sc.nextLine();
			System.out.println("Enter the task Text");

			String taskText = sc.nextLine();
			
			System.out.println("Enter the task Assigned To");

			String taskAssignedTo = sc.nextLine();
			
			TaskPOJO task = new TaskPOJO();
			
			task.taskId = taskId;   task.title = taskTitle;  task.text = taskText;    task.assignedTo = taskAssignedTo;

			array[counter] = task;

			counter++;

			System.out.println("Do you continue to add more tasks? Press Y/N");

			String yOrN = sc.nextLine();

			if(yOrN.equals("Y")) {
		
				continue;
			}
			else {
			
				flag = false;
			}

		}

	}

}
