package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.dialogwin;


import android.app.GameState;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import android.os.VibrationEffect;
import android.os.Vibrator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class MainActivity extends AppCompatActivity  {
   private HashSet<String> englishWordsSet;
   private ArrayList<String> enteredWords = new ArrayList<>();

    int[] currentPosition = {0, 0};
    int score =0;
    TextView[][] textViews = new TextView[6][5];
   int[] wrongspot = new int[5];
   int[] correctspot = new int[5];
   int[] wrongletter = new int[5];
    String targerword = "";
    Vibrator vibrator;
    int Score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_main);

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        Button buttonA = findViewById(R.id.A);
        Button buttonB = findViewById(R.id.B);
        Button buttonC = findViewById(R.id.C);
        Button buttonD = findViewById(R.id.D);
        Button buttonE = findViewById(R.id.E);
        Button buttonF = findViewById(R.id.F);
        Button buttonG = findViewById(R.id.G);
        Button buttonH = findViewById(R.id.H);
        Button buttonI = findViewById(R.id.I);
        Button buttonJ = findViewById(R.id.J);
        Button buttonK = findViewById(R.id.K);
        Button buttonL = findViewById(R.id.L);
        Button buttonM = findViewById(R.id.M);
        Button buttonN = findViewById(R.id.N);
        Button buttonO = findViewById(R.id.O);
        Button buttonP = findViewById(R.id.P);
        Button buttonQ = findViewById(R.id.Q);
        Button buttonR = findViewById(R.id.R);
        Button buttonS = findViewById(R.id.S);
        Button buttonT = findViewById(R.id.T);
        Button buttonU = findViewById(R.id.U);
        Button buttonV = findViewById(R.id.V);
        Button buttonW = findViewById(R.id.W);
        Button buttonX = findViewById(R.id.X);
        Button buttonY = findViewById(R.id.Y);
        Button buttonZ = findViewById(R.id.Z);
        Button buttonBack = findViewById(R.id.back);


        TextView text11 = findViewById(R.id.text11);
        TextView text12 = findViewById(R.id.text12);
        TextView text13 = findViewById(R.id.text13);
        TextView text14 = findViewById(R.id.text14);
        TextView text15 = findViewById(R.id.text15);

        TextView text21 = findViewById(R.id.text21);
        TextView text22 = findViewById(R.id.text22);
        TextView text23 = findViewById(R.id.text23);
        TextView text24 = findViewById(R.id.text24);
        TextView text25 = findViewById(R.id.text25);

        TextView text31 = findViewById(R.id.text31);
        TextView text32 = findViewById(R.id.text32);
        TextView text33 = findViewById(R.id.text33);
        TextView text34 = findViewById(R.id.text34);
        TextView text35 = findViewById(R.id.text35);

        TextView text41 = findViewById(R.id.text41);
        TextView text42 = findViewById(R.id.text42);
        TextView text43 = findViewById(R.id.text43);
        TextView text44 = findViewById(R.id.text44);
        TextView text45 = findViewById(R.id.text45);

        TextView text51 = findViewById(R.id.text51);
        TextView text52 = findViewById(R.id.text52);
        TextView text53 = findViewById(R.id.text53);
        TextView text54 = findViewById(R.id.text54);
        TextView text55 = findViewById(R.id.text55);

        TextView text61 = findViewById(R.id.text61);
        TextView text62 = findViewById(R.id.text62);
        TextView text63 = findViewById(R.id.text63);
        TextView text64 = findViewById(R.id.text64);
        TextView text65 = findViewById(R.id.text65);

        initLetterButtonMap();

// Initialize the array with your TextViews using findViewById

        for (int u = 0; u < 6; u++) {
            for (int v = 0; v < 5; v++) {
                String textViewId = "text" + (u + 1) + "" + (v + 1);
                int resId = getResources().getIdentifier(textViewId, "id", getPackageName());
                textViews[u][v] = findViewById(resId);

            }
        }
       //
// Set click listeners for each button
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();
                updateTextView((Button) v, "A");
            }
        });


        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();
                updateTextView((Button) v, "B");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "C");
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "D");
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "E");
            }
        });
        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "F");
            }
        });
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "G");
            }
        });
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "H");
            }
        });
        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "I");
            }
        });
        buttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "J");
            }
        });
        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "K");
            }
        });
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "L");
            }
        });
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vibrate();updateTextView((Button) v, "M");
            }
        });
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "N");
            }
        });
        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "O");
            }
        });
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "P");
            }
        });
        buttonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "Q");
            }
        });
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "R");
            }
        });
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "S");
            }
        });
        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "T");
            }
        });
        buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate(); updateTextView((Button) v, "U");
            }
        });
        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "V");
            }
        });
        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "W");
            }
        });
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "X");
            }
        });
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "Y");
            }
        });
        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();updateTextView((Button) v, "Z");
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate();deleteTextView((Button) v, "");
            }
        });
        targerword = getRandomWord();

        loadgame();

    }



String userword = "";
int s =0 ;
    public void updateTextView(Button b, String letter) {

        int i = currentPosition[0];
        int[] jHolder = {currentPosition[1]}; // Use an array to hold the value of j
        if(jHolder[0] > 5) {
            jHolder[0]--;
            return ;
        }
        if(jHolder[0] == 5)
            jHolder[0]--;
        TextView test2 = findViewById(R.id.test2);
        TextView test = findViewById(R.id.test);
        Button subButton = findViewById(R.id.submit);
        subButton.setBackgroundResource(R.drawable.submit);
        textViews[i][jHolder[0]].setTextColor(Color.parseColor("#000000"));
        textViews[i][jHolder[0]].setText(letter);
        String word = "";
        StringBuilder wordBuilder = new StringBuilder();
        for (int u = 0; u < 5; u++) {
            wordBuilder.append(textViews[i][u].getText());
        }

        word = wordBuilder.toString().toLowerCase();
        userword = word;
        enteredWords.add(userword);
        englishWordsSet = readEnglishWordsFromFile();
        boolean wordExists = false ;
        wordExists = isWordInEnglish(word);

        jHolder[0]++; // Increment j
        subButton.setEnabled(wordExists);

            if (jHolder[0] >= 5) {
                if (wordExists) {
                    TextView ScoreTxt = findViewById(R.id.score);
                    final boolean[] exists = {wordExists};
                    subButton.setBackgroundResource(R.drawable.submittrue);
                    subButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                jHolder[0]++;
                                int newI = i;
                                if (jHolder[0] >= 5) {
                                    jHolder[0] = 0;
                                    newI++;

                                }
                                compareWords(targerword, userword);

                                int count = 0;
                                for (int s = 0; s < 5; s++) {
                                    if (wrongletter[s] != -1) {
                                        textViews[i][wrongletter[s]].setBackgroundResource(R.drawable.wrongletter);
                                        textViews[i][wrongletter[s]].setTextColor(Color.parseColor("#FFFFFF"));
                                        String letter = textViews[i][wrongletter[s]].getText().toString();
                                        int buttonId = letterButtonMap.get(letter);
                                        Button btnletter = findViewById(buttonId);
                                        btnletter.setBackgroundResource(R.drawable.wrongletter);
                                        btnletter.setTextColor(Color.parseColor("#FFFFFF"));
                                    }
                                    wrongletter[s] = -1;
                                }

                                for (int s = 0; s < 5; s++) {
                                    if (wrongspot[s] != -1) {
                                        textViews[i][wrongspot[s]].setBackgroundResource(R.drawable.wrongspot);
                                        textViews[i][wrongspot[s]].setTextColor(Color.parseColor("#FFFFFF"));
                                        String letter = textViews[i][wrongspot[s]].getText().toString();
                                        int buttonId = letterButtonMap.get(letter);
                                        Button btnletter = findViewById(buttonId);
                                        btnletter.setBackgroundResource(R.drawable.wrongspot);
                                        btnletter.setTextColor(Color.parseColor("#FFFFFF"));
                                    }
                                    wrongspot[s] = -1;

                                }
                                int r=0;
                                  s=0;
                                for (int s = 0; s < 5; s++) {
                                    if (correctspot[s] != -1) {
                                        textViews[i][correctspot[s]].setBackgroundResource(R.drawable.correctspot);
                                        textViews[i][correctspot[s]].setTextColor(Color.parseColor("#FFFFFF"));
                                        String letter = textViews[i][correctspot[s]].getText().toString();
                                        int buttonId = letterButtonMap.get(letter);
                                        Button btnletter = findViewById(buttonId);
                                        btnletter.setBackgroundResource(R.drawable.correctspot);
                                        btnletter.setTextColor(Color.parseColor("#FFFFFF"));
                                        r++;
                                    }
                                    correctspot[s] = -1;
                                }
                                // getting score id

                                s=r;// for the rest position
                            test2.setText(String.valueOf(targerword));
                            test.setText(String.valueOf(r));
                            if(r==5) // win state
                                {
                                    Score += score(newI);
                                    openDialogWin();
                                    reste();
                                    ScoreTxt.setText("Score : "+String.valueOf(Score));

                                    targerword=getRandomWord();

                                }
                            if (newI >= 6) { // loose state
                                openDialogLoose(Score,targerword);
                                reste();
                                Score = 0;
                                ScoreTxt.setText("Score : "+String.valueOf(Score));
                                targerword = getRandomWord();
                                enteredWords.clear();
                                currentPosition[0]=0;
                                currentPosition[1]=0;

                                newI = 0;
                                subButton.setEnabled(false);
                                subButton.setBackgroundResource(R.drawable.submit);
                                return ;
                            }

                                // Update the current position
                            if(s==5)
                            {
                                currentPosition[0]=0;
                                currentPosition[1]=0;

                            }
                            else {

                                currentPosition[0] = newI;
                                currentPosition[1] = jHolder[0];
                            }

                                // Reset the background to original
                                subButton.setBackgroundResource(R.drawable.submit);
                                subButton.setEnabled(false);


                                // Call the updateTextView method again with the new position
                                exists[0] = false;
                            }

                    });
                }
                wordExists = false;
            }

        else if(jHolder[0]>5)
        {
                jHolder[0]--;
        }
        //


        currentPosition[0] = i;
        currentPosition[1] = jHolder[0];
        // Now you have the word from the current row (i) in the 'word' variable
        // You can do whatever you want with the word, e.g., check if it exists in English words.
    }



    private void deleteTextView(Button b, String letter) {

        int i = currentPosition[0];
        int j = currentPosition[1];
        if(j != 5) {
            textViews[i][j].setText(letter);
        }

        j--; // Decrement j
        if (j < 0) {
            j = 0; // Reset j if it goes below 0
        }

        currentPosition[0] = i;
        currentPosition[1] = j;

        // Check if userWord has at least one letter before deleting

            // Update the UI with the new position

            textViews[i][j].setText("");
            Button subButton = findViewById(R.id.submit);
            subButton.setEnabled(false);
            subButton.setBackgroundResource(R.drawable.submit);


    }

    private HashSet<String> readEnglishWordsFromFile() {
        HashSet<String> wordsSet = new HashSet<>();
        try {
            InputStream inputStream = getAssets().open("words.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                wordsSet.add(line.trim().toLowerCase());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsSet;
    }

    private boolean isWordInEnglish(String word) {
        return englishWordsSet.contains(word.toLowerCase());
    }
    private String getRandomWord() {
        List<String> wordsList = new ArrayList<>();
        try {
            InputStream inputStream = getAssets().open("words.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                wordsList.add(line.trim().toLowerCase());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        return wordsList.get(random.nextInt(wordsList.size()));
    }

   private  void compareWords(String targetWord, String userWord) {

initspots(correctspot);
initspots(wrongspot);
initspots(wrongletter);
        char[] targetChar = new char[5];
        char[] userChar = new char[5];

        int v = 0,u=0,t=0,count=0;

        for (int i = 0; i < 5; i++) {
            targetChar[i] = targetWord.charAt(i);
            userChar[i] = userWord.charAt(i);
        }
        for(int i=0 ; i<5;i++)
        {
            count = 0;
            for(int j=0;j<5;j++)
            {
                if(userChar[i]==targetChar[j] && i==j) {
                    correctspot[v] = i;
                    v++;
                }
                else if (userChar[i] == targetChar[j] && i!=j){
                    wrongspot[u] = i ;
                u++;
                }
                else {
                    count++;
                }
            }
            if(count == 5)
            {

                wrongletter[t] = i ;
                t++;
            }
        }


    }

private void initspots(int[] spot)
{
    for(int i=0 ; i<5;i++)
    {
        spot[i]=-1;
    }
}


    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
    private HashMap<String, Integer> letterButtonMap = new HashMap<>();

    private void initLetterButtonMap() {
        letterButtonMap.put("A", R.id.A); // Replace R.id.buttonA with the correct ID of the button for letter A
        letterButtonMap.put("B", R.id.B); // Replace R.id.buttonB with the correct ID of the button for letter B
        letterButtonMap.put("C", R.id.C); // Replace R.id.buttonC with the correct ID of the button for letter C
        letterButtonMap.put("D", R.id.D); // Replace R.id.buttonD with the correct ID of the button for letter D
        letterButtonMap.put("E", R.id.E); // Replace R.id.buttonE with the correct ID of the button for letter E
        letterButtonMap.put("F", R.id.F); // Replace R.id.buttonF with the correct ID of the button for letter F
        letterButtonMap.put("G", R.id.G); // Replace R.id.buttonG with the correct ID of the button for letter G
        letterButtonMap.put("H", R.id.H); // Replace R.id.buttonH with the correct ID of the button for letter H
        letterButtonMap.put("I", R.id.I); // Replace R.id.buttonI with the correct ID of the button for letter I
        letterButtonMap.put("J", R.id.J); // Replace R.id.buttonJ with the correct ID of the button for letter J
        letterButtonMap.put("K", R.id.K); // Replace R.id.buttonK with the correct ID of the button for letter K
        letterButtonMap.put("L", R.id.L); // Replace R.id.buttonL with the correct ID of the button for letter L
        letterButtonMap.put("M", R.id.M); // Replace R.id.buttonM with the correct ID of the button for letter M
        letterButtonMap.put("N", R.id.N); // Replace R.id.buttonN with the correct ID of the button for letter N
        letterButtonMap.put("O", R.id.O); // Replace R.id.buttonO with the correct ID of the button for letter O
        letterButtonMap.put("P", R.id.P); // Replace R.id.buttonP with the correct ID of the button for letter P
        letterButtonMap.put("Q", R.id.Q); // Replace R.id.buttonQ with the correct ID of the button for letter Q
        letterButtonMap.put("R", R.id.R); // Replace R.id.buttonR with the correct ID of the button for letter R
        letterButtonMap.put("S", R.id.S); // Replace R.id.buttonS with the correct ID of the button for letter S
        letterButtonMap.put("T", R.id.T); // Replace R.id.buttonT with the correct ID of the button for letter T
        letterButtonMap.put("U", R.id.U); // Replace R.id.buttonU with the correct ID of the button for letter U
        letterButtonMap.put("V", R.id.V); // Replace R.id.buttonV with the correct ID of the button for letter V
        letterButtonMap.put("W", R.id.W); // Replace R.id.buttonW with the correct ID of the button for letter W
        letterButtonMap.put("X", R.id.X); // Replace R.id.buttonX with the correct ID of the button for letter X
        letterButtonMap.put("Y", R.id.Y); // Replace R.id.buttonY with the correct ID of the button for letter Y
        letterButtonMap.put("Z", R.id.Z); // Replace R.id.buttonZ with the correct ID of the button for letter Z
    }

    private void vibrate() {
        if (vibrator != null && vibrator.hasVibrator()) {
            // Vibrate for 50 milliseconds (deprecated method)
            vibrator.vibrate(50);
        }
    }

    private void openDialogWin()
    {
        dialogwin dialogwin = new dialogwin();
        dialogwin.show(getSupportFragmentManager(),"Win");

    }
    private void openDialogLoose(int score , String world)
    {
        dialogloose dialogloose = new dialogloose(score,world);
        dialogloose.show(getSupportFragmentManager(),"Loose");

    }
    private void reste(){

        currentPosition[0] = 0;
        currentPosition[1] = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            String letter = String.valueOf(c);
            int buttonId = letterButtonMap.get(letter);

            // Find the button by its ID
            Button button = findViewById(buttonId);

            // Change the background color of the button here (replace R.color.your_color with the desired color resource)
            button.setBackgroundResource(R.drawable.diffrentstates);
            button.setTextColor(Color.parseColor("#FF000000"));
        }
        for(int i=0 ; i<6 ; i++ )
        {
            for(int j=0 ; j<5 ; j++)
            {
                textViews[i][j].setBackgroundResource(R.drawable.square_border);
                textViews[i][j].setText("");
            }
        }

    }
    public void onGoNextClicked() {

        reste(); // Call the reste() method here or perform any other actions you want

    }
    private int score(int i)
    {
        if(i==1)
            return 6;
        else if(i==2)
            return 5;
        else if(i==3)
            return 4;
        else if(i==4)
            return 3;
        else if(i==5)
            return 2;
        else if(i==6)
            return 1;
        else
            return 0;

    }

    private void saveGameState(ArrayList<String> currentWord,int[] currentPosition,int score,String targetword) {
        try {
            FileOutputStream fileOutputStream = openFileOutput("game_state.dat", Context.MODE_PRIVATE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            GameState gameState = new GameState(currentWord, currentPosition,score,targetword);
            objectOutputStream.writeObject(gameState);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class GameState implements Serializable {
        private ArrayList<String> currentWord;
        private int[] currentPosition;
        private int score;
        private String targetWord;

        public GameState(ArrayList<String> currentWord, int[] currentPosition, int score, String targetWord) {
            this.currentWord = currentWord;
            this.currentPosition = currentPosition;
            this.score = score;
            this.targetWord = targetWord;
        }

        public ArrayList<String> getCurrentWord() {
            return currentWord;
        }

        public int[] getCurrentPosition() {
            return currentPosition;
        }

        public int getScore() {
            return score;
        }

        public String getTargetWord() {
            return targetWord;
        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        // Save the game state here
        saveGameState(enteredWords,currentPosition,Score,targerword);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Save the game state here
        saveGameState(enteredWords,currentPosition,Score,targerword);
    }

    private void loadgame()
    {
        try {
            FileInputStream fileInputStream = openFileInput("game_state.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            GameState gameState = (GameState) objectInputStream.readObject();
            objectInputStream.close();

            // Retrieve saved values
             targerword = gameState.getTargetWord();
            currentPosition = gameState.getCurrentPosition();
            enteredWords = gameState.getCurrentWord();
            Score = gameState.getScore();
            Button submitButton = findViewById(R.id.submit);
            for (String word : enteredWords) {
                updateTextView(submitButton, word);
            }
            // Load other game data as needed
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
