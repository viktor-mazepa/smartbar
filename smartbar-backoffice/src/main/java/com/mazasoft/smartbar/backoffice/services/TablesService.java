package com.mazasoft.smartbar.backoffice.services;

import com.mazasoft.smartbar.backoffice.api.model.Table;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TablesService {

    public Table get() {
        return new Table().name("Paris");
    }
}
