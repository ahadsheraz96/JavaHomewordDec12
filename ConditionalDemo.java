public class ConditionalDemo {
    public static void main(String args[]) {
        int age = 199;
        if (age < 18) {
            System.out.println("you are a minor");
        } else if (age>=18 && age<=100) {
            System.out.println("you are eligible");
        }
        else  {
            System.out.println("sorry you are too old");
        }
    }
}