package org.fastrackit.online.shop.transfer.Customer;

import javax.validation.constraints.NotNull;

public class SaveCustomerRequest {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    @Override
    public String toString() {
        return "SaveCustomerRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
