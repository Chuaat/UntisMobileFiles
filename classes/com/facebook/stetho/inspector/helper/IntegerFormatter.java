// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.helper;

import android.annotation.TargetApi;
import androidx.annotation.k0;
import android.view.ViewDebug$ExportedProperty;
import android.os.Build$VERSION;

public class IntegerFormatter
{
    private static IntegerFormatter cachedFormatter;
    
    private IntegerFormatter() {
    }
    
    public static IntegerFormatter getInstance() {
        if (IntegerFormatter.cachedFormatter == null) {
            synchronized (IntegerFormatter.class) {
                if (IntegerFormatter.cachedFormatter == null) {
                    IntegerFormatter cachedFormatter;
                    if (Build$VERSION.SDK_INT >= 21) {
                        cachedFormatter = new IntegerFormatterWithHex();
                    }
                    else {
                        cachedFormatter = new IntegerFormatter();
                    }
                    IntegerFormatter.cachedFormatter = cachedFormatter;
                }
            }
        }
        return IntegerFormatter.cachedFormatter;
    }
    
    public String format(final Integer obj, @k0 final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
        return String.valueOf(obj);
    }
    
    private static class IntegerFormatterWithHex extends IntegerFormatter
    {
        private IntegerFormatterWithHex() {
            super(null);
        }
        
        @TargetApi(21)
        @Override
        public String format(final Integer n, @k0 final ViewDebug$ExportedProperty viewDebug$ExportedProperty) {
            if (viewDebug$ExportedProperty != null && viewDebug$ExportedProperty.formatToHexString()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("0x");
                sb.append(Integer.toHexString(n));
                return sb.toString();
            }
            return super.format(n, viewDebug$ExportedProperty);
        }
    }
}
