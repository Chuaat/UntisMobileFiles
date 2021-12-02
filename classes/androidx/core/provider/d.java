// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.t0;
import androidx.annotation.k0;
import androidx.core.util.n;
import androidx.annotation.e;
import androidx.annotation.j0;
import java.util.List;

public final class d
{
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;
    
    public d(@j0 final String s, @j0 final String s2, @j0 final String s3, @e final int e) {
        this.a = n.g(s);
        this.b = n.g(s2);
        this.c = n.g(s3);
        this.d = null;
        n.a(e != 0);
        this.e = e;
        this.f = this.a(s, s2, s3);
    }
    
    public d(@j0 final String s, @j0 final String s2, @j0 final String s3, @j0 final List<List<byte[]>> list) {
        this.a = n.g(s);
        this.b = n.g(s2);
        this.c = n.g(s3);
        this.d = n.g(list);
        this.e = 0;
        this.f = this.a(s, s2, s3);
    }
    
    private String a(@j0 final String str, @j0 final String str2, @j0 final String str3) {
        final StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        return sb.toString();
    }
    
    @k0
    public List<List<byte[]>> b() {
        return this.d;
    }
    
    @e
    public int c() {
        return this.e;
    }
    
    @j0
    @t0({ t0.a.G })
    String d() {
        return this.f;
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public String e() {
        return this.f;
    }
    
    @j0
    public String f() {
        return this.a;
    }
    
    @j0
    public String g() {
        return this.b;
    }
    
    @j0
    public String h() {
        return this.c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.b);
        sb2.append(", mQuery: ");
        sb2.append(this.c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List<byte[]> list = this.d.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
