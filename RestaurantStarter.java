class RestaurantStarter{
	
	public static void main(String args[])
	{
		System.out.println("Starting of the main method");
		
		Restaurant restaurant=new Restaurant();
		
		String[] specialitems=new String[6];    // creation of the arrays
		specialitems[0]="puri";
		specialitems[1]="vada";
		specialitems[2]="magi";
		specialitems[3]="pakoda";
		specialitems[4]="parota";
		specialitems[5]="sira";
		restaurant.setSpecialitems(specialitems);
		restaurant.setOwnerName("rama");
		restaurant.display();
		
		
		System.out.println("Starting of the main method");
		
}
}