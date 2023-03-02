public class Challenge {
    public static void main(String[] args) {
        Integer[] numbers = {5,2,3,4};

        System.out.println("Array before the algorithm: ");
        for(Integer number: numbers) {
            System.out.println(number);
        }

        for(int i = 0; i < numbers.length - 1; i++) {
            /*
                Array = 5,2,3,4

                i = 0
                Array = 2,5,3,4
                i = 1
                Array = 2,3,5,4
                i = 2
                Array = 2,3,4,5
             */
            if(numbers[i] > numbers[i+1]) {
                Integer aux = numbers[i+1];
                numbers[i+1] = numbers[i];
                numbers[i] = aux;
            }
        }

        System.out.println("Array after the algorithm: ");
        for(Integer number: numbers) {
            System.out.println(number);
        }
    }
}
