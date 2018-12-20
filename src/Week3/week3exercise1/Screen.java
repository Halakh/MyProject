package week3exercise1;

public class Screen {
    public String display(Customer customer) {
        if (customer.getCategory().equals("Business")) {
            String name = customer.getName().toUpperCase();
            System.out.println(name);
            return name;
        } else
            {
                String name = customer.getName().toLowerCase();
                System.out.println(name);
                return name;

        }

    }
}
//A Screen can display a customer name according to the railway rules,
// and it also returns the name it displayed so that it can be tested afterwards.