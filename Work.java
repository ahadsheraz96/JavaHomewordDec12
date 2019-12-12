public class Work {
    public static void main (String args []){
        int workingHours=59;
        if (workingHours<=30){
            System.out.println("you are a part-time employee");
        }
        else if (workingHours>=30 && workingHours<=60){
            System.out.println("you are a full time employee");
        }
        else {
            System.out.println("you are a freelancer");
        }
    }
}
