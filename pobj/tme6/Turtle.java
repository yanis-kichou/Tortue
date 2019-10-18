package pobj.tme6;

public class Turtle implements ITurtle {

	private int x, y;
	private int angle;
	private boolean crayon;
	public Turtle() {
		this.x = 0;
		this.y = 0;
		this.angle = 0;
		crayon = true;
	}

	@Override
	public void move(int length) {
		int newX, newY;
		newX = x + (int) (length * Math.sin(angle * Math.PI / 180.));
		newY = y + (int) (length * Math.cos(angle * Math.PI / 180.));
		
			
		
		if(crayon) {
			draw(x, y, newX, newY);
		}
			
		x=newX;
		y=newY;
		
	}

	@Override
	public void turn(int angle) {
		this.angle=(angle+this.angle)%360;
	}

	@Override
	public void up() {
		crayon=false;
	}

	@Override
	public void down() {
		crayon=true;
	}

	public void draw(int x1, int y1, int x2, int y2) {
		System.out.print(x+" "+y+" "+x2+" "+y2+"\n");
	}
	

}
