package com.example.a403.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.a403.myapplication2.R.id.radioButton2;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2,textView3;
    CheckBox checkBox;
    RadioButton radioButton1, radiobutton2;
    ImageView imageView;
    Button button;
    EditText edittext1,edittext2,edittext3;
    EditText edittext4,edittext5,edittext6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        checkBox = (CheckBox)findViewById(R.id.checkBox2);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton);
        radiobutton2 = (RadioButton)findViewById(radioButton2);
        imageView = (ImageView)findViewById(R.id.imageView2);
        button = (Button)findViewById(R.id.button);
        edittext1 = (EditText)findViewById(R.id.editText);
        edittext2 = (EditText)findViewById(R.id.editText2);
        edittext3 = (EditText)findViewById(R.id.editText3);
        edittext4 = (EditText)findViewById(R.id.editText4);
        edittext5 = (EditText)findViewById(R.id.editText5);
        edittext6 = (EditText)findViewById(R.id.editText6);


        String e1 = edittext1.getText().toString();

        String e2 = edittext2.getText().toString();

        String e3 = edittext3.getText().toString();

        checkBox .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){


                }
            }
        });

        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageView.setImageResource(R.drawable.pick);
                }else if(){

                };
            }
        });

        radiobutton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageView.setImageResource(R.drawable.source);
                }
            }
        });

    }
}
