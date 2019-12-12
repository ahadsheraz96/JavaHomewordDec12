import java.util.Scanner;
public class Selection {
    public static void main (String args[]){
        System.out.println("This computer will decide if you can be selected in the team");
        int avgScore;
        int score1;
        int score2;
        int score3;
        Scanner ahad=new Scanner(System.in);
        System.out.println("Enter your game one score");
        score1=ahad.nextInt();
        System.out.println("Enter your game two score");
        score2=ahad.nextInt();
        System.out.println("Enter your game three score");
        score3=ahad.nextInt();
        avgScore=(score1+score2+score3)/3;
        if (avgScore<=20){
            System.out.println("you are dropped");
        }
        else if (avgScore>=20 && avgScore<=80){
            System.out.println("you are selected");
        }
        else
            {
                System.out.println("Head coach override needed ");
            }
    }
}
