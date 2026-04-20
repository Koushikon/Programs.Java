class This_on_Method {
	int variable = 5;
	public static void main(String args[]) {
		This_on_Method obj = new This_on_Method();
		obj.method(20);
		obj.method();
	}
	void method(int variable) {
		variable = 10;
		System.out.println("Instance variable :" + this.variable);
		System.out.println("Local variable :" + variable);
	}
	void method() {
		int variable = 40;
		System.out.println("Instance variable :" + this.variable);
		System.out.println("Local variable :" + variable);
	}
}