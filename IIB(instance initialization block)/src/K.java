class  K
{
	 static int count;  
	

	k()
	{
	
		count ++ ; 
	 
	 }

	 K(int i)
	{
		 
	}
	public static void main(String[] args) 
	{
		K obj1 = new K();
		K obj2 = new K();
		K obj3 = new K(20);
		K obj4 = new K(120);
		System.out.println(K.count );
	}
}
/*
skip becouse no error
but there have problem becouse it is not runnable

*/
