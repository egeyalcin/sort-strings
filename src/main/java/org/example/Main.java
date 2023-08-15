package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(order(""));
    }

    public static String order(String words) {
        String[] array = words.split(" ");
        String[] returnArray = new String[array.length];
        for(int i = 0; i < array.length;i++) {
            char[] charArray = array[i].toCharArray();
            for(int j = 0; j < charArray.length;j++) {
                if(Character.isDigit(charArray[j])) {
                    int integer = Integer.parseInt(Character.toString(charArray[j]));
                    returnArray[integer - 1] = array[i];
                }
            }
        }
        return words.isEmpty() ? words : String.join(" ", returnArray);
    }
}