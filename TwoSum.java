
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> complements = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]); // Verifica si el complemento ya está en el mapa
            if (complementIndex != null) { // Si se encuentra el complemento, devuelve los índices
                return new int[] {i, complementIndex};
            }
            complements.put(target - nums[i], i); // Almacena el complemento necesario y su índice
        }
         return nums;
    }
   
}
