package com.crudoperation.crud.services;

import com.crudoperation.crud.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
