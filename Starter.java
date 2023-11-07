class Starter
{
public static void main(String [] args)
{
	System.out.println("Starting main in Starter");
	Color color=Color.RED;
	Tent tent=new Tent();
	Agent agent=new Agent();
	tent.showInfo(22,color,34,29);
	agent.openTent(tent);
	agent.closeTent(tent);
	agent.showInfo();
	System.out.println("ending main in Starter");
}
}
