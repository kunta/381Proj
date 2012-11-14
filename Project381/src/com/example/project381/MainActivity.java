package com.example.project381;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class MainActivity extends Activity {
	
//    final ProjectTextView pview = (ProjectTextView) findViewById(R.id.main_text_input);
//    final TextView lineNumbers = (TextView) findViewById(R.id.lineNumbers);
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
        final ProjectTextView pview = (ProjectTextView) findViewById(R.id.main_text_input);
        final TextView lineNumbers = (TextView) findViewById(R.id.lineNumbers);
        Menu menu = (Menu) findViewById(R.id.file);
        
        MenuItem item1 = (MenuItem) findViewById(R.id.delete);     
        
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  
        
        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();
        
        TabSpec mainSpec = tabHost.newTabSpec("Main");
        mainSpec.setIndicator("main");
        mainSpec.setContent(R.id.main_text_input);
        tabHost.addTab(mainSpec);
        
        ActionBar aBar = getActionBar();
        aBar.setDisplayShowTitleEnabled(false);
        aBar.setDisplayShowHomeEnabled(false);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    
    public boolean onCreateNewFileMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.new_file, menu);
    	return true;
    }
    
    public void createNewText() {
    //	ProjectTextView newText = new ProjectTextView();
    }
    
    public void inflateLineNumbers(TextView view, int numbers) {
    	String lineNumbers = null;
    	for(int i = 1; i <= numbers; i++) {
    		lineNumbers = lineNumbers + i + "\n";
    		System.out.println(i);
    	}
    	view.setText(lineNumbers);
    }
    
}


