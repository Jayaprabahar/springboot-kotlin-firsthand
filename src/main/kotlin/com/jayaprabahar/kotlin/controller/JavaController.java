/**
 * 
 */
package com.jayaprabahar.kotlin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {
	
	/**
	 * @return 
	 * 
	 */
	@GetMapping("/javacontroller")
	public String helloJavaWorld() {
		return "Hello Java World!";
	}

}
