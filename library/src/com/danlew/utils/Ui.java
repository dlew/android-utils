package com.danlew.utils;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class Ui {

	@SuppressWarnings("unchecked")
	public static <T extends View> T findView(Activity activity, int id) {
		return (T) activity.findViewById(id);
	}

	@SuppressWarnings("unchecked")
	public static <T extends View> T findView(View view, int id) {
		return (T) view.findViewById(id);
	}

	@SuppressWarnings("unchecked")
	public static <T extends Fragment> T findFragment(Activity activity, String tag) {
		return (T) activity.getFragmentManager().findFragmentByTag(tag);
	}

	@SuppressWarnings("unchecked")
	public static <T extends Fragment> T findFragment(Activity activity, int id) {
		return (T) activity.getFragmentManager().findFragmentById(id);
	}

	@SuppressWarnings("unchecked")
	public static <T extends android.support.v4.app.Fragment> T findFragment(FragmentActivity activity, String tag) {
		return (T) activity.getSupportFragmentManager().findFragmentByTag(tag);
	}

	@SuppressWarnings("unchecked")
	public static <T extends android.support.v4.app.Fragment> T findFragment(FragmentActivity activity, int id) {
		return (T) activity.getSupportFragmentManager().findFragmentById(id);
	}

}
