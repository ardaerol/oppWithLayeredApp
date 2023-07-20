package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CustomerDao.CustomerDao;
import oopWithNLayeredApp.entities.Customer;

public class CustomerManager {
    private CustomerDao customerDao;
    private Logger[] loggers;

    public CustomerManager(CustomerDao customerDao,Logger[] loggers) {
        this.customerDao = customerDao;
        this.loggers = loggers;
    }

    public void addCustomer(Customer customer){
        customerDao.add(customer);

        for (Logger logger: loggers) {
            logger.log(customer.getName());
        }
    }
}
