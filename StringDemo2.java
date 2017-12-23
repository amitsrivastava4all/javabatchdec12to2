class StringDemo2{
public static void main(String ...arr){
String name = "Amit";
String name2=new String("AMIT");

if(name.contains("mit")){
System.out.println("Found");
}

System.out.println(name.startsWith("Am")?"Start Found":"No Start Found");
System.out.println(name.endsWith("it")?"End Found":"No End Found");



if(name.equalsIgnoreCase(name2)){
	System.out.println("Value are Same");
}
else{
System.out.println("Value are Not Same");
}

if(name == name2){
System.out.println("Same Ref ");
}
else{
System.out.println("Not Same Ref ");
}
name2="Ram";
if(name == name2){
System.out.println("Same Ref ");
}
else{
System.out.println("Not Same Ref ");
}
}
}