// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import androidx.core.graphics.a;
import androidx.core.view.i;
import android.graphics.Rect;
import android.util.Log;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.graphics.Bitmap;
import androidx.annotation.j0;
import android.content.res.Resources;

public final class h
{
    private static final String a = "RoundedBitmapDrawableFa";
    
    private h() {
    }
    
    @j0
    public static g a(@j0 final Resources resources, @k0 final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT >= 21) {
            return new f(resources, bitmap);
        }
        return new a(resources, bitmap);
    }
    
    @j0
    public static g b(@j0 final Resources resources, @j0 final InputStream obj) {
        final g a = a(resources, BitmapFactory.decodeStream(obj));
        if (a.b() == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("RoundedBitmapDrawable cannot decode ");
            sb.append(obj);
            Log.w("RoundedBitmapDrawableFa", sb.toString());
        }
        return a;
    }
    
    @j0
    public static g c(@j0 final Resources resources, @j0 final String str) {
        final g a = a(resources, BitmapFactory.decodeFile(str));
        if (a.b() == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("RoundedBitmapDrawable cannot decode ");
            sb.append(str);
            Log.w("RoundedBitmapDrawableFa", sb.toString());
        }
        return a;
    }
    
    private static class a extends g
    {
        a(final Resources resources, final Bitmap bitmap) {
            super(resources, bitmap);
        }
        
        @Override
        void f(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
            androidx.core.view.i.b(n, n2, n3, rect, rect2, 0);
        }
        
        @Override
        public boolean h() {
            final Bitmap a = super.a;
            return a != null && androidx.core.graphics.a.b(a);
        }
        
        @Override
        public void o(final boolean b) {
            final Bitmap a = super.a;
            if (a != null) {
                androidx.core.graphics.a.c(a, b);
                this.invalidateSelf();
            }
        }
    }
}
