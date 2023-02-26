package kodlama.io.rent_a_car.business.concrates;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rent_a_car.business.abstracts.BrandService;
import kodlama.io.rent_a_car.entities.concrates.Brand;
import kodlama.io.rent_a_car.repository.abstracts.BrandRepository;

@Service
public class BrandManager implements BrandService{

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
    
}
