class Vehicle2{
private int model=1991;
String brand="Ford";
protected String type="SUV";
public String colour="red";
public void honk(){
System.out.println("Honk Honk Honk");
}
}
class Car2{
public static void main(String[] args){
Vehicle2 v1=new Vehicle2();
v1.honk();
System.out.println(v1.model);
System.out.println(v1.brand);
System.out.println(v1.type);
System.out.println(v1.colour);
}
}