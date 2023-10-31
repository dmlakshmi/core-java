class RocketStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");
Rocket rocket=new Rocket();
System.out.println("rocket model:"+rocket.model);
System.out.println("rocket size:"+rocket.frame);
System.out.println("rocket remainder:"+rocket.fuel);
System.out.println("rocket number:"+rocket.yearOfmanf);
System.out.println("*************************");

Rocket rocket1=new Rocket("flying");
System.out.println("rocket1 model:"+rocket1.model);
System.out.println("rocket1 size:"+rocket1.frame);
System.out.println("rocket1 remainder:"+rocket1.fuel);
System.out.println("rocket1 number:"+rocket1.yearOfmanf);
System.out.println("*************************");

Rocket rocket2=new Rocket("flying",5);
System.out.println("rocket2 model:"+rocket2.model);
System.out.println("rocket2 size:"+rocket2.frame);
System.out.println("rocket2 remainder:"+rocket2.fuel);
System.out.println("rocket2 number:"+rocket2.yearOfmanf);
System.out.println("*************************");

Rocket rocket3=new Rocket(true,2000);
System.out.println("rocket3 model:"+rocket3.model);
System.out.println("rocket3 size:"+rocket3.frame);
System.out.println("rocket3 remainder:"+rocket3.fuel);
System.out.println("rocket3 number:"+rocket3.yearOfmanf);
System.out.println("*************************");

Rocket rocket4=new Rocket(5,false,1999);
System.out.println("rocket4 model:"+rocket4.model);
System.out.println("rocket4 size:"+rocket4.frame);
System.out.println("rocket4 remainder:"+rocket4.fuel);
System.out.println("rocket4 number:"+rocket4.yearOfmanf);
System.out.println("*************************");
}
}