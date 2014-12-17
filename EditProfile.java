package com.anand.simplesite;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class EditProfile extends ActionBarActivity {
	public static String user=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exc12);
		((TextView)findViewById(R.id.textView1)).setText(SecondActivity.user);
	}



}
