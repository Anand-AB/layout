package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exc16);
	}

	public void loginPage(View v) {
		startActivity(new Intent(this, SecondActivity.class));

	}
	public void registerPage(View v) {
		startActivity(new Intent(this, ThirdActivity.class));

	}

}
