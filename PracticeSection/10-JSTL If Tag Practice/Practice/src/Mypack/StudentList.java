package Mypack;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	public static List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Cao Minh Đức", "Male", "82 Trường Chinh, Huế", 8.5));
		list.add(new Student("Lư Ngọc Chí Cường", "Male", "03 Lê Lợi, Thành Phố Hồ Chí Minh", 8.0));
		list.add(new Student("Cao Minh Trí", "Male", "82 Trường Chinh", 7.5));
		list.add(new Student("Phạm Việt Hưng", "Male", "114 An Dương Vương, P16, Q8, TPHCM", 5.5));
		list.add(new Student("L.Modric", "Male", "Spain", 4.2));
		list.add(new Student("C.Ronaldo", "Male", "Italia", 9));
		list.add(new Student("L.Messi", "Male", "Spain", 6.2));
		list.add(new Student("Gareth bale", "Male", "England", 4.5));
		
		return list;
	}
}
