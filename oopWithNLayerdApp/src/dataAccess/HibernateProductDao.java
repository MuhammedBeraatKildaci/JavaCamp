package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Using Hibernate Product added");
    }
}
