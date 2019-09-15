package dataStructure.miscellaneous;

public class Test  {

  public Exception m1(){
    int i=1;
    if(i==1){
      return new Exception();
    }else{
      throw new ArithmeticException();
    }
  }

  public static void main(String[] args) {

    foo(5);
  }
  public static void foo(Integer i){
    System.out.println("Test.foo int");
  }


  public static void foo(Long i){
    System.out.println("Test.foo");
  }
}

