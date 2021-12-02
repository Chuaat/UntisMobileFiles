// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.util.Log;
import androidx.annotation.j0;
import java.util.Arrays;
import androidx.annotation.k0;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class AudioAttributesImplBase implements AudioAttributesImpl
{
    @t0({ t0.a.G })
    public int a;
    @t0({ t0.a.G })
    public int b;
    @t0({ t0.a.G })
    public int c;
    @t0({ t0.a.G })
    public int d;
    
    @t0({ t0.a.G })
    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }
    
    AudioAttributesImplBase(final int b, final int c, final int a, final int d) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    static int g(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 10: {
                return 11;
            }
            case 8: {
                return 3;
            }
            case 6: {
                return 2;
            }
            case 5: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 6;
            }
            case 1:
            case 7: {
                return 13;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    @Override
    public int a() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        return AudioAttributesCompat.h(false, this.c, this.a);
    }
    
    @Override
    public int b() {
        return this.d;
    }
    
    @Override
    public int c() {
        return this.a;
    }
    
    @k0
    @Override
    public Object d() {
        return null;
    }
    
    @Override
    public int e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof AudioAttributesImplBase;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase)o;
        boolean b3 = b2;
        if (this.b == audioAttributesImplBase.e()) {
            b3 = b2;
            if (this.c == audioAttributesImplBase.w()) {
                b3 = b2;
                if (this.a == audioAttributesImplBase.c()) {
                    b3 = b2;
                    if (this.d == audioAttributesImplBase.d) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int f() {
        return AudioAttributesCompat.h(true, this.c, this.a);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.a, this.d });
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.j(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
    
    @Override
    public int w() {
        final int c = this.c;
        final int a = this.a();
        int n;
        if (a == 6) {
            n = (c | 0x4);
        }
        else {
            n = c;
            if (a == 7) {
                n = (c | 0x1);
            }
        }
        return n & 0x111;
    }
    
    static class a implements AudioAttributesImpl.a
    {
        private int a;
        private int b;
        private int c;
        private int d;
        
        a() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
        }
        
        a(final AudioAttributesCompat audioAttributesCompat) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
            this.a = audioAttributesCompat.c();
            this.b = audioAttributesCompat.e();
            this.c = audioAttributesCompat.w();
            this.d = audioAttributesCompat.b();
        }
        
        private a d(final int i) {
            int b = 1;
            switch (i) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid stream type ");
                    sb.append(i);
                    sb.append(" for AudioAttributesCompat");
                    Log.e("AudioAttributesCompat", sb.toString());
                    break;
                }
                case 6: {
                    this.b = 1;
                    this.c |= 0x4;
                    break;
                }
                case 7: {
                    this.c |= 0x1;
                }
                case 1:
                case 2:
                case 4:
                case 5:
                case 8:
                case 9: {
                    this.b = 4;
                    break;
                }
                case 3: {
                    b = 2;
                }
                case 0:
                case 10: {
                    this.b = b;
                    break;
                }
            }
            this.a = AudioAttributesImplBase.g(i);
            return this;
        }
        
        @j0
        public a a(final int n) {
            int b = n;
            if (n != 0 && (b = n) != 1 && (b = n) != 2 && (b = n) != 3 && (b = n) != 4) {
                b = 0;
            }
            this.b = b;
            return this;
        }
        
        @j0
        public a b(final int n) {
            this.c |= (n & 0x3FF);
            return this;
        }
        
        @j0
        public a e(final int d) {
            if (d != 10) {
                this.d = d;
                return this.d(d);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
        
        @j0
        public a f(final int n) {
            int a = n;
            switch (n) {
                case 16: {
                    a = 12;
                }
                default: {
                    a = 0;
                }
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15: {
                    this.a = a;
                    return this;
                }
            }
        }
        
        @j0
        @Override
        public AudioAttributesImpl h() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
        }
    }
}
