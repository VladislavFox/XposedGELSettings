package de.theknut.xposedgelsettings.hooks.GoogleSearchBar;

import static de.robv.android.xposed.XposedHelpers.getIntField;
import android.view.ViewGroup.LayoutParams;
import de.robv.android.xposed.XC_MethodHook;
import de.theknut.xposedgelsettings.Common;
import de.theknut.xposedgelsettings.hooks.GELSettings;

public final class OnPageEndMovingHook extends XC_MethodHook {
	
	@Override
	protected void afterHookedMethod(MethodHookParam param) throws Throwable {
		if (Common.LAUNCHER_INSTANCE == null)
			return;
		
		if (getIntField(param.thisObject, "mCurrentPage") == 0) {
			GELSettings.setLayoutParams(Common.LAUNCHER_INSTANCE, LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, Common.SEARCH_BAR_SPACE_WIDTH, Common.SEARCH_BAR_SPACE_HEIGHT);					
		}
	}	
}