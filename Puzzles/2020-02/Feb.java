import java.util.ArrayList;

public class Feb {
    public static int aliquotSum(int number) {
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number%i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
 }


    public static String solvePuzzle() {
        int farthest = 0;
        int farthestNum = 0;
        int sum = 0;
        int slot = 0;
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<ArrayList<Integer>>();
        for (int j = 1; j < 2020; j++) {
            if(!isPrime(j)) {
                sum = aliquotSum(j);
                if(!arr1.contains(sum)) {
                    arr1.set(slot, sum);
                    arr2.set(slot, )
                    slot++;
                } else {
                    for(int c = 0; c < arr1.size(); c++) {
                        if(arr1.get(c) == sum) {
                            arr2.get(c).add(j);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(arr2);
        return String.format("FarthestNum: %d, Diff: %d.",2, 2);
    }
    public static void main(String[] args) {
        System.out.println(solvePuzzle());

    }
}