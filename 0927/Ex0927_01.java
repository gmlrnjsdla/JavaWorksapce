class TV1{
	private int size;
	public TV1(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
class ColorTV extends TV1{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치"+ color+"컬러");
	}
}
	

public class Ex0927_01 {

	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32, 1024);
		mytv.printProperty();

	}

}
