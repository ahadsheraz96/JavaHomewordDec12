public class Scores {
    public static void main (String args []){
        int score;
        Scores myScore=new Scores();
        myScore.ScoreFinder(4,18);
        myScore.average(49,102);
        myScore.computer();
    }
     public int ScoreFinder(int x, int y){
         System.out.println(x+y);
        return x+y;
     }
     public int average(int x,int y){
         System.out.println(((x+y)/2));
         return ((x+y)/2);
    }
    public void computer(){
        System.out.println("i have a computer");
    }
}
