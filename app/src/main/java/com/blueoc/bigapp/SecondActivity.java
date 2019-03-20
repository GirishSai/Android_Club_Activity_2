package com.blueoc.bigapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public Button button2;
    public EditText reply;

    TextView messe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        String mess = bundle.getString("mess");
        messe = findViewById(R.id.mess);
        messe.setText(mess);

        button2 = (Button) findViewById(R.id.button2);
        reply = (EditText) findViewById(R.id.editText3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toys = new Intent(SecondActivity.this, MainActivity.class);
                toys.putExtra("repl", reply.getText().toString());
                startActivity(toys);
            }
        });
    }
}