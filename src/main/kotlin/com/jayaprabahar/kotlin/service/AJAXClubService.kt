package com.jayaprabahar.kotlin.service

import org.springframework.stereotype.Service
import com.jayaprabahar.kotlin.util.KNVBServiceStringFormatter
import java.lang.UnsupportedOperationException

@Service("AJAXClubService")
class AJAXClubService : KNVBClubService {

	override val captainName: String = "Hakim Ziyech";

	override fun getCityName(): String {
		return "Amsterdam";
	}

	override fun getHomeGround(): String {
		return "AJAX Bijlmer";
	}

	override fun isSelctedForUEFACL(): Boolean {
		return true;
	}

	override fun getKNVBPosition(): Int {
		return 1;
	}

	override fun isCaptainNameIs(name: String): Boolean {
		return captainName.equals(name, false);
	}
	
	override fun getClubInformation(): String {
		throw UnsupportedOperationException();
	}
	
	override fun toString(): String {
		return KNVBServiceStringFormatter.getKNVBServiceString(this);
	}

}