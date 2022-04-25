package ru.gb.shalaeva.Homework4;


import java.util.Random;
import java.util.Scanner;

    public class Homework4 {
        public static int SIZE = 5;
        public static int DOTS_TO_WIN = 4;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Human win");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Nobody win");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("AI win");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Nobody win");
                    break;
                }
            }
            System.out.println("Game is over");
        }

        public static boolean checkWin(char symb) {
            int hor, ver;
            int diagMain, diagReverse;
            for (int i = 0; i < SIZE; i++) {
                hor = 0;
                ver = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == symb) {
                        hor++;
                    } else if (map[i][j] != symb && hor < DOTS_TO_WIN) {
                        hor = 0;
                    }
                    if (map[j][i] == symb) {
                        ver++;
                    } else if (map[j][i] != symb && ver < DOTS_TO_WIN) {
                        ver = 0;
                    }
                }
                if (hor >= DOTS_TO_WIN || ver >= DOTS_TO_WIN) {
                    System.out.println("By horizontal or vertical " + hor + " " + ver);
                    return true;
                }
            }
            for (int j = 0; j < SIZE; j++) {
                diagMain = 0;
                for (int i = 0; i < SIZE; i++) {
                    int k = j + i;
                    if (k < SIZE) {
                        if (map[i][k] == symb) {                      // проверяем главную диагональ от центральной оси вправо на возможную победу
                            diagMain++;
                        } else if (map[i][k] != symb && diagMain < DOTS_TO_WIN) {
                            diagMain = 0;
                        }
                    }
                    if (diagMain >= DOTS_TO_WIN) {
                        System.out.println("Along the main diagonal from the central axis to the right " + diagMain);
                        return true;
                    }
                }
            }
            for (int j = 1; j < SIZE; j++) {
                diagMain = 0;
                for (int i = 0; i < SIZE; i++) {
                    int k = j + i;
                    if (k < SIZE) {
                        if (map[k][i] == symb) {                      // проверяем главную диагональ от центральной оси вниз на возможную победу
                            diagMain++;
                        } else if (map[k][i] != symb && diagMain < DOTS_TO_WIN) {
                            diagMain = 0;
                        }
                    }
                    if (diagMain >= DOTS_TO_WIN) {
                        System.out.println("Down the main diagonal from the central axis " + diagMain);
                        return true;
                    }
                }
            }
            for (int j = 0; j < SIZE; j++) {
                diagReverse = 0;
                for (int i = 0; i < SIZE; i++) {
                    int k = (SIZE - 1) - i;
                    int l = j + i;
                    if (k >= 0 && l < SIZE) {
                        if (map[l][k] == symb) {                     // проверяем побочную диагональ от центральной оси вниз на возможную победу
                            diagReverse++;
                        } else if (map[l][k] != symb && diagReverse < DOTS_TO_WIN) {
                            diagReverse = 0;
                        }
                    }
                    if (diagReverse >= DOTS_TO_WIN) {
                        System.out.println("On the side diagonal from the central axis down " + diagReverse);
                        return true;
                    }
                }
            }
            for (int j = 1; j < SIZE; j++) {
                diagReverse = 0;
                for (int i = 0; i < SIZE; i++) {
                    int k = (SIZE - 1) - j - i;
                    if (k >= 0) {
                        if (map[i][k] == symb) {     // проверяем побочную диагональ от центральной оси влево на возможную победу
                            diagReverse++;
                        } else if (map[i][k] != symb && diagReverse < DOTS_TO_WIN) {
                            diagReverse = 0;
                        }
                    }
                    if (diagReverse >= DOTS_TO_WIN) {
                        System.out.println("On the side diagonal from the central axis left " + diagReverse);
                        return true;
                    }
                }
            }
            return false;
        }
            public static boolean isMapFull () {
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (map[i][j] == DOT_EMPTY) return false;
                    }
                }
                return true;
            }

            public static void aiTurn () {
                int x, y;
                do {
                    x = rand.nextInt(SIZE);
                    y = rand.nextInt(SIZE);
                } while (!isCellValid(x, y));
                System.out.println("Computer came to the point " + (x + 1) + " " + (y +
                        1));
                map[y][x] = DOT_O;
            }

            public static void humanTurn () {
                int x, y;
                do {
                    System.out.println("Enter coordinates in the format of X Y");
                    x = sc.nextInt() - 1;
                    y = sc.nextInt() - 1;
                } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
                map[y][x] = DOT_X;
            }

            public static boolean isCellValid ( int x, int y){
                if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
                return map[y][x] == DOT_EMPTY;
            }

            public static void initMap () {
                map = new char[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }

            public static void printMap () {
                for (int i = 0; i <= SIZE; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i = 0; i < SIZE; i++) {
                    System.out.print((i + 1) + " ");
                    for (int j = 0; j < SIZE; j++) {
                        System.out.print(map[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
