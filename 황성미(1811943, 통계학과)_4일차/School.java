class School 
{
	Teacher yiyoon;
	Student kim, song, choi, lee;
	Members members[];

	public School() 
	{
		yiyoon = new Teacher("Yoon", "M103313", "IT공학전공");
		kim = new Student("kim", "STAT1811943", "통계학과");
		song = new Student("song", "IT201234", "IT공학전공");
		choi = new Student("choi", "IT193834", "IT공학전공");

		members = new Members[4];
		members[0] = yiyoon;
		members[1] = kim;
		members[2] = song;
		members[3] = choi;
	}

	public void makeWork(){
		int n = members.length;

		for (int i = 0; i < n ; i++ )
		{
			members[i].work();
		}
	}
}
