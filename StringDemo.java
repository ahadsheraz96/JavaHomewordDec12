public class StringDemo {
    /**
     *   declare  STRING VARIABLE for example ;
     *   String courseName="qa automation engineering";
     *  1. convert courseName to a char array
     * 2.  use a for each loop to get the array elements
     *  3. find how many spaces in that string
     *  4 find how many spaces in the new char array
     *  remark :all the methods should work for any similar activitives
     **/

        public static void main(String Args[]) {
            String courseName="qa automatic engineering";
//using method that converts string to charArray and prints it using for each loop
            for (char eachCharacter : strToArray(courseName)) {
                System.out.println(eachCharacter);
            }
//use of method that takes string and print the count of spaces in the string
            System.out.println("Space count in String: "+ countSpacesInString(courseName));
//use method two method..one the converts string to char array and than
//that char array is used in another method to print the space count
            System.out.println("Space count in char Array: " + countSpacesInCharArray(strToArray(courseName)));
        }
//method that prints takes in string str and conerts it to char array

        public static char [] strToArray(String str) {
            /**deaclear char array and
            convert string str to char array
            using toCharArray() method which is bulit in and
            populate char with that
            */
            char[] charArray = str.toCharArray();
            //return char array
            return charArray;
        }
        //method that takes a string str and count space in the string
        public static int countSpacesInString(String str) {
            int spaceCount=0;
//for loop the size of string str length..it looks at every char in the string anf if its space than
//count gets incremented
            for(int i = 0; i < str.length(); i++) {
//str.charAt() is built in method that looks at the char of string at specific index
                if(Character.isWhitespace(str.charAt(i)))
                    spaceCount++;
            }
//return the space count
            return spaceCount;
        }
        //method that takes char array and count spaces in that array
        public static int countSpacesInCharArray(char [] charArray) {
            int spaceCount=0;
            for (char eachChar :charArray) {
                if(Character.isWhitespace(eachChar)) {
                    spaceCount++;
                }
            }
            return spaceCount;
        }
    }