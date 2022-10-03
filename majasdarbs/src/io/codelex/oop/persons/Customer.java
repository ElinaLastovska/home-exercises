package io.codelex.oop.persons;

public class Customer extends Person {
    private final String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }


    //    getInfo should return firstName + lastName + customerId + purchase count, for example "Peter Brown CID1234 (10 purchases)"
    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getId() + " (" + getPurchaseCount() + " purchases)";
    }
}
