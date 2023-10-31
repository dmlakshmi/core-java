class MakeupKit
{
String brand;
double price;
int noofitems=5;
String expiryDate="03/2024";
MakeupKit()
{
	this("Lacto",250);
	System.out.println("makeupkit is running successfully");
}
MakeupKit(String brand)
{
	this.brand=brand;
	System.out.println("brand of makeupkit is"+brand);
}
MakeupKit(String brand,double price)
{
	this.brand=brand;
	this.price=price;
	System.out.println("brand and price of MakeupKit is"+brand+","+price);
}
MakeupKit(int noofitems,String expiryDate)
{
	this.noofitems=noofitems;
	this.expiryDate=expiryDate;
	System.out.println("noofitems and expiryDate of makeupkit is "+noofitems+","+expiryDate);
}
MakeupKit(double price,int noofitems,String expiryDate)
{
	this.price=price;
	this.noofitems=noofitems;
	this.expiryDate=expiryDate;
	System.out.println("price and noofitems,expiryDate of makeupkitis "+price+","+noofitems+","+expiryDate);
}
}