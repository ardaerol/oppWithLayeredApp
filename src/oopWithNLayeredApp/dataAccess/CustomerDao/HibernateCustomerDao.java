package oopWithNLayeredApp.dataAccess.CustomerDao;

import oopWithNLayeredApp.entities.Customer;

public class HibernateCustomerDao implements CustomerDao{

    @Override
    public void add(Customer customer) {
        System.out.println("Customer Hibernate ile veritabanına eklendi");
    }
}
