package Mathematik;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        String fileName = "/Users/lennard/Desktop/text_random.txt";
        String fileName = "/Users/lennard/Desktop/text1_shuffled.txt";
//        String fileName = "/Users/lennard/Desktop/text1_encrypted.txt";
        Path path = Paths.get(fileName);
        String readString;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        putAlphabetZuordnung(hashMap);

        try {
            readString = Files.readString(path, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        countNumberOfCharacters(hashMap, readString);

        for (Object ch : hashMap.keySet()) {
            Character key = (Character) ch;
            Integer value = (Integer) hashMap.get(key);
            System.out.println(key + " " + String.valueOf(value));
        }

        System.out.println(crazyCheck(hashMap, readString));

        splitCharArray(readString, 3);
    }

    public static HashMap countNumberOfCharacters(HashMap hashMap, String readString) {
        HashMap<Character, Integer> newHashMap = hashMap;

        for (char c : readString.toCharArray()) {
            if (c != ' ' && c != '\r' && c != '\n') {
                int integer = newHashMap.get(c);
                newHashMap.replace(c, integer + 1);
            }
        }
        return newHashMap;
    }

    public static Double crazyCheck(HashMap hashMap, String readString) {

        char[] charArray = readString.replace(" ", "").toCharArray();
        double isSameChar = 0;
        for (int i = 0; i < 100000; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, charArray.length);
            int randomNumber2 = ThreadLocalRandom.current().nextInt(1, charArray.length);

            if (charArray[randomNumber] == charArray[randomNumber2]) {
                isSameChar += 1.0;
            }
        }
        return isSameChar / 100000;
    }

    static ArrayList<String> splitCharArray(String readString, int numberOfColumns) {
        readString = readString.replace(" ", "");
        ArrayList<String> splitArrayList = new ArrayList<String>();
        int row = 0;
        String rowString = "";

        for (int j = 0; j < readString.length(); j++) {
            for (int z = 0; z < numberOfColumns; z++) {
                rowString += String.valueOf(readString.charAt((row * numberOfColumns) + z));
            }
            splitArrayList.add(rowString);
            rowString = "";
            row++;
        }


        return splitArrayList;
    }

    public static void putAlphabetZuordnung(HashMap hashMap) {
        hashMap.put('A', 0);
        hashMap.put('B', 0);
        hashMap.put('C', 0);
        hashMap.put('D', 0);
        hashMap.put('E', 0);
        hashMap.put('F', 0);
        hashMap.put('G', 0);
        hashMap.put('H', 0);
        hashMap.put('I', 0);
        hashMap.put('J', 0);
        hashMap.put('K', 0);
        hashMap.put('L', 0);
        hashMap.put('M', 0);
        hashMap.put('N', 0);
        hashMap.put('O', 0);
        hashMap.put('P', 0);
        hashMap.put('Q', 0);
        hashMap.put('R', 0);
        hashMap.put('S', 0);
        hashMap.put('T', 0);
        hashMap.put('U', 0);
        hashMap.put('V', 0);
        hashMap.put('W', 0);
        hashMap.put('X', 0);
        hashMap.put('Y', 0);
        hashMap.put('Z', 0);
    }
}
