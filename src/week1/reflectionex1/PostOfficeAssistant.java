package reflectionex1;

public class PostOfficeAssistant {
    public void stamp(Letter letter) {
        letter.stamp();

    }

    public void send(Letter letter) {
        if (letter.isStamped()) {
            System.out.println("We will send it to the " + letter.getAddress());
        } else  {
            System.out.println("We will need the stamp" );

        }
    }


}


// It also has the send method that receives a letter, if
// it is stamped it says they will send it to the address it says in the letter;
// if it is not stamped it says they need to stamp it first.