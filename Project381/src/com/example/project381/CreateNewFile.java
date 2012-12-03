package com.example.project381;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CreateNewFile extends Activity {

	TextView fileName;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_document_view);
		
		ActionBar aBar = getActionBar();
		aBar.setDisplayShowTitleEnabled(false);
		aBar.setDisplayShowHomeEnabled(false);
		
		fileName = (TextView) findViewById(R.id.editText1);
		fileName.setSingleLine();
		
		Button cancelButton = (Button) findViewById(R.id.cancelButton);
		cancelButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				finish();
			}
			
		});
		
		Button createButton = (Button) findViewById(R.id.createButton);
		createButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				String text = (String) fileName.getText().toString();
				
				if(text.isEmpty()) {
					Log.d(null, "Empty");
				} else if (text.contains(",") || text.contains("<") || text.contains(".") || text.contains(">")
						|| text.contains("/") || text.contains("?") || text.contains(";") || text.contains(":")
						|| text.contains("'") || text.contains("\"") || text.contains("[") || text.contains("{")
						|| text.contains("]") || text.contains("}") || text.contains("\\") || text.contains("|")) {
					Log.d(null, "Bad character");
				} else {
					
				}
				
			}
			
		});
		
	}
	
}
