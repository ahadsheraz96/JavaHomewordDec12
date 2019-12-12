import java.util.Scanner;
public class AttempsLimit {
    public static void main(String args[]) {
        int counter = 1;
        int age;
        Scanner ahad = new Scanner(System.in);
        System.out.println("enter age");
         age=ahad.nextInt();
        while (counter <3) {
           if(age<18) {
               System.out.println("try again");
               age = ahad.nextInt();
               counter++;
           }
           else {
               System.out.println(age);
               break;
           }
        }
    }
}



