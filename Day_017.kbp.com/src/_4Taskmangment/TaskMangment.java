package _4Taskmangment;

import java.util.Scanner;

public class TaskMangment {
public static void main(String[] args) {
	boolean b=true;
	while(b) {
		System.out.println("*******Task Mangement System*******");
		System.out.println("Press 1 for add new task\nPress 2 for update the task\nPress 3 for check the tash status \nPress 4 for delete task\n Press 5 for exit");
		Scanner sc =new Scanner(System.in);
		int ch =sc.nextInt();
		switch(ch) {
		case 1:
			Opration.addNewTask();
			break;
		case 2:
			Opration.updateTask();
			break;
		case 3 :
			Opration.checkStatus();
			break;
		case 4 :
			Opration.deleteTask();
			break;
		case 5 :
			b=false;
			break;
		}
	}
}
}
