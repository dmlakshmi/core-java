class PrinterStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");                                            
Printer printer=new Printer();
System.out.println("printer model:"+printer.model);
System.out.println("printer color:"+printer.color);
System.out.println("printer noofpages:"+printer.noofpages);
System.out.println("printer quality:"+printer.quality);
System.out.println("printer cost:"+printer.cost);
System.out.println("*************************");

Printer printer5=new Printer("hp");
System.out.println("printer model:"+printer5.model);
System.out.println("printer color:"+printer5.color);
System.out.println("printer noofpages:"+printer5.noofpages);
System.out.println("printer quality:"+printer5.quality);
System.out.println("printer cost:"+printer5.cost);
System.out.println("*************************");

Printer printer1=new Printer("hp","black");
System.out.println("printer model:"+printer1.model);
System.out.println("printer color:"+printer1.color);
System.out.println("printer noofpages:"+printer1.noofpages);
System.out.println("printer quality:"+printer1.quality);
System.out.println("printer cost:"+printer1.cost);
System.out.println("*************************");

Printer printer2=new Printer("hp","black",100);
System.out.println("printer model:"+printer2.model);
System.out.println("printer color:"+printer2.color);
System.out.println("printer noofpages:"+printer2.noofpages);
System.out.println("printer quality:"+printer2.quality);
System.out.println("printer cost:"+printer2.cost);
System.out.println("*************************");

Printer printer3=new Printer("hp","black",100,"good");
System.out.println("printer model:"+printer3.model);
System.out.println("printer color:"+printer3.color);
System.out.println("printer noofpages:"+printer3.noofpages);
System.out.println("printer quality:"+printer3.quality);
System.out.println("printer cost:"+printer3.cost);
System.out.println("*************************");

Printer printer4=new Printer("hp","black",100,"good",1200);
System.out.println("printer model:"+printer4.model);
System.out.println("printer color:"+printer4.color);
System.out.println("printer noofpages:"+printer4.noofpages);
System.out.println("printer quality:"+printer4.quality);
System.out.println("printer cost:"+printer4.cost);
System.out.println("*************************");
}
}