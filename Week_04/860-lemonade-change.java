class Solution {

    public boolean lemonadeChange(int[] bills) {
        int num_five = 0;
        int num_ten = 0;

        for (int money : bills) {
            switch(money) {
                case 5:
                    num_five++;
                    break;
                case 10:
                    if (num_five == 0) {
                        return false;
                    }
                    num_ten++;
                    num_five--;
                    break;
                case 20:
                    if (num_ten > 0 && num_five > 0) {
                        num_five--;
                        num_ten--;
                    } else if (num_five > 3) {
                        num_five -= 3;
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}