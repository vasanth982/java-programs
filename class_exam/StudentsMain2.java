class StudentsMain2{
public static void main(String[] args){
Students s1=new Students();
Students s2=new Students(124,"madhu");

System.out.println("using getter");
System.out.println(s2.getRollno()+" "+s2.getName());
s1.setRollno(125);
s1.setName("Vasanth");
System.out.println("After using Setter");
System.out.println(s1.getRollno()+" "+s1.getName());
}
}
