class Clock
{
String type;
String size;
boolean remainder=true;
int number=12;
Clock()
{
	this("small",true,12);
	System.out.println("clock is running successfully");
}
Clock(String type)
{
	this.type=type;
	System.out.println("type of clock is"+type);
}
Clock(String type,String size)
{
	this.type=type;
	this.size=size;
	System.out.println("type and size of clock is"+type+","+size);
}
Clock(boolean remainder,int number)
{
	this.remainder=remainder;
	this.number=number;
	System.out.println("remainder and number of clock is "+remainder+","+number);
}
Clock(String size,boolean remainder,int number)
{
	this.remainder=remainder;
	this.size=size;
	this.number=number;
	System.out.println("remainder and size,number of clock is "+remainder+","+size+","+number);
}
}