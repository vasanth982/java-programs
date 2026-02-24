class Students{
private int rollno;
private String name;
Students(){
this.rollno=123;
this.name="nani";
}
Students(int rollno,String name){
this.rollno=rollno;
this.name=name;
}
void setRollno(int rollno){
this.rollno=rollno;
}
void setName(String name){
this.name=name;
}
int getRollno(){
return this.rollno;
}
String getName(){
return this.name;
}
}