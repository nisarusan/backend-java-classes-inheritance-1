public class Customer {
    String name;
    String lastName;
    int customerNumber;
    private Creditcard creditcard;

    public Customer(String name, String lastName, Creditcard creditcard) {
        this.name = name;
        this.lastName = lastName;
        this.creditcard = creditcard;
    }
    public Customer(String name, String lastName, int customerNumber, Creditcard creditcard) {
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditcard = creditcard;

    }

    public void setCreditcard(Creditcard creditcard) {
        this.creditcard = creditcard;
    }

    public Creditcard getCreditcard() {
        return creditcard;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }
}
