package com.my.dog;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface PropertyRepository extends PagingAndSortingRepository<Property, String> {

	@Query("Select c from Property c where c.name like %:filtro% order by category,name")
	public List<Property> findByFiltro(@Param("filtro") String filtro);

}
