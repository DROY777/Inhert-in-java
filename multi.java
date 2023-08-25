//MULTILEVEL INHERITANCE
class Car{
  Car(){
  System.out.println("cons1");
  }
 public void show(){
  System.out.println("parent"); 
}
}
class tire extends Car{
  tire(){
  System.out.println("cons2");
  }
 public void show(){
  System.out.println("child"); 
}
}
class horn extends tire{
  horn(){
  System.out.println("cons3");
  }
 public void show(){
  System.out.println("grndchild"); 
}
}
//Heirachial inheritance
class Car2{
  public void show(){
  System.out.println("parent"); 
 }
}
class Car3 extends Car2{
 public void show(){
  System.out.println("child"); 
 } 
}
class Car4 extends Car2{
 public void show(){
  System.out.println("superchild"); 
}
}
//Multiple inheritance(interfaces)
interface A{
 public void pg();
}
interface B{
  public void gg();
 }
class child implements A,B{
  public void pg(){
   System.out.println("paaaaaa");   
  }
  public void gg(){
   System.out.println("ggggggg");
  }
}
//Hybrid Inheritance
class sun{}
class earth extends sun{}
class venus extends sun{}
class moon extends earth{}
 public class multi{ 
 public static void main(String[]args){
  tire obj=new tire();
  obj.show();  
  child obj1=new child();
  obj1.gg();
  sun s=new sun();
  earth e=new earth();
  venus v=new venus();
  moon m=new moon();
  System.out.println(s instanceof sun);
  System.out.println(e instanceof sun);
  System.out.println(s instanceof earth);
  System.out.println(v instanceof venus);
  System.out.println(m instanceof sun);
  System.out.println(m instanceof earth);
  
 }    
}
