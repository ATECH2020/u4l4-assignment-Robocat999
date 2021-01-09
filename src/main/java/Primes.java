public class Primes 
{//Start Primes class
    //Takes an int and returns however many factors it has
    public static int countFactors(int n)
    {//Start countFactors
        int factors = 0;
          for(int i = 1; i <= n; i++)
          {//Start for loop
            if(n % i == 0)
            {//Start if 0 remain
              factors++;
            }//End if 0 remain
          }//End for loop
        return factors;
    }//End countFactors

    //Takes in an int and retuns true or false based on if it is a prime number
    public static boolean isPrime(int n)
    {//Start isPrime
        boolean prime = false;
          if (countFactors(n) == 2) 
          {//Start if factors == 2
            prime = true;
          }//End if factors == 2
        return prime;
    }//End isPrime

    //Takes an int and returns the number of primes from 2 to the int
    public static int countPrimes(int n)
    {//Start countPrimes
        int numPrimes = 0;
          for(int i = 2; i <= n; i++)
          {//Start for loop
            if(isPrime(n) == true)
            {//Start if n is prime
              numPrimes++;
            }//End if n is prime
          }//End for loop
        return numPrimes;
    }//End countPrimes 
}//End Primes class
