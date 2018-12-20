package week2java.exercise1;

import Week2.exercise5.Magazine;

import java.util.List;

public class Printer {

    public void print(Article article) {
        System.out.println(article.getTitle() + " " + article.getText());

    }
    public void printMagazine (Magazine magazine) {
        System.out.println(magazine.getTitle() );
        List<Article>articleList=magazine.getArticles();
        for (Article article:articleList
             ) {
            System.out.println(article.getTitle());
            System.out.println(article.getText());

        }
    }

}

