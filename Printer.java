class Printer
{
String model;
String color;
int noofpages;
String quality="good";
double cost;
Printer()
{
	this("dell","black");
	System.out.println("printer is running successfully");
}
Printer(String model)
{
	this.model=model;
	System.out.println("model of printer is"+model);
}
Printer(String model,String color)
{
	this.model=model;
	this.color=color;
	System.out.println("model and color of printer is"+model+","+color);
}
Printer(String model,String color,int noofpages)
{
	this(model,color);
	this.noofpages=noofpages;
	System.out.println("model,color and noofpages of printer is "+model+","+color+","+noofpages);
}
Printer(String model,String color,int noofpages,String quality)
{
	this(model,color,noofpages);
	this.quality=quality;
	System.out.println("model,color and noofpages of printer is "+model+","+color+","+noofpages+","+quality);
}
Printer(String model,String color,int noofpages,String quality,double cost)
{
	this(model,color,noofpages,quality);
	this.cost=cost;
	System.out.println("model,color and noofpages of printer is "+model+","+color+","+noofpages+","+quality+","+cost);
}
}