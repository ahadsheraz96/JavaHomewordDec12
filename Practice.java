public class Practice {
    public static void main(String args[]) {
        int a = 12;
        int b = 10;
        int sum = a + b;
        System.out.println("your sum is " + sum);

        Practice fauroz= new Practice();
       int y=fauroz.minusNumbers(3,7);
        System.out.println(y);
        fauroz.myName();
        fauroz.myName();
        fauroz.myName();
        fauroz.myName();
        fauroz.myCompleteName();
        fauroz.proveStringImmutable();

    }

    public static int  minusNumbers(int c ,int d){

        int subtraction=c-d;
       // System.out.println("your answer is "+subtraction);
        return subtraction;
    }

    public void myName(){
        String myFullName="ahad khan";
        System.out.println("your name is "+myFullName);

    }

    public void myCompleteName(){
        String firstName="ahad";
        String lastName="khan";
        String completeName=firstName+" "+lastName;
        System.out.println("your complete name is "+completeName);
    }
    public String proveStringImmutable(){
        // String object cant be chnaged once it is declared. If you make change you need to store it in a new String variable/refrence-variable/Object
        String userName = "1Fairuz";//Fairuzabcd
        String userName2;
        userName2 = userName.replace('1', '2');

        System.out.println("String immutable --> userName: "+ userName); // 1Fairuz
        System.out.println("String immutable --> userName2: "+ userName2); // 2Fairuz

        return userName2;
    }

}