package com.itjob.util;

public class StringUtil {
	
	public static boolean isEmpty(String string){
		if("".equals(string)||string==null){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNotEmpty(String string){
		if(!"".equals(string)&&string!=null){
			return true;
		}
		else{
			return false;
		}
	}

}
