package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class practiceQue {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> list) {

        ArrayList<Integer> nums = new ArrayList<>();

        Collections.sort(list);
        System.out.println(list);
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i + 1) - 1 > list.get(i)) {
                nums.add(list.get(i));
            }
        }
        if (list.size() == 1) {
            nums.add(list.get(0));
        }
        if (list.size() > 1) {
            if (list.get(0) < list.get(1) + 1) {
                nums.add(list.get(0));
            }
            if (list.get(list.size() - 1) > list.get(list.size() - 2) + 1) {
                nums.add(list.get(list.size() - 1));
            }
        }

        return nums;
    }

    public static void mostFrequent(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        ans = temp;
        System.out.println(ans);

    }

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e <= n)
                    temp.add(e * 2);
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n)
                    temp.add(e * 2 - 1);
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        // list.add(3);
        // list.add(1);
        // list.add(12);

        // System.out.println(findLonely(list));

        // mostFrequent(list);

        System.out.println(beautifulArray(4));

    }
}
