package com.idunnolol.utils.log;

import android.app.ActivityGroup;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class LogActivityGroup extends ActivityGroup {

	// LogBase methods

	private LogBase mLogBase = new LogBase();

	public void setLoggingLevel(int level) {
		mLogBase.setLoggingLevel(level);
	}

	public void enableLogging() {
		mLogBase.enableLogging();
	}

	// Lifecycle

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mLogBase.onCreate(savedInstanceState);
	}

	@Override
	protected void onStart() {
		super.onStart();
		mLogBase.onStart();
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		mLogBase.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mLogBase.onPostCreate(savedInstanceState);
	}

	@Override
	protected void onResume() {
		super.onResume();
		mLogBase.onResume();
	}

	@Override
	protected void onPostResume() {
		super.onPostResume();
		mLogBase.onPostResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		mLogBase.onSaveInstanceState(outState);
	}

	@Override
	protected void onPause() {
		super.onPause();
		mLogBase.onPause();
	}

	@Override
	protected void onStop() {
		super.onStop();
		mLogBase.onStop();
	}

	@Override
	public Object onRetainNonConfigurationInstance() {
		mLogBase.onRetainNonConfigurationInstance();
		return super.onRetainNonConfigurationInstance();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		mLogBase.onRestart();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mLogBase.onDestroy();
	}

	// Non-lifecycle methods

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		mLogBase.onNewIntent(intent);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mLogBase.onConfigurationChanged(newConfig);
	}
}
