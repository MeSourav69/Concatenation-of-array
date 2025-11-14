Class Solution {
public static int repeatArray(int[] arr) {
    int n = arr.length;
    int[] result = new int[n * 2];

    for (int i = 0; i < n; i++) {
        result[i] = arr[i];        
        result[i + n] = arr[i];    
    }

    return result;
          }
}
