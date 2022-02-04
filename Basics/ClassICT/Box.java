class Box extends Rectangle {

	public int perimeter(){

	return 2*(length+width);

	}


	public double cost() {

	return Area()*10.75;

	}

	

	public Box (int l, int w){

	super(l,w);

	}
}
