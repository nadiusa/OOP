package Task_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        University university_1 = new University();
        float average=0f;
       // int counter_2=0;
        System.out.println("Enter the number of universities");
        Scanner scanner1 = new Scanner(System.in);
        int m = scanner1.nextInt();
        System.out.println(m);
        for (int j = 0; j < m; j++) {
            float sum=0f;
           // int counter=0;
            System.out.println("Enter the name of University"+ (j+1));
            Scanner scanner = new Scanner(System.in);
            university_1.name = scanner.nextLine();
            System.out.println(university_1.name);

            System.out.println("Enter the foundation year of University");
            university_1.foundation_Year = scanner.nextInt();
            System.out.println(university_1.foundation_Year);

            System.out.println("Enter the number of students of this university");
            int n = scanner.nextInt();
            System.out.println(n);

            System.out.println("Enter the information about students of University");
            Student[] students = new Student[n];
            int i;
            for ( i = 0; i < n; i++) {
                scanner.nextLine();
                students[i] = new Student();

                System.out.println("Enter the name of student" + (i + 1));
                students[i].name = scanner.nextLine();
                System.out.println(students[i].name);

                System.out.println("Enter the age");
                students[i].age = scanner.nextInt();
                System.out.println(students[i].age);

                System.out.println("Enter the average mark");
                students[i].average_mark = scanner.nextFloat();
                System.out.println(students[i].average_mark);
                sum+=students[i].average_mark;
                //counter++;
            }
            System.out.println("suma=" + sum);
           System.out.println("The average mark of this university " + (j+1) + "is: "+(sum/n));
            average= average+sum/n;
           // counter_2++;
        }
        System.out.println("The average mark of all universities "+(average/m));
    }
}