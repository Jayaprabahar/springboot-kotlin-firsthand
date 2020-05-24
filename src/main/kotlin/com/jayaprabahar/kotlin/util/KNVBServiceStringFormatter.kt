package com.jayaprabahar.kotlin.util

import com.jayaprabahar.kotlin.service.KNVBClubService

object KNVBServiceStringFormatter {

	var outputFormat: String =
		"Welcome to %s football club. Our home ground is %s. We are %s selected for UEFA Champions league this year. Our KNVB Positon is %s";
	
	@JvmStatic
	fun getKNVBServiceString(localKNVBService : KNVBClubService) : String {
		return outputFormat.format(localKNVBService.getCityName(), localKNVBService.getHomeGround(), localKNVBService.isSelctedForUEFACL(), localKNVBService.getKNVBPosition());
	}
}