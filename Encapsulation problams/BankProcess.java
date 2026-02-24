class Customer4{
int customer_id;
String name;
int age;
private int wallet_balance;
Customer4(int customer_id, String name, int age, int wallet_balance){
this.customer_id=customer_id;
this.name=name;
this.age=age;
this.wallet_balance=wallet_balance;
}
void update_balance(int amount){
wallet_balance+=amount;
}
void show_balance(){
System.out.println("Customer ID: "+customer_id);
System.out.println("Balance: "+wallet_balance);
}
}
class BankProcess{
public static void main(String[] args){
Customer4 c1=new Customer4(11,"VJ",40,5000);
c1.update_balance(5000);
c1.wallet_balance=1000000;
c1.show_balance();
}
}