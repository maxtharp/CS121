package activity28;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class StudentSet {
    TreeSet<String> students = new TreeSet<>();

    public void addStudents() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student names or press 'q' to quit: ");

        while (true) {
            String name = input.nextLine();
            if (name.equals("q")) {
                break;
            }
            students.add(name);
        }
    }

    public void displayStudents() {
        Iterator<String> iterator = students.iterator();
        System.out.println("student list: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

