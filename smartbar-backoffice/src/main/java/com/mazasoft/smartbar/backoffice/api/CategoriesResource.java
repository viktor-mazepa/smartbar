package com.mazasoft.smartbar.backoffice.api;

import com.mazasoft.smartbar.backoffice.api.model.Category;
import com.mazasoft.smartbar.backoffice.services.CategoriesService;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

public class CategoriesResource implements CategoriesApi {

    private final CategoriesService categoriesService;

    @Inject
    public CategoriesResource(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @Override
    public Response categoriesCategoryIdDelete(String categoryId) {
        return Response.ok().build();
    }

    @Override
    public Response categoriesCategoryIdGet(String categoryId) {
        return Response.ok(categoriesService.get()).build();
    }

    @Override
    public Response categoriesCategoryIdPut(String categoryId, Category category) {
        return Response.ok().build();
    }

    @Override
    public Response categoriesGet() {
        return Response.ok(List.of(categoriesService.get())).build();
    }

    @Override
    public Response categoriesPost(Category category) {
        return Response.created(URI.create("todo")).build();
    }
}
