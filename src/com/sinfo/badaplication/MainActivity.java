package com.sinfo.badaplication;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener{
	
	private EditText mName; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mName = (EditText) findViewById(R.id.et_name);
		
		Button btnAux = (Button) findViewById(R.id.btn_validate);
		btnAux.setOnClickListener(this);
	}

	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_validate:
			if (RetroTools.validateFieldEmpty(mName)){
				mName.setError(getString(R.string.field_empty));
			} else{
				startActivity(new Intent(MainActivity.this,SecondActivity.class));
			}
			break;
		}
	}
	
	

}
