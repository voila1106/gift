package com.voila.nb;

import android.app.*;
import android.content.*;
import android.media.*;
import android.os.*;
import java.util.*;
import android.util.*;
import java.io.*;
import android.widget.*;

public class vol extends Service
{

	@Override
	public IBinder onBind(Intent p1)
	{
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		
		final Timer t=new Timer();
		final AudioManager am=(AudioManager)getSystemService(AUDIO_SERVICE);
		TimerTask tt=new TimerTask(){
			@Override
			public void run()
			{
				am.setStreamVolume(AudioManager.STREAM_MUSIC,15,0);
				if(MainActivity.isStopped)
				{
					
					t.cancel();
					am.setStreamVolume(AudioManager.STREAM_MUSIC,0,0);
				}
			}
		};
		t.schedule(tt,0,20);
		return super.onStartCommand(intent,flags,startId);
	}
	
}
