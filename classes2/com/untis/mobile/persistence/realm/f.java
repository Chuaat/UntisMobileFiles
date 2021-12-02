// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import android.util.Log;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.CompactOnLaunchCallback;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/persistence/realm/f;", "Lio/realm/CompactOnLaunchCallback;", "", "totalBytes", "usedBytes", "", "shouldCompact", "", "a", "Ljava/lang/String;", "profileId", "b", "Z", "compactDone", "<init>", "(Ljava/lang/String;)V", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f implements CompactOnLaunchCallback
{
    @e
    public static final a c;
    private static final int d = 20971520;
    @e
    private final String a;
    private boolean b;
    
    static {
        c = new a(null);
    }
    
    public f(@e final String a) {
        k0.p(a, "profileId");
        this.a = a;
    }
    
    @Override
    public boolean shouldCompact(final long lng, final long lng2) {
        final boolean b = this.b;
        final boolean b2 = false;
        if (b) {
            return false;
        }
        final float f = lng2 / (float)lng;
        boolean b3 = b2;
        if (lng > 20971520L) {
            b3 = b2;
            if (f < 0.5) {
                b3 = true;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("should Compact ");
        sb.append(b3);
        sb.append(" for ");
        sb.append(this.a);
        sb.append(": total bytes - ");
        sb.append(lng);
        sb.append(", Used bytes - ");
        sb.append(lng2);
        sb.append(", MB Limit - 20971520, used vs total - ");
        sb.append(f);
        Log.d("untis_log", sb.toString());
        this.b = true;
        return b3;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/persistence/realm/f$a", "", "", "MB_LIMIT", "I", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
