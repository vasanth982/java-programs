class Overloading {

    public static void main(String[] args) {
        Overloading obj = new Overloading();  // Corrected class name
        obj.addition();                    
        obj.addition(10, 20);              
        obj.addition(32.45f, 587.655f);    
    }

    void addition() {
        System.out.println("No arguments method");
    }

    void addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of integers: " + sum);
    }

    void addition(float num1, float num2) {
        float sum = num1 + num2;
        System.out.println("Sum of floats: " + sum);
    }
}
