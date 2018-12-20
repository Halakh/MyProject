package reflectionex1;

import com.sun.jndi.cosnaming.IiopUrl;
import reflectionex2.Postman;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {
    public static void main(String[] args) {
        Letter letter = new Letter("my home");
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();

        postOfficeAssistant.stamp(letter);
        postOfficeAssistant.send(letter);

        Letter letter1 = new Letter("NBH");
        Letter letter2 = new Letter("SBH");
        Letter letter3 = new Letter("WBH");
        List<Letter>letters = new ArrayList<>();
        letters.add(letter2);
        letters.add(letter1);
        letters.add(letter3);


        Postman postman= new Postman(letters);

        postman.deliver();


    }

}


// nIn the PostOfficeApplication class main method,
// create three letters and a Postman with them,
// and use it to deliver all the letters.
//the PostOfficeApplication class main method,
// create a Letter and a PostOfficeAssistant,
// and use it to stamp the letter and then send it.