package com.study.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*A View, like a string, is a resource that can have an id.
        The findViewById call takes the ID of a view as its parameter and returns the View.
        Because the method returns a View, you have to cast the result to the view type you expect, in this case (TextView).*/
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {

        Toast toast = Toast.makeText(this , R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
}