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

	public static boolean isStopped=false;
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
		//p.setLooping(true);
		p.start();

    }
	//int c=6;
	public void onStopClick(View v)
	{

		try
		{
			p.stop();
			stopService(init.i);
			sToast(this,"已停止",0);
		}catch(Exception e)
		{}
		isStopped = true;

		
	}
	Toast t = null;
	public void sToast(Context context, String content, int duration)
	{

		if(t != null)
		{
			t.cancel();
			t = Toast.makeText(context,content,duration);
			t.show();
		}else
		{
			t = Toast.makeText(context,content,duration);
			t.show();
		}
	}
}
