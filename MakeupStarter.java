class MakeupStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");
MakeupKit makeup=new MakeupKit();
System.out.println("makeup brand:"+makeup.brand);
System.out.println("makeup price:"+makeup.price);
System.out.println("makeup noofitems:"+makeup.noofitems);
System.out.println("makeup expiryDate:"+makeup.expiryDate);
System.out.println("*************************");

MakeupKit makeup1=new MakeupKit("swiz");
System.out.println("makeup1 brand:"+makeup1.brand);
System.out.println("makeup1 price:"+makeup1.price);
System.out.println("makeup1 noofitems:"+makeup1.noofitems);
System.out.println("makeup1 expiryDate:"+makeup1.expiryDate);
System.out.println("*************************");

MakeupKit makeup2=new MakeupKit("swiz",250);
System.out.println("makeup brand:"+makeup2.brand);
System.out.println("makeup price:"+makeup2.price);
System.out.println("makeup noofitems:"+makeup2.noofitems);
System.out.println("makeup expiryDate:"+makeup2.expiryDate);
System.out.println("*************************");

MakeupKit makeup3=new MakeupKit(5,"09/2025");
System.out.println("makeup brand:"+makeup3.brand);
System.out.println("makeup price:"+makeup3.price);
System.out.println("makeup noofitems:"+makeup3.noofitems);
System.out.println("makeup expiryDate:"+makeup3.expiryDate);
System.out.println("*************************");

MakeupKit makeup4=new MakeupKit(340,5,"8/2025");
System.out.println("makeup brand:"+makeup4.brand);
System.out.println("makeup price:"+makeup4.price);
System.out.println("makeup noofitems:"+makeup4.noofitems);
System.out.println("makeup expiryDate:"+makeup4.expiryDate);
System.out.println("*************************");
}
}
