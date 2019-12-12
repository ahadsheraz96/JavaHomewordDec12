import java.util.Scanner;
public class Limitless {
    public static void main (String args []){
        int age;
        Scanner ahad=new Scanner(System.in);
        System.out.println("plz enter age");
            age=ahad.nextInt();
            while (age<=17){
                System.out.println("try again");
                age=ahad.nextInt();
        }
    }
}
