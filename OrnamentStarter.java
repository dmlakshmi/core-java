class OrnamentStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");                                            
Ornament ornament=new Ornament();
System.out.println("ornament design:"+ornament.design);
System.out.println("ornament type:"+ornament.type);
System.out.println("ornament color:"+ornament.color);
System.out.println("ornament size:"+ornament.size);
System.out.println("*************************");

Ornament ornament1=new Ornament("good");
System.out.println("ornament design:"+ornament1.design);
System.out.println("ornament type:"+ornament1.type);
System.out.println("ornament color:"+ornament1.color);
System.out.println("ornament size:"+ornament1.size);
System.out.println("*************************");

Ornament ornament2=new Ornament("bad","silver");
System.out.println("ornament design:"+ornament2.design);
System.out.println("ornament type:"+ornament2.type);
System.out.println("ornament color:"+ornament2.color);
System.out.println("ornament size:"+ornament2.size);
System.out.println("*************************");

Ornament ornament3=new Ornament("gold",34);
System.out.println("ornament design:"+ornament3.design);
System.out.println("ornament type:"+ornament3.type);
System.out.println("ornament color:"+ornament3.color);
System.out.println("ornament size:"+ornament3.size);
System.out.println("*************************");

Ornament ornament4=new Ornament("gold","silver",10);
System.out.println("ornament design:"+ornament4.design);
System.out.println("ornament type:"+ornament4.type);
System.out.println("ornament color:"+ornament4.color);
System.out.println("ornament size:"+ornament4.size);
System.out.println("*************************");

}
}






