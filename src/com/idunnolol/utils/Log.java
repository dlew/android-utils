package com.idunnolol.utils;

/**
 * Custom implementation of Log that adds extra functionality.  It functions
 * as a complete replacement for Log.
 * 
 * Its main advantage is in allowing you to configure defaults, thus
 * simplifying logging code.  It lets you configure a default tag,
 * which is used when the tag is not specified.  It also configures
 * a logging level, which allows you to enable/disable logging
 * statements at a particular level (or enable/disable them entirely).
 * 
 * It also has a convenience method for dumping long messages to the logs.
 * Since the length of debug 
 * 
 * In addition, it provides backwards compatibility for methods added in 
 * later versions of Android (like Log.wtf()).
 * 
 * There are two warnings about using this class.  The first is that it's not
 * a full replacement of Log - there are some methods in android.util.Log that
 * take a tag and a Throwable (namely, w() and wtf()) and those are not present
 * here (due to method signature collision).  The second warning is that this
 * class is potentially slower than using android.util.Log due to added
 * overhead with method calls (and the need to pre-format text).
 */
public class Log {

	public static final int VERBOSE = android.util.Log.VERBOSE;

	public static final int DEBUG = android.util.Log.DEBUG;

	public static final int INFO = android.util.Log.INFO;

	public static final int WARN = android.util.Log.WARN;

	public static final int ERROR = android.util.Log.ERROR;

	public static final int ASSERT = android.util.Log.ASSERT;

	public static final int NONE = Integer.MAX_VALUE;

	/**
	 * The default tag used for logging (if not yet configured).
	 */
	public static final String DEFAULT_TAG = "default";

	private static String sTag = DEFAULT_TAG;

	private static int sLevel = VERBOSE;

	/**
	 * Configure the defaults for logging.
	 * 
	 * @param tag the default logging tag
	 * @param level the minimum level at which statements are logged 
	 */
	public static void configure(String tag, int level) {
		sTag = tag;
		sLevel = level;
	}

	/**
	 * Configure the defaults for logging.  This method is a simpler
	 * version of the other configure() method, with less specificity
	 * needed for the level.
	 * 
	 * @param tag the default logging tag
	 * @param enabled whether logging should be enabled or not
	 */
	public static void configure(String tag, boolean enabled) {
		sTag = tag;
		sLevel = enabled ? VERBOSE : NONE;
	}

	/**
	 * @return the configured default logging tag
	 */
	public static String getTag() {
		return sTag;
	}

	/**
	 * @return the configured default logging level
	 */
	public static int getLevel() {
		return sLevel;
	}

	//////////////////////////////////////////////////////////////////////////
	// Logging

	// Tells whether the wtf() method is available or not
	private static boolean mWtfAvailable;

	static {
		try {
			android.util.Log.class.getMethod("wtf", String.class, String.class);
			mWtfAvailable = true;
		}
		catch (NoSuchMethodException unused) {
			mWtfAvailable = false;
		}
	}

	public static int v(String msg) {
		return (sLevel <= VERBOSE) ? android.util.Log.v(sTag, msg) : -1;
	}

	public static int v(String msg, Throwable tr) {
		return (sLevel <= VERBOSE) ? android.util.Log.v(sTag, msg, tr) : -1;
	}

	public static int v(String tag, String msg) {
		return (sLevel <= VERBOSE) ? android.util.Log.v(tag, msg) : -1;
	}

	public static int v(String tag, String msg, Throwable tr) {
		return (sLevel <= VERBOSE) ? android.util.Log.v(tag, msg, tr) : -1;
	}

	public static int d(String msg) {
		return (sLevel <= DEBUG) ? android.util.Log.d(sTag, msg) : -1;
	}

	public static int d(String msg, Throwable tr) {
		return (sLevel <= DEBUG) ? android.util.Log.d(sTag, msg, tr) : -1;
	}

	public static int d(String tag, String msg) {
		return (sLevel <= DEBUG) ? android.util.Log.d(tag, msg) : -1;
	}

	public static int d(String tag, String msg, Throwable tr) {
		return (sLevel <= DEBUG) ? android.util.Log.d(tag, msg, tr) : -1;
	}

	public static int i(String msg) {
		return (sLevel <= INFO) ? android.util.Log.i(sTag, msg) : -1;
	}

	public static int i(String msg, Throwable tr) {
		return (sLevel <= INFO) ? android.util.Log.i(sTag, msg, tr) : -1;
	}

	public static int i(String tag, String msg) {
		return (sLevel <= INFO) ? android.util.Log.i(tag, msg) : -1;
	}

	public static int i(String tag, String msg, Throwable tr) {
		return (sLevel <= INFO) ? android.util.Log.i(tag, msg, tr) : -1;
	}

	public static int w(String msg) {
		return (sLevel <= WARN) ? android.util.Log.w(sTag, msg) : -1;
	}

	public static int w(String msg, Throwable tr) {
		return (sLevel <= WARN) ? android.util.Log.w(sTag, msg, tr) : -1;
	}

	public static int w(String tag, String msg) {
		return (sLevel <= WARN) ? android.util.Log.w(tag, msg) : -1;
	}

	public static int w(String tag, String msg, Throwable tr) {
		return (sLevel <= WARN) ? android.util.Log.w(tag, msg, tr) : -1;
	}

	public static int e(String msg) {
		return (sLevel <= ERROR) ? android.util.Log.e(sTag, msg) : -1;
	}

	public static int e(String msg, Throwable tr) {
		return (sLevel <= ERROR) ? android.util.Log.e(sTag, msg, tr) : -1;
	}

	public static int e(String tag, String msg) {
		return (sLevel <= ERROR) ? android.util.Log.e(tag, msg) : -1;
	}

	public static int e(String tag, String msg, Throwable tr) {
		return (sLevel <= ERROR) ? android.util.Log.e(tag, msg, tr) : -1;
	}

	public static int wtf(String msg) {
		if (mWtfAvailable) {
			return (sLevel <= ERROR) ? android.util.Log.wtf(sTag, msg) : -1;
		}
		else {
			return (sLevel <= ERROR) ? android.util.Log.println(android.util.Log.ASSERT, sTag, msg) : -1;
		}
	}

	public static int wtf(String msg, Throwable tr) {
		if (mWtfAvailable) {
			return (sLevel <= ERROR) ? android.util.Log.wtf(sTag, msg, tr) : -1;
		}
		else {
			return (sLevel <= ERROR) ? android.util.Log.println(android.util.Log.ASSERT, sTag, msg + '\n'
					+ android.util.Log.getStackTraceString(tr)) : -1;
		}
	}

	public static int wtf(String tag, String msg) {
		if (mWtfAvailable) {
			return (sLevel <= ERROR) ? android.util.Log.wtf(tag, msg) : -1;
		}
		else {
			return (sLevel <= ERROR) ? android.util.Log.println(android.util.Log.ASSERT, tag, msg) : -1;
		}
	}

	public static int wtf(String tag, String msg, Throwable tr) {
		if (mWtfAvailable) {
			return (sLevel <= ERROR) ? android.util.Log.wtf(tag, msg, tr) : -1;
		}
		else {
			return (sLevel <= ERROR) ? android.util.Log.println(android.util.Log.ASSERT, tag, msg + '\n'
					+ android.util.Log.getStackTraceString(tr)) : -1;
		}
	}

	//////////////////////////////////////////////////////////////////////////
	// Dumps (logging long strings)

	// The maximum characters to dump on each line.  The official max is 4076,
	// however that also counts other portions of the dumped text (like tag
	// and timestamp), so this max works out pretty well.
	private static int DUMP_MAX = 4000;

	public static int dump(String longMsg) {
		return dump(sTag, longMsg, sLevel);
	}

	public static int dump(String longMsg, int level) {
		return dump(sTag, longMsg, level);
	}

	public static int dump(String tag, String longMsg) {
		return dump(tag, longMsg, sLevel);
	}

	public static int dump(String tag, String longMsg, int level) {
		if (level > sLevel) {
			return -1;
		}

		int bytes = 0;
		int start = 0;
		int len = longMsg.length();

		while (start < len) {
			int end = start + DUMP_MAX;
			if (end > len) {
				end = len;
			}
			String substr = longMsg.substring(start, end);

			switch (level) {
			case ASSERT:
				if (mWtfAvailable) {
					bytes += android.util.Log.wtf(tag, substr);
				}
				else {
					bytes += android.util.Log.println(android.util.Log.ASSERT, tag, substr);
				}
				break;
			case ERROR:
				bytes += android.util.Log.e(tag, substr);
				break;
			case WARN:
				bytes += android.util.Log.w(tag, substr);
				break;
			case INFO:
				bytes += android.util.Log.i(tag, substr);
				break;
			case DEBUG:
				bytes += android.util.Log.d(tag, substr);
				break;
			case VERBOSE:
			default:
				bytes += android.util.Log.v(tag, substr);
				break;
			}

			start += DUMP_MAX;
		}

		return bytes;
	}

	//////////////////////////////////////////////////////////////////////////
	// Other methods from Log (wrapped here for convenience)

	public static String getStackTraceString(Throwable tr) {
		return android.util.Log.getStackTraceString(tr);
	}

	public static boolean isLoggable(String tag, int level) {
		return android.util.Log.isLoggable(tag, level);
	}

	public static int println(int priority, String tag, String msg) {
		return android.util.Log.println(priority, tag, msg);
	}
}
