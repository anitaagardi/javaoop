package first;

public class Rectangle {
	private int a;
	private int b;
	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Rectangle(int side){
		this.a=side;
		this.b=side;
	}
	public int getArea(){
		return a*b;
	}
	public String getDetails(){
		return a+" "+b+" "+getArea();
	}
	public void setSides(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void setSides(int a){
		this.a=a;
		this.b=a;
	}
	public boolean isBigger(Rectangle rec){
		if(getArea()>rec.getArea()){
			return true;
		}
		return false;
	}
	public boolean isSame(Rectangle rec){
		if(a==rec.a||b==rec.a){
			if(a==rec.b||b==rec.b){
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
