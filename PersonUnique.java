class PersonUnique
{
	public static void main(String[] mail)
	{
		
		Email email2=new Email();
		email2.setMaill("lakshmi",23,"lak","M");
		email2.showInfo();
		
		Email email=new Email();
		email.setMaill("anu",22,"na","L");
		email.showInfo();
		
		Email email1=new Email();
		email1.setMaill(".mail",3,"Anu","M");
		email1.showInfo();
		
		
		
		Person person=new Person();
		person.setName("lakshmi");
		person.showInfo();
		
		Email[] emailArray=new Email[4];
		emailArray[2]=email;
		emailArray[1]=email1;
		emailArray[0]=email2;
		
		Email mai=emailArray[3];
		System.out.println(emailArray[1]);
		Email ref=emailArray[1];
		
		
		person.showInfo();
	}
}