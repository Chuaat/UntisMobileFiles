// 
// Decompiled by Procyon v0.5.36
// 

package androidx.documentfile.provider;

import android.provider.DocumentsContract;
import androidx.annotation.k0;
import android.net.Uri;
import android.content.Context;
import androidx.annotation.p0;

@p0(19)
class d extends a
{
    private Context c;
    private Uri d;
    
    d(@k0 final a a, final Context c, final Uri d) {
        super(a);
        this.c = c;
        this.d = d;
    }
    
    @Override
    public boolean a() {
        return androidx.documentfile.provider.b.a(this.c, this.d);
    }
    
    @Override
    public boolean b() {
        return androidx.documentfile.provider.b.b(this.c, this.d);
    }
    
    @Override
    public a c(final String s) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public a d(final String s, final String s2) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    @Override
    public boolean f() {
        return androidx.documentfile.provider.b.d(this.c, this.d);
    }
    
    @k0
    @Override
    public String k() {
        return androidx.documentfile.provider.b.f(this.c, this.d);
    }
    
    @k0
    @Override
    public String m() {
        return androidx.documentfile.provider.b.h(this.c, this.d);
    }
    
    @Override
    public Uri n() {
        return this.d;
    }
    
    @Override
    public boolean o() {
        return androidx.documentfile.provider.b.i(this.c, this.d);
    }
    
    @Override
    public boolean q() {
        return androidx.documentfile.provider.b.j(this.c, this.d);
    }
    
    @Override
    public boolean r() {
        return androidx.documentfile.provider.b.k(this.c, this.d);
    }
    
    @Override
    public long s() {
        return androidx.documentfile.provider.b.l(this.c, this.d);
    }
    
    @Override
    public long t() {
        return androidx.documentfile.provider.b.m(this.c, this.d);
    }
    
    @Override
    public a[] u() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean v(final String s) {
        throw new UnsupportedOperationException();
    }
}
