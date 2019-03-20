package com.blueoc.bigapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button1;
    public EditText message;

    TextView rep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        String repl = bundle.getString("repl");
        rep = findViewById(R.id.repl);
        rep.setText(repl);




        button1=(Button)findViewById(R.id.button1);
        message = (EditText)findViewById(R.id.editText2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this,SecondActivity.class);
                toy.putExtra("mess",message.getText().toString());
                startActivity(toy);

            }
        });

    }

}
