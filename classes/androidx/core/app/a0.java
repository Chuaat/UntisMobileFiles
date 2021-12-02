// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.text.Spanned;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.graphics.drawable.Drawable;
import android.text.Html;
import androidx.annotation.w0;
import android.os.Parcelable;
import android.content.ContextWrapper;
import androidx.core.util.n;
import android.content.Context;
import android.content.ClipData;
import android.content.ClipData$Item;
import android.net.Uri;
import java.util.ArrayList;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.content.Intent;
import android.content.ComponentName;
import android.app.Activity;
import android.os.Build$VERSION;
import android.view.ActionProvider;
import android.widget.ShareActionProvider;
import android.view.MenuItem;
import androidx.annotation.y;
import androidx.annotation.j0;
import android.view.Menu;

public final class a0
{
    public static final String a = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    public static final String c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    private static final String e = ".sharecompat_";
    
    private a0() {
    }
    
    @Deprecated
    public static void a(@j0 final Menu menu, @y final int i, @j0 final b b) {
        final MenuItem item = menu.findItem(i);
        if (item != null) {
            b(item, b);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not find menu item with id ");
        sb.append(i);
        sb.append(" in the supplied menu");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Deprecated
    public static void b(@j0 final MenuItem menuItem, @j0 final b b) {
        final ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider actionProvider2;
        if (!(actionProvider instanceof ShareActionProvider)) {
            actionProvider2 = new ShareActionProvider(b.l());
        }
        else {
            actionProvider2 = (ShareActionProvider)actionProvider;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(".sharecompat_");
        sb.append(b.l().getClass().getName());
        actionProvider2.setShareHistoryFileName(sb.toString());
        actionProvider2.setShareIntent(b.m());
        menuItem.setActionProvider((ActionProvider)actionProvider2);
        if (Build$VERSION.SDK_INT < 16 && !menuItem.hasSubMenu()) {
            menuItem.setIntent(b.j());
        }
    }
    
    @k0
    public static ComponentName c(@j0 final Activity activity) {
        final Intent intent = activity.getIntent();
        ComponentName componentName;
        if ((componentName = activity.getCallingActivity()) == null) {
            componentName = d(intent);
        }
        return componentName;
    }
    
    @k0
    static ComponentName d(@j0 final Intent intent) {
        ComponentName componentName;
        if ((componentName = (ComponentName)intent.getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY")) == null) {
            componentName = (ComponentName)intent.getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY");
        }
        return componentName;
    }
    
    @k0
    public static String e(@j0 final Activity activity) {
        final Intent intent = activity.getIntent();
        String s2;
        final String s = s2 = activity.getCallingPackage();
        if (s == null) {
            s2 = s;
            if (intent != null) {
                s2 = f(intent);
            }
        }
        return s2;
    }
    
    @k0
    static String f(@j0 final Intent intent) {
        String s;
        if ((s = intent.getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE")) == null) {
            s = intent.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
        }
        return s;
    }
    
    @p0(16)
    private static class a
    {
        static void a(@j0 final Intent intent, @j0 final ArrayList<Uri> list) {
            final ClipData clipData = new ClipData((CharSequence)null, new String[] { intent.getType() }, new ClipData$Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent)null, (Uri)list.get(0)));
            for (int size = list.size(), i = 1; i < size; ++i) {
                clipData.addItem(new ClipData$Item((Uri)list.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }
        
        static void b(@j0 final Intent intent) {
            intent.setClipData((ClipData)null);
            intent.setFlags(intent.getFlags() & 0xFFFFFFFE);
        }
    }
    
    public static class b
    {
        @j0
        private final Context a;
        @j0
        private final Intent b;
        @k0
        private CharSequence c;
        @k0
        private ArrayList<String> d;
        @k0
        private ArrayList<String> e;
        @k0
        private ArrayList<String> f;
        @k0
        private ArrayList<Uri> g;
        
        public b(@j0 Context baseContext) {
            this.a = n.g(baseContext);
            final Intent setAction = new Intent().setAction("android.intent.action.SEND");
            (this.b = setAction).putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", baseContext.getPackageName());
            setAction.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", baseContext.getPackageName());
            setAction.addFlags(524288);
            while (true) {
                while (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        final Activity activity = (Activity)baseContext;
                        if (activity != null) {
                            final ComponentName componentName = activity.getComponentName();
                            this.b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", (Parcelable)componentName);
                            this.b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", (Parcelable)componentName);
                        }
                        return;
                    }
                    baseContext = ((ContextWrapper)baseContext).getBaseContext();
                }
                final Activity activity = null;
                continue;
            }
        }
        
        private void h(final String s, final ArrayList<String> list) {
            final String[] stringArrayExtra = this.b.getStringArrayExtra(s);
            int length;
            if (stringArrayExtra != null) {
                length = stringArrayExtra.length;
            }
            else {
                length = 0;
            }
            final String[] a = new String[list.size() + length];
            list.toArray(a);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, a, list.size(), length);
            }
            this.b.putExtra(s, a);
        }
        
        private void i(@k0 final String s, @j0 final String[] array) {
            final Intent m = this.m();
            final String[] stringArrayExtra = m.getStringArrayExtra(s);
            int length;
            if (stringArrayExtra != null) {
                length = stringArrayExtra.length;
            }
            else {
                length = 0;
            }
            final String[] array2 = new String[array.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, array2, 0, length);
            }
            System.arraycopy(array, 0, array2, length, array.length);
            m.putExtra(s, array2);
        }
        
        @Deprecated
        @j0
        public static b k(@j0 final Activity activity) {
            return new b((Context)activity);
        }
        
        @j0
        public b a(@j0 final String e) {
            if (this.f == null) {
                this.f = new ArrayList<String>();
            }
            this.f.add(e);
            return this;
        }
        
        @j0
        public b b(@j0 final String[] array) {
            this.i("android.intent.extra.BCC", array);
            return this;
        }
        
        @j0
        public b c(@j0 final String e) {
            if (this.e == null) {
                this.e = new ArrayList<String>();
            }
            this.e.add(e);
            return this;
        }
        
        @j0
        public b d(@j0 final String[] array) {
            this.i("android.intent.extra.CC", array);
            return this;
        }
        
        @j0
        public b e(@j0 final String e) {
            if (this.d == null) {
                this.d = new ArrayList<String>();
            }
            this.d.add(e);
            return this;
        }
        
        @j0
        public b f(@j0 final String[] array) {
            this.i("android.intent.extra.EMAIL", array);
            return this;
        }
        
        @j0
        public b g(@j0 final Uri e) {
            if (this.g == null) {
                this.g = new ArrayList<Uri>();
            }
            this.g.add(e);
            return this;
        }
        
        @j0
        public Intent j() {
            return Intent.createChooser(this.m(), this.c);
        }
        
        @j0
        Context l() {
            return this.a;
        }
        
        @j0
        public Intent m() {
            final ArrayList<String> d = this.d;
            if (d != null) {
                this.h("android.intent.extra.EMAIL", d);
                this.d = null;
            }
            final ArrayList<String> e = this.e;
            if (e != null) {
                this.h("android.intent.extra.CC", e);
                this.e = null;
            }
            final ArrayList<String> f = this.f;
            if (f != null) {
                this.h("android.intent.extra.BCC", f);
                this.f = null;
            }
            final ArrayList<Uri> g = this.g;
            boolean b = true;
            if (g == null || g.size() <= 1) {
                b = false;
            }
            if (!b) {
                this.b.setAction("android.intent.action.SEND");
                final ArrayList<Uri> g2 = this.g;
                if (g2 != null && !g2.isEmpty()) {
                    this.b.putExtra("android.intent.extra.STREAM", (Parcelable)this.g.get(0));
                    if (Build$VERSION.SDK_INT < 16) {
                        return this.b;
                    }
                }
                else {
                    this.b.removeExtra("android.intent.extra.STREAM");
                    if (Build$VERSION.SDK_INT >= 16) {
                        a0.a.b(this.b);
                        return this.b;
                    }
                    return this.b;
                }
            }
            else {
                this.b.setAction("android.intent.action.SEND_MULTIPLE");
                this.b.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList)this.g);
                if (Build$VERSION.SDK_INT < 16) {
                    return this.b;
                }
            }
            a0.a.a(this.b, this.g);
            return this.b;
        }
        
        @j0
        public b n(@w0 final int n) {
            return this.o(this.a.getText(n));
        }
        
        @j0
        public b o(@k0 final CharSequence c) {
            this.c = c;
            return this;
        }
        
        @j0
        public b p(@k0 final String[] array) {
            this.b.putExtra("android.intent.extra.BCC", array);
            return this;
        }
        
        @j0
        public b q(@k0 final String[] array) {
            this.b.putExtra("android.intent.extra.CC", array);
            return this;
        }
        
        @j0
        public b r(@k0 final String[] array) {
            if (this.d != null) {
                this.d = null;
            }
            this.b.putExtra("android.intent.extra.EMAIL", array);
            return this;
        }
        
        @j0
        public b s(@k0 final String s) {
            this.b.putExtra("android.intent.extra.HTML_TEXT", s);
            if (!this.b.hasExtra("android.intent.extra.TEXT")) {
                this.v((CharSequence)Html.fromHtml(s));
            }
            return this;
        }
        
        @j0
        public b t(@k0 final Uri uri) {
            this.g = null;
            if (uri != null) {
                this.g(uri);
            }
            return this;
        }
        
        @j0
        public b u(@k0 final String s) {
            this.b.putExtra("android.intent.extra.SUBJECT", s);
            return this;
        }
        
        @j0
        public b v(@k0 final CharSequence charSequence) {
            this.b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }
        
        @j0
        public b w(@k0 final String type) {
            this.b.setType(type);
            return this;
        }
        
        public void x() {
            this.a.startActivity(this.j());
        }
    }
    
    public static class c
    {
        private static final String f = "IntentReader";
        @j0
        private final Context a;
        @j0
        private final Intent b;
        @k0
        private final String c;
        @k0
        private final ComponentName d;
        @k0
        private ArrayList<Uri> e;
        
        public c(@j0 final Activity activity) {
            this(n.g((Context)activity), activity.getIntent());
        }
        
        public c(@j0 final Context context, @j0 final Intent intent) {
            this.a = n.g(context);
            this.b = n.g(intent);
            this.c = a0.f(intent);
            this.d = a0.d(intent);
        }
        
        @Deprecated
        @j0
        public static c a(@j0 final Activity activity) {
            return new c(activity);
        }
        
        private static void t(final StringBuilder sb, final CharSequence charSequence, int i, final int n) {
            while (i < n) {
                final char char1 = charSequence.charAt(i);
                Label_0165: {
                    String str;
                    if (char1 == '<') {
                        str = "&lt;";
                    }
                    else if (char1 == '>') {
                        str = "&gt;";
                    }
                    else if (char1 == '&') {
                        str = "&amp;";
                    }
                    else if (char1 <= '~' && char1 >= ' ') {
                        if (char1 == ' ') {
                            while (true) {
                                final int n2 = i + 1;
                                if (n2 >= n || charSequence.charAt(n2) != ' ') {
                                    break;
                                }
                                sb.append("&nbsp;");
                                i = n2;
                            }
                            sb.append(' ');
                            break Label_0165;
                        }
                        sb.append(char1);
                        break Label_0165;
                    }
                    else {
                        sb.append("&#");
                        sb.append((int)char1);
                        str = ";";
                    }
                    sb.append(str);
                }
                ++i;
            }
        }
        
        @k0
        public ComponentName b() {
            return this.d;
        }
        
        @k0
        public Drawable c() {
            if (this.d == null) {
                return null;
            }
            final PackageManager packageManager = this.a.getPackageManager();
            try {
                return packageManager.getActivityIcon(this.d);
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.e("IntentReader", "Could not retrieve icon for calling activity", (Throwable)ex);
                return null;
            }
        }
        
        @k0
        public Drawable d() {
            if (this.c == null) {
                return null;
            }
            final PackageManager packageManager = this.a.getPackageManager();
            try {
                return packageManager.getApplicationIcon(this.c);
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.e("IntentReader", "Could not retrieve icon for calling application", (Throwable)ex);
                return null;
            }
        }
        
        @k0
        public CharSequence e() {
            if (this.c == null) {
                return null;
            }
            final PackageManager packageManager = this.a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.c, 0));
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.e("IntentReader", "Could not retrieve label for calling application", (Throwable)ex);
                return null;
            }
        }
        
        @k0
        public String f() {
            return this.c;
        }
        
        @k0
        public String[] g() {
            return this.b.getStringArrayExtra("android.intent.extra.BCC");
        }
        
        @k0
        public String[] h() {
            return this.b.getStringArrayExtra("android.intent.extra.CC");
        }
        
        @k0
        public String[] i() {
            return this.b.getStringArrayExtra("android.intent.extra.EMAIL");
        }
        
        @k0
        public String j() {
            String s2;
            final String s = s2 = this.b.getStringExtra("android.intent.extra.HTML_TEXT");
            if (s == null) {
                final CharSequence o = this.o();
                if (o instanceof Spanned) {
                    s2 = Html.toHtml((Spanned)o);
                }
                else {
                    s2 = s;
                    if (o != null) {
                        if (Build$VERSION.SDK_INT >= 16) {
                            s2 = Html.escapeHtml(o);
                        }
                        else {
                            final StringBuilder sb = new StringBuilder();
                            t(sb, o, 0, o.length());
                            s2 = sb.toString();
                        }
                    }
                }
            }
            return s2;
        }
        
        @k0
        public Uri k() {
            return (Uri)this.b.getParcelableExtra("android.intent.extra.STREAM");
        }
        
        @k0
        public Uri l(final int n) {
            if (this.e == null && this.q()) {
                this.e = (ArrayList<Uri>)this.b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            final ArrayList<Uri> e = this.e;
            Object o;
            if (e != null) {
                o = e.get(n);
            }
            else {
                if (n != 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Stream items available: ");
                    sb.append(this.m());
                    sb.append(" index requested: ");
                    sb.append(n);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                o = this.b.getParcelableExtra("android.intent.extra.STREAM");
            }
            return (Uri)o;
        }
        
        public int m() {
            if (this.e == null && this.q()) {
                this.e = (ArrayList<Uri>)this.b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            final ArrayList<Uri> e = this.e;
            if (e != null) {
                return e.size();
            }
            return this.b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }
        
        @k0
        public String n() {
            return this.b.getStringExtra("android.intent.extra.SUBJECT");
        }
        
        @k0
        public CharSequence o() {
            return this.b.getCharSequenceExtra("android.intent.extra.TEXT");
        }
        
        @k0
        public String p() {
            return this.b.getType();
        }
        
        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.b.getAction());
        }
        
        public boolean r() {
            final String action = this.b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }
        
        public boolean s() {
            return "android.intent.action.SEND".equals(this.b.getAction());
        }
    }
}
