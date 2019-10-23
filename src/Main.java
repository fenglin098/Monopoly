import java.util.Random;
public class Main {
    public static void main (String[] args){
        int roll1, roll2, count, sum;
        count=0;
        do {
            Random num = new Random();
            roll1 = 1 + num.nextInt(1);
            roll2 = 1 + num.nextInt(1);
            sum = roll1 + roll2;
            if (roll1 == roll2) {
                count++;
                if (count==3) {
                    System.out.println("User rolls " + roll1 + " & " + roll2 + "\nDOUBLES! \nGO TO JAIL--->");
                }else {
                    System.out.println("User rolls " + roll1 + " & " + roll2 + "\nDOUBLES! \nMove" + sum + " Spaces and roll again getting...");
                }
            } else if (roll1 != roll2) {
                System.out.println("User rolls " + roll1 + " & " + roll2 + "\nMove " + sum + " Spaces and stop");
            }
        }while (count<3);
    }
}
