
public class ArraysMethods {
    public static void main(String args[]) {
        int[] c = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }
        ArraysMethods z = new ArraysMethods();
        z.scores();
        z.names();
        z.addingNumbers(5, 9);
        z.avgScore(45,25,89);


    }

    public void scores() {
        int[] d = {100, 200, 50, 63, 90};
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

    }

    public void names() {
        String fullName = "my full name is ahad sheraz";
        System.out.println(fullName);
    }

    public static int addingNumbers(int a, int b) {
        int sum;

        sum = a + b;
        System.out.println("your sum is "+sum);
        // return a+b;
        return sum;
    }

    public static int avgScore(int x, int y, int z) {
        int average = (x + y + z) / 3;
        System.out.println("your average is "+average);
        return average;
    }


}
