// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.r0;

class t0 implements a<r0>
{
    public void b(final r0 r0, final y0 y0) {
        String replace;
        if (r0.Y0().equals("")) {
            replace = "(?:)";
        }
        else {
            replace = r0.Y0().replace("/", "\\/");
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(replace);
        sb.append("/");
        sb.append(r0.X0());
        y0.d(sb.toString());
    }
}
