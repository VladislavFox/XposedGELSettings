package de.theknut.xposedgelsettings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Common {
	
	public static final String PACKAGE_NAME = Common.class.getPackage().getName();
	public static String HOOKED_PACKAGE;
	
	public static Object LAUNCHER_INSTANCE;
	public static Object DEVICE_PROFILE_INSTANCE;
	
	public static int SEARCH_BAR_SPACE_HEIGHT;
	public static int SEARCH_BAR_SPACE_WIDTH;
	
	public static String ALL_APPS_LIST = "com.android.launcher3.AllAppsList";
	public static String ITEM_INFO = "com.android.launcher3.ItemInfo";
	public static String CELL_LAYOUT = "com.android.launcher3.CellLayout";
	public static String SEARCH_DROP_TARGET_BAR = "com.android.launcher3.SearchDropTargetBar";
	public static String DYNAMIC_GRID = "com.android.launcher3.DeviceProfile";
	public static String PAGED_VIEW = "com.android.launcher3.PagedView";
	public static String PAGED_VIEW_ICON = "com.android.launcher3.PagedViewIcon";
	public static String DEVICE_PROFILE = "com.android.launcher3.DeviceProfile";
	public static String GEL_PACKAGE = "com.google.android.googlequicksearchbox";
	public static final List<String> PACKAGE_NAMES = new ArrayList<String>(Arrays.asList("com.android.launcher2", "com.android.launcher3", "com.cyanogenmod.trebuchet", "com.google.android.googlequicksearchbox"));
}
