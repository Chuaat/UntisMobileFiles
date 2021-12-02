// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.text.TextUtils;
import android.content.ComponentName;
import android.provider.Settings$Secure;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import androidx.annotation.j0;
import android.content.ContentResolver;
import android.content.Context;

class i implements f.a
{
    private static final String c = "MediaSessionManager";
    private static final boolean d;
    private static final String e = "android.permission.STATUS_BAR_SERVICE";
    private static final String f = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final String g = "enabled_notification_listeners";
    Context a;
    ContentResolver b;
    
    static {
        d = androidx.media.f.c;
    }
    
    i(final Context a) {
        this.a = a;
        this.b = a.getContentResolver();
    }
    
    private boolean c(final c c, final String s) {
        final int b = c.b();
        final boolean b2 = true;
        boolean b3 = true;
        if (b < 0) {
            if (this.a.getPackageManager().checkPermission(s, c.x()) != 0) {
                b3 = false;
            }
            return b3;
        }
        return this.a.checkPermission(s, c.b(), c.a()) == 0 && b2;
    }
    
    @Override
    public boolean a(@j0 final c c) {
        boolean b = false;
        try {
            if (this.a.getPackageManager().getApplicationInfo(c.x(), 0) == null) {
                return false;
            }
            if (this.c(c, "android.permission.STATUS_BAR_SERVICE") || this.c(c, "android.permission.MEDIA_CONTENT_CONTROL") || c.a() == 1000 || this.b(c)) {
                b = true;
            }
            return b;
        }
        catch (PackageManager$NameNotFoundException ex) {
            if (i.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Package ");
                sb.append(c.x());
                sb.append(" doesn't exist");
                Log.d("MediaSessionManager", sb.toString());
            }
            return false;
        }
    }
    
    boolean b(@j0 final c c) {
        final String string = Settings$Secure.getString(this.b, "enabled_notification_listeners");
        if (string != null) {
            final String[] split = string.split(":");
            for (int i = 0; i < split.length; ++i) {
                final ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(c.x())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public Context getContext() {
        return this.a;
    }
    
    static class a implements c
    {
        private String a;
        private int b;
        private int c;
        
        a(final String a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public int a() {
            return this.c;
        }
        
        @Override
        public int b() {
            return this.b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = true;
            boolean b2 = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            if (this.b >= 0 && a.b >= 0) {
                if (!TextUtils.equals((CharSequence)this.a, (CharSequence)a.a) || this.b != a.b || this.c != a.c) {
                    b2 = false;
                }
                return b2;
            }
            return TextUtils.equals((CharSequence)this.a, (CharSequence)a.a) && this.c == a.c && b;
        }
        
        @Override
        public int hashCode() {
            return androidx.core.util.i.b(this.a, this.c);
        }
        
        @Override
        public String x() {
            return this.a;
        }
    }
}
