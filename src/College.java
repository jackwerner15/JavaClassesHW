public class College {
	
	private String name; 
	private int students; 
	private String location; 
	
	public College() {
		
	}
	
	public College(String name, int students) {
		this.name = name; 
		this.students = students;
	}
	
	public College(String name, int students, String location) {
		this.name = name; 
		this.students = students; 
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean isGoodSchool() {
		return true; 
	}
	
	public static void message() {
		System.out.println("Choosing a college is a very important decision a lot of seniors in High School have to make.");
	}
	
	public String tourGuide(String list) {
		//there is now a variable called list, that exists only within this method
		return "We hope your tours are " + list + " and you pick the right school!";
	}

}