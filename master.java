class Master{
	public static void main(String args[])
	{
		//Haapy I have taken the code from remote
		int a =10;
		int b= 5;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
	}

	public static int add(int a, int b){
		int result = a + b;
		return result;
	}

	public static int sub(int a, int b){
		int result = a - b;
		return result;
	}

	public static int mul(int a, int b){
		int result = a * b;
		return result;
	}
	public static long div(int a, int b){
		long result = a / b;
		return result;
	}
}