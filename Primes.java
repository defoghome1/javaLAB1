public class Primes {
	public static void main(String[] args) {
		int n=2;
		for (;n<=100;) {
			if(isPrime(n)) {
				System.out.println(n + "\n");
				++n;
			}
			else
				++n;
		}
			
	}
	public static boolean isPrime(int n) {
		int i=2;
		for (;i<n;) {
			if(n%i == 0)
				return false;
			else
				++i;
		}
		return true;
	}
}