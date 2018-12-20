package reflection2;

import java.util.Scanner;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        NumberMirror numberMirror = new NumberMirror();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number ");
        Integer number = scanner.nextInt();
        Integer mirrorNumber = numberMirror.mirror(number);
        System.out.println("Your number is "+ number);
        System.out.println("Mirror reflection of your number is "+ mirrorNumber);


    }
}
