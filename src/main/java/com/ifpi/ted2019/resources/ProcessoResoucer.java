package com.ifpi.ted2019.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/processos")
public class ProcessoResoucer {
	
	@RequestMapping(method=RequestMethod.GET)
	public String Listar() {
		return "Rest funcionando";
	}

}
