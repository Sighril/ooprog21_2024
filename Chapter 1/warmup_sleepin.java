public class warmup_sleepin {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true; 
        } else if (weekday == true && vacation == true) {
            return true;
        } else if (weekday == false && vacation == true) {
            return true; 
        } else if (weekday == true && vacation == false) {
            return false; 
        }
        return false; 
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false)); //  true: it's a weekend
        System.out.println(sleepIn(true, false));  //  false: it's a weekday
        System.out.println(sleepIn(false, true));  //  true: on vacation
    }
}
