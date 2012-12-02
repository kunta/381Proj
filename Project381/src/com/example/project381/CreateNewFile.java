package com.example.project381;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CreateNewFile extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_document_view);
		
		ActionBar aBar = getActionBar();
		aBar.setDisplayShowTitleEnabled(false);
		aBar.setDisplayShowHomeEnabled(false);
		
		TextView fileName = (TextView) findViewById(R.id.editText1);
		
		Button cancelButton = (Button) findViewById(R.id.cancelButton);
		cancelButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				finish();
			}
			
		});
		
	}
	
}
