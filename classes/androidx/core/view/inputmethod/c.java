// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.inputmethod;

import android.view.inputmethod.InputContentInfo;
import androidx.annotation.p0;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.content.ClipDescription;
import androidx.annotation.j0;
import android.net.Uri;

public final class c
{
    private final c a;
    
    public c(@j0 final Uri uri, @j0 final ClipDescription clipDescription, @k0 final Uri uri2) {
        c a;
        if (Build$VERSION.SDK_INT >= 25) {
            a = new a(uri, clipDescription, uri2);
        }
        else {
            a = new b(uri, clipDescription, uri2);
        }
        this.a = a;
    }
    
    private c(@j0 final c a) {
        this.a = a;
    }
    
    @k0
    public static c g(@k0 final Object o) {
        if (o == null) {
            return null;
        }
        if (Build$VERSION.SDK_INT < 25) {
            return null;
        }
        return new c((c)new a(o));
    }
    
    @j0
    public Uri a() {
        return this.a.a();
    }
    
    @j0
    public ClipDescription b() {
        return this.a.getDescription();
    }
    
    @k0
    public Uri c() {
        return this.a.c();
    }
    
    public void d() {
        this.a.e();
    }
    
    public void e() {
        this.a.b();
    }
    
    @k0
    public Object f() {
        return this.a.d();
    }
    
    @p0(25)
    private static final class a implements c
    {
        @j0
        final InputContentInfo a;
        
        a(@j0 final Uri uri, @j0 final ClipDescription clipDescription, @k0 final Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
        
        a(@j0 final Object o) {
            this.a = (InputContentInfo)o;
        }
        
        @j0
        @Override
        public Uri a() {
            return this.a.getContentUri();
        }
        
        @Override
        public void b() {
            this.a.requestPermission();
        }
        
        @k0
        @Override
        public Uri c() {
            return this.a.getLinkUri();
        }
        
        @k0
        @Override
        public Object d() {
            return this.a;
        }
        
        @Override
        public void e() {
            this.a.releasePermission();
        }
        
        @j0
        @Override
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }
    
    private static final class b implements c
    {
        @j0
        private final Uri a;
        @j0
        private final ClipDescription b;
        @k0
        private final Uri c;
        
        b(@j0 final Uri a, @j0 final ClipDescription b, @k0 final Uri c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @j0
        @Override
        public Uri a() {
            return this.a;
        }
        
        @Override
        public void b() {
        }
        
        @k0
        @Override
        public Uri c() {
            return this.c;
        }
        
        @k0
        @Override
        public Object d() {
            return null;
        }
        
        @Override
        public void e() {
        }
        
        @j0
        @Override
        public ClipDescription getDescription() {
            return this.b;
        }
    }
    
    private interface c
    {
        @j0
        Uri a();
        
        void b();
        
        @k0
        Uri c();
        
        @k0
        Object d();
        
        void e();
        
        @j0
        ClipDescription getDescription();
    }
}
