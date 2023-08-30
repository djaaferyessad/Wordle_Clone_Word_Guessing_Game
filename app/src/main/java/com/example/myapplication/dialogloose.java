package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class dialogloose extends AppCompatDialogFragment {

String World ="";
int score = 0;

    public dialogloose(int score , String World)
    {
        this.score = score;
        this.World = World;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.looseact,null);
        TextView Scoretxt = view.findViewById(R.id.the_score); // Find the TextView in the inflated view
        TextView Worldtxt = view.findViewById(R.id.the_word);

        Worldtxt.setText("The word was : "+String.valueOf(World));
        Scoretxt.setText("Score : "+String.valueOf(score));
        builder.setView(view).setTitle("You loose ").setNeutralButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        return builder.create();
    }



}