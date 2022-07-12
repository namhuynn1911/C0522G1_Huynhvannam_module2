package ss8_CleanCode_Refactori.exercise.Cotroller;

import ss8_CleanCode_Refactori.exercise.TennicGame.TennicGame;

public class MainCotronller {
    public static void main(String[] args) {
        TennicGame tennicGame =new TennicGame();
        System.out.println(tennicGame.getScore(1,3));
        System.out.println(tennicGame);
    }
}
