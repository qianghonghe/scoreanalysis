package cn.scoreanalysis.system.util;

import java.util.HashMap;
import java.util.Map;

public class ResultMessageUtil {
	
	public static Map<String, Integer> resultMessage(int result){
		Map<String, Integer> map = new HashMap<String, Integer>();
		if(result==1) {
			map.put("code",200);
		}else {
			map.put("code",500);
		}
		return map;
	}
}
