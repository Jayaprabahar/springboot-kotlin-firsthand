package com.jayaprabahar.kotlin.controller

import com.jayaprabahar.kotlin.service.KNVBClubServiceAware
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@RestController
class KotlinController(val localKNVBServiceAware: KNVBClubServiceAware) {

	@GetMapping("/kotlincontroller")
	fun helloKotlinWorld(): String {
		return "Hello Kotlin World!";
	}

	@GetMapping("/kotlincontroller/clubs")
	fun getAllKNVBClubDetails(): String {
		return localKNVBServiceAware.getAllKNVBClubDetails();
	}
	
	@GetMapping("/kotlincontroller/clubs/{clubName}")
	fun getSpecificKNVBClubDetail(@PathVariable clubName : String): String {
		return localKNVBServiceAware.getSpecificKNVBClubDetail(clubName);
	}
	
	@GetMapping("/kotlincontroller/clubs/{clubName}/captain/{captainName}")
	fun checkKNVBClubCaptainName(@PathVariable clubName : String, @PathVariable captainName : String): String {
		return localKNVBServiceAware.checkKNVBClubCaptainName(clubName, captainName).toString();
	}
}