package schoolSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MyController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Teacher> teachers = new ArrayList<>();
		int choice = 0;
		while (choice != 6) {
			System.out.println("---------------------------");
			System.out.println("Enter your choice number:\n"
					+ "1. Add a new teacher\n"
					+ "2. Remove a Teacher\n"
					+ "3. Count the number of teachers\n"
					+ "4. Display all teacher name and their subjects\n"
					+ "5. Display teacher by Id\n" + "6. Exit");
			System.out.println("---------------------------");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Teacher Id : ");
				int tId = sc.nextInt();
				System.out.print("Enter Teacher Name : ");
				String tName = sc.next();
				System.out.print("Enter Teacher Age : ");
				int tAge = sc.nextInt();
				System.out.print("Enter Teacher Subject : ");
				String tSubject = sc.next();
				teachers = addTeacher(teachers, tId, tName, tAge, tSubject);
				break;

			case 2:
				System.out.print("Enter Teacher Id you want to remove : ");
				int removeId = sc.nextInt();
				/*
				 * for (int i = 0; i < teachers.size(); i++) { 
				 * 		if (teachers.get(i).tId == removeId) { 
				 * 			teachers.remove(i); } }
				 */
				teachers = removeTeacher(teachers, removeId);
				break;

			case 3:
				int count = 0;
				for (Teacher teacher : teachers) {
					count++;
				}
				System.out.println("Total teachers count: " + count);
				break;

			case 4:
				int c = 0;
				for (Teacher teacher : teachers) {
					c++;
				}
				if(c == 0) {
					System.out.println("No Teacher to display");
				}
				else {
					System.out.println("Id | Name | Age | Subject");
					System.out.println("---------------------------");
					for (Teacher teacher : teachers) {
						System.out.println(
								teacher.tId + " | " + teacher.tName + " | " + teacher.tAge + " | " + teacher.tSubject);
					}
				}
				break;

			case 5:
				System.out.print("Enter Teacher Id you want to check the details : ");
				int detailId = sc.nextInt();
				Teacher teacher = detailedTeacher(teachers, detailId);
				if (teacher == null) {
					System.out.println("Seems Id not exist or database empty");
				} else {
					System.out.println(
							teacher.tId + " | " + teacher.tName + " | " + teacher.tAge + " | " + teacher.tSubject);
				}
				break;

			default:
				System.out.println("Please choose correct choice");
				break;
			}
		}

		/*
		 * teachers.add(new Teacher(1001, "Swarna", 24, "Java")); teachers.add(new
		 * Teacher(1002, "Deep", 30, "Python"));
		 * System.out.println("Id | Name | Age | Subject");
		 * System.out.println("---------------------------"); for (Teacher teacher :
		 * teachers) { System.out.println(teacher.tId + " | " + teacher.tName + " | " +
		 * teacher.tAge + " | " + teacher.tSubject); }
		 */

	}

	public static ArrayList<Teacher> addTeacher(ArrayList<Teacher> teachers, int tId, String tName, int tAge, String tSubject) {
		teachers.add(new Teacher(tId, tName, tAge, tSubject));
		System.out.println(tName+ " Added into Teachers List");
		return teachers;
	}

	public static ArrayList<Teacher> removeTeacher(ArrayList<Teacher> teachers, int removeId) {
		int removeFlag = 0;
		for (int i = 0; i < teachers.size(); i++) {
			if (teachers.get(i).tId == removeId) {
				System.out.println(teachers.get(i).tName+ " removed from Teachers List");
				teachers.remove(i);
				removeFlag = 1;
			}
		}
		if(removeFlag == 0) {
			System.out.println("Seems Id not exist or database empty");
		}
		return teachers;
	}

	public static Teacher detailedTeacher(ArrayList<Teacher> teachers, int detailId) {
		for (Teacher teacher : teachers) {
			if (teacher.tId == detailId) {
				return teacher;
			} else {
				return null;
			}
		}
		return null;
	}

}
