public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    // Aufgabe c)
    public static String PrimeFactorisation(int n) {
        String answer = "";
        for (int i = 2; i<=n; i++) {
            if (n % i == 0) {
                answer = answer + i + " * ";
                n = n/i;
                i = 2;
            }
        }
        return answer + "1";
    }
    
    // Aufgabe d)
    public static double pi(int n) {
        double sum = 0;
        for (int i = 0; i <= Math.pow(10, n); i++) {
           sum += Math.pow(-1, i) / (2*i+1);
        }
        return sum*4;
    }
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        System.out.println(PrimeFactorisation(82));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}
