class myclass{

	// attributes
	static int count = 0;
	final double pi = 3.1415;

	myclass(){
		count++;
} //constructor

	public void v_final(){
		System.out.println("The final value of count and pi are: "+count+" and "+pi+" respectively");

	} //method

	public static void main(String[] args){

		myclass fv=new myclass();
		myclass sv=new myclass();
		myclass tv=new myclass();

		tv.v_final();
	} //mainfn
} //myclass