package com.voila.nb;

import android.app.*;
import android.os.Bundle;
import android.view.*;
import java.util.*;
import java.io.*;
import android.content.*;
import android.media.*;
import android.widget.*;
import android.view.View.*;
import android.net.*;

public class MainActivity extends Activity
{

	@Override
	public void onPointerCaptureChanged(boolean hasCapture)
	{
		// TODO: Implement this method
	}
	MediaPlayer p;
	TextView g;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		g = findViewById(R.id.g);
		g.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(g.getText().toString()));
					startActivity(i);
				}
			});

		p = MediaPlayer.create(this,R.raw.y);
		p.setLooping(true);
		p.start();

    }

}
