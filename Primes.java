public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[N+1];
        int p_counter = 0;
        int prime = 2;
        int c2 = 2;
        for (int i=0; i < arr.length;i++) {
            if (i>=2)
                arr[i] = true;
            else
                arr[i] = false;
        }
        while (prime*prime <= N){
            c2= 2;
            while (c2*prime <= N)
            {
                arr[c2*prime] = false;
                c2++;
            }
            prime++;
            
        }
        System.out.println("Prime numbers up to "+ N+ ":");
            for (int i=0; i < arr.length;i++) {
                if (arr[i]== true) {
                    p_counter++;
                    System.out.println(i);
                }
            }
        System.out.println("There are "+p_counter+" prime numbers between 2 and "+N+"("+((N-2)/p_counter)+"% are primes)");
    }
}