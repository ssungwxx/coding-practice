import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P0039_CombinationSum {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7};

        List<List<Integer>> res = combinationSum(a, 7);

        for (List<Integer> list : res) {
            for (int ele : list) {
                System.out.print(ele);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> res;

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new LinkedList<>();

        findCombination(candidates, target, new ArrayList<>(), 0);

        return res;
    }

    public static void findCombination(int[] candidates, int target, List<Integer> list, int start) {
        if(target > 0){
            for(int i = start; i < candidates.length; i++){
                list.add(candidates[i]);
                findCombination(candidates, target - candidates[i], list, i);
                list.remove(list.size() - 1);
            }
        }else if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
    }
}
