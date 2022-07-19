class Teacher extends Members 
{
	String dept;
	Members students[];

	public Teacher(String name, String idnum, String dept) 
	{
		super(name, idnum);
		this.dept = dept;
	}
	public void setStudents(Members sub[]){
		students = sub;
	}

	//오버라이딩
	public void work(){
		System.out.println("Teacher : \"" + name + 
			"\" studies hard with his students in " + dept +
			" dept.");
	}
}
