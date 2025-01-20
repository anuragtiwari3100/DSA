
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    
    public class SumOftwoList {
        
        public static List<Integer> reverse(List<Integer> v) {
            int start = 0;
            int end = v.size() - 1;
            while (start < end) {
                int temp = v.get(start);
                v.set(start, v.get(end));
                v.set(end, temp);
                start++;
                end--;
            }
            return v;
        }
    
        public static List<Integer> findArraySum(List<Integer> a, int n, List<Integer> b, int m) {
            int i = n - 1;
            int j = m - 1;
    
            List<Integer> ans = new ArrayList<>();
            int carry = 0;
    
            // Adding digits from both arrays
            while (i >= 0 && j >= 0) {
                int val1 = a.get(i);
                int val2 = b.get(j);
                int sum = val1 + val2 + carry;
    
                carry = sum / 10;
                sum = sum % 10;
    
                ans.add(sum);
                i--;
                j--;
            }
    
            // Remaining digits in array `a`
            while (i >= 0) {
                int sum = a.get(i) + carry;
                carry = sum / 10;
                sum = sum % 10;
    
                ans.add(sum);
                i--;
            }
    
            // Remaining digits in array `b`
            while (j >= 0) {
                int sum = b.get(j) + carry;
                carry = sum / 10;
                sum = sum % 10;
    
                ans.add(sum);
                j--;
            }
    
            // If there's still a carry
            while (carry != 0) {
                int sum = carry;
                carry = sum / 10;
                sum = sum % 10;
    
                ans.add(sum);
            }
    
            // Reverse the result list to get the correct order
            Collections.reverse(ans);
            return ans;
        }
    
        public static void main(String[] args) {
            List<Integer> a = new ArrayList<>();
            a.add(9);
            a.add(9);
    
            List<Integer> b = new ArrayList<>();
            b.add(1);
    
            List<Integer> result = findArraySum(a, a.size(), b, b.size());
    
            System.out.println("Sum: " + result);
        }
    }
    


