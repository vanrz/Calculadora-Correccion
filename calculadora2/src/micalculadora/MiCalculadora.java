
package micalculadora;

public class MiCalculadora {

    protected double x;
    private double y;
    private double r;

    public void sumar() {
        r = x + y;
    }
    
    public void restar(){
        if(x<0){
            x=-x;
            y=-y;
        }
        if(x<y){
            double a;
            a=x;
            x=y;
            y=a;
        }
        r=x-y;
    }

    public void setX(double operando1) {
        this.x = operando1;
    }
    
    public double getX(){
        return x;
    }

    public void setY(double operando2) {
        this.y = operando2;
    }
    
    public double getY(){
        return y;
    }

    public double getR() {
        return r;
    }
    
    public void setR(double r) {
        this.r=r;
    }

    
    
}
