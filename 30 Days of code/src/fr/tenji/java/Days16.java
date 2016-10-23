package fr.tenji.java;

/**
 * Created by nekran on 21/10/16.
 */
public class Days16 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        String s = "2";
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
