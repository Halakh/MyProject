package week3exercise2;

import week3exercise1.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Mr.Smith","Business");
        Customer customer1 = new Customer("Ms.Flan", "Economic");
        Customer customer2 = new Customer("Mr. Hanz Hokopoko","Business");
        Customer customer3 = new Customer("Mrs. Laurenz","Economic");
        TemplateChooser templateChooser = new TemplateChooser();
        System.out.println(templateChooser.chooseTemplate(customer));
        System.out.println(templateChooser.chooseTemplate(customer1));
        System.out.println(templateChooser.chooseTemplate(customer2));
        System.out.println(templateChooser.chooseTemplate(customer3));



    }
}
