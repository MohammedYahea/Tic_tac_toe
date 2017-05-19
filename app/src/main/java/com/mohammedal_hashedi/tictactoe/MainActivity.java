package com.mohammedal_hashedi.tictactoe;

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


    // 2 means unplayed

    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};


    public void dropIn(View view) {

        ImageView counter = (ImageView) view;

        ImageView AI0 = (ImageView) findViewById(R.id.imageView);
        ImageView AI1 = (ImageView) findViewById(R.id.imageView2);
        ImageView AI2 = (ImageView) findViewById(R.id.imageView3);
        ImageView AI3 = (ImageView) findViewById(R.id.imageView4);
        ImageView AI4 = (ImageView) findViewById(R.id.imageView5);
        ImageView AI5 = (ImageView) findViewById(R.id.imageView6);
        ImageView AI6 = (ImageView) findViewById(R.id.imageView7);
        ImageView AI7 = (ImageView) findViewById(R.id.imageView8);
        ImageView AI8 = (ImageView) findViewById(R.id.imageView9);

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2 && gameIsActive) {

            //  gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1000f);


            if (tappedCounter == 0 && gameState[tappedCounter] == 2) {
                //human player move
                counter.setImageResource(R.drawable.yellow);

                //save the value
                gameState[tappedCounter] = 0;


                // AI move
                if (gameState[4] == 2) {
                    AI4.setImageResource(R.drawable.red);
                    gameState[4] = 1;
                } else if (gameState[1] == 2) {
                    AI1.setImageResource(R.drawable.red);
                    gameState[1] = 1;
                } else if (gameState[3] == 2) {
                    AI3.setImageResource(R.drawable.red);
                    gameState[3] = 1;
                }
            } else if (tappedCounter == 1 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[4] == 2) {
                    AI4.setImageResource(R.drawable.red);
                    gameState[4] = 1;
                } else if (gameState[0] == 2) {
                    AI0.setImageResource(R.drawable.red);
                    gameState[0] = 1;
                } else if (gameState[2] == 2) {
                    AI2.setImageResource(R.drawable.red);
                    gameState[2] = 1;
                }

            } else if (tappedCounter == 2 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[4] == 2) {
                    AI4.setImageResource(R.drawable.red);
                    gameState[4] = 1;
                } else if (gameState[1] == 2) {
                    AI1.setImageResource(R.drawable.red);
                    gameState[1] = 1;
                } else if (gameState[5] == 2) {
                    AI5.setImageResource(R.drawable.red);
                    gameState[5] = 1;
                }
            } else if (tappedCounter == 3 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[4] == 2) {
                    AI4.setImageResource(R.drawable.red);
                    gameState[4] = 1;
                } else if (gameState[0] == 2) {
                    AI0.setImageResource(R.drawable.red);
                    gameState[0] = 1;
                } else if (gameState[6] == 2) {
                    AI6.setImageResource(R.drawable.red);
                    gameState[6] = 1;
                }
            } else if (tappedCounter == 4 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[0] == 2) {
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
            } else if (tappedCounter == 5 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[2] == 2) {
                    AI2.setImageResource(R.drawable.red);
                    gameState[2] = 1;
                } else if (gameState[4] == 2) {
                    AI4.setImageResource(R.drawable.red);
                    gameState[4] = 1;
                } else if (gameState[8] == 2) {
                    AI8.setImageResource(R.drawable.red);
                    gameState[8] = 1;
                }
            } else if (tappedCounter == 6 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[4] == 2) {
                    AI4.setImageResource(R.drawable.red);
                    gameState[4] = 1;
                } else if (gameState[7] == 2) {
                    AI7.setImageResource(R.drawable.red);
                    gameState[7] = 1;
                } else if (gameState[3] == 2) {
                    AI3.setImageResource(R.drawable.red);
                    gameState[3] = 1;
                }
            } else if (tappedCounter == 7 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[4] == 2) {
                    AI4.setImageResource(R.drawable.red);
                    gameState[4] = 1;
                } else if (gameState[6] == 2) {
                    AI6.setImageResource(R.drawable.red);
                    gameState[6] = 1;
                } else if (gameState[8] == 2) {
                    AI8.setImageResource(R.drawable.red);
                    gameState[8] = 1;
                }
            } else if (tappedCounter == 8 && gameState[tappedCounter] == 2) {
                counter.setImageResource(R.drawable.yellow);
                gameState[tappedCounter] = 0;


                //Ai move
                if (gameState[4] == 2) {
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
        }
        numberOfmoves++;



        counter.animate().translationYBy(1000f).rotation(360).setDuration(300);


        for (int[] winningPosition : winningPositions) {

            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                    gameState[winningPosition[0]] != 2) {

                // Someone has won!

                gameIsActive = false;

                String winner = "AI";

                if (gameState[winningPosition[0]] == 0) {

                    winner = "You";

                }

                TextView winnerMessage = (TextView) findViewById(R.id.winnerMessage);

                winnerMessage.setText(winner + " has won!");

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "You are the Yellow", Toast.LENGTH_SHORT).show();
    }




}
