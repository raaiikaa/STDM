package Interfaces;

public class Person {
    String vorname;
    String nachname;
    String middleInitial;
    int size;
    int weight;

    public Person(String vorname, String nachname, String middleInitial, int size, int weight) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.middleInitial = middleInitial;
        this.size = size;
        this.weight = weight;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    @Override
//    public int compareTo(Person o) {
//        return this.getWeight() - o.getWeight();
//    }
}
