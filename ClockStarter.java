class  ClockStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");
Clock clock=new Clock();
System.out.println("clock type:"+clock.type);
System.out.println("clock size:"+clock.size);
System.out.println("clock remainder:"+clock.remainder);
System.out.println("clock number:"+clock.number);
System.out.println("*************************");

Clock clock1=new Clock("wired");
System.out.println("clock1 type:"+clock1.type);
System.out.println("clock1 size:"+clock1.size);
System.out.println("clock1 remainder:"+clock1.remainder);
System.out.println("clock1 number:"+clock1.number);
System.out.println("*************************");

Clock clock2=new Clock("wireless","small");
System.out.println("clock2 type:"+clock2.type);
System.out.println("clock2 size:"+clock2.size);
System.out.println("clock2 remainder:"+clock2.remainder);
System.out.println("clock2 number:"+clock2.number);
System.out.println("*************************");

Clock clock3=new Clock(true,7);
System.out.println("clock3 type:"+clock3.type);
System.out.println("clock3 size:"+clock3.size);
System.out.println("clock3 remainder:"+clock3.remainder);
System.out.println("clock3 number:"+clock3.number);
System.out.println("*************************");

Clock clock4=new Clock("big",false,12);
System.out.println("clock4 type:"+clock4.type);
System.out.println("clock4 size:"+clock4.size);
System.out.println("clock4 remainder:"+clock4.remainder);
System.out.println("clock4 number:"+clock4.number);
System.out.println("*************************");

System.out.println("ending of main method");

}
}