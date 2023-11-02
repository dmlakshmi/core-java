class Bracelet
{
double purity;
String color;
String type;
double weight=0057;
double height;

Bracelet()
{
	this(250,"gold");
	System.out.println("Bracelet is running successfully");
}
Bracelet(double purity)
{
	this.purity=purity;
	System.out.println("purity of bracelet is:"+purity);
}
Bracelet(double purity,String color)
{
	this(purity);
	this.color=color;
	System.out.println("purity,color of bracelet is:"+purity+","+color);
}
Bracelet(double purity,String color,String type)
{
	this(purity,color);
	this.type=type;
	System.out.println("purity,color,type of bracelet is:"+purity+","+color+","+type);
}
Bracelet(double purity,String color,String type,double weight)
{
	this(purity,color,type);
	this.weight=weight;
	System.out.println("purity,color,type of bracelet is:"+purity+","+color+","+type+","+weight);
}
Bracelet(double purity,String color,String type,double weight,double height)
{
	this(purity,color,type,weight);
	this.height=height;
	System.out.println("purity,color,type of bracelet is:"+purity+","+color+","+type+","+weight+","+height);
}
}