// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.f;
import android.os.Environment;
import java.io.File;
import android.content.Context;

public class i implements h
{
    public static final String b = ".com.google.firebase.crashlytics";
    private final Context a;
    
    public i(final Context a) {
        this.a = a;
    }
    
    @Override
    public String a() {
        return new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }
    
    @Override
    public File b() {
        return this.d(new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }
    
    boolean c() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            f.f().m("External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
            return false;
        }
        return true;
    }
    
    File d(final File file) {
        f f;
        String s;
        if (file != null) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            f = com.google.firebase.crashlytics.internal.f.f();
            s = "Couldn't create file";
        }
        else {
            f = com.google.firebase.crashlytics.internal.f.f();
            s = "Null File";
        }
        f.m(s);
        return null;
    }
}
