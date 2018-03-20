package com.godwin.relationships.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//remember to import your model bussiness logic
import com.godwin.relationships.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
// i Can do raw sql command
	
}
