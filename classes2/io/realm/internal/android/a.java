// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.android;

import c6.h;
import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class a implements io.realm.internal.a
{
    @SuppressFBWarnings({ "MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL" })
    public static boolean c = false;
    private final Looper a;
    private final boolean b;
    
    public a() {
        this.a = Looper.myLooper();
        this.b = e();
    }
    
    private boolean d() {
        return this.a != null;
    }
    
    private static boolean e() {
        final String name = Thread.currentThread().getName();
        return name != null && name.startsWith("IntentService[");
    }
    
    @Override
    public boolean a() {
        return this.d() && !this.b;
    }
    
    @Override
    public boolean b() {
        final Looper a = this.a;
        return a != null && (io.realm.internal.android.a.c || a == Looper.getMainLooper());
    }
    
    @Override
    public void c(@h final String s) {
        final boolean d = this.d();
        String s2 = "";
        if (!d) {
            if (s != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(" ");
                sb.append("Realm cannot be automatically updated on a thread without a looper.");
                s2 = sb.toString();
            }
            throw new IllegalStateException(s2);
        }
        if (this.b) {
            if (s != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append(" ");
                sb2.append("Realm cannot be automatically updated on an IntentService thread.");
                s2 = sb2.toString();
            }
            throw new IllegalStateException(s2);
        }
    }
}
