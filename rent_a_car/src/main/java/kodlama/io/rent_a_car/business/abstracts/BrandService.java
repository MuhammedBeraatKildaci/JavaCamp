package kodlama.io.rent_a_car.business.abstracts;

import java.util.List;

import kodlama.io.rent_a_car.business.requests.CreateBrandRequest;
import kodlama.io.rent_a_car.business.responses.GetAllBrandsResponse;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
