package kodlama.io.rent_a_car.business.abstracts;

import java.util.List;

import kodlama.io.rent_a_car.entities.concrates.Brand;

public interface BrandService {
    List<Brand> getAll();
}
