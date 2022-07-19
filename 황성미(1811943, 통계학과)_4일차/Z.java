class Z extends Y 
{
	int zi = 30;
	String msg = "I am an Z.";

	void print(){
		System.out.println(msg);
	}

	void play(){
		System.out.println("Play.." + msg);
	}

	void doZ(){
		System.out.println("do somthing in Z.");
	}

	void test(int ti){
		Z z = new Z();
		Y y = z;
		X x = z;
		z.print();
		y.print();
		super.print();
		play();
		super.play();
		//y.doZ(); //컴파일에러
		//super.super.print(); //컴파일에러

		System.out.println("\nti = " + ti);
		System.out.println("yi = " + yi);
		System.out.println("xi = " + xi);

		System.out.println("this.zi = " + this.zi);
		System.out.println("this.yi = " + this.yi);
		System.out.println("this.xi = " + this.xi);

		System.out.println("super.yi = " + super.yi);
		System.out.println("y.yi = " + y.yi);
		System.out.println("x.xi = " + x.xi);
		System.out.println("((Y))this).yi = " + ((Y)this).yi);
		System.out.println("((X))this).xi = " + ((X)this).xi);
		//super.super.xi = 10; //컴파일에러

	}
}
