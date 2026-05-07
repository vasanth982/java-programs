import java.util.Scanner;
public class Matrix{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] [] A=new int[2][2];
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
A[i][j]=sc.nextInt();
}
}
int a11=A[0][0],a12=A[0][1];
int a21=A[1][0],a22=A[1][1];
int b11=A[0][0],b12=A[0][1];
int b21=A[1][0],b22=A[1][1];

int M1= (a11+ a22) * (b11+ b22);
int M2= (a21+ a22) * b11;
int M3= a11* (b12- b22);
int M4= a22* (b21- b11);
int M5= (a11+ a12) * b22;
int M6= (a21- a11) * (b11+ b12);
int M7= (a12- a22) * (b21+ b22);

int c11= M1+ M4- M5 + M7;
int c12= M3+ M5;
int c21= M2+ M4;
int c22= M1- M2+ M3 + M6;

int m11=c11-9*a11;
int m12=c12-9*a12;
int m21=c21-9*a21;
int m22=c22-9*a22;

System.out.println(m11+" "+m12);
System.out.println(m21+" "+m22);
sc.close();
}
}