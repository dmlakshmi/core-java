class Free
{
String what;
String why;
int freeforall;

Free()
{
System.out.println("free is running successfully");
}
Free(String what,String why,int freeforall)
{
	this.what=what;
	this.why=why;
	this.freeforall=freeforall;
	System.out.println("what,why,freeforall:"+what+","+why+","+freeforall);

}
void displayinfo()
{
	System.out.println("starting of displayinfo");
	System.out.println(this.what=what);
	System.out.println(this.why=why);
	System.out.println(this.freeforall=freeforall);
	System.out.println("ending of displayinfo");
}
}
