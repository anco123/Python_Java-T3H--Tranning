package series1x;

import java.util.Scanner;

public class example1_3 {
    public static void main(String[] args) {
        Scanner inputNameObj = new Scanner(System.in);
        System.out.println("please enter your name");
        String inputNameVar = inputNameObj.nextLine();
        if (inputNameVar.equals("Bob")||inputNameVar.equals("Alice")){
            System.out.println("welcome " + inputNameVar);
        } else System.out.println("Sorry, Just bob and Alce have perimission");
    }
}
