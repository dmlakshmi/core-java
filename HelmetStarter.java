class HelmetStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");                                            
Helmet helmet=new Helmet();
System.out.println("Helmet color:"+helmet.color);
System.out.println("Helmet brand :"+helmet.brand);
System.out.println("Helmet weight:"+helmet.weight);
System.out.println("Helmet material:"+helmet.material);
System.out.println("Helmet type:"+helmet.type);
System.out.println("*************************");

Helmet helmet1=new Helmet("black");
System.out.println("Helmet color:"+helmet1.color);
System.out.println("Helmet brand :"+helmet1.brand);
System.out.println("Helmet weight:"+helmet1.weight);
System.out.println("Helmet material:"+helmet1.material);
System.out.println("Helmet type:"+helmet1.type);
System.out.println("*************************");

Helmet helmet2=new Helmet("black","VEGA");
System.out.println("Helmet color:"+helmet2.color);
System.out.println("Helmet brand :"+helmet2.brand);
System.out.println("Helmet weight:"+helmet2.weight);
System.out.println("Helmet material:"+helmet2.material);
System.out.println("Helmet type:"+helmet2.type);
System.out.println("*************************");

Helmet helmet3=new Helmet("black","VEGA",1200);
System.out.println("Helmet color:"+helmet3.color);
System.out.println("Helmet brand :"+helmet3.brand);
System.out.println("Helmet weight:"+helmet3.weight);
System.out.println("Helmet material:"+helmet3.material);
System.out.println("Helmet type:"+helmet3.type);
System.out.println("*************************");

Helmet helmet4=new Helmet("yellow","NOAX",1200,"ABS");
System.out.println("Helmet color:"+helmet4.color);
System.out.println("Helmet brand :"+helmet4.brand);
System.out.println("Helmet weight:"+helmet4.weight);
System.out.println("Helmet material:"+helmet4.material);
System.out.println("Helmet type:"+helmet4.type);
System.out.println("*************************");

Helmet helmet5=new Helmet("grey","VEGA",1200,"ABS","street bike");
System.out.println("Helmet color:"+helmet4.color);
System.out.println("Helmet brand :"+helmet4.brand);
System.out.println("Helmet weight:"+helmet4.weight);
System.out.println("Helmet material:"+helmet4.material);
System.out.println("Helmet type:"+helmet4.type);
System.out.println("*************************");
}
}