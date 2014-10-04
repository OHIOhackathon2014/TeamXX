package com.example.ohio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DisplaySubjects extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_subjects);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_subjects, menu);
		return true;
	}

}
