package com.example.bluetooth_togglebutton;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    BluetoothAdapter ba;
    ToggleButton t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(ToggleButton)findViewById(R.id.toggleButton);
        ba=BluetoothAdapter.getDefaultAdapter();
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ba.enable();
                }else {
                    ba.disable();
                }
            }
        });
    }
}