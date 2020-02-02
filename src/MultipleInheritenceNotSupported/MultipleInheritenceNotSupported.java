
package MultipleInheritenceNotSupported;

public class MultipleInheritenceNotSupported {
    
    void msg(){
        System.out.println("Hello Wanbahjahkas");
    }
  }
    void B {
      void msg(){
            System.out.println("Wan");
    }
}
class C extends MultipleInheritenceNotSupported, B{//suppose if it were

Public Static Void main(){
C obj = new C();
obj.msg();//now which msg() method would be invoked?
}   
}

