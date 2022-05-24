public class SnakeAndLadder {
    public static void main(String[] args ){
        int player1position = 0;
        int player1Dice = (int)(Math.floor(Math.random() *10) %6) + 1;
        System.out.println("Dice Rolled Value:" +player1Dice);
    }
}
