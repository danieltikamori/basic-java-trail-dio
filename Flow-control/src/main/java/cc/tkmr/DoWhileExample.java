package cc.tkmr;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);


        System.out.println("Dialing...");

        do {
            System.out.println("Ringing...");

        } while (ringing());

        System.out.println("Hello!!!");

    }
        private static boolean ringing () {
            boolean answered = new Random().nextInt(3) == 1;
            System.out.println("Answered? " + answered);
            return !answered;
        }
    }

