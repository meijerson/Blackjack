package com.example.kenzie.blackjack;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private boolean didComputerWin = false;
    private boolean didPlayerWin = false;
    private boolean isItATie = false;
    private boolean hasCard3BeenDrawn = false;
    private int computerScore = 0;
    private int playerScore = 0;
    private Deck deck;

    public MainActivity() {
        deck = new Deck();
    }

    public void gameLoop(View view) {
        resetGame();
        deal();
        checkIfComputerWonOnDeal();
        checkIfPlayerWonOnDeal();
        }

    public void deal() {
        ImageView computerCard1 = (ImageView) findViewById(R.id.computerCard1);
        ImageView computerCard2 = (ImageView) findViewById(R.id.computerCard2);

        Card card = deck.drawCard();
        computerScore = computerScore + card.getPointValue();
        card.setViewDrawing(computerCard1);
        card = deck.drawCard();
        computerScore = computerScore + card.getPointValue();
        card.setViewDrawing(computerCard2);

        ImageView playerCard1 = (ImageView) findViewById(R.id.playerCard1);
        ImageView playerCard2 = (ImageView) findViewById(R.id.playerCard2);
        card = deck.drawCard();
        playerScore = playerScore + card.getPointValue();
        card.setViewDrawing(playerCard1);
        card = deck.drawCard();
        playerScore = playerScore + card.getPointValue();
        card.setViewDrawing(playerCard2);
        updateScoreboard();
    }

    public void checkIfComputerWonOnDeal() {
        if (computerScore == 21) {
            didComputerWin = true;
            displayWinner();
        }
    }

    public void checkIfPlayerWonOnDeal() {
        if (playerScore == 21) {
            didPlayerWin = true;
            displayWinner();
        }
    }

    public void holdClicked(View view) {
        if (didPlayerWin == false && didComputerWin == false) {
            computerTurn();
        } else {
            Toast.makeText(this, "The game is over. Please press Start to play again.", Toast.LENGTH_LONG).show();
        }
    }

    public void drawClicked(View view) {
        if (didPlayerWin == false && didComputerWin == false) {
            if (hasCard3BeenDrawn == false) {
                ImageView playerCard3 = (ImageView) findViewById(R.id.playerCard3);
                Card card = deck.drawCard();
                card.setViewDrawing(playerCard3);
                hasCard3BeenDrawn = true;
                playerScore = playerScore + card.getPointValue();
            }else {
                ImageView playerCard4 = (ImageView) findViewById(R.id.playerCard4);
                Card card = deck.drawCard();
                card.setViewDrawing(playerCard4);
                playerScore = playerScore + card.getPointValue();
            }
                updateScoreboard();
            if (playerScore > 21) {
                didComputerWin = true;
                displayWinner();
            } else if (playerScore == 21) {
                didPlayerWin = true;
                displayWinner();
            }
        } else {
            Toast.makeText(this, "The game is over. Please press Start to play again.", Toast.LENGTH_LONG).show();
        }
    }

    public void computerTurn() {
        if (computerScore < 17) {
            ImageView computerCard3 = (ImageView) findViewById(R.id.computerCard3);

            Card card = deck.drawCard();
            computerScore = computerScore + card.getPointValue();
            card.setViewDrawing(computerCard3);
            updateScoreboard();
            if (computerScore < 17) {
                ImageView computerCard4 = (ImageView) findViewById(R.id.computerCard4);

                card = deck.drawCard();
                computerScore = computerScore + card.getPointValue();
                card.setViewDrawing(computerCard4);
                updateScoreboard();
            }
        }
        seeWhoWon();
        displayWinner();
    }

    public void updateScoreboard() {
        TextView computerScoreTextView = (TextView) findViewById(R.id.computerScoreTextView);
        computerScoreTextView.setText(Integer.toString(computerScore));
        TextView playerScoreTextView = (TextView) findViewById(R.id.playerScoreTextView);
        playerScoreTextView.setText(Integer.toString(playerScore));
    }

    public void seeWhoWon() {
        if (didComputerWin != true && didPlayerWin != true) {
            if (computerScore >= playerScore && computerScore <= 21) {
                didComputerWin = true;
            } else if (playerScore <= 21) {
                didPlayerWin = true;
            } else {
                isItATie = true;
            }
        }
    }

    public void resetGame() {
        didComputerWin = false;
        didPlayerWin = false;
        computerScore = 0;
        playerScore = 0;
        hasCard3BeenDrawn = false;
        deck.shuffleDeck();
        flipCards();
        updateScoreboard();
    }

    public void displayWinner() {
        if (didComputerWin == true && didPlayerWin == true) {
            Log.i("Info", "Both the player and the computer won. Impossible.");
            Toast.makeText(this, "Both the player and the computer won. Impossible.", Toast.LENGTH_SHORT).show();
        }
        else if (didComputerWin == true) {
            System.out.println("The computer won!");
            Toast.makeText(this, "The computer won!", Toast.LENGTH_LONG).show();
        }
        else if (didPlayerWin == true) {
            System.out.println("The player won!");
            Toast.makeText(this, "You won!", Toast.LENGTH_LONG).show();
        }
        else if (isItATie == true) {
            System.out.println("It is a tie");
            Toast.makeText(this, "It is a tie!", Toast.LENGTH_LONG).show();
        }
    }

    public void flipCards() {
        ImageView computerCard1 = (ImageView) findViewById(R.id.computerCard1);
        ImageView computerCard2 = (ImageView) findViewById(R.id.computerCard2);
        ImageView computerCard3 = (ImageView) findViewById(R.id.computerCard3);
        ImageView computerCard4 = (ImageView) findViewById(R.id.computerCard4);
        ImageView playerCard1 = (ImageView) findViewById(R.id.playerCard1);
        ImageView playerCard2 = (ImageView) findViewById(R.id.playerCard2);
        ImageView playerCard3 = (ImageView) findViewById(R.id.playerCard3);
        ImageView playerCard4 = (ImageView) findViewById(R.id.playerCard4);

        computerCard1.setImageResource(R.drawable.back);
        computerCard2.setImageResource(R.drawable.back);
        computerCard3.setImageResource(R.drawable.back);
        computerCard4.setImageResource(R.drawable.back);
        playerCard1.setImageResource(R.drawable.back);
        playerCard2.setImageResource(R.drawable.back);
        playerCard3.setImageResource(R.drawable.back);
        playerCard4.setImageResource(R.drawable.back);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
