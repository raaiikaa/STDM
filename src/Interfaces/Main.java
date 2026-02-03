package Interfaces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int size = getSize();

            personList.add(new Person(getVorname(), getNachname(), getMiddleInitial(), size, getWeightForSize(size)));
        }

        printPersonList(personList);

        System.out.println("");

        sortListAndPrintIt(personList);

    }

    static String getVorname() {
        Random random = new Random();
        String[] vornamenArray = {
                "Dieter",
                "Anna",
                "Max",
                "Laura",
                "Paul",
                "Sabine",
                "Michael",
                "Lisa",
                "Thomas",
                "Julia"
        };

        return vornamenArray[random.nextInt(vornamenArray.length)];
    }

    static String getNachname() {
        Random random = new Random();
        String[] nachnamenArray = {
                "Müller",
                "Schmidt",
                "Schneider",
                "Fischer",
                "Weber",
                "Meyer",
                "Wagner",
                "Becker",
                "Hoffmann",
                "Schulz"
        };

        return nachnamenArray[random.nextInt(nachnamenArray.length)];
    }

    static String getMiddleInitial() {
        Random random = new Random();
        String[] middleInitial = {
                "A.",
                "B.",
                "C.",
                "D.",
                "E.",
                "F.",
                "G.",
                "H.",
                "I.",
                "J.",
                "K.",
                "L.",
                "M.",
                "N.",
                "O.",
                "P.",
                "Q.",
                "R.",
                "S.",
                "T.",
                "U.",
                "V.",
                "W.",
                "X.",
                "Y.",
                "Z."
        };

        return middleInitial[random.nextInt(middleInitial.length)];
    }

    static int getSize() {
        Random random = new Random();
        return random.nextInt(140, 200);
    }

    static int getWeightForSize(int size) {
        Random random = new Random();
        double sizeAsDb = Double.valueOf(size);
        int weight = 0;
        double bmi = 0;
        double sizeDiv = 0.0;

        do {
            weight = random.nextInt(40, 150);
            sizeDiv = sizeAsDb / 100.0;
            bmi = weight / (sizeDiv * sizeDiv);
        } while (bmi < 16.0 || bmi > 45.0);

        return weight;
    }

    static void printPersonList(List<Person> personList) {
        for (Person person : personList) {
            double sizeAsDb = Double.valueOf(person.getSize());
            double weightAsDb = Double.valueOf(person.getWeight());
            double bmi = weightAsDb / ((sizeAsDb / 100) * (sizeAsDb / 100));

            System.out.println(person.getVorname() + " " + person.getMiddleInitial() + " " + person.getNachname() + ", "
                    + person.getSize() + "cm, " + person.getWeight() + "kg, " + String.format("%.1f", bmi));
        }
    }

    static void sortListAndPrintIt(List<Person> personList) {
        Collections.sort(personList,
                Comparator.comparing(Person::getNachname)
                        .thenComparing(Person::getSize)
                        .thenComparing(Person::getWeight));
        printPersonList(personList);
    }
}
