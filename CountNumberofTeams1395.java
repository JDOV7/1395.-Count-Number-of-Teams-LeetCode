package leetcode;

public class CountNumberofTeams1395 {

    public void CountNumberofTeams1395() {
        int[] rating = {1,2,3,4};
        int iContTeams = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i; j < rating.length; j++) {
                for (int k = j; k < rating.length; k++) {
                    if (i < j && j < k && rating[i] < rating[j] && rating[j] < rating[k]) {
                        iContTeams++;
                    } else if (i < j && j < k && rating[i] > rating[j] && rating[j] > rating[k]) {
                        iContTeams++;
                    }
                }
            }
        }
        System.out.println(iContTeams);
    }
}
