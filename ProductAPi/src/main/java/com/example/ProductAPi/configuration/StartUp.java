package com.example.ProductAPi.configuration;

import com.example.ProductAPi.entity.Brand;
import com.example.ProductAPi.entity.Category;
import com.example.ProductAPi.entity.Product;
import com.example.ProductAPi.repository.BrandRepository;
import com.example.ProductAPi.repository.CategoryRepository;
import com.example.ProductAPi.repository.ProductRepository;
import com.example.ProductAPi.service.BrandServiceImpl;
import com.example.ProductAPi.service.CategoryServiceImpl;
import com.example.ProductAPi.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartUp implements CommandLineRunner {

    private final ProductServiceImpl productService;

    private final CategoryServiceImpl categoryService;

    private final BrandServiceImpl brandService;

    @Override
    public void run(String... args) throws Exception {

        if (categoryService.findAll().isEmpty()) {
            Category c1 = new Category();
            c1.setName("Coffee");
            c1.setDescription("good Coffee");
            categoryService.create(c1);

            Category c2 = new Category();
            c2.setName("Snack foods");
            c2.setDescription("Snack foods is good");
            categoryService.create(c2);
        }

        if (brandService.findAll().isEmpty()) {
            Brand b1 = new Brand();
            b1.setName("Cairo Coffee Co.");
            b1.setDescription("good Cairo Coffee Co.");
            brandService.create(b1);

            Brand b2 = new Brand();
            b2.setName("Snack ");
            b2.setDescription("Snack is good");
            brandService.create(b2);
        }
        if (productService.findAll().isEmpty()) {
            Product p1 = new Product();
            p1.setName(" Nile Brew Coffee ");
            p1.setPrice(150.0);
            p1.setDescription("Nile Brew Coffee is good");
            p1.setAvailability(true);
            p1.setQuantity(10);
            p1.setProductCode("S100");
            p1.setImage("BZ");
            p1.setStoreId(1L);
            p1.setCategory(categoryService.findById(1l));
            p1.setBrand(brandService.findById(1l));
            productService.create(p1);

            Product p2 = new Product();
            p2.setName("Crunchy ");
            p2.setPrice(120.0);
            p2.setDescription("Crunchy is good  ");
            p2.setAvailability(true);
            p2.setQuantity(10);
            p2.setProductCode("C100");
            p2.setImage("CO");
            p2.setStoreId(2L);
            p2.setCategory(categoryService.findById(2l));
            p2.setBrand(brandService.findById(2l));
            productService.create(p2);
        }
    }
}
