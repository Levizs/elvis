package com.my.dog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PropertyController {

	@Autowired
	private PropertyRepository propertyRepository;

	@GetMapping("/find")
	List<Property> findByFiltro(@RequestParam("filtro") String filtro) {
		return propertyRepository.findByFiltro(filtro);
	}

}
