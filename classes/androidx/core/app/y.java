// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.k0;
import java.util.HashSet;
import androidx.annotation.j0;
import java.util.HashMap;
import android.content.ClipDescription;
import androidx.annotation.p0;
import android.app.RemoteInput$Builder;
import java.util.Iterator;
import android.content.ClipData;
import android.app.RemoteInput;
import android.os.Build$VERSION;
import android.net.Uri;
import java.util.Map;
import android.content.Intent;
import java.util.Set;
import android.os.Bundle;

public final class y
{
    private static final String h = "RemoteInput";
    public static final String i = "android.remoteinput.results";
    public static final String j = "android.remoteinput.resultsData";
    private static final String k = "android.remoteinput.dataTypeResultsData";
    private static final String l = "android.remoteinput.resultsSource";
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final int e;
    private final Bundle f;
    private final Set<String> g;
    
    y(final String a, final CharSequence b, final CharSequence[] c, final boolean d, final int e, final Bundle f, final Set<String> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (this.k() == 2 && !this.f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
    
    public static void a(final y y, final Intent intent, final Map<String, Uri> map) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            RemoteInput.addDataResultToIntent(c(y), intent, (Map)map);
        }
        else if (sdk_INT >= 16) {
            Intent i;
            if ((i = i(intent)) == null) {
                i = new Intent();
            }
            for (final Map.Entry<String, Uri> entry : map.entrySet()) {
                final String s = entry.getKey();
                final Uri uri = entry.getValue();
                if (s == null) {
                    continue;
                }
                Bundle bundleExtra;
                if ((bundleExtra = i.getBundleExtra(l(s))) == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(y.o(), uri.toString());
                i.putExtra(l(s), bundleExtra);
            }
            intent.setClipData(ClipData.newIntent((CharSequence)"android.remoteinput.results", i));
        }
    }
    
    public static void b(final y[] array, final Intent intent, Bundle bundle) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            RemoteInput.addResultsToIntent(d(array), intent, bundle);
        }
        else {
            int i = 0;
            if (sdk_INT >= 20) {
                final Bundle p3 = p(intent);
                final int q = q(intent);
                if (p3 != null) {
                    p3.putAll(bundle);
                    bundle = p3;
                }
                for (final y y : array) {
                    final Map<String, Uri> k = j(intent, y.o());
                    RemoteInput.addResultsToIntent(d(new y[] { y }), intent, bundle);
                    if (k != null) {
                        a(y, intent, k);
                    }
                }
                s(intent, q);
            }
            else if (sdk_INT >= 16) {
                Intent l;
                if ((l = i(intent)) == null) {
                    l = new Intent();
                }
                Bundle bundleExtra;
                if ((bundleExtra = l.getBundleExtra("android.remoteinput.resultsData")) == null) {
                    bundleExtra = new Bundle();
                }
                while (i < array.length) {
                    final y y2 = array[i];
                    final Object value = bundle.get(y2.o());
                    if (value instanceof CharSequence) {
                        bundleExtra.putCharSequence(y2.o(), (CharSequence)value);
                    }
                    ++i;
                }
                l.putExtra("android.remoteinput.resultsData", bundleExtra);
                intent.setClipData(ClipData.newIntent((CharSequence)"android.remoteinput.results", l));
            }
        }
    }
    
    @p0(20)
    static RemoteInput c(final y y) {
        final RemoteInput$Builder addExtras = new RemoteInput$Builder(y.o()).setLabel(y.n()).setChoices(y.h()).setAllowFreeFormInput(y.f()).addExtras(y.m());
        if (Build$VERSION.SDK_INT >= 26) {
            final Set<String> g = y.g();
            if (g != null) {
                final Iterator<String> iterator = g.iterator();
                while (iterator.hasNext()) {
                    addExtras.setAllowDataType((String)iterator.next(), true);
                }
            }
        }
        if (Build$VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(y.k());
        }
        return addExtras.build();
    }
    
    @p0(20)
    static RemoteInput[] d(final y[] array) {
        if (array == null) {
            return null;
        }
        final RemoteInput[] array2 = new RemoteInput[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = c(array[i]);
        }
        return array2;
    }
    
    @p0(20)
    static y e(final RemoteInput remoteInput) {
        final a a = new a(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
        if (Build$VERSION.SDK_INT >= 26) {
            final Set allowedDataTypes = remoteInput.getAllowedDataTypes();
            if (allowedDataTypes != null) {
                final Iterator<String> iterator = allowedDataTypes.iterator();
                while (iterator.hasNext()) {
                    a.d(iterator.next(), true);
                }
            }
        }
        if (Build$VERSION.SDK_INT >= 29) {
            a.g(remoteInput.getEditChoicesBeforeSending());
        }
        return a.b();
    }
    
    @p0(16)
    private static Intent i(final Intent intent) {
        final ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        final ClipDescription description = clipData.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent")) {
            return null;
        }
        if (!description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return null;
        }
        return clipData.getItemAt(0).getIntent();
    }
    
    public static Map<String, Uri> j(Intent i, final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            return (Map<String, Uri>)RemoteInput.getDataResultsFromIntent(i, s);
        }
        Map<String, Uri> map2;
        final Map<String, Uri> map = map2 = null;
        if (sdk_INT >= 16) {
            i = i(i);
            if (i == null) {
                return null;
            }
            map2 = new HashMap<String, Uri>();
            for (final String s2 : i.getExtras().keySet()) {
                if (s2.startsWith("android.remoteinput.dataTypeResultsData")) {
                    final String substring = s2.substring(39);
                    if (substring.isEmpty()) {
                        continue;
                    }
                    final String string = i.getBundleExtra(s2).getString(s);
                    if (string == null) {
                        continue;
                    }
                    if (string.isEmpty()) {
                        continue;
                    }
                    map2.put(substring, Uri.parse(string));
                }
            }
            if (map2.isEmpty()) {
                map2 = map;
            }
        }
        return map2;
    }
    
    private static String l(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("android.remoteinput.dataTypeResultsData");
        sb.append(str);
        return sb.toString();
    }
    
    public static Bundle p(Intent i) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 20) {
            return RemoteInput.getResultsFromIntent(i);
        }
        if (sdk_INT < 16) {
            return null;
        }
        i = i(i);
        if (i == null) {
            return null;
        }
        return (Bundle)i.getExtras().getParcelable("android.remoteinput.resultsData");
    }
    
    public static int q(@j0 Intent i) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return RemoteInput.getResultsSource(i);
        }
        if (sdk_INT < 16) {
            return 0;
        }
        i = i(i);
        if (i == null) {
            return 0;
        }
        return i.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }
    
    public static void s(@j0 final Intent intent, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            RemoteInput.setResultsSource(intent, n);
        }
        else if (sdk_INT >= 16) {
            Intent i;
            if ((i = i(intent)) == null) {
                i = new Intent();
            }
            i.putExtra("android.remoteinput.resultsSource", n);
            intent.setClipData(ClipData.newIntent((CharSequence)"android.remoteinput.results", i));
        }
    }
    
    public boolean f() {
        return this.d;
    }
    
    public Set<String> g() {
        return this.g;
    }
    
    public CharSequence[] h() {
        return this.c;
    }
    
    public int k() {
        return this.e;
    }
    
    public Bundle m() {
        return this.f;
    }
    
    public CharSequence n() {
        return this.b;
    }
    
    public String o() {
        return this.a;
    }
    
    public boolean r() {
        return !this.f() && (this.h() == null || this.h().length == 0) && this.g() != null && !this.g().isEmpty();
    }
    
    public static final class a
    {
        private final String a;
        private final Set<String> b;
        private final Bundle c;
        private CharSequence d;
        private CharSequence[] e;
        private boolean f;
        private int g;
        
        public a(@j0 final String a) {
            this.b = new HashSet<String>();
            this.c = new Bundle();
            this.f = true;
            this.g = 0;
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }
        
        @j0
        public a a(@j0 final Bundle bundle) {
            if (bundle != null) {
                this.c.putAll(bundle);
            }
            return this;
        }
        
        @j0
        public y b() {
            return new y(this.a, this.d, this.e, this.f, this.g, this.c, this.b);
        }
        
        @j0
        public Bundle c() {
            return this.c;
        }
        
        @j0
        public a d(@j0 final String s, final boolean b) {
            if (b) {
                this.b.add(s);
            }
            else {
                this.b.remove(s);
            }
            return this;
        }
        
        @j0
        public a e(final boolean f) {
            this.f = f;
            return this;
        }
        
        @j0
        public a f(@k0 final CharSequence[] e) {
            this.e = e;
            return this;
        }
        
        @j0
        public a g(final int g) {
            this.g = g;
            return this;
        }
        
        @j0
        public a h(@k0 final CharSequence d) {
            this.d = d;
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface b {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface c {
    }
}
