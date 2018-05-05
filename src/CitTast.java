public class CitTast {
    public static void main(String[] args) {

        SkeletonJava.printConsole("Programul se va termina cand introduci cifra zero, 0");
        //citirea
          int NrIntrare=SkeletonJava.readIntConsole("Da un numar mai bade! ");

        //algoritm
           while (NrIntrare != 0) {
               if (NrIntrare <= 10) {

                   long rezultat = NrIntrare * NrIntrare * NrIntrare;
                   SkeletonJava.printConsole(rezultat);
                   NrIntrare = SkeletonJava.readIntConsole("Da un numar mai bade! ");
                   }
               else
                   if (NrIntrare <= 20){
                   long rezultat = NrIntrare * NrIntrare;
                   SkeletonJava.printConsole(rezultat);
                   NrIntrare = SkeletonJava.readIntConsole("Da un numar mai bade! ");
                   }
                   else {
                       long rezultat = NrIntrare;
                       SkeletonJava.printConsole(rezultat);
                       NrIntrare = SkeletonJava.readIntConsole("Da un numar mai bade! ");
                   }
           }
        //afisarea
           SkeletonJava.printConsole("Bye-Bye");

    }
}
