public class NestedForDemo {
    public static void main (String args[]){
        for (int x=100; x>=1; x--){
            System.out.println(x);
            for (int y=5; y>=1; y--){
                System.out.print(y+" ");
            }
        }
    }
}
