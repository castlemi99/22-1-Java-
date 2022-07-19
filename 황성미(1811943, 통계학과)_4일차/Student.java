class Student extends Members 
{
	String dept;
	
	public Student(String name, String idnum, String dept) 
	{
		super(name, idnum);
		this.dept = dept;
	}
	
	//오버라이딩
	public void work(){
		System.out.println("Student : \"" + name + 
			"\" studies hard with his teacher in " + dept +
			" dept.");
	}
}
