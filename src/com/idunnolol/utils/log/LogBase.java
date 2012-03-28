package com.idunnolol.utils.log;

import com.idunnolol.utils.Log;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LogBase {

	private static final String TAG = "LifecycleLog";

	// LogBase methods

	private int mLevel;

	public LogBase() {
		mLevel = Log.NONE;
	}

	public void setLoggingLevel(int level) {
		mLevel = level;
	}

	// Convenience method, for quick enabling of logging
	public void enableLogging() {
		mLevel = Log.INFO;
	}

	// Activity/Fragment lifecycle

	public void onCreate(Bundle savedInstanceState) {
		Log.log(mLevel, TAG, "onCreate(" + savedInstanceState + ")");
	}

	public void onStart() {
		Log.log(mLevel, TAG, "onStart()");
	}

	public void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.log(mLevel, TAG, "onRestoreInstanceState(" + savedInstanceState + ")");
	}

	public void onPostCreate(Bundle savedInstanceState) {
		Log.log(mLevel, TAG, "onPostCreate(" + savedInstanceState + ")");
	}

	public void onResume() {
		Log.log(mLevel, TAG, "onResume()");
	}

	public void onPostResume() {
		Log.log(mLevel, TAG, "onPostResume()");
	}

	public void onSaveInstanceState(Bundle outState) {
		Log.log(mLevel, TAG, "onSaveInstanceState(" + outState + ")");
	}

	public void onPause() {
		Log.log(mLevel, TAG, "onPause()");
	}

	public void onStop() {
		Log.log(mLevel, TAG, "onStop()");
	}

	public void onRetainNonConfigurationInstance() {
		Log.log(mLevel, TAG, "onRetainNonConfigurationInstance()");
	}

	public void onRestart() {
		Log.log(mLevel, TAG, "onRestart()");
	}

	public void onDestroy() {
		Log.log(mLevel, TAG, "onDestroy()");
	}

	// Fragment lifecycle

	public void onAttach(Activity activity) {
		Log.log(mLevel, TAG, "onAttach(" + activity + ")");
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		Log.log(mLevel, TAG, "onActivityCreated(" + savedInstanceState + ")");
	}

	public void onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.log(mLevel, TAG, "onCreateView(" + inflater + ", " + container + ", " + savedInstanceState + ")");
	}

	public void onDestroyView() {
		Log.log(mLevel, TAG, "onDestroyView()");
	}

	public void onDetach() {
		Log.log(mLevel, TAG, "onDetach()");
	}

	public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
		Log.log(mLevel, TAG, "onInflate(" + activity + ", " + attrs + ", " + savedInstanceState + ")");
	}

	public void onViewCreated(View view, Bundle savedInstanceState) {
		Log.log(mLevel, TAG, "onViewCreated(" + view + ", " + savedInstanceState + ")");
	}

	// Non-lifecycle methods

	public void onHiddenChanged(boolean hidden) {
		Log.log(mLevel, TAG, "onHiddenChanged(" + hidden + ")");
	}

	public void onNewIntent(Intent intent) {
		Log.log(mLevel, TAG, "onNewIntent(" + intent + ")");
	}

	public void onConfigurationChanged(Configuration newConfig) {
		Log.log(mLevel, TAG, "onConfigurationChanged(" + newConfig + ")");
	}
}
