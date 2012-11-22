package com.example.project381;

import java.util.HashMap;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class KeyboardListener extends KeyboardView implements OnKeyboardActionListener, OnKeyListener {
	
	ProjectTextView currentEditText = (ProjectTextView) findViewById(R.id.main_text_input); 
	
	public KeyboardListener(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
    private void toggleKeyboardVisibility() {
           KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
           int visibility = keyboardView.getVisibility();
           switch (visibility) {
            case View.VISIBLE:
             keyboardView.setVisibility(View.GONE);
             break;
            case View.GONE:
            case View.INVISIBLE:
             keyboardView.setVisibility(View.VISIBLE);
             break;
           }
    }

	public boolean onKey(View v, int keyCode, KeyEvent event) {
		return false;
	}

	
	public void onKey(int primaryCode, int[] keyCodes) {
		 HashMap<String, String> keyCodeMap = new HashMap<String, String>();
	       keyCodeMap.put("1", "1");
	       keyCodeMap.put("2", "2");
	       keyCodeMap.put("3", "3");
	       keyCodeMap.put("4", "4");
	       keyCodeMap.put("5", "5");
	       keyCodeMap.put("6", "6");
	       keyCodeMap.put("7", "7");
	       keyCodeMap.put("8", "8");
	       keyCodeMap.put("9", "9");
	       keyCodeMap.put("0", "0");
	       keyCodeMap.put("11", "q");
	       keyCodeMap.put("12", "w");
	       keyCodeMap.put("13", "e");
	       keyCodeMap.put("14", "r");
	       keyCodeMap.put("15", "t");
	       keyCodeMap.put("16", "y");
	       keyCodeMap.put("17", "u");
	       keyCodeMap.put("18", "i");
	       keyCodeMap.put("19", "o");
	       keyCodeMap.put("10", "p");
	       keyCodeMap.put("21", "a");
	       keyCodeMap.put("22", "s");
	       keyCodeMap.put("23", "d");
	       keyCodeMap.put("24", "f");
	       keyCodeMap.put("25", "g");
	       keyCodeMap.put("26", "h");
	       keyCodeMap.put("27", "j");
	       keyCodeMap.put("28", "k");
	       keyCodeMap.put("29", "l");
	       keyCodeMap.put("31", "z");
	       keyCodeMap.put("32", "x");
	       keyCodeMap.put("33", "c");
	       keyCodeMap.put("34", "v");
	       keyCodeMap.put("35", "b");
	       keyCodeMap.put("36", "n");
	       keyCodeMap.put("37", "m");
	       keyCodeMap.put("38", "{");
	       keyCodeMap.put("39", "[");
	       keyCodeMap.put("40", "(");
	       keyCodeMap.put("-1", "");
	       keyCodeMap.put("-2", "");
	       keyCodeMap.put("-3", "");
	       keyCodeMap.put("-4", ";");
	       keyCodeMap.put("-5", "");
	       keyCodeMap.put("-6", ",");
	       keyCodeMap.put("-7", ".");
	       
		String c = keyCodeMap.get(String.valueOf(primaryCode));
		       if(!(c == null)){
		    	   System.out.println(c);
		    	   //currentEditText.append(c);
		       }
		       else{
		        switch(primaryCode){
		        case -5://backspace
		         if(currentEditText.getText().toString().length() > 0)
		          currentEditText.setText(currentEditText.getText().toString().substring(0, currentEditText.getText().toString().length() - 1));
		        }
		       }


		
	}

	
	public void onPress(int primaryCode) {
		// TODO Auto-generated method stub
		
	}

	
	public void onRelease(int primaryCode) {
		// TODO Auto-generated method stub
		
	}

	
	public void onText(CharSequence text) {
		// TODO Auto-generated method stub
		
	}

	
	public void swipeDown() {
		// TODO Auto-generated method stub
		
	}

	public void swipeLeft() {
		// TODO Auto-generated method stub
		
	}

	public void swipeRight() {
		// TODO Auto-generated method stub
		
	}

	public void swipeUp() {
		// TODO Auto-generated method stub
		
	}
}