package com.mazasoft.smartbar.backoffice.services;

import com.mazasoft.smartbar.backoffice.api.model.Category;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoriesService {
    public Category get() {
        return new Category().name("drink");
    }
}
