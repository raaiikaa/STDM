package MyArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class MyArrayListOG {
    
    private String myArray[];
    private int count;
    
    public MyArrayListOG() {
        myArray = new String[5]; // Erstmal Platz für 5 Elemente
        count = 0;
    }

    public int size() {
        // liefert die Anzahl der Elemente
        return count;
    }

    public boolean isEmpty() {
        // sagt ob der Conatiner leer ist
        if (count == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean contains(String s) {
        // liefert true wenn s enthalten ist
        for(String string : myArray){
            if(string != null) {
                if (string.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean add(String s) {
        // hängt den String s ans Ende
        // liefert true, wenn es geklappt hat (also immer!)

        if(count == myArray.length){
            String[] newArray = new String[5 + myArray.length];

            for(int i=0; i<myArray.length; i++ ){
                newArray[i] = myArray[i];
            }

            myArray = newArray;
            myArray[count] = s;
            count ++;

        }else{
            myArray[count] = s;
            count ++;
        }
        return true;
    }

    public boolean remove(String s) {
        // löscht das erste Vorkommen von s, die folgenden Elemente rücken vor
        // liefert false, wenn s nicht enthalten ist
        for(int i=0; i<myArray.length; i++){
            if(myArray[i].equals(s)){

            }
        }
        return true;
    }

    public void clear() {
        // Leert den Container
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String get(int i) {
        // holt das Element an der Stelle i (ohne es zu löschen)
        return myArray[i];
    }

    public String set(int i, String e) {
        // ersetzt das Element an der Stelle i
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int i, String s) {
        // fügt s an der Stelle i ein (nachfolgende Elemente rutschen weiter)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // löscht das Element an der Stelle i, die folgenden Elemente rücken vor
    // liefert das gelöschte Element als Ergebnis
    public String remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(String s) {
        // liefert die Platznummer des ersten Vorkommens von s
        // oder -1 wenn s nicht enthalten ist
        for(int i=0; i< myArray.length; i++){
            if(myArray[i] != null){
                if(myArray[i].equals(s)){
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(String s) {
        // liefert die Platznummer des letzten Vorkommens von s
        // oder -1 wenn s nicht enthalten ist
        int lastPosition = -1;
        for(int i=0; i< myArray.length; i++){
            if(myArray[i] != null){
                if(myArray[i].equals(s)){
                    lastPosition = i;
                }
            }
        }
        return lastPosition;
    }    
}
