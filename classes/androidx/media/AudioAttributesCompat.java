// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.k0;
import android.media.AudioAttributes;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import androidx.annotation.t0;
import android.util.SparseIntArray;
import androidx.versionedparcelable.h;

public class AudioAttributesCompat implements h
{
    private static final SparseIntArray A;
    static boolean B = false;
    private static final int[] C;
    public static final int D = 1;
    static final int E = 2;
    static final int F = 4;
    static final int G = 8;
    public static final int H = 16;
    static final int I = 32;
    static final int J = 64;
    static final int K = 128;
    static final int L = 256;
    static final int M = 512;
    static final int N = 1023;
    static final int O = 273;
    static final int P = -1;
    static final String b = "AudioAttributesCompat";
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 6;
    public static final int o = 7;
    public static final int p = 8;
    public static final int q = 9;
    public static final int r = 10;
    public static final int s = 11;
    public static final int t = 12;
    public static final int u = 13;
    public static final int v = 14;
    static final int w = 15;
    public static final int x = 16;
    private static final int y = 1;
    private static final int z = 2;
    @t0({ t0.a.G })
    public AudioAttributesImpl a;
    
    static {
        final SparseIntArray a = new SparseIntArray();
        (A = a).put(5, 1);
        a.put(6, 2);
        a.put(7, 2);
        a.put(8, 1);
        a.put(9, 1);
        a.put(10, 1);
        C = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16 };
    }
    
    @t0({ t0.a.G })
    public AudioAttributesCompat() {
    }
    
    AudioAttributesCompat(final AudioAttributesImpl a) {
        this.a = a;
    }
    
    @t0({ t0.a.G })
    public static void g(final boolean b) {
        AudioAttributesCompat.B = b;
    }
    
    static int h(final boolean b, int n, final int i) {
        final int n2 = 1;
        if ((n & 0x1) == 0x1) {
            if (b) {
                n = n2;
            }
            else {
                n = 7;
            }
            return n;
        }
        final int n3 = 0;
        final int n4 = 0;
        if ((n & 0x4) == 0x4) {
            if (b) {
                n = n4;
            }
            else {
                n = 6;
            }
            return n;
        }
        n = n3;
        switch (i) {
            default: {
                if (!b) {
                    return 3;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown usage value ");
                sb.append(i);
                sb.append(" in audio attributes");
                throw new IllegalArgumentException(sb.toString());
            }
            case 13: {
                return 1;
            }
            case 11: {
                return 10;
            }
            case 6: {
                return 2;
            }
            case 5:
            case 7:
            case 8:
            case 9:
            case 10: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                if (b) {
                    n = n3;
                    return n;
                }
                n = 8;
                return n;
            }
            case 2: {
                return n;
            }
            case 0:
            case 1:
            case 12:
            case 14:
            case 16: {
                return 3;
            }
        }
    }
    
    static String j(final int i) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("unknown usage ");
                sb.append(i);
                return sb.toString();
            }
            case 16: {
                return "USAGE_ASSISTANT";
            }
            case 14: {
                return "USAGE_GAME";
            }
            case 13: {
                return "USAGE_ASSISTANCE_SONIFICATION";
            }
            case 12: {
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            }
            case 11: {
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            }
            case 10: {
                return "USAGE_NOTIFICATION_EVENT";
            }
            case 9: {
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            }
            case 8: {
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            }
            case 7: {
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            }
            case 6: {
                return "USAGE_NOTIFICATION_RINGTONE";
            }
            case 5: {
                return "USAGE_NOTIFICATION";
            }
            case 4: {
                return "USAGE_ALARM";
            }
            case 3: {
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            }
            case 2: {
                return "USAGE_VOICE_COMMUNICATION";
            }
            case 1: {
                return "USAGE_MEDIA";
            }
            case 0: {
                return "USAGE_UNKNOWN";
            }
        }
    }
    
    @k0
    public static AudioAttributesCompat k(@j0 final Object o) {
        if (AudioAttributesCompat.B) {
            return null;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes)o));
        }
        if (sdk_INT >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes)o));
        }
        return null;
    }
    
    public int a() {
        return this.a.a();
    }
    
    int b() {
        return this.a.b();
    }
    
    public int c() {
        return this.a.c();
    }
    
    public int e() {
        return this.a.e();
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof AudioAttributesCompat;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        final AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat)o;
        final AudioAttributesImpl a = this.a;
        final AudioAttributesImpl a2 = audioAttributesCompat.a;
        if (a == null) {
            if (a2 == null) {
                b2 = true;
            }
            return b2;
        }
        return a.equals(a2);
    }
    
    public int f() {
        return this.a.f();
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @k0
    public Object i() {
        return this.a.d();
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    public int w() {
        return this.a.w();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface a {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface b {
    }
    
    abstract static class c
    {
        public static final int a = 6;
        public static final int b = 7;
        public static final int c = 9;
        public static final int d = 10;
        
        private c() {
        }
    }
    
    public static class d
    {
        final AudioAttributesImpl.a a;
        
        public d() {
            AudioAttributesImpl.a a;
            if (AudioAttributesCompat.B) {
                a = new AudioAttributesImplBase.a();
            }
            else {
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 26) {
                    a = new AudioAttributesImplApi26.a();
                }
                else if (sdk_INT >= 21) {
                    a = new AudioAttributesImplApi21.a();
                }
                else {
                    a = new AudioAttributesImplBase.a();
                }
            }
            this.a = a;
        }
        
        public d(final AudioAttributesCompat audioAttributesCompat) {
            AudioAttributesImpl.a a;
            if (AudioAttributesCompat.B) {
                a = new AudioAttributesImplBase.a(audioAttributesCompat);
            }
            else {
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 26) {
                    a = new AudioAttributesImplApi26.a(audioAttributesCompat.i());
                }
                else if (sdk_INT >= 21) {
                    a = new AudioAttributesImplApi21.a(audioAttributesCompat.i());
                }
                else {
                    a = new AudioAttributesImplBase.a(audioAttributesCompat);
                }
            }
            this.a = a;
        }
        
        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.a.h());
        }
        
        public d b(final int n) {
            this.a.j(n);
            return this;
        }
        
        public d c(final int n) {
            this.a.c(n);
            return this;
        }
        
        public d d(final int n) {
            this.a.i(n);
            return this;
        }
        
        public d e(final int n) {
            this.a.k(n);
            return this;
        }
    }
}
