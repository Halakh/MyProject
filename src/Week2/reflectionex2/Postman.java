package reflectionex2;

import reflectionex1.Letter;

import java.util.ArrayList;
import java.util.List;

public class Postman {
    List<Letter> letters = new ArrayList<>();

    public Postman(List<Letter> letters) {
        this.letters = letters;
    }

    public void deliver() {

        while (letters.size()>0){
            Letter letter= letters.get(0);


            System.out.println("I delivered the letter to " + letter.getAddress());
            letters.remove(0);
        }
    }


}


//Create the class Postman that has a list of Letter.
// It has the deliver method that goes through all the
// letters he has and one by one, says that he delivered it to
// its address and removes it from his list
// (until there are no more letters left).