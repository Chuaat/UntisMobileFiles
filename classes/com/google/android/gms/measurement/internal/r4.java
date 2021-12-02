// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.k0;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import com.google.android.gms.common.o;
import android.content.Context;

public final class r4
{
    public static String a(Context context) {
        try {
            context = (Context)context.getResources().getResourcePackageName(o.b.a);
        }
        catch (Resources$NotFoundException ex) {
            context = (Context)context.getPackageName();
        }
        return (String)context;
    }
    
    @k0
    public static final String b(String string, final Resources resources, final String s) {
        final int identifier = resources.getIdentifier(string, "string", s);
        string = null;
        if (identifier == 0) {
            return string;
        }
        try {
            string = resources.getString(identifier);
            return string;
        }
        catch (Resources$NotFoundException ex) {
            return string;
        }
    }
}
