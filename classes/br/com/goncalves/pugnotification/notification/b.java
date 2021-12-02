// 
// Decompiled by Procyon v0.5.36
// 

package br.com.goncalves.pugnotification.notification;

import androidx.annotation.s;
import android.os.Looper;
import android.graphics.Bitmap;
import androidx.core.app.r;
import android.text.Spanned;
import android.widget.RemoteViews;
import android.annotation.TargetApi;

@TargetApi(16)
public class b extends a implements p1.b
{
    private static final String o = "b";
    private RemoteViews f;
    private String g;
    private String h;
    private Spanned i;
    private String j;
    private int k;
    private int l;
    private int m;
    private p1.a n;
    
    public b(final r.g g, final int n, final String g2, final String h, final Spanned i, final int k, final String s) {
        super(g, n, s);
        this.f = new RemoteViews(br.com.goncalves.pugnotification.notification.e.d.a.getPackageName(), n1.b.f.a);
        this.g = g2;
        this.h = h;
        this.i = i;
        this.k = k;
        this.m = n1.b.d.b;
        this.i();
    }
    
    private void i() {
        this.o();
        this.l();
        this.n();
    }
    
    private void j() {
        this.f.setImageViewResource(n1.b.e.c, this.m);
        final String j = this.j;
        if (j != null) {
            this.n.a(j, this);
        }
        else {
            this.n.b(this.l, this);
        }
    }
    
    private void l() {
        final Spanned i = this.i;
        if (i != null) {
            this.f.setTextViewText(n1.b.e.e, (CharSequence)i);
        }
        else {
            this.f.setTextViewText(n1.b.e.e, (CharSequence)this.h);
        }
    }
    
    private void n() {
        if (this.k <= 0) {
            this.f.setImageViewResource(n1.b.e.d, n1.b.d.a);
        }
        this.f.setImageViewResource(n1.b.e.d, this.k);
    }
    
    private void o() {
        this.f.setTextViewText(n1.b.e.f, (CharSequence)this.g);
    }
    
    @Override
    public void a(final Bitmap bitmap) {
        if (bitmap != null) {
            this.f.setImageViewBitmap(n1.b.e.c, bitmap);
            super.c();
            return;
        }
        throw new IllegalArgumentException("bitmap cannot be null");
    }
    
    @Override
    public void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.b();
            this.f(this.f);
            this.j();
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }
    
    public b g(@s final int l) {
        if (l <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        if (this.j == null) {
            this.l = l;
            return this;
        }
        throw new IllegalStateException("Background Already Set!");
    }
    
    public b h(final String j) {
        if (this.l > 0) {
            throw new IllegalStateException("Background Already Set!");
        }
        if (this.j != null) {
            throw new IllegalStateException("Background Already Set!");
        }
        if (j == null) {
            throw new IllegalArgumentException("Path Must Not Be Null!");
        }
        if (j.trim().length() == 0) {
            throw new IllegalArgumentException("Path Must Not Be Empty!");
        }
        if (this.n != null) {
            this.j = j;
            return this;
        }
        throw new IllegalStateException("You have to set an ImageLoader!");
    }
    
    public b k(final p1.a n) {
        this.n = n;
        return this;
    }
    
    public b m(@s final int m) {
        if (m > 0) {
            this.m = m;
            return this;
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
}
