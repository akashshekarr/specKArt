package com.example.testingclone;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class OptionsCust extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_cust);

        fragmentManager = getSupportFragmentManager();

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;

        // Handle button clicks
        switch (v.getId()) {
            case R.id.button1:
                fragment = new Fragment1();
                break;
            case R.id.button2:
                fragment = new Fragment2();
                break;
            case R.id.button3:
                fragment = new Fragment3();
                break;
            case R.id.button4:
                fragment = new Fragment4();
                break;
        }

        // Replace the FrameLayout content with the selected fragment
        if (fragment != null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
