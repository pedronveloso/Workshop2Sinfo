package com.sinfo.badaplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThirdActivity extends Activity{
	
	static final String[] ANDROID_VERSIONS = new String[] { "Android", "Bender", "Cupcake",
		"Eclair", "Froyo", "Gingerbread", "Honeycomb", "ICS",
		"JellyBean","Android", "Bender", "Cupcake",
		"Eclair", "Froyo", "Gingerbread", "Honeycomb", "ICS",
		"JellyBean"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		
		ListView listView = (ListView) findViewById(R.id.list);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,ANDROID_VERSIONS);
		listView.setAdapter(adapter);
	}
	
}
