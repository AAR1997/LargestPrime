public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(10));
    }

    public static int getLargestPrime(int number) {

        int prime = 0;
        int count = 0;
        if(number > 1) {

            for(int x = 1; x <= number; x++) {

                int r = (number % x);
                 if(r == 0) {
                     for(int i = 2; i < x; i++) {
                         if(x % i == 0) {
                             count++;
                         }
                     }
                     if(count == 0) {
                         prime = x;
                     }
                 }
            }
            return prime;
        }
        return -1;
    }

//    public static boolean primeCheck(int x) {
//
//            for(int i = 2; i <= x/2; i++) {
//                if(x < 2 || x % i == 0) {
//                    return false;
//                }
//            }
//
//        return true;
//    }

//    public static int getLargestPrime(int number) {
//
//        if (number < 2) {
//            return -1;
//        }
//
//        int factor = -1;
//        for (int i = 2; i * i <= number; i++) {
//            if (number % i != 0) {
//                continue;
//            }
//            factor = i;
//            while (number % i == 0) {
//                number /= i;
//            }
//        }
//        return number == 1 ? factor : number;
//    }
}
