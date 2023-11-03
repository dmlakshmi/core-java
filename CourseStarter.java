class CourseStarter
{
public static void main(String args[])
{
	System.out.println("starting of main method");
    //Course course=new course();
    //course.displayinfo();
	Course course1=new Course("java","application",20,4,25000,false,"btm");
	course1.displayinfo();
	Course course2=new Course("web","design",20,4,25000,true,"btm");
	course2.displayinfo();
    Course course3=new Course("sql","database",12,3,25000,true,"bng");
	course3.displayinfo();
	Course course4=new Course("advancejava","coding",13,4,25000,false,"btm");
	course4.displayinfo();
	Course course5=new Course("python","coding",13,4,25000,true,"btm");
	course5.displayinfo();
    Course course6=new Course("ruby","coding",13,4,25000,true,"btm");
	course6.displayinfo();
	Course course7=new Course("c++","coding",13,4,25000,true,"btm");
	course7.displayinfo();
    Course course8=new Course("c","coding",13,4,25000,true,"btm");
	course8.displayinfo();
	Course course9=new Course("network","coding",13,4,25000,true,"btm");
	course9.displayinfo();
	Course course10=new Course("cyber","coding",13,4,25000,true,"btm");
	course10.displayinfo();

    Course course11=new Course("server","coding",13,4,25000,true,"btm");
	course11.displayinfo();

    Course course12=new Course("ui","coding",2,4,25000,true,"btm");
	course12.displayinfo();
	System.out.println("ending of main method");
}
}

