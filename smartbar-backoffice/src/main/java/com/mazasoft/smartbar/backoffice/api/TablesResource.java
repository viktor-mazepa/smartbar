package com.mazasoft.smartbar.backoffice.api;

import com.mazasoft.smartbar.backoffice.api.model.Table;
import com.mazasoft.smartbar.backoffice.services.TablesService;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import java.net.URI;

import java.util.List;

public class TablesResource implements TablesApi {
    private final TablesService tablesService;

    @Inject
    public TablesResource(TablesService tablesService) {
        this.tablesService = tablesService;
    }

    @Override
    public Response tablesGet() {
        return Response.ok(List.of(tablesService.get())).build();
    }

    @Override
    public Response tablesPost(Table table) {
        return Response.created(URI.create("todo")).build();
    }

    @Override
    public Response tablesTableIdDelete(String tableId) {
        return Response.ok().build();
    }

    @Override
    public Response tablesTableIdGet(String tableId) {
        return Response.ok(tablesService.get()).build();
    }

    @Override
    public Response tablesTableIdPut(String tableId, Table table) {
        return Response.ok().build();
    }
}
