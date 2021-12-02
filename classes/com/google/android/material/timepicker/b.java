// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import android.text.Spanned;
import android.text.InputFilter;

class b implements InputFilter
{
    private int a;
    
    public b(final int a) {
        this.a = a;
    }
    
    public int a() {
        return this.a;
    }
    
    public void b(final int a) {
        this.a = a;
    }
    
    public CharSequence filter(final CharSequence charSequence, int int1, int a, final Spanned seq, final int start, final int end) {
        try {
            final StringBuilder sb = new StringBuilder((CharSequence)seq);
            sb.replace(start, end, charSequence.subSequence(int1, a).toString());
            int1 = Integer.parseInt(sb.toString());
            a = this.a;
            if (int1 <= a) {
                return null;
            }
            return "";
        }
        catch (NumberFormatException ex) {
            return "";
        }
    }
}
