//  Weston Hale
//  A00267225
//  Feb 19th, 2024
//  Grading Program

public class FinalExam extends GradedActivity {
    
    private int num_questions = 0;
    private double points_each = 0.0;
    private int num_missed = 0;


    public FinalExam(int num_q, int num_m){
        this.num_questions = num_q;
        this.num_missed = num_m;

        points_each = 100.0 / num_questions;
        super.set_score(100 - (num_missed * points_each));
    }

    
    public double get_points_each(){
        return points_each;
    }

    public int get_num_missed(){
        return num_missed;
    }

}
