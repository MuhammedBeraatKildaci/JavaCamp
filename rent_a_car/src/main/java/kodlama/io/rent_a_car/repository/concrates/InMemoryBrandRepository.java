package kodlama.io.rent_a_car.repository.concrates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rent_a_car.entities.concrates.Brand;
import kodlama.io.rent_a_car.repository.abstracts.BrandRepository;

@Repository
public class InMemoryBrandRepository implements BrandRepository{

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"bmw"));
        brands.add(new Brand(2,"mercedes"));
        brands.add(new Brand(3,"audi"));
        brands.add(new Brand(4,"fiat"));
        brands.add(new Brand(5,"ford"));
        brands.add(new Brand(6,"renault"));
        brands.add(new Brand(7,"togg"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
    
}
