package ARRAYLIST;

import java.util.ArrayList;
// import java.util.Collections;

public class findMax {

    public static int maxFinder(ArrayList<Integer> list) {
        int maxVal = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxVal) {
                maxVal = list.get(i);
            }
        }
        return maxVal;
    }

    // Second method
    public static int maxFinder2(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        return max;
    }

    public static void swapNum(ArrayList<Integer> list, int idx1, int idx2) {
        // int n1 = list.get(idx1);
        // int n2 = list.get(idx2);

        // list.set(idx2, n1);
        // list.set(idx1, n2);

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void sortAl(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int val = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, val);
                }
            }
        }
        // Collections.sort(list, Collections.reverseOrder());
    }

    public static void multiDimensionalAl() {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        mainlist.add(list1);
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
        }

    }

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    // (2 pointer approach)
    public static boolean pairsum1(ArrayList<Integer> list, int target1) {
        System.out.println(list);
        int lp = 0;// list.get(0);
        int rp = list.size() - 1;// list.get(list.size());
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target1) {
                return true;
            }
            if (list.get(lp) + list.get(rp) > target1) {
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }

    public static boolean pairsum2(ArrayList<Integer> list, int target2) {

        System.out.println(list);
        int j = 0;
        int lp = 0, rp = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(j)) {
                lp = i;
                rp = j;
                break;
            }
            j++;
        }

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target2) {
                return true;
            }
            if (list.get(lp) + list.get(rp) > target2) {
                if (rp == 0) {
                    rp = list.size();
                }
                rp--;
            } else {
                if (lp == list.size() - 1) {
                    lp = -1;
                }
                lp++;
            }
        }
        return false;

    }

    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(8);
        // list.add(15);
        list.add(6);
        // list.add(8);
        // list.add(9);
        // list.add(8);
        list.add(4);
        // list.add(7);

        // System.out.println(list);

        // System.out.println(maxFinder(list));
        // System.out.println(maxFinder2(list));

        // swapNum(list, 1, 4);
        // System.out.println(list);

        // sortAl(list);
        // System.out.println(list);

        // multiDimensionalAl();

        // System.out.println(storeWater(list));

        // int target1 = 5;
        // System.out.println(pairsum1(list, target));

        // int target2 = 26;
        // System.out.println(pairsum2(list, target2));

        System.out.println(isMonotonic(list));

    }
}
