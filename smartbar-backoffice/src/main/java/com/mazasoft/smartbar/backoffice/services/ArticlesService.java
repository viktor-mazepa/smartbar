package com.mazasoft.smartbar.backoffice.services;

import com.mazasoft.smartbar.backoffice.api.model.Article;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArticlesService {
    public Article get() {
        return new Article().name("pepsi");
    }
}
