package com.danlew.utils.log;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LogDialogFragment extends DialogFragment {
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
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mLogBase.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mLogBase.onCreateView(inflater, container, savedInstanceState);
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		mLogBase.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
		super.onInflate(activity, attrs, savedInstanceState);
		mLogBase.onInflate(activity, attrs, savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		mLogBase.onAttach(activity);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mLogBase.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
		mLogBase.onStart();
	}

	@Override
	public void onResume() {
		super.onResume();
		mLogBase.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		mLogBase.onSaveInstanceState(outState);
	}

	@Override
	public void onPause() {
		super.onPause();
		mLogBase.onPause();
	}

	@Override
	public void onStop() {
		super.onStop();
		mLogBase.onStop();
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mLogBase.onDestroyView();
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mLogBase.onDetach();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		mLogBase.onDestroy();
	}

	// Non-lifecycle methods

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mLogBase.onConfigurationChanged(newConfig);
	}

	@Override
	public void onHiddenChanged(boolean hidden) {
		super.onHiddenChanged(hidden);
		mLogBase.onHiddenChanged(hidden);
	}
}
