package com.example.armstrong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int number = 153;
        int work;
        int place;
        int after;
        int count;
        ArrayList<Integer> working = new ArrayList<>();

        work = number;

        while (work > 0) {
            place = work % 10;
            working.add(place);
            work = work / 10;
            count++;
        }

        while (count >= 0) {
            count--;
            work = working.get(count);
            after = work * work * work + after;
        }

        if (number == after) {
            System.out.println("Is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
