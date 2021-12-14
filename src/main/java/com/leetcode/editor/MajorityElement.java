package com.leetcode.editor;

import java.util.HashMap;
import java.util.Map;

/**
 * 多数元素
 *
 * @author loquy
 * @date 2021 /12/14 8:41
 */
public class MajorityElement {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int i = majorityElement(new int[]{1, 1, 2, 3, 3, 3});
        System.out.println(i);
    }

    /**
     * count
     *
     * @param nums
     * @return Map<Integer,Integer>
     */
    private static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>(nums.length);
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                // 映射里没有此元素的键，值为 1
                counts.put(num, 1);
            } else {
                // 存在值加 1
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    /**
     * Majority element int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        // 遍历映射，key->value
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            // 循环映射，值最大则是出现次数最多的元素
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        assert majorityEntry != null;
        // 元素为键值
        return majorityEntry.getKey();
    }
}
