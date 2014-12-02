package com.code2care.example.autocompleteedittextexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteEditText extends ActionBarActivity {

	AutoCompleteTextView autoTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_complete_edit_text);

		String[] ProgLanguages = { "Java", "C", "C++", ".Net", "PHP", "Perl",
				"Objective-c", "Small-Talk", "C#", "Ruby", "ASP", "ASP .NET" };

		autoTextView = (AutoCompleteTextView) findViewById(R.id.autocompleteEditTextView);

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.select_dialog_item, ProgLanguages);

		//Used to specify minimum number of characters the user has to type in order to display the drop down hint.
		autoTextView.setThreshold(1);

		//Setting adapter
		autoTextView.setAdapter(arrayAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.auto_complete_edit_text, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
