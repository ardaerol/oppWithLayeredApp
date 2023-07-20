package oopWithNLayeredApp.business;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;
import oopWithNLayeredApp.core.logging.Logger;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void addProduct(Product product) throws Exception {
        // iş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10dan küçük olamaz");
        }
//        ProductDao productDao = new jdbcProductDao();
        productDao.add(product);

        for (Logger logger: loggers) {//[db,mail]
            logger.log(product.getName());
        }
    }

}
