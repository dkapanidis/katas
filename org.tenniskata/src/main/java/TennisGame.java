public class TennisGame {

    private int m_score1 = 0;

    private int m_score2 = 0;

    private final String player1Name;

    private final String player2Name;

    public TennisGame(final String player1Name, final String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(final String playerName) {
        if (playerName == "player1") {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            score = getEqualScores();
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int scoreDif = m_score1 - m_score2;
            if (scoreDif == 1) {
                score = "Advantage player1";
            } else if (scoreDif == -1) {
                score = "Advantage player2";
            } else if (scoreDif >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = m_score1;
                } else {
                    score += "-";
                    tempScore = m_score2;
                }

                score += getScoreString(tempScore);
            }
        }
        return score;
    }

    /**
     * @return Scores that are Equals
     */
    private String getEqualScores() {
        String score;
        if (m_score1 > 3) {
            score = "Deuce";
        } else {
            score = getScoreString(m_score1) + "-All";
        }
        return score;
    }

    private String getScoreString(final int score) {
        final String[] scores = {"Love", "Fifteen", "Thirty", "Forty" };

        return scores[score];
    }
}
