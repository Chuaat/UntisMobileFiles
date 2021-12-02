// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import com.bumptech.glide.request.target.p;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;
import android.content.ComponentCallbacks;
import java.util.Collections;
import androidx.annotation.b1;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.view.View;
import android.app.Fragment;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Resources;
import java.net.URL;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.model.u;
import java.io.File;
import com.bumptech.glide.load.resource.bitmap.c0;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.resource.gif.h;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.resource.bitmap.h0;
import com.bumptech.glide.load.model.v;
import android.content.res.AssetFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.a0;
import android.os.ParcelFileDescriptor;
import android.graphics.Bitmap;
import java.io.InputStream;
import com.bumptech.glide.load.model.c;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.resource.bitmap.f0;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.gif.a;
import com.bumptech.glide.load.resource.bitmap.t;
import android.os.Build$VERSION;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.o;
import java.util.ArrayList;
import com.bumptech.glide.request.g;
import java.util.Map;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.w;
import androidx.annotation.k0;
import java.util.List;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.k;
import android.content.ComponentCallbacks2;

public class b implements ComponentCallbacks2
{
    private static final String S = "image_manager_disk_cache";
    private static final String T = "Glide";
    private static volatile b U;
    private static volatile boolean V;
    private final k G;
    private final e H;
    private final j I;
    private final d J;
    private final com.bumptech.glide.j K;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b L;
    private final l M;
    private final com.bumptech.glide.manager.d N;
    private final List<com.bumptech.glide.l> O;
    private final a P;
    private f Q;
    @k0
    @w("this")
    private com.bumptech.glide.load.engine.prefill.b R;
    
    b(@j0 final Context context, @j0 final k g, @j0 final j i, @j0 final e h, @j0 final com.bumptech.glide.load.engine.bitmap_recycle.b l, @j0 final l m, @j0 final com.bumptech.glide.manager.d n, final int n2, @j0 final a p13, @j0 final Map<Class<?>, m<?, ?>> map, @j0 final List<g<Object>> list, final boolean b, final boolean b2) {
        this.O = new ArrayList<com.bumptech.glide.l>();
        this.Q = f.I;
        this.G = g;
        this.H = h;
        this.L = l;
        this.I = i;
        this.M = m;
        this.N = n;
        this.P = p13;
        final Resources resources = context.getResources();
        final com.bumptech.glide.j k = new com.bumptech.glide.j();
        (this.K = k).t(new o());
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 27) {
            k.t(new t());
        }
        final List<ImageHeaderParser> g2 = k.g();
        final com.bumptech.glide.load.resource.gif.a a = new com.bumptech.glide.load.resource.gif.a(context, g2, h, l);
        final com.bumptech.glide.load.l<ParcelFileDescriptor, Bitmap> h2 = com.bumptech.glide.load.resource.bitmap.j0.h(h);
        final q q = new q(k.g(), resources.getDisplayMetrics(), h, l);
        com.bumptech.glide.load.l<InputStream, Bitmap> j;
        com.bumptech.glide.load.l<ByteBuffer, Bitmap> l2;
        if (b2 && sdk_INT >= 28) {
            j = new y();
            l2 = new com.bumptech.glide.load.resource.bitmap.k();
        }
        else {
            l2 = new com.bumptech.glide.load.resource.bitmap.j(q);
            j = new f0(q, l);
        }
        final com.bumptech.glide.load.resource.drawable.e e = new com.bumptech.glide.load.resource.drawable.e(context);
        final s.c c = new s.c(resources);
        final s.d d = new s.d(resources);
        final s.b b3 = new s.b(resources);
        final s.a a2 = new s.a(resources);
        final com.bumptech.glide.load.resource.bitmap.e e2 = new com.bumptech.glide.load.resource.bitmap.e(l);
        final com.bumptech.glide.load.resource.transcode.a a3 = new com.bumptech.glide.load.resource.transcode.a();
        final com.bumptech.glide.load.resource.transcode.d d2 = new com.bumptech.glide.load.resource.transcode.d();
        final ContentResolver contentResolver = context.getContentResolver();
        k.a(ByteBuffer.class, new c()).a(InputStream.class, new com.bumptech.glide.load.model.t(l)).e("Bitmap", ByteBuffer.class, Bitmap.class, l2).e("Bitmap", InputStream.class, Bitmap.class, j);
        if (com.bumptech.glide.load.data.m.c()) {
            k.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new a0(q));
        }
        k.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h2).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, com.bumptech.glide.load.resource.bitmap.j0.c(h)).d(Bitmap.class, Bitmap.class, (com.bumptech.glide.load.model.o<Bitmap, Bitmap>)v.a.b()).e("Bitmap", Bitmap.class, Bitmap.class, new h0()).b(Bitmap.class, e2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a<ByteBuffer>(resources, l2)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a<InputStream>(resources, j)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a<ParcelFileDescriptor>(resources, h2)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(h, e2)).e("Gif", InputStream.class, com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.j(g2, a, l)).e("Gif", ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, a).b(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d()).d(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, (com.bumptech.glide.load.model.o<com.bumptech.glide.gifdecoder.a, com.bumptech.glide.gifdecoder.a>)v.a.b()).e("Bitmap", com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new h(h)).c(Uri.class, Drawable.class, e).c(Uri.class, Bitmap.class, new c0(e, h)).u(new u1.a.a()).d(File.class, ByteBuffer.class, new com.bumptech.glide.load.model.d.b()).d(File.class, InputStream.class, new com.bumptech.glide.load.model.f.e()).c(File.class, File.class, new v1.a()).d(File.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.f.b()).d(File.class, File.class, (com.bumptech.glide.load.model.o<File, File>)v.a.b()).u(new com.bumptech.glide.load.data.k.a(l));
        if (com.bumptech.glide.load.data.m.c()) {
            k.u(new com.bumptech.glide.load.data.m.a());
        }
        final Class<Integer> type = Integer.TYPE;
        k.d((Class<Object>)type, InputStream.class, (com.bumptech.glide.load.model.o<Object, InputStream>)c).d((Class<Object>)type, ParcelFileDescriptor.class, (com.bumptech.glide.load.model.o<Object, ParcelFileDescriptor>)b3).d(Integer.class, InputStream.class, c).d(Integer.class, ParcelFileDescriptor.class, b3).d(Integer.class, Uri.class, d).d((Class<Object>)type, AssetFileDescriptor.class, (com.bumptech.glide.load.model.o<Object, AssetFileDescriptor>)a2).d(Integer.class, AssetFileDescriptor.class, a2).d((Class<Object>)type, Uri.class, (com.bumptech.glide.load.model.o<Object, Uri>)d).d(String.class, InputStream.class, new com.bumptech.glide.load.model.e.c<String>()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.e.c<Uri>()).d(String.class, InputStream.class, new u.c()).d(String.class, ParcelFileDescriptor.class, new u.b()).d(String.class, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.c.a()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.a.b(context.getAssets())).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.d.a(context)).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.e.a(context));
        if (sdk_INT >= 29) {
            k.d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.f.c(context));
            k.d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.stream.f.b(context));
        }
        k.d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.w.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.w.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new com.bumptech.glide.load.model.w.a(contentResolver)).d(Uri.class, InputStream.class, new x.a()).d(URL.class, InputStream.class, new com.bumptech.glide.load.model.stream.g.a()).d(Uri.class, File.class, new com.bumptech.glide.load.model.k.a(context)).d(com.bumptech.glide.load.model.g.class, InputStream.class, new com.bumptech.glide.load.model.stream.b.a()).d(byte[].class, ByteBuffer.class, new com.bumptech.glide.load.model.b.a()).d(byte[].class, InputStream.class, new com.bumptech.glide.load.model.b.d()).d(Uri.class, Uri.class, (com.bumptech.glide.load.model.o<Uri, Uri>)v.a.b()).d(Drawable.class, Drawable.class, (com.bumptech.glide.load.model.o<Drawable, Drawable>)v.a.b()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.resource.drawable.f()).x(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.transcode.b(resources)).x(Bitmap.class, byte[].class, a3).x(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(h, a3, d2)).x(com.bumptech.glide.load.resource.gif.c.class, byte[].class, d2);
        if (sdk_INT >= 23) {
            final com.bumptech.glide.load.l<ByteBuffer, Bitmap> d3 = com.bumptech.glide.load.resource.bitmap.j0.d(h);
            k.c(ByteBuffer.class, Bitmap.class, d3);
            k.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a<ByteBuffer>(resources, (com.bumptech.glide.load.l<Object, Bitmap>)d3));
        }
        this.J = new d(context, l, k, new com.bumptech.glide.request.target.k(), p13, map, list, g, b, n2);
    }
    
    @j0
    public static com.bumptech.glide.l B(@j0 final Activity activity) {
        return o((Context)activity).i(activity);
    }
    
    @Deprecated
    @j0
    public static com.bumptech.glide.l C(@j0 final Fragment fragment) {
        return o((Context)fragment.getActivity()).j(fragment);
    }
    
    @j0
    public static com.bumptech.glide.l D(@j0 final Context context) {
        return o(context).k(context);
    }
    
    @j0
    public static com.bumptech.glide.l E(@j0 final View view) {
        return o(view.getContext()).l(view);
    }
    
    @j0
    public static com.bumptech.glide.l F(@j0 final androidx.fragment.app.Fragment fragment) {
        return o(fragment.getContext()).m(fragment);
    }
    
    @j0
    public static com.bumptech.glide.l G(@j0 final androidx.fragment.app.d d) {
        return o((Context)d).n(d);
    }
    
    @w("Glide.class")
    private static void a(@j0 final Context context, @k0 final GeneratedAppGlideModule generatedAppGlideModule) {
        if (!b.V) {
            b.V = true;
            r(context, generatedAppGlideModule);
            b.V = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }
    
    @j0
    public static b d(@j0 final Context context) {
        if (b.U == null) {
            final GeneratedAppGlideModule e = e(context.getApplicationContext());
            synchronized (b.class) {
                if (b.U == null) {
                    a(context, e);
                }
            }
        }
        return b.U;
    }
    
    @k0
    private static GeneratedAppGlideModule e(Context ex) {
        try {
            ex = (InvocationTargetException)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(((Context)ex).getApplicationContext());
            return (GeneratedAppGlideModule)ex;
        }
        catch (InvocationTargetException ex) {
            goto Label_0052;
        }
        catch (NoSuchMethodException ex) {
            goto Label_0052;
        }
        catch (IllegalAccessException ex) {
            goto Label_0052;
        }
        catch (InstantiationException ex2) {}
        catch (ClassNotFoundException ex3) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        }
        ex = null;
        return (GeneratedAppGlideModule)ex;
    }
    
    @k0
    public static File k(@j0 final Context context) {
        return l(context, "image_manager_disk_cache");
    }
    
    @k0
    public static File l(@j0 final Context context, @j0 final String child) {
        final File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable("Glide", 6)) {
                Log.e("Glide", "default disk cache dir is null");
            }
            return null;
        }
        final File file = new File(cacheDir, child);
        if (!file.mkdirs() && (!file.exists() || !file.isDirectory())) {
            return null;
        }
        return file;
    }
    
    @j0
    private static l o(@k0 final Context context) {
        com.bumptech.glide.util.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).n();
    }
    
    @b1
    public static void p(@j0 final Context context, @j0 final com.bumptech.glide.c c) {
        final GeneratedAppGlideModule e = e(context);
        synchronized (b.class) {
            if (b.U != null) {
                x();
            }
            s(context, c, e);
        }
    }
    
    @Deprecated
    @b1
    public static void q(final b u) {
        synchronized (b.class) {
            if (b.U != null) {
                x();
            }
            b.U = u;
        }
    }
    
    @w("Glide.class")
    private static void r(@j0 final Context context, @k0 final GeneratedAppGlideModule generatedAppGlideModule) {
        s(context, new com.bumptech.glide.c(), generatedAppGlideModule);
    }
    
    @w("Glide.class")
    private static void s(@j0 Context context, @j0 final com.bumptech.glide.c c, @k0 final GeneratedAppGlideModule generatedAppGlideModule) {
        final Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.module.c> list = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            list = new com.bumptech.glide.module.e(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            final Set<Class<?>> d = generatedAppGlideModule.d();
            final Iterator<com.bumptech.glide.module.c> iterator = list.iterator();
            while (iterator.hasNext()) {
                final com.bumptech.glide.module.c obj = iterator.next();
                if (!d.contains(obj.getClass())) {
                    continue;
                }
                if (Log.isLoggable("Glide", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("AppGlideModule excludes manifest GlideModule: ");
                    sb.append(obj);
                    Log.d("Glide", sb.toString());
                }
                iterator.remove();
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (final com.bumptech.glide.module.c c2 : list) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(c2.getClass());
                Log.d("Glide", sb2.toString());
            }
        }
        l.b e;
        if (generatedAppGlideModule != null) {
            e = generatedAppGlideModule.e();
        }
        else {
            e = null;
        }
        c.t(e);
        final Iterator<com.bumptech.glide.module.c> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().a(applicationContext, c);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, c);
        }
        final b b = c.b(applicationContext);
        final Iterator<com.bumptech.glide.module.c> iterator4 = list.iterator();
        while (iterator4.hasNext()) {
            context = (Context)iterator4.next();
            try {
                ((com.bumptech.glide.module.c)context).b(applicationContext, b, b.K);
                continue;
            }
            catch (AbstractMethodError cause) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                sb3.append(context.getClass().getName());
                throw new IllegalStateException(sb3.toString(), cause);
            }
            break;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, b, b.K);
        }
        applicationContext.registerComponentCallbacks((ComponentCallbacks)b);
        com.bumptech.glide.b.U = b;
    }
    
    @b1
    public static void x() {
        synchronized (b.class) {
            if (b.U != null) {
                b.U.i().getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks)b.U);
                b.U.G.m();
            }
            b.U = null;
        }
    }
    
    private static void y(final Exception cause) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", cause);
    }
    
    void A(final com.bumptech.glide.l l) {
        synchronized (this.O) {
            if (this.O.contains(l)) {
                this.O.remove(l);
                return;
            }
            throw new IllegalStateException("Cannot unregister not yet registered manager");
        }
    }
    
    public void b() {
        com.bumptech.glide.util.m.a();
        this.G.e();
    }
    
    public void c() {
        com.bumptech.glide.util.m.b();
        this.I.b();
        this.H.b();
        this.L.b();
    }
    
    @j0
    public com.bumptech.glide.load.engine.bitmap_recycle.b f() {
        return this.L;
    }
    
    @j0
    public e g() {
        return this.H;
    }
    
    com.bumptech.glide.manager.d h() {
        return this.N;
    }
    
    @j0
    public Context i() {
        return this.J.getBaseContext();
    }
    
    @j0
    d j() {
        return this.J;
    }
    
    @j0
    public com.bumptech.glide.j m() {
        return this.K;
    }
    
    @j0
    public l n() {
        return this.M;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
    }
    
    public void onLowMemory() {
        this.c();
    }
    
    public void onTrimMemory(final int n) {
        this.z(n);
    }
    
    public void t(@j0 final com.bumptech.glide.load.engine.prefill.d.a... array) {
        synchronized (this) {
            if (this.R == null) {
                this.R = new com.bumptech.glide.load.engine.prefill.b(this.I, this.H, this.P.h().S().c(q.g));
            }
            this.R.c(array);
        }
    }
    
    void u(final com.bumptech.glide.l l) {
        synchronized (this.O) {
            if (!this.O.contains(l)) {
                this.O.add(l);
                return;
            }
            throw new IllegalStateException("Cannot register already registered manager");
        }
    }
    
    boolean v(@j0 final p<?> p) {
        synchronized (this.O) {
            final Iterator<com.bumptech.glide.l> iterator = this.O.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().b0(p)) {
                    return true;
                }
            }
            return false;
        }
    }
    
    @j0
    public f w(@j0 final f q) {
        com.bumptech.glide.util.m.b();
        this.I.c(q.b());
        this.H.c(q.b());
        final f q2 = this.Q;
        this.Q = q;
        return q2;
    }
    
    public void z(final int n) {
        com.bumptech.glide.util.m.b();
        final Iterator<com.bumptech.glide.l> iterator = this.O.iterator();
        while (iterator.hasNext()) {
            iterator.next().onTrimMemory(n);
        }
        this.I.a(n);
        this.H.a(n);
        this.L.a(n);
    }
    
    public interface a
    {
        @j0
        com.bumptech.glide.request.h h();
    }
}
