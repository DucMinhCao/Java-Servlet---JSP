package Mypack;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	public static List<Users> ExportUsers() {
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("cao minh duc", "sinh vien", "82 truong chinh hue"));
		list.add(new Users("cao minh tri", "sinh vien", "82 truong chinh hue"));
		return list;
	}
}
