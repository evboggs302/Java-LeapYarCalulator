public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean leapy = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapy = true;
                    } else {
                        return leapy;
                    }
                } else {
                    leapy = true;
                }
            } else {
                return leapy;
            }
        }
        return leapy;
    }
}
