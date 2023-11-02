class BraceletStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");                                            
Bracelet bracelet=new Bracelet();
System.out.println("bracelet purity:"+bracelet.purity);
System.out.println("bracelet color :"+bracelet.color);
System.out.println("bracelet type:"+bracelet.type);
System.out.println("bracelet weight:"+bracelet.weight);
System.out.println("bracelet height:"+bracelet.height);
System.out.println("*************************");

Bracelet bracelet1=new Bracelet(100);
System.out.println("bracelet purity:"+bracelet1.purity);
System.out.println("bracelet color :"+bracelet1.color);
System.out.println("bracelet type:"+bracelet1.type);
System.out.println("bracelet weight:"+bracelet1.weight);
System.out.println("bracelet height:"+bracelet1.height);
System.out.println("*************************");

Bracelet bracelet2=new Bracelet(200,"silver");
System.out.println("bracelet purity:"+bracelet2.purity);
System.out.println("bracelet color :"+bracelet2.color);
System.out.println("bracelet type:"+bracelet2.type);
System.out.println("bracelet weight:"+bracelet2.weight);
System.out.println("bracelet height:"+bracelet2.height);
System.out.println("*************************");

Bracelet bracelet3=new Bracelet(200,"gold","ring");
System.out.println("bracelet purity:"+bracelet3.purity);
System.out.println("bracelet color :"+bracelet3.color);
System.out.println("bracelet type:"+bracelet3.type);
System.out.println("bracelet weight:"+bracelet3.weight);
System.out.println("bracelet height:"+bracelet3.height);
System.out.println("*************************");


Bracelet bracelet4=new Bracelet(200,"gold","ring",250);
System.out.println("bracelet purity:"+bracelet4.purity);
System.out.println("bracelet color :"+bracelet4.color);
System.out.println("bracelet type:"+bracelet4.type);
System.out.println("bracelet weight:"+bracelet4.weight);
System.out.println("bracelet height:"+bracelet4.height);
System.out.println("*************************");


Bracelet bracelet5=new Bracelet(200,"gold","ring",120,122);
System.out.println("bracelet purity:"+bracelet5.purity);
System.out.println("bracelet color :"+bracelet5.color);
System.out.println("bracelet type:"+bracelet5.type);
System.out.println("bracelet weight:"+bracelet5.weight);
System.out.println("bracelet height:"+bracelet5.height);
System.out.println("*************************");
}
}