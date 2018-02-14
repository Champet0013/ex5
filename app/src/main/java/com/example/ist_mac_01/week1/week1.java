package com.example.ist_mac_01.week1;

import android.graphics.Color;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class week1 extends AppCompatActivity {
    RelativeLayout rb;

    NumberPicker np;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week1);

        np = (NumberPicker)findViewById(R.id.numberPicker);
        rb=(RelativeLayout)findViewById(R.id.layout1);

//        rb.setBackgroundColor(Color.RED);


        final String[] data = {"coke","sprite","fanta","coffee"};

        np.setMinValue(0);

        np.setMaxValue(data.length-1);

        np.setDisplayedValues(data);

        np.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        np.setWrapSelectorWheel(false);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                int value = numberPicker.getValue();
                int color = 0;
                if(value==0){
                    color = Color.RED;
                }else if(value == 1){
                    color = Color.GREEN;
                }else if (value ==2){
                    color= Color.BLUE;
                }else if(value ==3){
                    color = Color.YELLOW;
                }

                rb.setBackgroundColor(color);
                Toast.makeText(getApplicationContext(),data[value], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
