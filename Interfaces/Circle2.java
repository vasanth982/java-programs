interface shape{
void area();
}
class Circle2 implements shape{
public void area(){
double pi=3.14;
int r=5;
double circle_area = pi * r * r;
System.out.println("Area of circle:"+circle_area);
}
public static void main(String[] args){
Circle2 c1 = new Circle2();
c1.area();
}
}