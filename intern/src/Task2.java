import java.util.Scanner;
public class Task2 {
    public void grade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of subjects :");
        int sub = sc.nextInt();
        int[] marksArr = new int[sub];
        int marks = 0;

        for(int i = 0; i < sub; ++i) {
            System.out.println("Enter sub" + (i + 1) + " marks");
            marksArr[i] = sc.nextInt();
            marks += marksArr[i];
        }

        float avgPer = (float)marks / (float)sub;
        char grade;
        if (avgPer >= 85.0F) {
            grade = 'A';
        } else if (avgPer >= 70.0F) {
            grade = 'B';
        } else if (avgPer >= 60.0F) {
            grade = 'C';
        } else if (avgPer >= 45.0F) {
            grade = 'D';
        } else if (avgPer >= 33.0F) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks : " + marks);
        System.out.println("Average Percentage :" + avgPer);
        System.out.println("Grade : " + grade);
    }
    public static void main(String[] args) {
        Task2 t1 = new Task2();
        t1.grade();
    }
}

