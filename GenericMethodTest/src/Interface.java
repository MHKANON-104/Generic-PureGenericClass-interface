
interface PrintData{
	void print();
}
class Interface implements PrintData{
	public void print() {
		System.out.println("Hello JAva");
	}
	public static void main(String args[]) {
		Interface obj=new Interface();
		obj.print();
	}
}