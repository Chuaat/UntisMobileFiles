// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import java.lang.reflect.Method;
import android.annotation.TargetApi;

@TargetApi(24)
public final class v0
{
    @k0
    private static final Method a;
    @k0
    private static final Method b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Method method = null;
        Method declaredMethod = null;
        Label_0069: {
            if (sdk_INT >= 24) {
                try {
                    declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
                    break Label_0069;
                }
                catch (NoSuchMethodException ex) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                    }
                }
            }
            declaredMethod = null;
        }
        a = declaredMethod;
        Method declaredMethod2 = method;
        if (Build$VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", (Class<?>[])new Class[0]);
            }
            catch (NoSuchMethodException ex2) {
                declaredMethod2 = method;
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                    declaredMethod2 = method;
                }
            }
        }
        b = declaredMethod2;
    }
    
    public static int a(Context ex, final JobInfo jobInfo, String s, final String s2) {
        s = (String)((Context)ex).getSystemService("jobscheduler");
        Objects.requireNonNull(s);
        if (v0.a != null && ((Context)ex).checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            ex = (InvocationTargetException)v0.b;
            final int n = 0;
            int intValue = 0;
            Label_0098: {
                Label_0095: {
                    if (ex != null) {
                        try {
                            ex = (InvocationTargetException)((Method)ex).invoke(UserHandle.class, new Object[0]);
                            if (ex != null) {
                                intValue = (int)ex;
                                break Label_0098;
                            }
                            break Label_0095;
                        }
                        catch (InvocationTargetException ex) {}
                        catch (IllegalAccessException ex2) {}
                        if (Log.isLoggable("JobSchedulerCompat", 6)) {
                            Log.e("JobSchedulerCompat", "myUserId invocation illegal", (Throwable)ex);
                        }
                    }
                }
                intValue = 0;
            }
            ex = (InvocationTargetException)v0.a;
            if (ex != null) {
                try {
                    ex = (InvocationTargetException)((Method)ex).invoke(s, jobInfo, "com.google.android.gms", intValue, "UploadAlarm");
                    int n2 = n;
                    if (ex != null) {
                        n2 = (int)ex;
                        return n2;
                    }
                    return n2;
                }
                catch (InvocationTargetException ex) {}
                catch (IllegalAccessException ex3) {}
                Log.e("UploadAlarm", "error calling scheduleAsPackage", (Throwable)ex);
            }
            return ((JobScheduler)s).schedule(jobInfo);
        }
        return ((JobScheduler)s).schedule(jobInfo);
    }
}
