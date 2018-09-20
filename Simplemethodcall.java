package assignment2;

/**
 *
 * @author eschi
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paragraph1();
        paragraph2();
        paragraph3();
        paragraph4();
        paragraph5();
        paragraph6();
        
    }
   public static void paragraph1(){
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed the cat under yonder tree.");
        Cat();
        System.out.println();
   }
      public static void paragraph2(){
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed the hen under yonder tree.");
        Hen();
        Cat();
        System.out.println();
   }
      public static void paragraph3(){
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed the duck under yonder tree.");
        Duck();
        Hen();
        Cat();
        System.out.println();
   }
     
      public static void paragraph4(){
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed the goose under yonder tree.");
        Goose();
        Duck();
        Hen();
        Cat();
        System.out.println();
   }
      public static void paragraph5(){
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed the sheep under yonder tree.");
        Sheep();
        Goose();
        Duck();
        Hen();
        Cat();
        System.out.println();
   }
      public static void paragraph6(){
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed the pig under yonder tree.");
        Pig();
        Sheep();
        Goose();
        Duck();
        Hen();
        Cat();
        System.out.println();
   }

    public static void Cat(){
        System.out.println("Cat goes fiddle-i-fee.");
    }
    public static void Hen(){
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
    }
    public static void Duck(){
        System.out.println("Duck goes quack, quack,");
        
    }
    public static void Goose(){
        System.out.println("Goose goes hissy, hissy,");
    }
    public static void Sheep(){
        System.out.println("Sheep goes baa, baa, ");
    }
    public static void Pig(){
        System.out.println("Pig goes oink, oink,");
    }
}
