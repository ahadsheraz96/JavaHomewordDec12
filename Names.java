public class Names {
    public static void main (String args[]){
        String firstName="amir";
        String lastName="gul";
        String Charcteristics="amir is a good friend";
        String firstName2;

        firstName2=firstName.replace("a","k");

        System.out.println(firstName);
        System.out.println(firstName2);

        Names aobj=new Names();
        String y=aobj.addingNames();
        System.out.println(y);
        aobj.comparingStrings();
    }
    public String addingNames(){
        String one="ahad";
        String two="sheraz";
        String fullNmae=one+" "+two;
        //System.out.println("your full name is "+fullNmae);
        return fullNmae;
    }
    public void  comparingStrings(){
        String str1="pakistan";
        String str2="pakistan";
        System.out.println(str1.equals(str2));

    }
}
