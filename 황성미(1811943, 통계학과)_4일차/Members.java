class Members 
{
	String name;
	String dept;
	String major;
	int id;

	public Members(String name, String dept) 
	{
		this.name = name;
		this.dept = dept;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setMafor(String major){
		this.major = major;
	}
	public void work(){
		System.out.println("\tMemebers : \"" + name + "\" does his best.");
	}
}
