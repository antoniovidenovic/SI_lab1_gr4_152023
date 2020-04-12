class Point {
	String id
	double x,y;

	String color

	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}

	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw () {
		//TODO
	}



}
class Canvas{
	List<Point> points = new ArrayList<Points>();

	public int compare(Point o1,Point o2){
		return integer.compare(o1.getX(),o2.gety());
	}

}
