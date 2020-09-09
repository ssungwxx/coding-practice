package programmers;

public class 키패드_누르기 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String right = "right";

        System.out.println(solution(a, right));
    }

    final static int[][] keyPad = {
            {3, 1},
            {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
    };

    public static String solution(int[] numbers, String hand) {

        int[] leftHand = {3, 0};
        int[] rightHand = {3, 2};

        StringBuilder answer = new StringBuilder();

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                moveHand(leftHand, num);
                answer.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                moveHand(rightHand, num);
                answer.append("R");
            } else {
                int leftGap = Math.abs(leftHand[0] - keyPad[num][0]) + Math.abs(leftHand[1] - keyPad[num][1]);
                int rightGap = Math.abs(rightHand[0] - keyPad[num][0]) + Math.abs(rightHand[1] - keyPad[num][1]);

                if(leftGap < rightGap){
                    moveHand(leftHand, num);
                    answer.append("L");
                }else if(leftGap > rightGap){
                    moveHand(rightHand, num);
                    answer.append("R");
                }else{
                    if(hand.equals("left")){
                        moveHand(leftHand, num);
                        answer.append("L");
                    }else{
                        moveHand(rightHand, num);
                        answer.append("R");
                    }
                }
            }
        }

        return answer.toString();
    }

    public static void moveHand(int[] hand, int num){
        hand[0] = keyPad[num][0];
        hand[1] = keyPad[num][1];
    }
}
