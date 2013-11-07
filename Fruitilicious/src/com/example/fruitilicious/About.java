package com.example.fruitilicious;

import android.content.Intent;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class About extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.about);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		new MenuInflater(this).inflate(R.menu.options_about, menu);

		return (super.onCreateOptionsMenu(menu));
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
		    finish();
			return (true);
		case R.id.feedback:
			openFeedback();
			return (true);

		}
		return (super.onOptionsItemSelected(item));
	}

	/* Method to open feedback page from actionbar/options menu */
	private void openFeedback() {
		Intent intent = new Intent();
		intent.setClassName("com.example.fruitilicious",
				"com.example.fruitilicious.Feedback");
		startActivity(intent);
	}



}
