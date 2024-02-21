//  Weston Hale
//  A00267225
//  Feb 19th, 2024
//  Grading Program

public class GradedActivity {

    private double score = 0.0;

    public void set_score(double score){
        this.score = score;
    }

    public double get_score(){
        return score;
    }

    public String get_grade(){
        
        if(score >= 90){
            return "A";
        }
        else if(score >= 80){
            return "B";
        }
        else if(score >= 70){
            return "C";
        }
        else{
            return "F";
        }
    }



}
