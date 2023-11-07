class Agent
{
	int id=20;
	String name="lakshmi";
	String companyName="valnut";
	
	void openTent( Tent tent)
	{
System.out.println("Starting openTent in Agent");
System.out.println(tent.open());
System.out.println(tent.slno);
System.out.println(tent.color);
System.out.println(tent.width);		
System.out.println(tent.height);	
System.out.println("ending openTent in Agent");
	}
	void closeTent(Tent tent)
	{
	System.out.println("Starting closeTent in Agent");
	System.out.println(tent.close());
    System.out.println(tent.slno);
    System.out.println(tent.color);
    System.out.println(tent.width);		
    System.out.println(tent.height);	
    System.out.println("ending closeTent in Agent");
	}
	void showInfo()
	{
		
		System.out.println("Starting showInfo in Agent");
		System.out.println("agent id is"+id);
		System.out.println("agent name is"+name);
		System.out.println("agent companyName is "+companyName);
		System.out.println("ending showInfo in Agent");
	}
}

