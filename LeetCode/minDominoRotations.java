import java.util.Arrays;
import java.util.HashMap;

public class minDominoRotations {
    public static void main(String[] args) {
        int[] A = { 1, 2, 1, 1, 1, 2, 2, 2 };
        int[] B = { 2, 1, 2, 2, 2, 2, 2, 2 };
        int[] copyA = Arrays.copyOf(A, A.length);
        int[] copyB = Arrays.copyOf(B, B.length);

        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();

        int rotationA = 0;
        int rotationB = 0;
        
        mapA.equ
        for (int i = 0; i < A.length; i++) {
            int numA = A[i];
            int numB = B[i];
            mapA.put(numA, mapA.getOrDefault(numA, 0) + 1);
            mapB.put(numB, mapB.getOrDefault(numB, 0) + 1);
        }

        System.out.println(mapA);
        System.out.println(mapB);
        int maxA = -1;
        int maxKeyA = -1;

        for (int k : mapA.keySet()) {
            if (mapA.get(k) > maxA) {
                maxKeyA = k;
                maxA = mapA.get(k);
            }
        }
        // max = 4 & maxKey = 2
        for (int j = 0; j < A.length; j++) {
            if (A[j] != maxKeyA && copyB[j] == maxKeyA) {
                A[j] = copyB[j];
                rotationA++;
            } else if (A[j] != maxKeyA && copyB[j] != maxKeyA) {
                rotationA = -1;
                break;
            }
        }

        int max = -1;
        int maxKey = -1;
        for (int k : mapB.keySet()) {
            if (mapB.get(k) > max) {
                maxKey = k;
                max = mapB.get(k);
            }
        }

        // max = 4 & maxKey = 2
        for (int l = 0; l < B.length; l++) {
            System.out.println("j: " + l);
            System.out.println("B: " + B[l]);
            System.out.println("A: " + A[l]);
            if (B[l] != maxKey && copyA[l] == maxKey) {
                B[l] = copyA[l];
                rotationB++;
            } else if (B[l] != maxKey && copyA[l] != maxKey) {
                rotationB = -1;
                break;
            }
        }

        System.out.println(rotationA);
        System.out.println(rotationB);

        // if (rotationA != -1 && rotationA <= rotationB) {
        // return rotationA;
        // } else if (rotationB != -1 && rotationA <= rotationB) {
        // return rotationB;
        // } else {
        // return -1;
        // }
    }
}