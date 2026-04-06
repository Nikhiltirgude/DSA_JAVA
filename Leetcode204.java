import java.util.*;

class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                primes.add(i);
            }

            for(int j = 0; j < primes.size() && i * primes.get(j) < n; j++){
                isPrime[i * primes.get(j)] = false;

                if(i % primes.get(j) == 0){
                    break;
                }
            }
        }

        return primes.size();
    }
}