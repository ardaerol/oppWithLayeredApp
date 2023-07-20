package oopWithNLayeredApp.dataAccess.CustomerDao;

import oopWithNLayeredApp.entities.Customer;

public class jbcCustomerDao implements CustomerDao{
    @Override
    public void add(Customer customer) {
        System.out.println("Customer JDBC ile veritabanına eklendi");
    }
}
