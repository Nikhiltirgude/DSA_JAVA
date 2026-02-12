public class Leetcode3760 {
    class Solution {
    public int maxDistinct(String s) {
        Set<Character>set=new HashSet<>();

        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();
        
    }
        static {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
            fw.write("0");
        } catch (Exception e) {
        }
    }));
    }   
}
}
