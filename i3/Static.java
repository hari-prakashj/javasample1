package com.onesoft.i3;
public class Static{
static {System.out.println("hi there");}
public static void main(String[]args) {
Stu s1 = new Stu(28,"hari");
Stu s2 = new Stu(62,"jana");
s1.display();
s2.display();
System.out.println(Stu.a("hi"));
}

}
class Stu{
int age;
String name;
static String location="trichy";
   Stu(int age,String name){
this.age=age;
this.name=name;
}
public void display(){
System.out.println (age+" "+name+" "+location);
}
public static String a(String b) {
return b;
}
}
