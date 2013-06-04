package com.example.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    
    public void onTenPercent(View v) {
		EditText etNewItem = (EditText) findViewById(R.id.editAmount);
		float amount = Float.valueOf(etNewItem.getText().toString()).floatValue();
		
		float tip = 0.1f * amount;
		
		TextView tipView = (TextView) findViewById(R.id.tip);
		tipView.setText(""+tip);
		etNewItem.setText("");
	}
    
    
    public void onFifteenPercent(View v) {
		EditText etNewItem = (EditText) findViewById(R.id.editAmount);
		float amount = Float.valueOf(etNewItem.getText().toString()).floatValue();
		
		float tip = 0.15f * amount;
		
		TextView tipView = (TextView) findViewById(R.id.tip);
		tipView.setText(""+tip);
		etNewItem.setText("");
	}
    
    public void onTwentyPercent(View v) {
		EditText etNewItem = (EditText) findViewById(R.id.editAmount);
		float amount = Float.valueOf(etNewItem.getText().toString()).floatValue();
		
		float tip = 0.2f * amount;
		
		TextView tipView = (TextView) findViewById(R.id.tip);
		tipView.setText(""+tip);
		etNewItem.setText("");
	}
}
