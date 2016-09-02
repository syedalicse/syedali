class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Enter the number till which the prime numbers are to be calculated: ");
        int input = scanner.nextInt();

        int count = 0;

       
        for (int i = 2; i < input; i++) {

            boolean isPrimeNumber = true;

            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

           
            if (isPrimeNumber) {
                count++;
                System.out.print(i + ", ");

            }

        }
        System.out.println("Count: " + count);
    }

}
