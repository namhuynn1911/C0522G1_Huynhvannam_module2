package ss8_CleanCode_Refactori.exercise.TennicGame;

public class TennicGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;


    public static String getScore(int firstScore, int secondScore) {
        if (firstScore == secondScore) {
            return getFirstScore(firstScore);
        } else if (firstScore >= 4 || secondScore >= 4) {
            return result(firstScore, secondScore);
        } else {
            return currentPoint(firstScore, secondScore);
        }
    }

    public static String getFirstScore(int firstScore) {
        switch (firstScore) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String result(int firstScore, int secondScore) {
        int result = firstScore - secondScore;
        if (result == 1)
            return "Advantage player1";
        else if (result == -1)
            return "Advantage player2";
        else if (result >= 2)
            return "Win for player1";
        else
            return "Win for player2";
    }

    public static String currentPoint(int compareFirstScore, int compareSecondScore) {
        int provisionalPoint;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                provisionalPoint = compareFirstScore;
            } else {
                provisionalPoint = compareSecondScore;
            }
            switch (provisionalPoint) {
                case LOVE:
                    return "Love";
                case FIFTEEN:
                    return "Fifteen";
                case THIRTY:
                    return "Thirty";
                case FORTY:
                    return "Forty";
            }
        }
        return "";
    }
}


