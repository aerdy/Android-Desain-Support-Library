package com.example.jarod.desainsupportlibraryanna;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jarod on 8/4/15.
 */
public class FloatingButtonActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating);
        FloatingActionButton fb=(FloatingActionButton)findViewById(R.id.fab);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Iso",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
