package com.mohammedal_hashedi.tictactoe;

        import android.os.SystemClock;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.GridLayout;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 0 = yellow, 1 = red



    int activePlayer = 0;
    int numberOfmoves = 0;
    boolean gameIsActive = true;


    ImageView AI0;
    ImageView AI1;
    ImageView AI2;
    ImageView AI3;
    ImageView AI4;
    ImageView AI5;
    ImageView AI6;
    ImageView AI7;
    ImageView AI8;
    ImageView counter;
    int tappedCounter;

    // 2 means unplayed

    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    public void userMove(){
        //human player move
        counter.setImageResource(R.drawable.yellow);
        //save the value
        gameState[tappedCounter] = 0;
    }

    public void dropIn(View view) {

         counter = (ImageView) view;

        AI0 = (ImageView) findViewById(R.id.imageView);
        AI1 = (ImageView) findViewById(R.id.imageView2);
         AI2 = (ImageView) findViewById(R.id.imageView3);
         AI3 = (ImageView) findViewById(R.id.imageView4);
         AI4 = (ImageView) findViewById(R.id.imageView5);
         AI5 = (ImageView) findViewById(R.id.imageView6);
         AI6 = (ImageView) findViewById(R.id.imageView7);
         AI7 = (ImageView) findViewById(R.id.imageView8);
         AI8 = (ImageView) findViewById(R.id.imageView9);

         tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2 && gameIsActive) {
            //  gameState[tappedCounter] = activePlayer;
          //  counter.setTranslationY(-1000f);


            if (tappedCounter == 0 && gameState[tappedCounter] == 2) {
                userMove();

                 First_Button_Move();
            } else if (tappedCounter == 1 && gameState[tappedCounter] == 2) {
                userMove();

                Second_Button_Move();
                     //Ai move
            } else if (tappedCounter == 2 && gameState[tappedCounter] == 2) {
                   userMove();
                     //Ai move
                     Third_Button_Move();
            } else if (tappedCounter == 3 && gameState[tappedCounter] == 2) {
                    userMove();

                    Fourth_Button_Move();
            } else if (tappedCounter == 4 && gameState[tappedCounter] == 2) {
                    userMove();

                    Fifth_Button_Move();


            } else if (tappedCounter == 5 && gameState[tappedCounter] == 2) {
                     userMove();

                    Sixth_Button_Move();
            } else if (tappedCounter == 6 && gameState[tappedCounter] == 2) {
                    userMove();

                    Seventh_Button_Move();
            } else if (tappedCounter == 7 && gameState[tappedCounter] == 2) {
                    userMove();

                     Eight_Button_Move();
            } else if (tappedCounter == 8 && gameState[tappedCounter] == 2) {
                    userMove();

                    Ninth_Button_Move();

                 }

        }
        numberOfmoves+= 2;



   //     counter.animate().translationYBy(1000f).rotation(360).setDuration(300);


        for (int[] winningPosition : winningPositions) {

            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                    gameState[winningPosition[0]] != 2) {

                // Someone has won!

                gameIsActive = false;

                String winner = "You Lost";

                if (gameState[winningPosition[0]] == 0) {

                    winner = "You Won";

                }

                TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);

                winnerMessage.setText(winner);

                LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);

                layout.setVisibility(View.VISIBLE);

            } else {

                boolean gameIsOver = true;

                for (int counterState : gameState) {

                    if (counterState == 2) gameIsOver = false;

                }

                if (gameIsOver) {

                    TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);

                    winnerMessage.setText("It's a draw");

                    LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);

                    layout.setVisibility(View.VISIBLE);

                }

            }

        }
    }




    public void playAgain(View view) {

        gameIsActive = true;

        LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);

        layout.setVisibility(View.INVISIBLE);

        activePlayer = 0;

        for (int i = 0; i < gameState.length; i++) {

            gameState[i] = 2;

        }

        GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout);

        for (int i = 0; i< gridLayout.getChildCount(); i++) {

            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);

        }

    }
    public void First_Button_Move(){
        // AI move
        if (gameState[0] == gameState[1] && gameState[0] == 0 && gameState[2] == 2) {

            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;
        } else if (gameState[0] == gameState[2] && gameState[0] == 0 && gameState[1] == 2) {

            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;

        } else if (gameState[1] == gameState[2] && gameState[1] == 0 && gameState[0] == 2) {
            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;
        }if (gameState[0] == gameState[3] && gameState[0] == 0 && gameState[6] == 2) {
            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;
        }else if (gameState[0] == gameState[6] && gameState[0] == 0 && gameState[3] == 2) {
            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;
        }else if (gameState[3] == gameState[6] && gameState[3] == 0 && gameState[0] == 2) {
            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;
        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[1] == 2) {
            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;
        } else if (gameState[3] == 2) {
            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;
        }
    }
    public void Second_Button_Move(){
        if (gameState[0] == gameState[1] && gameState[0] == 0 && gameState[2] == 2) {

            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;
        } else if (gameState[0] == gameState[2] && gameState[0] == 0 && gameState[1] == 2) {

            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;

        } else if (gameState[1] == gameState[2] && gameState[1] == 0 && gameState[0] == 2) {


            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;
        }else if (gameState[1] == gameState[4] && gameState[1] == 0 && gameState[7] == 2) {

            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;

        }else if (gameState[1] == gameState[7] && gameState[1] == 0 && gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        }else if (gameState[4] == gameState[7] && gameState[4] == 0 && gameState[1] == 2) {

            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;

        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[0] == 2) {
            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;
        } else if (gameState[2] == 2) {
            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;
        }

    }
    public void Third_Button_Move(){
        if (gameState[0] == gameState[1] && gameState[0] == 0 && gameState[2] == 2) {

            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;
        } else if (gameState[0] == gameState[2] && gameState[0] == 0 && gameState[1] == 2) {

            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;

        } else if (gameState[1] == gameState[2] && gameState[1] == 0 && gameState[0] == 2) {


            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;
        } else if (gameState[2] == gameState[5] && gameState[2] == 0 && gameState[8] == 2) {

            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;

        }else if (gameState[5] == gameState[8] && gameState[5] == 0 && gameState[2] == 2) {

            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;

        }else if (gameState[2] == gameState[8] && gameState[2] == 0 && gameState[5] == 2) {

            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;

        }else if (gameState[2] == gameState[4] && gameState[2] == 0 && gameState[6] == 2) {

            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[4] == gameState[6] && gameState[4] == 0 && gameState[2] == 2) {
            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;

        }else if (gameState[2] == gameState[6] && gameState[2] == 0 && gameState[4] == 2) {

            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[1] == 2) {
            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;
        } else if (gameState[5] == 2) {
            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;
        }
    }
    public void Fourth_Button_Move(){
        //Ai move
        if (gameState[0] == gameState[3] && gameState[0] == 0 && gameState[6] == 2) {


            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[0] == gameState[6] && gameState[0] == 0 && gameState[3] == 2) {

            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;

        }else if (gameState[3] == gameState[6] && gameState[3] == 0 && gameState[0] == 2) {

            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;

        } else if (gameState[3] == gameState[4] && gameState[3] == 0 && gameState[5] == 2) {

            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;

        }else if (gameState[5] == gameState[3] && gameState[5] == 0 && gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        }else if (gameState[4] == gameState[5] && gameState[4] == 0 && gameState[3] == 2) {

            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;

        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[0] == 2) {
            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;
        } else if (gameState[6] == 2) {
            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;
        }
    }
    public void Fifth_Button_Move(){

        //Ai move
        if (gameState[1] == gameState[4] && gameState[1] == 0 && gameState[7] == 2) {

            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;

        }else if (gameState[1] == gameState[7] && gameState[1] == 0 && gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        }else if (gameState[4] == gameState[7] && gameState[4] == 0 && gameState[1] == 2) {

            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;

        }else if (gameState[3] == gameState[4] && gameState[3] == 0 && gameState[5] == 2) {

            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;

        }else if (gameState[5] == gameState[3] && gameState[5] == 0 && gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        }else if (gameState[4] == gameState[5] && gameState[4] == 0 && gameState[3] == 2) {

            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;

        }else if (gameState[2] == gameState[4] && gameState[2] == 0 && gameState[6] == 2) {

            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[4] == gameState[6] && gameState[4] == 0 && gameState[2] == 2) {
            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;

        }else if (gameState[2] == gameState[6] && gameState[2] == 0 && gameState[4] == 2) {

            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        }else if (gameState[0] == 2) {
            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;
        } else if (gameState[1] == 2) {
            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;
        } else if (gameState[2] == 2) {
            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;
        } else if (gameState[3] == 2) {
            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;
        } else if (gameState[5] == 2) {
            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;
        } else if (gameState[6] == 2) {
            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;
        } else if (gameState[7] == 2) {
            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;
        } else if (gameState[8] == 2) {
            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;
        }
    }
    public void Sixth_Button_Move(){

        //Ai move
        if (gameState[2] == gameState[5] && gameState[2] == 0 && gameState[8] == 2) {

            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;

        }else if (gameState[5] == gameState[8] && gameState[5] == 0 && gameState[2] == 2) {
            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;

        }else if (gameState[2] == gameState[8] && gameState[2] == 0 && gameState[5] == 2) {

            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;

        } else if (gameState[3] == gameState[4] && gameState[3] == 0 && gameState[5] == 2) {

            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;

        }else if (gameState[5] == gameState[3] && gameState[5] == 0 && gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        }else if (gameState[4] == gameState[5] && gameState[4] == 0 && gameState[3] == 2) {

            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;

        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[2] == 2) {
            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;
        } else if (gameState[8] == 2) {
            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;
        }
    }
    public void Seventh_Button_Move(){

        //Ai move
        if (gameState[6] == gameState[7] && gameState[6] == 0 && gameState[8] == 2) {

            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;

        } else if (gameState[7] == gameState[8] && gameState[7] == 0 && gameState[6] == 2) {

            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[6] == gameState[8] && gameState[6] == 0 && gameState[7] == 2) {

            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;

        }else if (gameState[0] == gameState[3] && gameState[0] == 0 && gameState[6] == 2) {


            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[0] == gameState[6] && gameState[0] == 0 && gameState[3] == 2) {

            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;

        }else if (gameState[3] == gameState[6] && gameState[3] == 0 && gameState[0] == 2) {

            AI0.setImageResource(R.drawable.red);
            gameState[0] = 1;

        }else if (gameState[2] == gameState[4] && gameState[2] == 0 && gameState[6] == 2) {

            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[4] == gameState[6] && gameState[4] == 0 && gameState[2] == 2) {
            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;

        }else if (gameState[2] == gameState[6] && gameState[2] == 0 && gameState[4] == 2) {

            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[7] == 2) {
            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;
        } else if (gameState[3] == 2) {
            AI3.setImageResource(R.drawable.red);
            gameState[3] = 1;
        }
    }
    public void Eight_Button_Move(){
        //Ai move
        if (gameState[6] == gameState[7] && gameState[6] == 0 && gameState[8] == 2) {

            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;

        } else if (gameState[7] == gameState[8] && gameState[7] == 0 && gameState[6] == 2) {

            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[6] == gameState[8] && gameState[6] == 0 && gameState[7] == 2) {

            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;

        }else if (gameState[1] == gameState[4] && gameState[1] == 0 && gameState[7] == 2) {

            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;

        }else if (gameState[1] == gameState[7] && gameState[1] == 0 && gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;

        }else if (gameState[4] == gameState[7] && gameState[4] == 0 && gameState[1] == 2) {

            AI1.setImageResource(R.drawable.red);
            gameState[1] = 1;

        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[6] == 2) {
            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;
        } else if (gameState[8] == 2) {
            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;
        }
    }
    public void Ninth_Button_Move(){
        //Ai move
        if (gameState[6] == gameState[7] && gameState[6] == 0 && gameState[8] == 2) {

            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;

        } else if (gameState[7] == gameState[8] && gameState[7] == 0 && gameState[6] == 2) {

            AI6.setImageResource(R.drawable.red);
            gameState[6] = 1;

        }else if (gameState[6] == gameState[8] && gameState[6] == 0 && gameState[7] == 2) {

            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;

        } else if (gameState[2] == gameState[5] && gameState[2] == 0 && gameState[8] == 2) {

            AI8.setImageResource(R.drawable.red);
            gameState[8] = 1;

        }else if (gameState[5] == gameState[8] && gameState[5] == 0 && gameState[2] == 2) {

            AI2.setImageResource(R.drawable.red);
            gameState[2] = 1;

        }else if (gameState[2] == gameState[8] && gameState[2] == 0 && gameState[5] == 2) {

            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;

        } else if (gameState[4] == 2) {
            AI4.setImageResource(R.drawable.red);
            gameState[4] = 1;
        } else if (gameState[7] == 2) {
            AI7.setImageResource(R.drawable.red);
            gameState[7] = 1;
        } else if (gameState[5] == 2) {
            AI5.setImageResource(R.drawable.red);
            gameState[5] = 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "You are the Yellow", Toast.LENGTH_LONG).show();
    }




}
