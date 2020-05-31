package com.example.androidlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);

        Button button = findViewById(R.id.button01);
        button.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), getString(R.string.toast_message), Toast.LENGTH_LONG).show();
        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(MainActivity.this, getString(R.string.toast_message), Toast.LENGTH_LONG);
//                toast.show();
//            }
//        });

        CheckBox checkBox = findViewById(R.id.checkbox01);
        checkBox.setOnCheckedChangeListener( (buttonView, isChecked) -> {
            if(isChecked){
                Snackbar.make(findViewById(R.id.checkbox01), getString(R.string.switchOn), 3000)
                        .setAction(getString(R.string.undo), v -> buttonView.setChecked(!isChecked))
                        .show();
            } else {
                Snackbar.make(findViewById(R.id.checkbox01), getString(R.string.switchOff),3000).show();
            }
        });

        Switch switch_button = findViewById(R.id.switch01);
        switch_button.setOnCheckedChangeListener( (buttonView, isChecked) -> {
                if(isChecked){
                    Snackbar.make(findViewById(R.id.switch01), getString(R.string.switchOn), 3000)
                            .setAction(getString(R.string.undo), v -> buttonView.setChecked(!isChecked))
                            .show();
                } else {
                    Snackbar.make(findViewById(R.id.switch01), getString(R.string.switchOff),3000).show();
                }
        });


//        Snackbar snackbar = Snackbar.make(findViewById(R.id.switch01), getString(R.string.switchOn), 3000);
//        snackbar.setAction(getString(R.string.undo), v -> buttonView.setChecked(!isChecked));
//        snackbar.show();


    }

}