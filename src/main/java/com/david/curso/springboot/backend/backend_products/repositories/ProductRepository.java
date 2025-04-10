package com.david.curso.springboot.backend.backend_products.repositories;

import com.david.curso.springboot.backend.backend_products.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:4200"})
@RepositoryRestResource(path = "products")
// Indica que la ruta de la API es /products, en este caso es para evitar tener que crear un CRUD.
public interface ProductRepository extends CrudRepository<Product, Long> {
}
