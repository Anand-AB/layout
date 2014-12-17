package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends ActionBarActivity {
	public static String user="nul";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exc18);
	}

	public void regBtn(View v) {
		EditText edit_user=(EditText)findViewById(R.id.editText3);
		String user_name=edit_user.getText().toString();
		user=user_name;
		startActivity(new Intent(this, HomePage.class));

	}

}
