import java.util.Scanner;

class ScoreGenertor{
    private float percent;
    public ScoreGenertor(float percent){
        this.percent=percent;
    }
    public void getGrade(){
        if(percent>=90 && percent<=100){
            System.out.println("Grade A");
        }
        else if(percent>=80 && percent<90){
            System.out.println("Grade B");
        }
        else if(percent>=70 && percent<80){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Average");
        }
    }
}
public class GradeCal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage");
        float percent=sc.nextFloat();
        ScoreGenertor s1=new ScoreGenertor(percent);
        s1.getGrade();
        System.out.println(s1);
    }
}
