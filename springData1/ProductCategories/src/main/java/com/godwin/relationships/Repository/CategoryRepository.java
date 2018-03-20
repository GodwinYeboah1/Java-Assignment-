package com.godwin.relationships.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//remember to import your model bussiness logic
import com.godwin.relationships.models.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	
}
