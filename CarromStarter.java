class CarromStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");                                            
Carrom carrom=new Carrom();

System.out.println("carrom noofcoins:"+carrom.noofcoins);
System.out.println("carrom color :"+carrom.color);
System.out.println("carrom noofwhole:"+carrom.noofwhole);
System.out.println("carrom weight:"+carrom.weight);
System.out.println("carrom height:"+carrom.height);
System.out.println("*************************");

Carrom carrom1=new Carrom(24);
System.out.println("carrom noofcoins:"+carrom1.noofcoins);
System.out.println("carrom color :"+carrom1.color);
System.out.println("carrom noofwhole:"+carrom1.noofwhole);
System.out.println("carrom weight:"+carrom1.weight);
System.out.println("carrom height:"+carrom1.height);
System.out.println("*************************");

Carrom carrom2=new Carrom(21,"red");
System.out.println("carrom noofcoins:"+carrom2.noofcoins);
System.out.println("carrom color :"+carrom2.color);
System.out.println("carrom noofwhole:"+carrom2.noofwhole);
System.out.println("carrom weight:"+carrom2.weight);
System.out.println("carrom height:"+carrom2.height);
System.out.println("*************************");

Carrom carrom3=new Carrom(15,"white",4);
System.out.println("carrom noofcoins:"+carrom3.noofcoins);
System.out.println("carrom color :"+carrom3.color);
System.out.println("carrom noofwhole:"+carrom3.noofwhole);
System.out.println("carrom weight:"+carrom3.weight);
System.out.println("carrom height:"+carrom3.height);
System.out.println("*************************");

Carrom carrom4=new Carrom(10,"black",4,12);
System.out.println("carrom noofcoins:"+carrom4.noofcoins);
System.out.println("carrom color :"+carrom4.color);
System.out.println("carrom noofwhole:"+carrom4.noofwhole);
System.out.println("carrom weight:"+carrom4.weight);
System.out.println("carrom height:"+carrom4.height);
System.out.println("*************************");

Carrom carrom5=new Carrom(12,"white",4,12,11);
System.out.println("carrom noofcoins:"+carrom5.noofcoins);
System.out.println("carrom color :"+carrom5.color);
System.out.println("carrom noofwhole:"+carrom5.noofwhole);
System.out.println("carrom weight:"+carrom5.weight);
System.out.println("carrom height:"+carrom5.height);
System.out.println("*************************");
}
}