package com.example.kenzie.blackjack;

import android.widget.ImageView;


public class Card {

    private int pointValue;
    private int cardNumber;
    private String drawingName;
    private boolean hasCardBeenDrawn = false;

    public Card(int pointValue, int cardNumber, /*String suit,*/ String drawingName) {
        this.pointValue = pointValue;
        this.cardNumber = cardNumber;
        this.drawingName = drawingName;
    }

    public boolean getHasCardBeenDrawn() {
        return hasCardBeenDrawn;
    }

    public void setHasCardBeenDrawn(Boolean hasCardBeenDrawn) {
        this.hasCardBeenDrawn = hasCardBeenDrawn;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public String getDrawingName() {
        return drawingName;
    }

    public void setDrawingName(String drawingName) {
        this.drawingName = drawingName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setViewDrawing(ImageView imageView) {
        if (cardNumber == 1) { imageView.setImageResource(R.drawable.club2); }
        else if (cardNumber == 2) { imageView.setImageResource(R.drawable.spade2); }
        else if (cardNumber == 3) { imageView.setImageResource(R.drawable.heart2); }
        else if (cardNumber == 4) { imageView.setImageResource(R.drawable.diamond2); }

        else if (cardNumber == 5) { imageView.setImageResource(R.drawable.club3); }
        else if (cardNumber == 6) { imageView.setImageResource(R.drawable.spade3); }
        else if (cardNumber == 7) { imageView.setImageResource(R.drawable.heart3); }
        else if (cardNumber == 8) { imageView.setImageResource(R.drawable.diamond3); }

        else if (cardNumber == 9) { imageView.setImageResource(R.drawable.club4); }
        else if (cardNumber == 10) { imageView.setImageResource(R.drawable.spade4); }
        else if (cardNumber == 11) { imageView.setImageResource(R.drawable.heart4); }
        else if (cardNumber == 12) { imageView.setImageResource(R.drawable.diamond4); }

        else if (cardNumber == 13) { imageView.setImageResource(R.drawable.club5); }
        else if (cardNumber == 14) { imageView.setImageResource(R.drawable.spade5); }
        else if (cardNumber == 15) { imageView.setImageResource(R.drawable.heart5); }
        else if (cardNumber == 16) { imageView.setImageResource(R.drawable.diamond5); }

        else if (cardNumber == 17) { imageView.setImageResource(R.drawable.club6); }
        else if (cardNumber == 18) { imageView.setImageResource(R.drawable.spade6); }
        else if (cardNumber == 19) { imageView.setImageResource(R.drawable.heart6); }
        else if (cardNumber == 20) { imageView.setImageResource(R.drawable.diamond6); }

        else if (cardNumber == 21) { imageView.setImageResource(R.drawable.club7); }
        else if (cardNumber == 22) { imageView.setImageResource(R.drawable.spade7); }
        else if (cardNumber == 23) { imageView.setImageResource(R.drawable.heart7); }
        else if (cardNumber == 24) { imageView.setImageResource(R.drawable.diamond7); }

        else if (cardNumber == 25) { imageView.setImageResource(R.drawable.club8); }
        else if (cardNumber == 26) { imageView.setImageResource(R.drawable.spade8); }
        else if (cardNumber == 27) { imageView.setImageResource(R.drawable.heart8); }
        else if (cardNumber == 28) { imageView.setImageResource(R.drawable.diamond8); }

        else if (cardNumber == 29) { imageView.setImageResource(R.drawable.club9); }
        else if (cardNumber == 30) { imageView.setImageResource(R.drawable.spade9); }
        else if (cardNumber == 31) { imageView.setImageResource(R.drawable.heart9); }
        else if (cardNumber == 32) { imageView.setImageResource(R.drawable.diamond9); }

        else if (cardNumber == 33) { imageView.setImageResource(R.drawable.club10); }
        else if (cardNumber == 34) { imageView.setImageResource(R.drawable.spade10); }
        else if (cardNumber == 35) { imageView.setImageResource(R.drawable.heart10); }
        else if (cardNumber == 36) { imageView.setImageResource(R.drawable.diamond10); }

        else if (cardNumber == 37) { imageView.setImageResource(R.drawable.clubj); }
        else if (cardNumber == 38) { imageView.setImageResource(R.drawable.spadej); }
        else if (cardNumber == 39) { imageView.setImageResource(R.drawable.heartj); }
        else if (cardNumber == 40) { imageView.setImageResource(R.drawable.diamondj); }


        else if (cardNumber == 41) { imageView.setImageResource(R.drawable.clubq); }
        else if (cardNumber == 42) { imageView.setImageResource(R.drawable.spadeq); }
        else if (cardNumber == 43) { imageView.setImageResource(R.drawable.heartq); }
        else if (cardNumber == 44) { imageView.setImageResource(R.drawable.diamondq); }

        else if (cardNumber == 45) { imageView.setImageResource(R.drawable.clubk); }
        else if (cardNumber == 46) { imageView.setImageResource(R.drawable.spadek); }
        else if (cardNumber == 47) { imageView.setImageResource(R.drawable.heartk); }
        else if (cardNumber == 48) { imageView.setImageResource(R.drawable.diamondk); }

        else if (cardNumber == 49) { imageView.setImageResource(R.drawable.cluba); }
        else if (cardNumber == 50) { imageView.setImageResource(R.drawable.spadea); }
        else if (cardNumber == 51) { imageView.setImageResource(R.drawable.hearta); }
        else if (cardNumber == 52) { imageView.setImageResource(R.drawable.diamonda); }
    }
}
