import java.util.Scanner;

class Student {

    String name;
    int marks[] = new int[3];
    double average;
    char grade;

    void inputData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.println("Enter marks for 3 subjects:");

        for(int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    void calculateGrade() {

        int sum = 0;

        for(int i = 0; i < 3; i++) {
            sum += marks[i];
        }

        average = sum / 3.0;

        if(average >= 80)
            grade = 'A';

        else if(average >= 60)
            grade = 'B';

        else if(average >= 40)
            grade = 'C';

        else
            grade = 'F';
    }

    void displayReport() {

        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);

        for(int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i+1) + " Marks: " + marks[i]);
        }

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradeSystem {

    public static void main(String[] args) {

        Student s = new Student();

        s.inputData();
        s.calculateGrade();
        s.displayReport();
    }
}