package com.jayaprabahar.kotlin.service

interface KNVBClubService {
	
	val captainName: String

	fun getCityName(): String;

	fun getHomeGround(): String;

	fun isSelctedForUEFACL(): Boolean;
	
	fun getKNVBPosition(): Int;
	
	fun isCaptainNameIs(name :String): Boolean;
	
	fun getClubInformation(): String;
	
	override fun toString(): String;
}