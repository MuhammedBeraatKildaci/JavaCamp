package kodlama.io.rent_a_car.business.concrates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rent_a_car.business.abstracts.BrandService;
import kodlama.io.rent_a_car.business.requests.CreateBrandRequest;
import kodlama.io.rent_a_car.entities.concrates.Brand;
import kodlama.io.rent_a_car.repository.abstracts.BrandRepository;
import kodlama.io.rent_a_car.business.responses.GetAllBrandsResponse;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponse.add(responseItem);
        }
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brandRepository.save(brand);
    }
}