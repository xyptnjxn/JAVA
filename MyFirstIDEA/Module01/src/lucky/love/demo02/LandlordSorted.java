package lucky.love.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LandlordSorted {
    public static void main(String[] args) {
        ArrayList<Integer> pokerIndexes = new ArrayList<>();
        HashMap< Integer, String > pokers = new HashMap<>();
        String[] types = {"♥", "♠", "♣", "♦"};
        String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        ArrayList<Integer> playerOne = new ArrayList<>();
        ArrayList<Integer> playerTwo = new ArrayList<>();
        ArrayList<Integer> playerThree = new ArrayList<>();
        ArrayList<Integer> rest = new ArrayList<>();
        int index = 0;
        //1. 制作扑克牌
        for (int i = 0; i < 54; i++) {
            pokerIndexes.add(i);
        }
        pokers.put(index++, "大王");
        pokers.put(index++, "小王");
        // System.out.println(pokerIndexes);
        for (int j = numbers.length-1; j >= 0; j--) {
            for (int i = 0; i < types.length; i++) {
                pokers.put(index++, types[i]+numbers[j]);
            }
        }
        // System.out.println(pokers);

        //2. 洗牌
        Collections.shuffle(pokerIndexes);
        // System.out.println(pokerIndexes);

        //3. 发牌
        for (int i = 0; i < pokerIndexes.size(); i++) {
            if (i >= 51) {
                rest.add(pokerIndexes.get(i));
            } else if (i % 3 == 0) {
                playerOne.add(pokerIndexes.get(i));
            } else if (i % 3 == 1) {
                playerTwo.add(pokerIndexes.get(i));
            } else if (i % 3 == 2) {
                playerThree.add(pokerIndexes.get(i));
            }
        }
//        System.out.println(playerOne);
//        System.out.println(playerTwo);
//        System.out.println(playerThree);
//        System.out.println(rest);

        //4. 排序
        Collections.sort(rest);
        Collections.sort(playerOne);
        Collections.sort(playerTwo);
        Collections.sort(playerThree);

        //5. 看牌
        System.out.println("rest: ");
        for (int i = 0; i < rest.size(); i++) {
            String val = pokers.get(rest.get(i));
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("playerOne: ");
        for (int i = 0; i < playerOne.size(); i++) {
            String val = pokers.get(playerOne.get(i));
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("playerTwo: ");
        for (int i = 0; i < playerTwo.size(); i++) {
            String val = pokers.get(playerTwo.get(i));
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("playerThree: ");
        for (int i = 0; i < playerThree.size(); i++) {
            String val = pokers.get(playerThree.get(i));
            System.out.print(val + " ");
        }
    }
}
