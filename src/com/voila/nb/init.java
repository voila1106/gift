package com.voila.nb;

import android.app.*;
import android.content.*;

public class init extends Application
{

	@Override
	public void onCreate()
	{
		Intent i=new Intent(this,vol.class);
		startService(i);
		super.onCreate();
	}
	
}
