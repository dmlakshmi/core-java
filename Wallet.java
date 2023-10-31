class Wallet
{
String quality="good";
String type;
double price=250;
int  noofzips=3;
Wallet()
{
	this(300,4);
	System.out.println("wallet is running successfully");
}
Wallet(String quality)
{
	this.quality=quality;
	System.out.println("quality of wallet is"+quality);
}
Wallet(String quality,String type)
{
	this.quality=quality;
	this.type=type;
	System.out.println("quality and type of wallet is"+quality+","+type);
}
Wallet(double price,int noofzips)
{
	this.price=price;
	this.noofzips=noofzips;
	System.out.println("price and noofzips of wallet is "+price+","+noofzips);
}
Wallet(String type,double price,int noofzips)
{
	this.type=type;
	this.price=price;
	this.noofzips=noofzips;
	System.out.println("type and noofzips,price of wallet "+type+","+price+","+noofzips);
}
}