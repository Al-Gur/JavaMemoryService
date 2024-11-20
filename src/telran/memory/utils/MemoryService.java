package telran.memory.utils;

public class MemoryService {
    public static int getMaxAvailableMemory() {
        // TODO Homework
        int l = 1;
        int r = Integer.MAX_VALUE - 1;
        while (r - l > 1) {
            int m = (l + r) / 2;
            try {
                int[] arr = new int[m];
                l = m;
            } catch (Throwable e) {
                r = m;
            }
        }
        //System.out.println(l);
        return l;
    }
}
