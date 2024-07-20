package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
		
		private String name;
		private int age;
		private String course;
		private String time;
		
		public Student(String name, int age, String course, String time) {
			super();
			this.name = name;
			this.age = age;
			this.course = course;
			this.time = time;
		}

		public String getname() {
			return name;
		}
		
		public void setname(String name) {
			this.name = name;
		}
		
		public int getage() {
			return age;
		}
		
		public void setage(int age) {
			this.age = age;
		}
		
		public String getcourse() {
			return course;
		}
		
		public void setcourse(String course) {
			this.course = course;
		}
		
		public String gettime() {
			return time;
		}
		
		public void settime(String time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", course=" + course + ", time=" + time + "]";
		}
	}


public class StudentList {
	public static void main(String[] args) {

		Student s1 = new Student("Jagadish ", 20, "Java ", "8 to 10pm");
		Student s2 = new Student("Shiv ", 21, " C ", "8 to 10pm");
		Student s3 = new Student("Omkar ", 19, " C++ ", "8 to 10pm");
		Student s4 = new Student("Deval ", 18, " Python ", "8 to 10pm");

		List<Student> L = new ArrayList<Student>();
		L.add(s1);
		L.add(s2);
		L.add(s3);
		L.add(s3);
		L.add(s4);

		System.out.println("*****Before Overriding toString Method*****");
		for (Student ss : L) {
			System.out.println(ss.getname() + "" + ss.getage() + "" + ss.getcourse() + "" + ss.gettime());
		}

		System.out.println("\n *****After Overriding toString Method*****");

		for (int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i));
		}

		System.out.println("\n Age less than 20 Using for Loop ");
		for (int i = 0; i < L.size(); i++) {
			if (L.get(i).getage() < 20) {
				System.out.println(L.get(i));
			}
		}

		System.out.println("\n Age less than 20 Using Stream Without distinct Method");
		L.stream() // intermediate
				.filter((studentObj) -> {
					return studentObj.getage() < 20;
				})// intermediate
				.forEach((nn -> System.out.println(nn))); // terminal

		System.out.println("\n Age less than 20 Using Stream With distinct Method ");
		L.stream() // intermediate
				.distinct() // intermediate
				.filter((studentObj) -> {
					return studentObj.getage() < 20;
				})// intermediate
				.forEach((nn -> System.out.println(nn))); // terminal

		System.out.println("\nstream with java student");
		List<String> names = L.stream().filter((studentObj) -> {
			return studentObj.getcourse().trim().equalsIgnoreCase("java");
		}).map(stream -> stream.getname().toUpperCase()).distinct().collect(Collectors.toList());

		System.out.println(names);

	}

}
