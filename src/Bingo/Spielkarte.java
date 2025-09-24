package Bingo;

import GeneratorAndPrinter.Printer;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Spielkarte {

    private Printer printer = new Printer();
    int bingoArray[][] = new int[5][5];
    private ArrayList<Integer> setNumbers = new ArrayList<>();
    public String name = "";

    public void erstelleRandomSpielkarte(String name) {
        int randomNumber = -1;
        this.name = name;

        for (int i = 0; i < bingoArray.length; i++) {
            for (int j = 0; j < bingoArray[i].length; j++) {
                if (j == 0) {
                    while (bingoArray[i][j] == 0) {
                        randomNumber = ThreadLocalRandom.current().nextInt(1, 16);
                        if (!setNumbers.contains(randomNumber)) {
                            bingoArray[i][j] = randomNumber;
                            setNumbers.add(randomNumber);
                        }
                    }
                } else if (j == 1) {
                    while (bingoArray[i][j] == 0) {
                        randomNumber = ThreadLocalRandom.current().nextInt(16, 32);
                        if (!setNumbers.contains(randomNumber)) {
                            bingoArray[i][j] = randomNumber;
                            setNumbers.add(randomNumber);
                        }
                    }
                } else if (j == 2) {
                    while (bingoArray[i][j] == 0) {
                        randomNumber = ThreadLocalRandom.current().nextInt(31, 46);
                        if (!setNumbers.contains(randomNumber)) {
                            bingoArray[i][j] = randomNumber;
                            setNumbers.add(randomNumber);
                        }
                    }
                } else if (j == 3) {
                    while (bingoArray[i][j] == 0) {
                        randomNumber = ThreadLocalRandom.current().nextInt(46, 61);
                        if (!setNumbers.contains(randomNumber)) {
                            bingoArray[i][j] = randomNumber;
                            setNumbers.add(randomNumber);
                        }
                    }
                } else if (j == 4) {
                    while (bingoArray[i][j] == 0) {
                        randomNumber = ThreadLocalRandom.current().nextInt(61, 76);
                        if (!setNumbers.contains(randomNumber)) {
                            bingoArray[i][j] = randomNumber;
                            setNumbers.add(randomNumber);
                        }
                    }
                }

            }
        }
    }

    public void erstelleBasicSpielkarte(String name) {
        name = name;
        int number = 1;
        for (int i = 0; i < bingoArray.length; i++) {
            for (int j = 0; j < bingoArray.length; j++) {
                if (j == 0) {
                    while (bingoArray[j][i] == 0) {
                        bingoArray[j][i] = number;
                        number++;
                    }
                } else if (j == 1) {
                    while (bingoArray[j][i] == 0) {
                        bingoArray[j][i] = number;
                        number++;
                    }
                } else if (j == 2) {
                    while (bingoArray[j][i] == 0) {
                        bingoArray[j][i] = number;
                        number++;
                    }
                } else if (j == 3) {
                    while (bingoArray[j][i] == 0) {
                        bingoArray[j][i] = number;
                        number++;
                    }
                } else if (j == 4) {
                    while (bingoArray[j][i] == 0) {
                        bingoArray[j][i] = number;
                        number++;
                    }
                }

            }
            number += 10;
        }
    }

    public void kreuzeZahlAn(int gezogeneNummer) {
        for (int i = 0; i < bingoArray.length; i++) {
            for (int j = 0; j < bingoArray[i].length; j++) {
                if (bingoArray[i][j] == gezogeneNummer) {
                    bingoArray[i][j] = 0;
                    break;
                }
            }
        }
    }

    public void druckeSpielkarte() {
//        printer.print2DimIntArrayAsBingo(bingoArray);
        System.out.println("|-----|-----|-----|");
        System.out.println("|  " + bingoArray[0][0] + "  |  " + bingoArray[0][1] + "  |  " + bingoArray[0][2] + "  |  " + bingoArray[0][3] + "  |  " + bingoArray[0][3] + "  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  " + bingoArray[1][0] + "  |  " + bingoArray[1][1] + "  |  " + bingoArray[1][2] + "  |  " + bingoArray[1][3] + "  |  " + bingoArray[1][3] + "  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  " + bingoArray[2][0] + "  |  " + bingoArray[2][1] + "  |  " + bingoArray[2][2] + "  |  " + bingoArray[2][3] + "  |  " + bingoArray[2][3] + "  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  " + bingoArray[3][0] + "  |  " + bingoArray[3][1] + "  |  " + bingoArray[3][2] + "  |  " + bingoArray[3][3] + "  |  " + bingoArray[3][3] + "  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  " + bingoArray[4][0] + "  |  " + bingoArray[4][1] + "  |  " + bingoArray[4][2] + "  |  " + bingoArray[4][3] + "  |  " + bingoArray[4][3] + "  |");
        System.out.println("|-----|-----|-----|");
    }

    public boolean ueberpruefeBingokarte() {

        //Horizontale Zeilen
        if (bingoArray[0][0] == 0 && bingoArray[0][1] == 0 && bingoArray[0][2] == 0 && bingoArray[0][3] == 0 && bingoArray[0][4] == 0) {
            return true;
        }
        if (bingoArray[1][0] == 0 && bingoArray[1][1] == 0 && bingoArray[1][2] == 0 && bingoArray[1][3] == 0 && bingoArray[1][4] == 0) {
            return true;
        }
        if (bingoArray[2][0] == 0 && bingoArray[2][1] == 0 && bingoArray[2][2] == 0 && bingoArray[2][3] == 0 && bingoArray[2][4] == 0) {
            return true;
        }
        if (bingoArray[3][0] == 0 && bingoArray[3][1] == 0 && bingoArray[3][2] == 0 && bingoArray[3][3] == 0 && bingoArray[3][4] == 0) {
            return true;
        }
        if (bingoArray[4][0] == 0 && bingoArray[4][1] == 0 && bingoArray[4][2] == 0 && bingoArray[4][3] == 0 && bingoArray[4][4] == 0) {
            return true;
        }

        //Vertikale Zeilen
        if (bingoArray[0][0] == 0 && bingoArray[1][0] == 0 && bingoArray[2][0] == 0 && bingoArray[3][0] == 0 && bingoArray[4][0] == 0) {
            return true;
        }
        if (bingoArray[0][1] == 0 && bingoArray[1][1] == 0 && bingoArray[2][1] == 0 && bingoArray[3][1] == 0 && bingoArray[4][1] == 0) {
            return true;
        }
        if (bingoArray[0][2] == 0 && bingoArray[1][2] == 0 && bingoArray[2][2] == 0 && bingoArray[3][2] == 0 && bingoArray[4][2] == 0) {
            return true;
        }
        if (bingoArray[0][3] == 0 && bingoArray[1][3] == 0 && bingoArray[2][3] == 0 && bingoArray[3][3] == 0 && bingoArray[4][3] == 0) {
            return true;
        }
        if (bingoArray[0][4] == 0 && bingoArray[1][4] == 0 && bingoArray[2][4] == 0 && bingoArray[3][4] == 0 && bingoArray[4][4] == 0) {
            return true;
        }

        //Diagonal
        if (bingoArray[0][0] == 0 && bingoArray[1][1] == 0 && bingoArray[2][2] == 0 && bingoArray[3][3] == 0 && bingoArray[4][4] == 0) {
            return true;
        }
        if (bingoArray[0][4] == 0 && bingoArray[1][3] == 0 && bingoArray[2][2] == 0 && bingoArray[3][1] == 0 && bingoArray[4][0] == 0) {
            return true;
        }

        return false;
    }
}
