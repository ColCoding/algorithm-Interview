import java.util.*;


public class Solution {
    /**
     * 最大数
     * @param nums int整型一维数组 
     * @return string字符串
     */
    public String solve (int[] nums) {
        // write code here
        ArrayList<String> list = new ArrayList<>();
        //将整型的数字转化为字符串
        for(int i = 0;i < nums.length;i ++){
            list.add(String.valueOf(nums[i]));
        }
        //排序
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                return (b + a).compareTo(a + b);
            }
        });
        //这个地方需要注意如果第一个字符串已经是0了，那么直接输出0
        if(list.get(0).equals("0")) return "0";

        StringBuilder res = new StringBuilder(); //结果字符串
        for(int i = 0;i < list.size();i ++){//将排序好后的字符串一次相加就是最终的结果
            res.append(list.get(i));
        }
        return res.toString();
    }
}