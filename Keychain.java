class Keychain
{
String color;
String type;
String design;
int keylength;
boolean digital=true;
Keychain()
{
	this("pink","bikechain","mental");
	System.out.println("keychain is running successfully");
}
Keychain(String color)
{
	this.color=color;
	System.out.println("color of keychain is:"+color);
}
Keychain(String color,String type)
{
	this(color);
	this.type=type;
	System.out.println("color and type of keychain is:"+color+","+type);
}
Keychain(String color,String type,String design)
{
	this(color,type);
	this.design=design;
	System.out.println("color and type ,design of keychain is :"+color+","+type+","+design);
}
Keychain(String color,String type,String design,int keylength)
{
	this(color,type,design);
	this.keylength=keylength;
	System.out.println("color and type ,design,keylength of keychain is :"+color+","+type+","+design+","+keylength);

}
Keychain(String color,String type,String design,int keylength,boolean digital)
{
	this(color,type,design,keylength);
	this.digital=digital;
	System.out.println("color and type ,design,keylength of keychain is :"+color+","+type+","+design+","+keylength+","+digital);
}
}