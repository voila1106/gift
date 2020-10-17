package com.voila.nb;

import android.app.*;
import android.os.Bundle;
import android.view.*;
import java.util.*;
import java.io.*;
import android.content.*;
import android.media.*;
import android.widget.*;

public class MainActivity extends Activity
{

	@Override
	public void onPointerCaptureChanged(boolean hasCapture)
	{
		// TODO: Implement this method
	}
	MediaPlayer p;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		p=MediaPlayer.create(this,R.raw.y);
		p.setLooping(true);
		//p.start();
		p.start();
    }
	
}
