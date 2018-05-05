public class P2 {
    public static void main(String[] args) {


        int PrimulNr = 7;
        int AlDoileaNr = 16;
        int Max;

       /* if (PrimulNr > AlDoileaNr) {
            System.out.println("Cel mare numar este "+PrimulNr);
        } else {
            System.out.println("Cel mare numar este "+AlDoileaNr);
        } */

        if (PrimulNr > AlDoileaNr) {
            Max = PrimulNr;
        } else {
            Max = AlDoileaNr;
        }
        System.out.println("Cel mare numar este "+Max);
    }
}