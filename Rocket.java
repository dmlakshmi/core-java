class Rocket
{
String model="flying";
int frame;
boolean fuel=true;
int yearOfmanf=5;
Rocket()
{
	this(true,2000);
	System.out.println("rocket is running successfully");
}
Rocket(String model)
{
	this.model=model;
	System.out.println("model of rocket is"+model);
}
Rocket(String model,int frame)
{
	this.model=model;
	this.frame=frame;
	System.out.println("model and frame of rocket is"+model+","+frame);
}
Rocket(boolean fuel,int yearOfmanf)
{
	this.fuel=fuel;
	this.yearOfmanf=yearOfmanf;
	System.out.println("fuel and yearOfmanf of rocket is "+fuel+","+yearOfmanf);
}
Rocket(int frame,boolean fuel,int yearOfmanf)
{
	this.frame=frame;
	this.fuel=fuel;
	this.yearOfmanf=yearOfmanf;
	System.out.println("frame and fuel,yearOfmanf of clock is "+frame+","+fuel+","+yearOfmanf);
}
}