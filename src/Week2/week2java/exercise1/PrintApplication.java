package week2java.exercise1;

public class PrintApplication {
    public static void main(String[] args) {
        String title = "My Title";
        String text = "This is the story of my life";
        Article article = new Article(title,text);
        Printer printer = new Printer();
        printer.print(article);
    }
}
