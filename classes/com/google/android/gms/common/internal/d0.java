// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNullable;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class d0
{
    private d0() {
    }
    
    @RecentlyNullable
    @a
    public static String a(@RecentlyNonNull String attributeValue, @RecentlyNonNull final String s, @RecentlyNonNull final Context context, @RecentlyNonNull AttributeSet obj, @RecentlyNonNull final boolean b, @RecentlyNonNull final boolean b2, @RecentlyNonNull final String s2) {
        if (obj == null) {
            attributeValue = null;
        }
        else {
            attributeValue = obj.getAttributeValue(attributeValue, s);
        }
        String string = attributeValue;
        if (attributeValue != null) {
            string = attributeValue;
            if (attributeValue.startsWith("@string/")) {
                string = attributeValue;
                if (b) {
                    final String substring = attributeValue.substring(8);
                    final String packageName = context.getPackageName();
                    obj = (AttributeSet)new TypedValue();
                    try {
                        final Resources resources = context.getResources();
                        final StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(substring).length());
                        sb.append(packageName);
                        sb.append(":string/");
                        sb.append(substring);
                        resources.getValue(sb.toString(), (TypedValue)obj, true);
                    }
                    catch (Resources$NotFoundException ex) {
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 30 + attributeValue.length());
                        sb2.append("Could not find resource for ");
                        sb2.append(s);
                        sb2.append(": ");
                        sb2.append(attributeValue);
                        Log.w(s2, sb2.toString());
                    }
                    final CharSequence string2 = ((TypedValue)obj).string;
                    if (string2 != null) {
                        string = string2.toString();
                    }
                    else {
                        final String value = String.valueOf(obj);
                        final StringBuilder sb3 = new StringBuilder(String.valueOf(s).length() + 28 + value.length());
                        sb3.append("Resource ");
                        sb3.append(s);
                        sb3.append(" was not a string: ");
                        sb3.append(value);
                        Log.w(s2, sb3.toString());
                        string = attributeValue;
                    }
                }
            }
        }
        if (b2 && string == null) {
            final StringBuilder sb4 = new StringBuilder(String.valueOf(s).length() + 33);
            sb4.append("Required XML attribute \"");
            sb4.append(s);
            sb4.append("\" missing");
            Log.w(s2, sb4.toString());
        }
        return string;
    }
}
