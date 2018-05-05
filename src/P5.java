public class P5 {
    public static void main(String[] args) {
        int [] ArrayDeIntreg= {4,5,11,23,7}; //declarat si initializat
        double avg=0;
        int sum = 0;
        for (int i=0; i < ArrayDeIntreg.length; i++)
        {
            sum = sum + ArrayDeIntreg[i];
        }
        avg=(double)sum/ArrayDeIntreg.length;
        System.out.println("Media aritmetica a celor "+ArrayDeIntreg.length+" numere este: "+ avg);
    }
}
