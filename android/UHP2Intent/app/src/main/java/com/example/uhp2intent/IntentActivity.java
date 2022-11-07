package com.example.uhp2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        EditText editText2 = findViewById(R.id.editext2);
        Button get2 = findViewById(R.id.get2);

        String name = getIntent().getExtras().getString("name");
        editText2.setText(name);

        get2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IntentActivity.this, "Welcome " + editText2.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
