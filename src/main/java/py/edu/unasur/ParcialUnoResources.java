package py.edu.unasur;

import java.util.ArrayList;
import java.util.List;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class ParcialUnoResources {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hola desde LP2";
    }

    // Prime Numbers
    @GET
    @Path("/prime-numbers/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPrimeNumbers(@PathParam("n") int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }
        return Response.ok(primes).build();
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Sum of Digits
    @GET
    @Path("/sum-digits/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sumDigits(@PathParam("number") int number) {
        int sum = 0;
        int num = Math.abs(number);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return Response.ok(sum).build();
    }

    // Fibonacci Sequence
    @GET
    @Path("/algorithms/fibonacci/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFibonacci(@PathParam("n") int n) {
        List<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            fibonacci.add(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
        return Response.ok(fibonacci).build();
    }

    // Sort Array
    @POST
    @Path("/algorithms/sort")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sortArray(List<Integer> numbers) {
        numbers.sort(Integer::compareTo);
        return Response.ok(numbers).build();
    }

    // Palindrome Number
    @GET
    @Path("/algorithms/palindrome/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isPalindrome(@PathParam("number") int number) {
        String numStr = String.valueOf(Math.abs(number));
        String reversed = new StringBuilder(numStr).reverse().toString();
        boolean isPalindrome = numStr.equals(reversed);
        return Response.ok(isPalindrome).build();
    }

    // Power of a Number
    @POST
    @Path("/algorithms/power")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response powerOfNumber(PowerInput input) {
        double result = Math.pow(input.base, input.exponent);
        return Response.ok(result).build();
    }

    public static class PowerInput {
        public int base;
        public int exponent;
    }

    // Perfect Number
    @GET
    @Path("/algorithms/perfect-number/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isPerfectNumber(@PathParam("number") int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        boolean isPerfect = sum == number;
        return Response.ok(isPerfect).build();
    }

    // Factorial
    @GET
    @Path("/algorithms/factorial/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFactorial(@PathParam("number") int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return Response.ok(factorial).build();
    }

    // Sum of Array
    @POST
    @Path("/algorithms/sum-array")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sumArray(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return Response.ok(sum).build();
    }

    // Greatest Common Divisor (GCD)
    @POST
    @Path("/algorithms/gcd")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response gcd(GcdInput input) {
        int result = gcd(input.number1, input.number2);
        return Response.ok(result).build();
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static class GcdInput {
        public int number1;
        public int number2;
    }

    // Armstrong Number
    @GET
    @Path("/algorithms/armstrong/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isArmstrong(@PathParam("number") int number) {
        String numStr = String.valueOf(number);
        int length = numStr.length();
        int sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += Math.pow(Character.getNumericValue(c), length);
        }
        boolean isArmstrong = sum == number;
        return Response.ok(isArmstrong).build();
    }

    // Convert to Binary
    @GET
    @Path("/algorithms/convert-to-binary/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertToBinary(@PathParam("number") int number) {
        String binary = Integer.toBinaryString(number);
        return Response.ok(binary).build();
    }
}
//Este seria mi examen profe 