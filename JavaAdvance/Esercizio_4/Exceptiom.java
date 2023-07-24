package Esercizio_4;
public class Exceptiom {


    public static void main(String[] args) {



        // l'eccezzione è un oggetto java , puoi assegnare qualasiasi cosa , in questo casdo ho assegnato a per
        // dare l'esempio che può essere e, a, b, o altra lettere, ma non può essere un numero
            try {
                Exceptiom a = new Exceptiom();
                a.checkScore(2.15);
                a.checkScore(50);
                a.checkScore(95.02);
                a.checkScore(100.01);

                // trovata l'eccezzione printa il messaggio e si ferma non controllando gli altri valori
                a.checkScore(200);
                a.checkScore(34532);
                a.checkScore(1);


            } catch (ArithmeticException a) {
                System.out.println(a.getMessage());
                System.out.println("non puoi inserire un numero che non è definito");

            }
    }

    private void checkScore(double score) {
        if (score > 0 & score <= 50.00) {
            System.out.println(score + " = " + "Average score");
        } else if (score > 50.00 && score <= 100.00) {
            System.out.println(score + " = "  + "Very good score");
        } else {
            throw new ArithmeticException(score + " = " + " Score is out of scale!");
        }
    }

}
