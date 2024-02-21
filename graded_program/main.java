//  Weston Hale
//  A00267225
//  Feb 19th, 2024
//  Grading Program

import java.util.Scanner;

class GradingProgram {
    public static void main(String[] args){

        // Open a handle on the input scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of questions on the exam: ");
        int q_count = in.nextInt();

        System.out.print("Enter the number of questions that the student missed: ");
        int q_missed = in.nextInt();

        if(q_count > 0){
            FinalExam exam = new FinalExam(q_count, q_missed);
        
            System.out.printf("Each question on the exam counts %.1f points.\n", exam.get_points_each());
            System.out.printf("The exam score is %.2f\n", exam.get_score());
            System.out.printf("The exam grade is %s\n", exam.get_grade());
        }
        else{
            System.out.println("Question count cannot be Zero.");
        }

        // Close input handle
        in.close();
    }

}