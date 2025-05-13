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
        int indexToRemove = -1;

        for(int i=0; i< myArray.length; i++){
            if(myArray[i] != null){
                if(myArray[i].equals(s)){
                    indexToRemove = i;
                    break;
                }
            }
        }

        if(myArray != null){
            String[] finalArray = new String[myArray.length + 1];
            int counter = 0;

            for(int j=0; j<myArray.length; j++) {
                if (counter < myArray.length) {
                if (myArray[counter] != null) {
                    if (j == indexToRemove) {
                        counter++;
                        finalArray[j] = myArray[counter];
                        counter++;
                    } else {
                        finalArray[j] = myArray[counter];
                        counter++;
                    }
                }
            }
            }

            myArray = finalArray;

            count --;

        }

        if(indexToRemove == -1){
            return false;
        }
        return true;
    }

    public void clear() {
        // Leert den Container
       for(int i=0; i<myArray.length; i++){
           myArray[i] = null;
       }
       count = 0;
    }

    public String get(int i) {
        // holt das Element an der Stelle i (ohne es zu löschen)
        return myArray[i];
    }

    public String set(int i, String e) {
        // ersetzt das Element an der Stelle i
        String oldString = myArray[i];
        myArray[i] = e;
        return oldString;
    }

    public void add(int i, String s) {
        // fügt s an der Stelle i ein (nachfolgende Elemente rutschen weiter)
        String[] finalArray = new String[myArray.length + 1];
        String[] firstHalf = new String[count];
        String[] secondHalf = new String[count];

        if(i == 0){
            finalArray[0] = s;
            for(int l=1; l< myArray.length; l++){
                if(myArray[l-1] != null){
                    finalArray[l] = myArray[l - 1];

                }
            }
            myArray = finalArray;
            count ++;

        }else{
            int sizeFirstHalf = i;
            int sizeSecondHalf = count - i;
            int counter = 0;

            for(int j=0; j<sizeFirstHalf; j++){
                finalArray[j] = myArray[j];
                counter ++;
            }

            finalArray[counter] = s;

            for(int z=counter; z< myArray.length; z++){
                finalArray[z + 1] = myArray[z];
            }

            myArray = finalArray;
            count ++;
        }
    }

    // löscht das Element an der Stelle i, die folgenden Elemente rücken vor
    // liefert das gelöschte Element als Ergebnis
    public String remove(int i) {
        if(myArray != null){
            String[] finalArray = new String[myArray.length + 1];
            String deletedItem = "";
            int counter = 0;

            for(int j=0; j<myArray.length; j++){
                if(myArray[counter] != null){
                    if(j == i){
                        deletedItem = myArray[i];
                        counter ++;
                        finalArray[j] = myArray[counter];
                        counter ++;
                    }else{
                        finalArray[j] = myArray[counter];
                        counter ++;
                    }
                }
            }

            myArray = finalArray;

            count --;
            return deletedItem;
        }
        return "";
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
