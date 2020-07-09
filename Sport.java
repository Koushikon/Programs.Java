//Question Paer Solve Jun-17 (1.b)
class Sportsperson
{
	String name,address;

	Sportsperson(String nm, String add)
	{
		name=nm;
		address=add;
	}

	void display_all_info()
	{
		System.out.print("\nName :- "+name+"\nAddress :- "+address);
	}
}
class Athlete extends Sportsperson
{
	String event,participate;
	Athlete(String nm, String add, String eve, String pt)
	{
		super(nm,add);
		event=eve;
		participate=pt;
	}

	void display_all_info()
	{
		super.display_all_info();
		System.out.print("\nEvent :- "+event+"\nParticipate :- "+participate+"\n");
	}
}
class Hocky_player extends Sportsperson
{
	int goals;

	Hocky_player(String nm, String add, int g)
	{
		super(nm,add);
		goals=g;
	}

	void display_all_info()
	{
		super.display_all_info();
		System.out.print("\nGoals Scored :- "+goals+"\n");
	}
}
class Sport
{
	public static void main(String []args)
	{
		Athlete a=new Athlete("Alita","Iceland","Run","Yes");
		Hocky_player hp=new Hocky_player("Shar","Rajbari",12);
		a.display_all_info();
		hp.display_all_info();
	}
}
