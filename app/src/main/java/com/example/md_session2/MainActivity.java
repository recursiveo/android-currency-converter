package com.example.md_session2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void covertAmount(View view) {
        EditText editText1 = (EditText) findViewById(R.id.usd);
        EditText editText2 = (EditText) findViewById(R.id.cad);

            String usdText= editText1.getText().toString();
            String cadText = editText2.getText().toString();

            if(!usdText.equals("")&&(cadText.equals(""))){
                float usd = Float.parseFloat(usdText);
                float cad = (float)(1.27*usd);
                editText2.setText(String.valueOf(cad));
            }else if(usdText.equals("")&& !(cadText.equals(""))){
                float cad = Float.parseFloat(cadText);
                float usd = (float)(cad/1.27);
                editText1.setText(String.valueOf(usd));
            }else{
                editText1.setText("");
                editText2.setText("");
            }

        }
}