// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import android.util.Pair;
import androidx.core.util.o;
import androidx.annotation.t0;
import android.content.ClipData$Item;
import java.util.List;
import android.content.ClipDescription;
import androidx.core.util.n;
import android.os.Bundle;
import androidx.annotation.k0;
import android.net.Uri;
import androidx.annotation.j0;
import android.content.ClipData;

public final class c
{
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 1;
    @j0
    final ClipData a;
    final int b;
    final int c;
    @k0
    final Uri d;
    @k0
    final Bundle e;
    
    c(final a a) {
        this.a = n.g(a.a);
        this.b = n.c(a.b, 0, 3, "source");
        this.c = n.f(a.c, 1);
        this.d = a.d;
        this.e = a.e;
    }
    
    private static ClipData a(final ClipDescription clipDescription, final List<ClipData$Item> list) {
        final ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData$Item)list.get(0));
        for (int i = 1; i < list.size(); ++i) {
            clipData.addItem((ClipData$Item)list.get(i));
        }
        return clipData;
    }
    
    @j0
    @t0({ t0.a.I })
    static String b(final int i) {
        if ((i & 0x1) != 0x0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }
    
    @j0
    @t0({ t0.a.I })
    static String i(final int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i != 3) {
            return String.valueOf(i);
        }
        return "SOURCE_DRAG_AND_DROP";
    }
    
    @j0
    public ClipData c() {
        return this.a;
    }
    
    @k0
    public Bundle d() {
        return this.e;
    }
    
    public int e() {
        return this.c;
    }
    
    @k0
    public Uri f() {
        return this.d;
    }
    
    public int g() {
        return this.b;
    }
    
    @j0
    public Pair<c, c> h(@j0 final o<ClipData$Item> o) {
        final int itemCount = this.a.getItemCount();
        int i = 0;
        Object o2 = null;
        if (itemCount == 1) {
            final boolean a = o.a(this.a.getItemAt(0));
            c c;
            if (a) {
                c = this;
            }
            else {
                c = null;
            }
            if (!a) {
                o2 = this;
            }
            return (Pair<c, c>)Pair.create((Object)c, o2);
        }
        final ArrayList<ClipData$Item> list = new ArrayList<ClipData$Item>();
        final ArrayList<ClipData$Item> list2 = new ArrayList<ClipData$Item>();
        while (i < this.a.getItemCount()) {
            final ClipData$Item item = this.a.getItemAt(i);
            if (o.a(item)) {
                list.add(item);
            }
            else {
                list2.add(item);
            }
            ++i;
        }
        if (list.isEmpty()) {
            return (Pair<c, c>)Pair.create((Object)null, (Object)this);
        }
        if (list2.isEmpty()) {
            return (Pair<c, c>)Pair.create((Object)this, (Object)null);
        }
        return (Pair<c, c>)Pair.create((Object)new a(this).b(a(this.a.getDescription(), list)).a(), (Object)new a(this).b(a(this.a.getDescription(), list2)).a());
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        sb.append(i(this.b));
        sb.append(", flags=");
        sb.append(b(this.c));
        final Uri d = this.d;
        final String s = "";
        String string;
        if (d == null) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", hasLinkUri(");
            sb2.append(this.d.toString().length());
            sb2.append(")");
            string = sb2.toString();
        }
        sb.append(string);
        String str;
        if (this.e == null) {
            str = s;
        }
        else {
            str = ", hasExtras";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class a
    {
        @j0
        ClipData a;
        int b;
        int c;
        @k0
        Uri d;
        @k0
        Bundle e;
        
        public a(@j0 final ClipData a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public a(@j0 final c c) {
            this.a = c.a;
            this.b = c.b;
            this.c = c.c;
            this.d = c.d;
            this.e = c.e;
        }
        
        @j0
        public c a() {
            return new c(this);
        }
        
        @j0
        public a b(@j0 final ClipData a) {
            this.a = a;
            return this;
        }
        
        @j0
        public a c(@k0 final Bundle e) {
            this.e = e;
            return this;
        }
        
        @j0
        public a d(final int c) {
            this.c = c;
            return this;
        }
        
        @j0
        public a e(@k0 final Uri d) {
            this.d = d;
            return this;
        }
        
        @j0
        public a f(final int b) {
            this.b = b;
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
