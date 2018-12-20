package week3exercise2;

import week3exercise1.Customer;

public class TemplateChooser {
    public String chooseTemplate(Customer customer) {
        //are you a hokopoko
        String name = customer.getName();
        if (name.contains("Hokopoko")) {
            return "privileged";
        }
        //are you a man
        if (name.startsWith("Mr.")) {
            return "man";
        }
        //are you a woman
        if (name.startsWith("Ms.") || name.startsWith("Mrs.")) {
            return "woman";
        }
        return "default";
    }
}

//The TemplateChooser has no attributes.
// It has the chooseTemplate method that receives a customer
// and returns the word man, woman,
// privileged or default depending on the insurance company’s requirements.