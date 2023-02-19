package business;
import core.logging.Logger;
import dataAccess.ProductDao;
import entities.Product;


public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }
    
    public void add(Product product) throws Exception{
        if(product.getPrice() <10){
            throw new Exception("Product price must be greater than 10");
        }

        // ProductDao productDao = new HibernateProductDao();
        productDao.add(product);

        for(Logger logger : loggers){
            logger.log(product.getName()+" added");
        }
    }
}
