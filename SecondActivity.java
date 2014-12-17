package com.anand.simplesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {
	public static String user="nul";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exc20);
	}

	public void loginBtn(View v) {
		EditText edit_user=(EditText)findViewById(R.id.editText1);
		String user_name=edit_user.getText().toString();
		EditText edit_pass=(EditText)findViewById(R.id.editText2);
		String user_pass=edit_pass.getText().toString();
		if(user_name.equals("anandab") && user_pass.equals("anand"))
		{
			user="Anand A";
			startActivity(new Intent(this, HomePage.class));
		}
		if(user.equals("nul"))
		{
			Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_LONG).show();
		}

	}

}
