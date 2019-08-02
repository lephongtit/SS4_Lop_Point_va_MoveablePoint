public class MovablePoint extends Point {
    private float xSpeed=0;
    private float ySpeed=0;

    public MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float []Speed(){
        float[]count= new float[2];
        count[0]=this.xSpeed;
        count[1]=this.ySpeed;
        return count;
    }
    public  void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public String toString(){
        return "MovablePoint, (x= "+this.x+" y="+this.y+"), speed=("+this.xSpeed+","+this.ySpeed+")";
    }
    public MovablePoint move(){
        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
        return this;
    }
}
