@RestController
@RequestMapping("/api/algorithms")
public class PrimeNumberController {

    @GetMapping("/prime-numbers/{n}")
    public List<Integer> getPrimeNumbers(@PathVariable int n) {
        return generatePrimeNumbers(n);
    }

    private List<Integer> generatePrimeNumbers(int n) {
        List<Integer> primes = new ArrayList<>();
        int number = 2;
        while (primes.size() < n) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }
        return primes;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
@RestController
@RequestMapping("/api/algorithms")
public class FibonacciController {

    @GetMapping("/fibonacci/{n}")
    public List<Long> getFibonacciSequence(@PathVariable int n) {
        return generateFibonacciSequence(n);
    }

    private List<Long> generateFibonacciSequence(int n) {
        List<Long> fibonacci = new ArrayList<>();
        if (n <= 0) {
            return fibonacci;
        }
        fibonacci.add(0L);
        if (n == 1) {
            return fibonacci;
        }
        fibonacci.add(1L);
        for (int i = 2; i < n; i++) {
            long next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(next);
        }
        return fibonacci;
    }
