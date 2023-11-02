class Carrom
{
int noofcoins;
String color;
int noofwhole;
double weight=10;
double height;

Carrom()
{
	this(25,"white");
	System.out.println("carrom is running successfully");
}
Carrom(int noofcoins)
{
	this.noofcoins=noofcoins;
	System.out.println("noofcoins of carrom is:"+noofcoins);
}
Carrom(int noofcoins,String color)
{
	this(noofcoins);
	this.color=color;
	System.out.println("noofcoins,color of carrom is:"+noofcoins+","+color);
}

Carrom(int noofcoins,String color,int noofwhole)
{
	this(noofcoins,color);
	this.noofwhole=noofwhole;
	System.out.println("noofcoins,color,noofwhole of carrom is:"+noofcoins+","+color+","+noofwhole);
}

Carrom(int noofcoins,String color,int noofwhole,double weight)
{
	this(noofcoins,color,noofwhole);
	this.weight=weight;
	System.out.println("noofcoins,color,noofwhole,weight of carrom is:"+noofcoins+","+color+","+noofwhole+","+weight);
}

Carrom(int noofcoins,String color,int noofwhole,double weight,double height)
{
	this(noofcoins,color,noofwhole,weight);
	this.height=height;
	System.out.println("noofcoins,color,noofwhole,weight,height of carrom is:"+noofcoins+","+color+","+noofwhole+","+weight+","+height);
}
}

