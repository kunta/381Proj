import com.example.project381.R;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;


public class OpenFilesView extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.open_files_view);
		
		ActionBar aBar = getActionBar();
		aBar.setDisplayShowHomeEnabled(false);
		aBar.setDisplayShowTitleEnabled(false);
	}
	
}
