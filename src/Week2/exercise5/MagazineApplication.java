package Week2.exercise5;

import week2java.exercise1.Printer;

public class MagazineApplication {
    public static void main(String[] args) {

        Editor editor = new Editor();
        Magazine magazine= editor.writeMagazine();

        Printer printer = new Printer();
        printer.printMagazine(magazine);










    }

}

