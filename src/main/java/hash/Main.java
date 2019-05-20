package hash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a message:");

        String message=readInput();

        System.out.println("MD2: "+Md2.md2(message));
    }

    private static String readInput(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
}
