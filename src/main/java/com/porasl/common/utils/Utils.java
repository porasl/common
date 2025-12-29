package com.porasl.common.utils;

import java.util.Optional;

public class Utils {

	 public static String principalInfo(Object principal) {
	        if (principal == null) return "null";
	        return principal.getClass().getSimpleName() + "(" + principal.toString() + ")";
	    }
	 
	
}
