package com.jayaprabahar.kotlin.service

import org.springframework.stereotype.Service
import com.jayaprabahar.kotlin.util.KNVBServiceStringFormatter

@Service("PSV")
class PSVClubService : KNVBClubService {

	override val captainName: String = "Ibrahim Afellay";

	override fun getCityName(): String {
		return "Eindhoven";
	}

	override fun getHomeGround(): String {
		return "Philips Stadion Eindhoven";
	}

	override fun isSelctedForUEFACL(): Boolean {
		return false;
	}

	override fun getKNVBPosition(): Int {
		return 3;
	}

	override fun isCaptainNameIs(name: String): Boolean {
		return captainName.equals(name, false);
	}

	override fun getClubInformation(): String {
		return KNVBServiceStringFormatter.getKNVBServiceString(this);
	}

	override fun toString(): String {
		return getClubInformation();
	}

}