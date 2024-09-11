public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    // Teilaufgabe a)
    public static String hours(int seconds) {
        String hoursString ="";
        String minuteString="";
        String secondString="";
        int hours = seconds / 3600;
        int minutes = seconds / 60;
        if (minutes < 10) {
            minuteString = "0" + Integer.toString(minutes);
        } else {
            minuteString = Integer.toString(minutes);
        }
        if (hours < 10) {
            hoursString = "0" + Integer.toString(hours);
        } else {
            hoursString = Integer.toString(hours);
        }



        int secs = seconds - hours*3600 - minutes*60;
        if (secs < 10) {
            secondString = "0" + Integer.toString(secs);
        } else {
            secondString = Integer.toString(secs);
        }
        return hoursString+ ":" + minuteString + ":" + secondString;
    }

    // Teilaufgabe b)
        public static double distance(int x1, int y1, int x2, int y2) {
            int n1 = x2-x1;
            int n2 = y2-y1;
            int n3 = n1*n1 + n2*n2;

            return Math.sqrt(n3);
            
    }
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        System.out.println(hours(60));
        System.out.println(hours(6079));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        System.out.println(distance(1, 2, 3, 4));
        System.out.println(distance(0, 0, 3, 4));
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
