package HomeworkWeek2;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SimonaRosuWeek2Homework {
    public static void main(String[] args) {
        //check if the strings are equal. After that, concatenate them into one single string

        checkEqualsAndConcatenate("Simona", "Rosu1");

        //Given a one word string, return true if the string is a palindrome

        checkPalindrome("Minim");

        //Create an empty string, an empty array of strings, and a list of strings with random upper and lowercase letters
        // 3.Iterate the list.
        // If the word starts with a vowel, make it all lowercase and append it to the empty string
        // print the string which starts with a vowel
        // If the word starts with a consonant, make it all uppercase and add it to the empty array
        // If the word contains letter x or X or has less than 3 letters, replace the word with "skipped" and print into the console the current word and the replaced word

        createEmptyStringEmptyArrayOfStringsListOfStrings();

        //Create an empty map that will contain Name and Email as key-value pairs
        //Add a couple of K-V entries
        //Get the size of the map
        //Check that map contains a specific name
        //Get the email that contains a specific name
        //Remove an entry
        //Sort the map by key

        createHashMap();

    }
    public static void checkEqualsAndConcatenate(String first, String second) {

        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        System.out.println("First String: " + first);
        System.out.println("Second String: " + second);
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
    }
    public static void checkPalindrome(String string){

        boolean flag = true;
        string = string.toLowerCase();
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Is 'Minim' string palindrome? R: " + flag);
        else
            System.out.println("Is 'Minim' string a palindrome? R: " + flag);
    }
    public static void createEmptyStringEmptyArrayOfStringsListOfStrings() {
        String EmptyString = "";
        ArrayList<String> strArray = new ArrayList<String>();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Computer");
        list1.add("MEMORY");
        list1.add("Hard Disk");
        list1.add("DRAM");
        list1.add("Another");
        list1.add("Xilofon");

        System.out.println("Empty string: " + EmptyString);
        System.out.println("Empty array: " + strArray);
        System.out.println("Array list: " + list1);

        String vowel = "aeiou";
        for (String word : list1) {

            if (vowel.contains(String.valueOf(word.charAt(0)).toLowerCase())) {
                System.out.println(word);
                EmptyString +=
                        word.toLowerCase();
                System.out.println("EmptyString: " + EmptyString);
            }
        }

        for (String word : list1) {

            if (!vowel.contains(String.valueOf(word.charAt(0)).toLowerCase())) {
                System.out.println(word);
                strArray.add(word.toUpperCase());
                System.out.println("strArray: " + strArray);
            }
        }
    }
    public static void createHashMap(){

        HashMap<String, String> hm = new HashMap<String, String>();
        System.out.println("Initial list of elements: " + hm);
        hm.put("Simona Rosu","simona.sovrea@live.com");
        hm.put("Pop Iona","ioan.pop@example.com");
        hm.put("Constantin Madalina","c.mada@example.com");
        hm.put("Andra Simon","andra@live.com");

        System.out.println("After invoking put() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println("Name: " + m.getKey() + "; Email: " + m.getValue());
        }
        int size = hm.size();
        System.out.println("Size of HashMap: " + size);

        if(hm.containsKey("Simona Rosu")) {
            System.out.println("'Simona Rosu' name is present in the Hashmap.");
        }
        if(hm.containsValue("simona.sovrea@live.com")) {
            System.out.println("'simona.sovrea@live.com' email is present on the list.");
        }
        hm.remove("Pop Iona","ioan.pop@example.com");
        System.out.println("Updated list of elements: " + hm);


        TreeMap<String, String> sortedNumbers = new TreeMap<>(hm);
        System.out.println("Map with sorted Key" + sortedNumbers);

    }
}
