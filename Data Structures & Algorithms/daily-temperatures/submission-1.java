class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> hstack= new Stack<>();
        int n= temperatures.length;
        int[] result= new int[n];

        for(int idx= n-1; idx >=0; idx--){
            while(!hstack.isEmpty() && temperatures[idx]>= temperatures[hstack.peek()]){
                hstack.pop();
            }

            if(!hstack.isEmpty()){
                result[idx] = hstack.peek()-idx;
            }
            hstack.push(idx);
        }
        return result;
    }
}