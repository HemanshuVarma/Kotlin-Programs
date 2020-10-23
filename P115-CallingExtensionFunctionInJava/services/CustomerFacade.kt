package services

class CustomerFacade(customerService: CustomerService) {

    init {

        //When utilizing java methods data, type inference is important as they could vary(could be nullable)
        //Java methods calls can be wrapped around requireNotNull() and other non-null operators like double bang(!!). Can be utilized based upon handling
        val customerName = customerService.customerName("@VarmaHemanshu")

        //Performing kotlin's operation on java response
        customerName.name //Getter is invoked here

        //Calling extension function
        customerName.name.initials() //Prints HV

        //Kotlin will not know the property type(mutable/immutable, nullable/non-nullable) until specified explicitly
        val customersList = customerService.customersList()

        //Performing kotlin specific functions
        customersList.map {
            //Mapping here
        }
        customersList.filterNotNull()
    }
}