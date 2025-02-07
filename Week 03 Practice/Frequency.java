public class Frequency{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,7,3,6,6,8,9,8,3,4,9,12,5};
        int[] frequency = new int[100];
        for (int num : array) {
            frequency[num]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Element: " + i + ", Frequency: " + frequency[i]);
            }
        }
    }
}