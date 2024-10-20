import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 students to the list
        students.add(new Student(101, "Alice", "New York"));
        students.add(new Student(102, "Bob", "Los Angeles"));
        students.add(new Student(103, "Charlie", "Chicago"));
        students.add(new Student(104, "Dave", "Houston"));
        students.add(new Student(105, "Eve", "Phoenix"));
        students.add(new Student(106, "Frank", "Philadelphia"));
        students.add(new Student(107, "Grace", "San Antonio"));
        students.add(new Student(108, "Heidi", "San Diego"));
        students.add(new Student(109, "Ivan", "Dallas"));
        students.add(new Student(110, "Judy", "San Jose"));

        // Sort by name
        System.out.println("Sorting by name:");
        SelectionSort.selectionSort(students, new NameComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by roll number
        System.out.println("\nSorting by roll number:");
        SelectionSort.selectionSort(students, new RollnoComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
