public class Fan {
    public static void main(String[] args) {
        Fan obj1 = new Fan();
        System.out.println(obj1);

    }

    final int SLOW = 1;
    final int MEDIUM =2;
    final int FAST =3;
    int speed;
    boolean on;
    int radius;
    String color;

    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "red";
    }
    int getterSpeed(){
        return this.speed;
    }
    int getterRadius(){
        return this.radius;
    }
    String getterColor(){
        return this.color;
    }
    void setterSpeed(int newValue){
        this.speed = newValue;
    }
    void setterRadius(int newRadius){
        this.radius = newRadius;
    }
    void setterColor(String color){
        this.color = color;
    }
    void setterOn(){
        this.on = !this.on;
    }
    public String toString(){
        if(on){
            return   getterSpeed() + "@" + getterRadius();
        }else {
            return  getterColor() + "@" + getterRadius();
        }
    }

}
