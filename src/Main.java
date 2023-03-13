

public class Main {
    public static void main(String[] args) {

        int [] vector = {-12, -8, 45, 10, 5};

        System.out.println("Vector's Number: ");
        int count = 0;

        while(count < (vector.length)){
            System.out.println(vector[count] + " ");
            count++;
        }

        System.out.println("\nVector: ");
        for (int i = (vector.length - 1); i >= 0; i--){
            System.out.print(vector[i] + " ");
        }
    }
}
