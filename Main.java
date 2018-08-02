package com.gmail.oturisme;

public class Main {
	public static void main(String[] args) {
		Group gr = new Group("OOP-1");
		try {
			gr.addStudent(new Student("Oleg", "Venskiy", 21, true, 1235, "OOP-1"));
			gr.addStudent(new Student("Elena", "Ivanova", 19, false, 1236, "OOP-1"));
			gr.addStudent(new Student("Igor", "Svitoch", 27, true, 1237, "OOP-1"));
			gr.addStudent(new Student("Iraida", "Petrova", 25, false, 1238, "OOP-1"));
			gr.addStudent(new Student("Olga", "Chernikova", 18, false, 1239, "OOP-1"));
			gr.addStudent(new Student("Andrey", "Paslavskiy", 22, true, 1240, "OOP-1"));
			gr.addStudent(new Student("Stanislav", "Boev", 20, true, 1241, "OOP-1"));
			gr.addStudent(new Student("Anatoliy", "Pryanenko", 26, true, 1242, "OOP-1"));
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(gr);
		gr.sortByParametr(2, false);
		System.out.println(gr);

		System.out.println();
		Student[] recruterArray = gr.getRecruter();
		for (Student student : recruterArray) {
			System.out.println("You should go to voenkomat: " + student);
		}
	}
}
