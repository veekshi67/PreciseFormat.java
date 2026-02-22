import java.util.*;

class Solution {
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        
        ArrayList<Float> list = new ArrayList<>();
        
        float result = a / b;
        
        list.add(result);
        
        float rounded = Math.round(result * 1000f) / 1000f;
        list.add(rounded);
        
        return list;
    }
}
