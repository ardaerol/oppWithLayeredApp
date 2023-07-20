import oopWithNLayeredApp.business.CustomerManager;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.CustomerDao.HibernateCustomerDao;
import oopWithNLayeredApp.dataAccess.CustomerDao.jbcCustomerDao;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Customer;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Telefon",10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.addProduct(product1);

        Customer customer1 = new Customer(2,"arda");
        CustomerManager customerManager = new CustomerManager(new jbcCustomerDao(),loggers);
        customerManager.addCustomer(customer1);
    }
}