package fr.tenji.java;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 * Created by nekran on 12/10/16.
 */
public class Days8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 3;
        Map<String, Integer> phoneBook = new HashMap<String,Integer>();
//        for (int i = 0; i < n; i++) {
//            String name = in.next();
//            int phone = in.nextInt();
//            phoneBook.put(name, phone);
//        }
        phoneBook.put("sam", 1111);
        phoneBook.put("toto", 2222);
        phoneBook.put("titi", 3333);
        ArrayList<String> search = new ArrayList<>();
        while(in.hasNext()) {
            String s = in.next();
            if (phoneBook.containsKey(s)) {
                search.add(s + "=" + phoneBook.get(s));
            } else {
                search.add("Not found");
            }
        }
        in.close();
        for (Iterator<String> it = search.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
