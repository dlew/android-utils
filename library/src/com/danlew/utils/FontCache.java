package com.danlew.utils;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Simple font cache, keeps us from having to reload the same font over
 * and over again.
 */
public class FontCache {

	private static Map<String, Typeface> sCachedFonts = new HashMap<String, Typeface>();

	public static Typeface getTypeface(Context context, String assetPath) {
		if (!sCachedFonts.containsKey(assetPath)) {
			Typeface tf = Typeface.createFromAsset(context.getAssets(), assetPath);
			sCachedFonts.put(assetPath, tf);
		}

		return sCachedFonts.get(assetPath);
	}
}
