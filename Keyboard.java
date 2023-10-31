class Keyboard
{
String brand;
String color="red";
int noofKeys;
String type="wired";
double cost;

Keyboard()
{
System.out.println("keyboard  running successfully");
}
Keyboard(String brand)
{
this.brand=brand;
System.out.println("brand of keyboard"+brand);
}
Keyboard(int noofKeys)
{
	this.noofKeys=noofKeys;
	System.out.println("noofKeys in Keyboard"+noofKeys);
}
Keyboard(double cost)
{
	this.cost=cost;
	System.out.println("cost of keyboard"+cost);
}
Keyboard(String brand,int noofKeys)
{
	this.brand=brand;
	this.noofKeys=noofKeys;
	System.out.println("brand and noofKeys of keyboard"+brand+","+noofKeys);
}
Keyboard(String  type,double cost)
{
	this.type=type;
	this.cost=cost;
	System.out.println("type and cost of Keyboard"+type+","+cost);
}
}