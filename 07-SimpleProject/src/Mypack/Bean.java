package Mypack;

import java.util.ArrayList;
import java.util.List;

public class Bean {
	public static List<Users> ExportUsers() {
		List<Users> list = new ArrayList<Users>();
		
		list.add(new Users("minh duc cao", "Senior Web Dev", "82 Truong Chinh Hue"));
		list.add(new Users("Cao Minh Tri", "Senior Mobile Dev","DHBK"));
		
		return list;
	}
}
