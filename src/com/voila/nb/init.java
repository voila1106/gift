package com.voila.nb;

import android.app.*;
import android.content.*;

public class init extends Application
{
	public static Intent i;
	@Override
	public void onCreate()
	{
		i=new Intent(this,vol.class);
		startService(i);
		super.onCreate();
	}
	public static void stop(Context c)
	{
		c.stopService(i);
	}
	
}
