package com.example.mahjongmaneger;

import com.example.mahjongmaneger.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

public class HalfEndActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.half_zhuang_end);
		
		 EditText editText1 = (EditText) findViewById(id.edittext1);
		 EditText editText2 = (EditText) findViewById(id.edittext2);
		 EditText editText3 = (EditText) findViewById(id.edittext3);
		 EditText editText4 = (EditText) findViewById(id.edittext4);


	}
	
	
}
