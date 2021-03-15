package cse237;

import java.util.Scanner;

public class Menu {
	
	private Scanner keyboardIn;
	
	public Menu() {
		keyboardIn = new Scanner(System.in);
	}

	public static void main(String[] args) {
		
		Menu quizMasterMenu = new Menu();
		quizMasterMenu.runMenu(quizMasterMenu);
	}

	public void runMenu(Menu quizMasterMenu) {
		this.displayMainMenu();	
		int selectedOption = this.getUserInput();
		this.processMainMenu(selectedOption);
		keyboardIn.close();
	}

	public void processMainMenu(int selectedOption) {
		if (selectedOption == 1) {
			this.displayTeacherMenu();
			
			int teacherOption = this.getUserInput();
			
			this.processTeacherMenu(teacherOption);
		} else {
			this.displayStudentMenu();	
			
			int studentOption = this.getUserInput();
			
			this.processStudentMenu(studentOption);
		}
	}

	public void processTeacherMenu(int teacherOption) {
		if(teacherOption == 1) {
			System.out.println("Creating a quiz");
		} else if (teacherOption == 2) {
			System.out.println("Viewing grades");
		} else if (teacherOption == 3) { 
			System.out.println("Editing");
		}
	}

	public void processStudentMenu(int studentOption) {
		if(studentOption == 1) {
			System.out.println("List of quizzes");
		} else if (studentOption == 2) {
			System.out.println("Taking quiz");
		} else if (studentOption == 3) { 
			System.out.println("List of scores");
		}
	}

	public void displayStudentMenu() {
		System.out.println("1. See list of quizzes");
		System.out.println("2. Take a quiz");
		System.out.println("3. View your quiz scores");
	}

	public  void displayTeacherMenu() {
		System.out.println("1. Create a quiz");
		System.out.println("2. View quiz grades");
		System.out.println("3. Edit existing quiz");
	}

	public void displayMainMenu() {
		System.out.println("Welcome to QuizMaster");
		System.out.println("Please select an option: ");
		
		System.out.println("1. Teacher menu");
		System.out.println("2. Student menu");
	}
	
	private int getUserInput() {
		return keyboardIn.nextInt();
	}
	
	
	
	
}
