package kodlama.io.rent_a_car.repository.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.rent_a_car.entities.concrates.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
