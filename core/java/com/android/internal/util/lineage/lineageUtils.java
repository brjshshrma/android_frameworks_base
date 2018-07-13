package com.android.internal.util.lineage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.SystemClock;
import android.view.IWindowManager;
import android.view.WindowManagerGlobal;

import com.android.internal.statusbar.IStatusBarService;

public class lineageUtils {

public static final String INTENT_SCREENSHOT = "action_take_screenshot";
public static final String INTENT_REGION_SCREENSHOT = "action_take_region_screenshot";

 public static void takeScreenshot(boolean full) {
        IWindowManager wm = WindowManagerGlobal.getWindowManagerService();
        try {
            wm.sendCustomAction(new Intent(full? INTENT_SCREENSHOT : INTENT_REGION_SCREENSHOT));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
