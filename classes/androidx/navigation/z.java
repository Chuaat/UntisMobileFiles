// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.util.regex.Pattern;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.content.Intent;
import android.net.Uri;

public class z
{
    private final Uri a;
    private final String b;
    private final String c;
    
    z(@j0 final Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }
    
    z(@k0 final Uri a, @k0 final String b, @k0 final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @k0
    public String a() {
        return this.b;
    }
    
    @k0
    public String b() {
        return this.c;
    }
    
    @k0
    public Uri c() {
        return this.a;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.a != null) {
            sb.append(" uri=");
            sb.append(this.a.toString());
        }
        if (this.b != null) {
            sb.append(" action=");
            sb.append(this.b);
        }
        if (this.c != null) {
            sb.append(" mimetype=");
            sb.append(this.c);
        }
        sb.append(" }");
        return sb.toString();
    }
    
    public static final class a
    {
        private Uri a;
        private String b;
        private String c;
        
        private a() {
        }
        
        @j0
        public static a b(@j0 final String s) {
            if (!s.isEmpty()) {
                final a a = new a();
                a.e(s);
                return a;
            }
            throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
        }
        
        @j0
        public static a c(@j0 final String s) {
            final a a = new a();
            a.f(s);
            return a;
        }
        
        @j0
        public static a d(@j0 final Uri uri) {
            final a a = new a();
            a.g(uri);
            return a;
        }
        
        @j0
        public z a() {
            return new z(this.a, this.b, this.c);
        }
        
        @j0
        public a e(@j0 final String b) {
            if (!b.isEmpty()) {
                this.b = b;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
        }
        
        @j0
        public a f(@j0 final String str) {
            if (Pattern.compile("^[-\\w*.]+/[-\\w+*.]+$").matcher(str).matches()) {
                this.c = str;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("The given mimeType ");
            sb.append(str);
            sb.append(" does not match to required \"type/subtype\" format");
            throw new IllegalArgumentException(sb.toString());
        }
        
        @j0
        public a g(@j0 final Uri a) {
            this.a = a;
            return this;
        }
    }
}
