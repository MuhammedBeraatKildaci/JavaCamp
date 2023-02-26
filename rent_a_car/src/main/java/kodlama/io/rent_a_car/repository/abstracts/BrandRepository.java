package kodlama.io.rent_a_car.repository.abstracts;

import java.util.List;


import kodlama.io.rent_a_car.entities.concrates.Brand;

public interface BrandRepository {
    List<Brand> getAll();
}
