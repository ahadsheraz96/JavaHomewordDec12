import java.util.Scanner;
public class CondStatements {
    public static void main (String args[]){
        int grade;
        Scanner ahad=new Scanner(System.in);
        System.out.println("enter your grade");
        grade=ahad.nextInt();
        if (grade<=70){
            System.out.println("you failed");
        }
        else if (grade>70 && grade<=90){
            System.out.println("you are a mediocre");
        }
        else{
            System.out.println("you passed");
        }
    }
}
