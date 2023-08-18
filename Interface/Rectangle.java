
class Rectangle implements Shape{
	int l=2,b=3;
	public void calculateArea() {
		System.out.println("The area of rectangle is "+l*b);
		}
	public void calculatePerimeter() {
		System.out.println("The Perimeter of rectangle is "+2*(l+b));
		}
	}
