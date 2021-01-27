public class RichestCustomerWealth {
    public static void main(String args[]){
        int[][] wealth = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(wealth));
    }

    public static int maximumWealth(int[][] accounts){
        int maxAccount = 0;

        for(int i = 0; i < accounts.length; i++){

            int wealth = maxWealth(accounts[i]);
            if(wealth > maxAccount){
                maxAccount = wealth;
            }
        }

        return maxAccount;
    }

    public static int maxWealth(int[] wealth){
        int maxAccount = 0;
        for(int i = 0; i < wealth.length; i++){
            maxAccount += wealth[i];
        }
        return maxAccount;
    }

//INITIAL ALGORITHM
//    public int maximumWealth(int[][] accounts) {
//        int maxAccount = 0;
//
//        for(int i = 0; i < accounts.length; i++){
//            int wealth = 0;
//            for(int j = 0; j < accounts[i].length; j++){
//                wealth += accounts[i][j];
//
//            }
//            if(wealth > maxAccount){
//                maxAccount = wealth;
//            }
//        }
//
//        return maxAccount;
//    }
}
