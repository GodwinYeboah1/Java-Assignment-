package com.godwin.Languages;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//step 2
//database wrapper comes with pre built methods
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{



	
}


