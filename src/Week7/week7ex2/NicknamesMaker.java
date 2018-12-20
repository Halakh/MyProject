package week7ex2;

public class NicknamesMaker {

    public String makeNickname(String word) {
        if(word.length()< 2){
            return word;
        }
        Integer halfname = word.length() / 2;
        String nickname = word.substring(0, halfname);
        return nickname;
    }


}

