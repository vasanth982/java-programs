import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
public class MergeSortList{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
LinkedList<Integer> list1=new LinkedList<>();
LinkedList<Integer> list2 =new LinkedList<>();
int n=sc.nextInt();
for(int i=0;i<n;i++){
list1.add(sc.nextInt());
}
int m=sc.nextInt();
for (int i=0;i<m;i++){
list2.add(sc.nextInt());
}
LinkedList<Integer> mergeList=new LinkedList<>();
mergeList.addAll(list1);
mergeList.addAll(list2);
Collections.sort(mergeList);
for (int x:mergeList){
System.out.print(x+" ");
}
sc.close();
}
}