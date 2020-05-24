package com.jayaprabahar.kotlin.service

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class KNVBClubServiceAware {

	var knvbServicesMap: Map<String, KNVBClubService> = mutableMapOf();

	@Autowired
	fun KNVBServiceAware(knvbServices: List<KNVBClubService>) {
		knvbServicesMap = knvbServices.associateBy { it.getCityName() };
	}

	fun getAllKNVBClubDetails(): String {
		return knvbServicesMap.toString();
	}

	fun getSpecificKNVBClubDetail(clubName: String): String {
		return knvbServicesMap.get(clubName)?.getClubInformation().toString();
	}
	
	fun checkKNVBClubCaptainName(clubName: String, captainName : String): Boolean {
		return knvbServicesMap.get(clubName)?.isCaptainNameIs(captainName) == true;
	}

}