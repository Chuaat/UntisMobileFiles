// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import android.content.ComponentName;
import m6.a;
import kotlin.jvm.internal.k0;
import androidx.annotation.y;
import android.net.Uri;
import android.app.Activity;
import org.jetbrains.annotations.f;
import android.content.Context;
import kotlin.Metadata;

@c0
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR$\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b$\u0010\n¨\u0006," }, d2 = { "Landroidx/navigation/e;", "Landroidx/navigation/b0;", "Landroidx/navigation/d$a;", "j", "", "l", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "dataPattern", "Landroid/net/Uri;", "k", "Landroid/net/Uri;", "m", "()Landroid/net/Uri;", "r", "(Landroid/net/Uri;)V", "data", "Lkotlin/reflect/d;", "Landroid/app/Activity;", "i", "Lkotlin/reflect/d;", "()Lkotlin/reflect/d;", "q", "(Lkotlin/reflect/d;)V", "activityClass", "Landroid/content/Context;", "g", "Landroid/content/Context;", "context", "h", "o", "t", "targetPackage", "p", "action", "Landroidx/navigation/d;", "navigator", "", "id", "<init>", "(Landroidx/navigation/d;I)V", "navigation-runtime-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class e extends b0<d.a>
{
    private final Context g;
    @f
    private String h;
    @f
    private kotlin.reflect.d<? extends Activity> i;
    @f
    private String j;
    @f
    private Uri k;
    @f
    private String l;
    
    public e(@org.jetbrains.annotations.e final d d, @y final int n) {
        k0.q((Object)d, "navigator");
        super(d, n);
        final Context h = d.h();
        k0.h((Object)h, "navigator.context");
        this.g = h;
    }
    
    @org.jetbrains.annotations.e
    public d.a j() {
        final d.a a = super.c();
        a.X(this.h);
        final kotlin.reflect.d<? extends Activity> i = this.i;
        if (i != null) {
            a.R(new ComponentName(this.g, m6.a.c((kotlin.reflect.d)i)));
        }
        a.P(this.j);
        a.S(this.k);
        a.U(this.l);
        return a;
    }
    
    @f
    public final String k() {
        return this.j;
    }
    
    @f
    public final kotlin.reflect.d<? extends Activity> l() {
        return this.i;
    }
    
    @f
    public final Uri m() {
        return this.k;
    }
    
    @f
    public final String n() {
        return this.l;
    }
    
    @f
    public final String o() {
        return this.h;
    }
    
    public final void p(@f final String j) {
        this.j = j;
    }
    
    public final void q(@f final kotlin.reflect.d<? extends Activity> i) {
        this.i = i;
    }
    
    public final void r(@f final Uri k) {
        this.k = k;
    }
    
    public final void s(@f final String l) {
        this.l = l;
    }
    
    public final void t(@f final String h) {
        this.h = h;
    }
}
