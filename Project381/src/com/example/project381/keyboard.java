
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public class MainActivity extends Activity implements OnKeyboardActionListener, OnKeyListener {

	 EditText currentEditText = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
        Keyboard keyboard = new Keyboard(this, R.xml.keyboard);
        keyboardView.setKeyboard(keyboard);
        keyboardView.setEnabled(true);
        keyboardView.setPreviewEnabled(true);
        keyboardView.setOnKeyListener(this);
        keyboardView.setOnKeyboardActionListener(this);
        


        final EditText edittext = (EditText) findViewById(R.id.main_text_input);
                edittext.setCursorVisible(false);
                edittext.setOnClickListener(new View.OnClickListener() {
           
           public void onClick(View v) {
            toggleKeyboardVisibility(edittext);
           }
          });




    }
    
    

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }



    private void toggleKeyboardVisibility(EditText ei) {
           KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
           int visibility = keyboardView.getVisibility();
           switch (visibility) {
            case View.VISIBLE:
             keyboardView.setVisibility(View.GONE);
             break;
            case View.GONE:
            case View.INVISIBLE:
             keyboardView.setVisibility(View.VISIBLE);
             currentEditText = ei;
             break;
           }
          }


	public boolean onKey(View v, int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void onKey(int primaryCode, int[] keyCodes) {
		// TODO Auto-generated method stub
		
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