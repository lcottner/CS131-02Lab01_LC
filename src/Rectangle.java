public class Rectangle{
int length;
int width;

	public Rectangle(){
	length=1;
	width=1;
	}

	public Rectangle(int a, int b){
	length=a;
	width=b;
	}
	
	public int getWidth(){
		return width;
	}

	public int getLength(){
		return length;
	}

	public int calculateArea(){
	return length*width;
	}
	
	public int calculatePerimeter(){
	return length+length+width+width;
	}
}