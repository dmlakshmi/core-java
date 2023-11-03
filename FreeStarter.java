class FreeStarter
{
public static void main(String args[])
{
	System.out.println("starting of main method");
	Free free=new Free();
	System.out.println("free for what:"+free);
	free.displayinfo();
	Free free1=new Free("java","skill",34);
	free1.displayinfo();
	Free free2=new Free("c","langlearn",4);
	free1.displayinfo();
	Free free3=new Free("c++","job",5);
	free3.displayinfo();
	Free free4=new Free("database","work",16);
	free4.displayinfo();
	Free free5=new Free("web","frentend",11);
	free5.displayinfo();
	Free free6=new Free("bootstarp","design",19);
	free6.displayinfo();
	Free free7=new Free("advancejava","coding",42);
	free7.displayinfo();
	Free free8=new Free("ruby","coding",12);
	free8.displayinfo();
	Free free9=new Free("python","game",15);
	free9.displayinfo();
	Free free10=new Free("javascript","frentend",17);
	free10.displayinfo();
	Free free11=new Free("UI","database",15);
	free11.displayinfo();
	Free free12=new Free("server","database",17);
	free12.displayinfo();
      System.out.println("ending of main method");
}
}