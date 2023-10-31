class WalletStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");
Wallet wallet=new Wallet();
System.out.println("wallet quality:"+wallet.quality);
System.out.println("wallet type:"+wallet.type);
System.out.println("wallet price:"+wallet.price);
System.out.println("wallet noofzips:"+wallet.noofzips);
System.out.println("*************************");

Wallet wallet1=new Wallet("good");
System.out.println("wallet quality:"+wallet1.quality);
System.out.println("wallet type:"+wallet1.type);
System.out.println("wallet price:"+wallet1.price);
System.out.println("wallet noofzips:"+wallet1.noofzips);
System.out.println("*************************");

Wallet wallet2=new Wallet("good","leather");
System.out.println("wallet quality:"+wallet2.quality);
System.out.println("wallet type:"+wallet2.type);
System.out.println("wallet price:"+wallet2.price);
System.out.println("wallet noofzips:"+wallet2.noofzips);
System.out.println("*************************");

Wallet wallet3=new Wallet(500,3);
System.out.println("wallet quality:"+wallet3.quality);
System.out.println("wallet type:"+wallet3.type);
System.out.println("wallet price:"+wallet3.price);
System.out.println("wallet noofzips:"+wallet3.noofzips);
System.out.println("*************************");

Wallet wallet4=new Wallet("clothes",450,2);
System.out.println("wallet quality:"+wallet4.quality);
System.out.println("wallet type:"+wallet4.type);
System.out.println("wallet price:"+wallet4.price);
System.out.println("wallet noofzips:"+wallet4.noofzips);
System.out.println("*************************");
}
}
