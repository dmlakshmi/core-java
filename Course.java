class Course
{
String name;
String application;
int  nooftopics;
int nooftrainer;
int fee;
boolean online;
String address;

Course()
{
System.out.println("course is running successfully");
}
Course(String name,String application,int nooftopics,int nooftrainer,int fee,boolean online,String address)
{
	this.name=name;
	this.application=application;
	this.nooftopics=nooftopics;
	this.nooftrainer=nooftrainer;
	this.fee=fee;
	this.online=online;
	this.address=address;
	System.out.println("name,application,nooftopics,nooftrainer,fee,online,address:"+name+","+application+","+nooftopics+","+nooftrainer+","+fee+","+online+","+address);

}
void displayinfo()
{
	System.out.println("starting of displayinfo");
	System.out.println(this.name=name);
	System.out.println(this.application=application);
	System.out.println(this.nooftopics=nooftopics);
	System.out.println(this.nooftrainer=nooftrainer);
	System.out.println(this.fee=fee);
	System.out.println(this.online=online);
	System.out.println(this.address=address);
    System.out.println("ending of displayinfo");
}
}
