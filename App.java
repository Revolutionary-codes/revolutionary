/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackage;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class App {

    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner();

        TempleRunGame game = new TRG_Level_1();

        gameRunner.run(game);
    }
}

class GameRunner {

    public void run(TempleRunGame gameObjectRef) {
        int score = gameObjectRef.start();
        while (true) {
            switch (score) {
                case 1:
                    gameObjectRef = new TRG_Level_2();
                    break;
                case 2:
                    gameObjectRef = new TRG_Level_3();
                    break;
                default:
                    gameObjectRef = new TRG_Level_1();
            }
            run(gameObjectRef);
        }
    }
}

interface TempleRunGame {

    public int start();

    public int stop();
}

class TRG_Level_1 implements TempleRunGame {

    String level = "Level 1";
    int score;

    public int start() {
        System.out.println(this.level + " has started!!");
        System.out.println("Guess a letter ");
        String letter = new Scanner(System.in).next();
        if (!letter.equals("h")) {
            score = 0;
            return score;
        }
        score = 1;
        return stop();
    }

    public int stop() {
        System.out.println("Congratulations, you can proceed to the next level!!");
        return score;
    }

}

class TRG_Level_2 implements TempleRunGame {

    String level = "Level 2";
    int score;

    public int start() {
        System.out.println(this.level + " has started!!");
        System.out.println("Guess two letters : ");
        String letter = new Scanner(System.in).next();
        if (!letter.equals("jk")) {
            score = 1;
            return score;
        }
        score = 2;
        return stop();
    }

    public int stop() {
        System.out.println("You are definitely a pro, go on champ!!");
        return score;
    }

}

class TRG_Level_3 implements TempleRunGame {

    String level = "Level 3";
    int score;

    public int start() {
        System.out.println(this.level + " has started!!");
        System.out.println("Guess the club that always beats Chelsea : ");
        String letter = new Scanner(System.in).nextLine();
        if (!letter.equals("mes que une clube")) {
            score = 1;
            return score;
        }
        score = 2;
        return stop();
    }

    public int stop() {
        System.out.println("Campiones! campiones!!, oaay oaay!!!!");
        return score;
    }

}

