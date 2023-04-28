package activity31;

public class Main {
    public static void main(String[] args) {
        // Create two student instances
        Student student1 = new Student("John", "Cena", "379537", "Computer Science", "Sophomore", 3.8);
        Student student2 = new Student("Jason", "Bourne", "028592", "Mechanical Engineering", "Freshman", 3.4);

        // Add courses to each student's course list
        student1.addCourse("Programming I");
        student1.addCourse("Data Structures");
        student1.addCourse("Computer Networks");
        student1.addCourse("Operating Systems");

        student2.addCourse("Behavior of Materials");
        student2.addCourse("Thermodynamics");
        student2.addCourse("Fluid Dynamics");
        student2.addCourse("Solid Mechanics");

        // Print each student's info
        System.out.println("Student 1 info:");
        System.out.println(student1.getStudentInfo());
        System.out.println();

        System.out.println("Student 2 info:");
        System.out.println(student2.getStudentInfo());
        System.out.println();

        // Print each student's course list
        System.out.println("Student 1 course list:");
        student1.displayStudentCourses();
        System.out.println();

        System.out.println("Student 2 course list:");
        student2.displayStudentCourses();
        System.out.println();

        // Remove a course from each student's course list
        student1.removeCourse("Computer Networks");
        student2.removeCourse("Fluid Dynamics");

        // Print each student's course list again
        System.out.println("Student 1 course list after removing a course: ");
        student1.displayStudentCourses();
        System.out.println();

        System.out.println("Student 2 course list after removing a course: ");
        student2.displayStudentCourses();
        System.out.println();
    }
}

