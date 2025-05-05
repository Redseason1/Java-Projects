package LoginSystem;

import java.util.HashMap;
public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
	
	public IDandPasswords(){
		logininfo.put("108AB0719","s2078413");	
	}
	
	public HashMap<String,String> getLoginInfo(){
		return logininfo;
	}
}
