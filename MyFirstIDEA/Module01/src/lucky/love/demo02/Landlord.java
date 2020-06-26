package lucky.love.demo02;

import java.util.ArrayList;
import java.util.Collections;

public class Landlord {
    public static void main(String[] args) {
        //1.制作扑克
        ArrayList<String> pokers = new ArrayList<>();
        String[] types = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<String> playerOne = new ArrayList<>();
        ArrayList<String> playerTwo = new ArrayList<>();
        ArrayList<String> playerThree = new ArrayList<>();
        ArrayList<String> rest = new ArrayList<>();
        pokers.add("大王");
        pokers.add("小王");
        for (String type: types) {
            for (String number: numbers) {
                pokers.add(type+number);
            }
        }
        // System.out.println(pokers);

        //2.洗牌
        Collections.shuffle(pokers);
        // System.out.println(pokers);

        //3.发牌
        for (int i = 0; i < pokers.size(); i++) {
            if (i >= 51) {
                rest.add(pokers.get(i));
            } else if (i % 3 == 0) {
                playerOne.add(pokers.get(i));
            } else if (i % 3 == 1) {
                playerTwo.add(pokers.get(i));
            } else if (i % 3 == 2) {
                playerThree.add(pokers.get(i));
            }
        }

        //4.看牌
        System.out.println(playerOne);
        System.out.println(playerTwo);
        System.out.println(playerThree);
        System.out.println(rest);
    }
}
