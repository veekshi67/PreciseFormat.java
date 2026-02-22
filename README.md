🔹 Problem Statement

Given two floating-point numbers a and b, compute:

The exact result of a / b

The result rounded to 3 decimal places

Return both values in an ArrayList<Float>.

💡 Approach

Divide a by b

Store exact result

Use Math.round(result * 1000f) / 1000f to round to 3 decimal places

Return both values in an ArrayList

💻 Java Code
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
🧪 Example

Input:

a = 10.0
b = 4.0

Output:

[2.5, 2.500]
🚀 Concepts Used

Floating point division

ArrayList

Math.round()

Precision formatting
