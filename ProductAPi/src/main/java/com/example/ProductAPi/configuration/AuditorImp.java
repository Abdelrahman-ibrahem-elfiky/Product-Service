package com.example.ProductAPi.configuration;

import com.example.ProductAPi.entity.Product;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorImp implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        //should get username from userAPI with spring security.
        return Optional.of("Admin");
    }
}
