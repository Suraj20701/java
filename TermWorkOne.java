

import java.util.Scanner;

public class TermWorkOne {
  static int students = 5, subjects = 3;
  static int[][] marks = new int[students][subjects];
  static int[] totalMarks = new int[students];

  public static void main(String[] args) {
    // Take input from user
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < students; i++) {
      System.out.println("Enter the marks of student " + (i + 1));
      int total = 0;
      for (int j = 0; j < subjects; j++) {
        marks[i][j] = sc.nextInt();
        total += marks[i][j];
      }
      totalMarks[i] = total;
    }

    // Display the student report
    for (int i = 0; i < students; i++) {
      System.out.println("\n\nReport of student  " +(i + 1));
      System.out.print("Marks :" + " ");
      for (int j = 0; j < subjects; j++) {
        System.out.print(marks[i][j] + "  ");
      }
      System.out.println("\nTotal marks : " + totalMarks[i]);
      System.out.println("Average marks : " + averageMarks(marks[i]));
    }
    sc.close();
  }

  public static double averageMarks(int[] marks) {
    int min = 1000;
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
      if (mark < min) {
        min = mark;
      }
    }
    double sumOfBest = sum - min;
    double average = Math.ceil(sumOfBest/2) ;
    return average;
  }

}
