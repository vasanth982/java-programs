public class MethodOverloading {
public static void main(String[] args) {
MethodOverloading obj = new MethodOverloading();
obj.addition();
obj.addition(10, 20);
obj.addition(32.45f, 56.78f);
}
void addition() {
System.out.println("No method");
}
void addition(int num1, int num2) {
System.out.println(num1 + num2);
}
void addition(float num1, float num2) {
System.out.println(num1 + num2);
}
}