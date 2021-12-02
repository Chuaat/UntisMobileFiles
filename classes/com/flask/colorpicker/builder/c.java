// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.builder;

import com.flask.colorpicker.renderer.d;
import com.flask.colorpicker.e;

public class c
{
    public static com.flask.colorpicker.renderer.c a(final e.c c) {
        final int n = c$a.a[c.ordinal()];
        if (n == 1) {
            return new com.flask.colorpicker.renderer.e();
        }
        if (n == 2) {
            return new d();
        }
        throw new IllegalArgumentException("wrong WHEEL_TYPE");
    }
}
