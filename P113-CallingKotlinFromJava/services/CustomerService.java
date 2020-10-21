package services;

import models.Customer;
import models.CustomerType;

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

        //Similarly, property of customerType is "var"(mutable), so we can have getters and setters for it
        customerType.getType(); //fetches value
        customerType.setType("Premium"); //sets value
    }
}
