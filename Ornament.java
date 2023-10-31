class Ornament
{
String design="good";
String type;
String color="gold";
double size;
Ornament()
{
	this("earing","gold",20);
	System.out.println("ornament is running successfully");
}
Ornament(String design)
{
	this.design=design;
	System.out.println("design of ornament is"+design);
}
Ornament(String design,String type)
{
	this.design=design;
	this.type=type;
	System.out.println("design and type of ornament is"+design+","+type);
}
Ornament(String color,double size)
{
	this.color=color;
	this.size=size;
	System.out.println("color and size of ornament is "+color+","+size);
}
Ornament(String type,String color,double size)
{
	this.type=type;
	this.color=color;
	this.size=size;
	System.out.println("type and color,size of ornament "+type+","+color+","+size);
}
}