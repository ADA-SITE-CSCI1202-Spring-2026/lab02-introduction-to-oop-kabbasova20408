package week04.geometry;

public class Point {
    private float x;
    private float y;
    public Point()
    {
        x= 0f;
        y=0f;
    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p){
        this.x= p.x;
        this.y=p.y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setx(float x){
        this.x=x;
    }
    public void Sety(float y){
        this.y=y;
    }
}
