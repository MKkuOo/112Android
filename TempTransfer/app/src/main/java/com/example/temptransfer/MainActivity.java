package com.example.temptransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view)
    {
        EditText txtTemp = (EditText) findViewById(R.id.txtTemp);
        double degreeC = Double.parseDouble(txtTemp.getText().toString());
        double degreeF = (9.0 * degreeC) + 32;
        TextView output = (TextView) findViewById(R.id.txvshow);
        output.setText("華氏溫度:" + String.format("%.2f", degreeF));
    }
}