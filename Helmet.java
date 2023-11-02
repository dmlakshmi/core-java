class Helmet
{
String color;
String brand;
double weight=10;
String material;
String type="all_vehicle";
Helmet()
{
	this("dullblack","vega",120);
	System.out.println("helmet is running successfully");
}
Helmet(String color)
{
	this.color=color;
	System.out.println("color of helmet is:"+color);
}
Helmet(String color,String brand)
{
	this(color);
	this.brand=brand;
	System.out.println("color of helmet is:"+color+","+brand);
}

Helmet(String color,String brand,double weight)
{
	this(color,brand);
	this.weight=weight;
	System.out.println("color,weight of helmet is:"+color+","+brand+","+weight);
}
Helmet(String color,String brand,double weight,String material)
{
	this(color,brand,weight);
	this.material=material;
	System.out.println("color,weight of helmet is:"+color+","+brand+","+weight+","+material);
}
Helmet(String color,String brand,double weight,String material,String type)
{
	this(color,brand,weight,material);
	this.type=type;
	System.out.println("color,weight of helmet is:"+color+","+brand+","+weight+","+material+","+type);
}
}


