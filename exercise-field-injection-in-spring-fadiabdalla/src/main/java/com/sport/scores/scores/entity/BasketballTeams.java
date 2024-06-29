package com.sport.scores.scores.entity;

import org.springframework.stereotype.Component;

@Component
public class BasketballTeams implements Sport{


    String scores = "<h1>NBA - Regular Season Scores</h1>\n" +
            "    <ul>\n" +
            "        <li>\n" +
            "            <strong>Charlotte Hornets</strong>: 111\n" +
            "            <br>\n" +
            "            <strong>Indiana Pacers</strong>: 102\n" +
            "        </li>\n" +
            "        <li>\n" +
            "            <strong>Cleveland Cavaliers</strong>: 121\n" +
            "            <br>\n" +
            "            <strong>Philadelphia 76ers</strong>: 123\n" +
            "        </li>\n" +
            "        <li>\n" +
            "            <strong>Toronto Raptors</strong>: 99\n" +
            "            <br>\n" +
            "            <strong>San Antonio Spurs</strong>: 122\n" +
            "        </li>\n" +
            "    </ul>";

    @Override
    public String getScores() {
        return scores;
    }
}
