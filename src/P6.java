public class P6 {
    public static void main(String[] args) {
        float[] ArrayDeIntreg = {2,50,141,23,24}; //declarat si initializat
        float[] ArrayPare = new float[ArrayDeIntreg.length];
        int i=0;
        int j=0;

      /*  for (int i = 0; i < ArrayDeIntreg.length; i++) {
            if ((ArrayDeIntreg[i] % 2) == 0) {
                System.out.println(ArrayDeIntreg[i]);
            }*/
        System.out.println("Lungimea sirului este: "+ArrayDeIntreg.length);
         for (i = 0; i < ArrayDeIntreg.length; i++) {
             if ((ArrayDeIntreg[i] % 2) == 0) {
                 ArrayPare[j] = ArrayDeIntreg[i];
                 System.out.println("Din for primul sir:" + ArrayDeIntreg[i]);
                 System.out.println("Din for al doilea sir:" + ArrayPare[j]);
                 j++;
             }
         }
          for (j = 0; j < ArrayPare.length; j++) {
              System.out.println(ArrayPare[j]);
          }
        }
    }
