package Week2.exercise5;

import week2java.exercise1.Article;

public class Editor {
    public Magazine writeMagazine(){
        Article article1=new Article("life","life is life");
        Article article2=new Article("love","love is love");
        Article article3=new Article("pray","pray for life");



        Magazine magazine = new Magazine("Magazine");
        magazine.add(article1);
        magazine.add(article2);
        magazine.add(article3);
        return magazine;





    }

}
