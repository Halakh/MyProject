package Week2.exercise5;

import week2java.exercise1.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    public String title;
    public List<Article> articles = new ArrayList<>();


    public Magazine(String title) {
        this.title = title;
    }

    public void add(Article article) {
        articles.add(article);
    }

    public List<Article> getArticles() {
        return articles;
    }

    public String getTitle() {
        return title;
    }
}
