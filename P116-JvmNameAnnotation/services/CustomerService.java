package services;

import models.Customer;
import models.CustomerType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * CustomerService java class to simulate interaction between kotlin and java
 */
public class CustomerService {

    //Here customer, customerType are kotlin model classes holding all the data.
    public void processCustomerData(Customer customer, CustomerType customerType) {
        customer.hasLongName(); //calling method of customer's model class

        //Java has getters and setter with which we can assign some value or fetch the assigned value.
        //as customer's name is of type "val"(immutable), it doesn't have setters.
        customer.getName();

        //Calling extension function. Without Jvm naming
//        ExtensionsKt.initials(customer.getName());

        //With Jvm naming
        Extensions.initials(customer.getName());

        //Similarly, property of customerType is "var"(mutable), so we can have getters and setters for it
        customerType.getType(); //fetches value
        customerType.setType("Premium"); //sets value
    }

    //Function to return user name based on their handle
    //Annotation "NonNull" is used to avoid any possibilities of nullable data
    @NotNull
    public Customer customerName(String userHandle) {
        return new Customer("Hemanshu Varma"); //Simulating API response
    }

    //Function to return all the list of customers.
    @NotNull
    public List<Customer> customersList() {
        return new ArrayList<Customer>(); //Simulation of API
    }
}
