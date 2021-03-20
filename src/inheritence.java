// Assignment #: 5
// Arizona State University - CSE205
//         Name: Your name
//    StudentID: Your id
//      Lecture: Your lecture time (for instance, MWF 10:40am)
//  Description: The Assignment 5 class displa ys a menu of choices
//               (add summer camp, search summer camp title,
//               list summer camps, quit, display menu) to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.awt.desktop.SystemSleepEvent;
import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

class inheritence {
    public static void main(String[] args) throws IOException {
        char input1;
        String inputInfo = new String();
        String line = new String();
        boolean operation;

        printMenu();
        // create a BufferedReader object to read input from a keyboard
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);
        do {
            System.out.println("What action would you like to perform?");
            line = stdin.readLine().trim();
            input1 = line.charAt(0);
            input1 = Character.toUpperCase(input1);

            switch (input1) {
                case 'A':

                    System.out.println("Please enter title ");
                    String title = stdin.readLine();
                    System.out.println("Please enter Location of the camp ");
                    String location = stdin.readLine();
                    System.out.println("Please enter the number of weeks for the camp ");
                    int numofWeeks = stdin.read();
                    System.out.println("Please enter the weekly cost of the camp ");
                    double weeklyRate = stdin.read();
                    System.out.println("Please enter the total cost of the camp ");
                    double totalCost = stdin.read();

                    debateCamp debateCamp = new debateCamp(title, location, numofWeeks, weeklyRate, totalCost);

                    System.out.println(debateCamp.toString());
                    break;

                case 'B':
                    System.out.println("Please enter title ");
                    String t = stdin.readLine();
                    System.out.println("Please enter Location of the camp ");
                    String loc = stdin.readLine();
                    System.out.println("Please enter the number of weeks for the camp ");
                    int numofW = stdin.read();
                    System.out.println("Please enter the weekly cost of the camp ");
                    int weeklyR = stdin.read();
                    System.out.println("Please enter the total cost of the camp ");
                    int totalC = stdin.read();

                    roboticCamp roboticCamp = new roboticCamp(t, loc, numofW, weeklyR, totalC);
                    System.out.println(roboticCamp.toString());
                    break;

                case 'Q':
                    break;
                case '?':
                    printMenu();
                default:
                    System.out.println("Unknown action \n");
                    break;
            }
        }
        while (input1 != 'Q');



    }


    /** The method printMenu displays the menu to a user **/
    public static void printMenu()
    {
        System.out.print("Choice\t\tAction\n" +
                "------\t\t------\n" +
                "A\t\tAdd and list DebateCamp\n" +
                "B\t\tAdd and list RoboticsCamp\n" +
                "Q\t\tQuit\n" +
                "?\t\tDisplay Help\n\n");
    }
}


