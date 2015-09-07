package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

	
		// lifecycle counts	
		//TODO:
		//Create 7 counter variables, each corresponding to a different one of the lifecycle callback methods.
		// You will need to increment these variables' values when their corresponding lifecycle methods get called.  
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_one);
			
			// check for previous state
			if (savedInstanceState != null){
	    		super.onRestoreInstanceState(savedInstanceState);
	    		//TODO:
	    		// Restore value of counters from saved state
				// only need 7 lines of code, each for every count variable.
	    	}
			
			//Log cat print out
			Log.i(TAG, "onCreate called");
			
			//TODO:
			//update the appropriate count variable
			//update the view by calling displayCounts()
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}
		
		// lifecycle callback overrides
		
		@Override
		public void onStart(){
			super.onStart();
			
			//Log cat print out
			Log.i(TAG, "onStart called");
			
			//TODO:
			//update the appropriate count variable
			//update the view 
		}
		
		@Override
		public void onResume(){
			super.onResume();
			
			//Log cat print out
			Log.i(TAG, "onResume called");
			
			//TODO:
			//update the appropriate count variable
			//update the view 
		}
		
		@Override
		public void onPause(){
			super.onPause();
			
			//Log cat print out
			Log.i(TAG, "onPause called");
			
			//TODO:
			//update the appropriate count variable
			//update the view 
		}
		
		@Override
		public void onStop(){
			super.onStop();
			
			//Log cat print out
			Log.i(TAG, "onStop called");
			
			//TODO:
			//update the appropriate count variable
			//update the view 
		}

		@Override
		public void onRestart(){
			super.onRestart();
			
			//Log cat print out
			Log.i(TAG, "onRestart called");
			
			//TODO:
			//update the appropriate count variable
			//update the view 
		}
		
		@Override
		public void onDestroy(){
			super.onDestroy();
			
			//Log cat print out
			Log.i(TAG, "onDestroy called");
			
			//TODO:
			//update the appropriate count variable
			//update the view 
		}
		
		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:
			// save state information with a collection of key-value pairs
			// 7 lines of code, each for every count variable
		}

		
		public void launchActivityTwo(View view) {
			//TODO:
			// This function launches Activity Two. 
			// Hint: use Context’s startActivity() method.
		}
		
		// update the views for counts
		
		public void displayCounts(){
			//TODO:
			// Updates the displayed counters 
			// Hint: Access the TextViews by calling Activity’s findViewById(). 
			// Update the TextView’s text by calling TextView’s setText() method.
			// TextView textView1 = (TextView) findViewById(R.id.textView1);
			// textView1.setText(“foo”);
		}

}
