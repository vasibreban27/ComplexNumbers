//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1,-5);
        Complex b = new Complex(1,5);
       System.out.println(a.toString());
       System.out.println(b.toString());

       a.add(b);
       System.out.println(a.toString());

       b.mul(a);
       System.out.println(b.toString());

       b.mulScalar(2);
       System.out.println(b.toString());

       b.sub(a);
       System.out.println(b.toString());

       Complex[] array = {a,b};
       //array[0] = a;
       //array[1] = b;
       for(int i=0; i<array.length; i++){
           System.out.println(array[i]);
    }
//    for(Complex v : array)
//    {
//        System.out.println(v);
//    }
        MatriceDeNumere matrixA = new MatriceDeNumere(3,3);
        matrixA.afisareMatrice();

        MatriceDeNumere matrixB = new MatriceDeNumere(3,3);
        matrixB.afisareMatrice();
        System.out.println("Adunarea matricelor este: ");
        matrixA.adunareMatrice(matrixB);
        matrixA.afisareMatrice();

        System.out.println("Scaderea matricelor este: ");
        matrixA.scadereMatrice(matrixB);
        matrixA.afisareMatrice();

        System.out.println("Inmultirea matricelor este: ");
        matrixA.inmultireMatrice(matrixB);
        matrixA.afisareMatrice();
}}