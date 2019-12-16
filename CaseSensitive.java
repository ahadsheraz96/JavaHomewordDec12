public class CaseSensitive {
    public static void main (String args []){
        String str1="AppleSS AND mANgoes";
        String str2="        i live in long island       ";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str2.trim());

        StringBuffer ahad =new StringBuffer("my full name is ahad ");
        ahad.append("khan");
        System.out.println(ahad);
        ahad.insert(0,"pak");
        System.out.println(ahad);



    }
}
