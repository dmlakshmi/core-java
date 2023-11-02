class KeychainStarter
{
public static void main(String args[])
{
System.out.println("Starting of main method");                                            
Keychain keychain=new Keychain();
System.out.println("Keychain color:"+keychain.color);
System.out.println("Keychain type :"+keychain.type);
System.out.println("Keychain design:"+keychain.design);
System.out.println("Keychain quality:"+keychain.keylength);
System.out.println("Keychain digital:"+keychain.digital);
System.out.println("*************************");

Keychain keychain1=new Keychain("red");
System.out.println("Keychain color:"+keychain1.color);
System.out.println("Keychain type :"+keychain1.type);
System.out.println("Keychain design:"+keychain1.design);
System.out.println("Keychain quality:"+keychain1.keylength);
System.out.println("Keychain digital:"+keychain1.digital);
System.out.println("*************************");

Keychain keychain2=new Keychain("pink","carchain");
System.out.println("Keychain color:"+keychain2.color);
System.out.println("Keychain type :"+keychain2.type);
System.out.println("Keychain design:"+keychain2.design);
System.out.println("Keychain quality:"+keychain2.keylength);
System.out.println("Keychain digital:"+keychain2.digital);
System.out.println("*************************");

Keychain keychain3=new Keychain("yellow","carchain","steel");
System.out.println("Keychain color:"+keychain3.color);
System.out.println("Keychain type :"+keychain3.type);
System.out.println("Keychain design:"+keychain3.design);
System.out.println("Keychain quality:"+keychain3.keylength);
System.out.println("Keychain digital:"+keychain3.digital);
System.out.println("*************************");

Keychain keychain4=new Keychain("red","cyclechain","steel",12);
System.out.println("Keychain color:"+keychain4.color);
System.out.println("Keychain type :"+keychain4.type);
System.out.println("Keychain design:"+keychain4.design);
System.out.println("Keychain quality:"+keychain4.keylength);
System.out.println("Keychain digital:"+keychain4.digital);
System.out.println("*************************");

Keychain keychain5=new Keychain("red","cyclechain","steel",12,false);
System.out.println("Keychain color:"+keychain5.color);
System.out.println("Keychain type :"+keychain5.type);
System.out.println("Keychain design:"+keychain5.design);
System.out.println("Keychain quality:"+keychain5.keylength);
System.out.println("Keychain digital:"+keychain5.digital);
System.out.println("*************************");
}
}