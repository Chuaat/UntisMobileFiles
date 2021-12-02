// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.os.Message;
import android.os.Handler$Callback;
import java.util.Objects;
import androidx.annotation.r;
import android.media.AudioFocusRequest$Builder;
import androidx.core.util.i;
import androidx.annotation.j0;
import androidx.annotation.p0;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Looper;
import android.os.Build$VERSION;
import android.os.Handler;
import android.media.AudioManager$OnAudioFocusChangeListener;

public class a
{
    static final AudioAttributesCompat g;
    private final int a;
    private final AudioManager$OnAudioFocusChangeListener b;
    private final Handler c;
    private final AudioAttributesCompat d;
    private final boolean e;
    private final Object f;
    
    static {
        g = new AudioAttributesCompat.d().e(1).a();
    }
    
    a(final int a, final AudioManager$OnAudioFocusChangeListener b, final Handler c, final AudioAttributesCompat d, final boolean e) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26 && c.getLooper() != Looper.getMainLooper()) {
            this.b = (AudioManager$OnAudioFocusChangeListener)new c(b, c);
        }
        else {
            this.b = b;
        }
        AudioFocusRequest a2;
        if (sdk_INT >= 26) {
            a2 = androidx.media.a.a.a(a, this.a(), e, this.b, c);
        }
        else {
            a2 = null;
        }
        this.f = a2;
    }
    
    @p0(21)
    AudioAttributes a() {
        final AudioAttributesCompat d = this.d;
        AudioAttributes audioAttributes;
        if (d != null) {
            audioAttributes = (AudioAttributes)d.i();
        }
        else {
            audioAttributes = null;
        }
        return audioAttributes;
    }
    
    @j0
    public AudioAttributesCompat b() {
        return this.d;
    }
    
    @p0(26)
    AudioFocusRequest c() {
        return (AudioFocusRequest)this.f;
    }
    
    @j0
    public Handler d() {
        return this.c;
    }
    
    public int e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (this.a != a.a || this.e != a.e || !i.a(this.b, a.b) || !i.a(this.c, a.c) || !i.a(this.d, a.d)) {
            b = false;
        }
        return b;
    }
    
    @j0
    public AudioManager$OnAudioFocusChangeListener f() {
        return this.b;
    }
    
    public boolean g() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return i.b(this.a, this.b, this.c, this.d, this.e);
    }
    
    @p0(26)
    private static class a
    {
        @r
        static AudioFocusRequest a(final int n, final AudioAttributes audioAttributes, final boolean willPauseWhenDucked, final AudioManager$OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener, final Handler handler) {
            return new AudioFocusRequest$Builder(n).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(willPauseWhenDucked).setOnAudioFocusChangeListener(audioManager$OnAudioFocusChangeListener, handler).build();
        }
    }
    
    public static final class b
    {
        private int a;
        private AudioManager$OnAudioFocusChangeListener b;
        private Handler c;
        private AudioAttributesCompat d;
        private boolean e;
        
        public b(final int n) {
            this.d = a.g;
            this.d(n);
        }
        
        public b(@j0 final a a) {
            this.d = a.g;
            if (a != null) {
                this.a = a.e();
                this.b = a.f();
                this.c = a.d();
                this.d = a.b();
                this.e = a.g();
                return;
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
        }
        
        private static boolean b(final int n) {
            return n == 1 || n == 2 || n == 3 || n == 4;
        }
        
        public a a() {
            if (this.b != null) {
                return new a(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        
        @j0
        public b c(@j0 final AudioAttributesCompat audioAttributesCompat) {
            Objects.requireNonNull(audioAttributesCompat, "Illegal null AudioAttributes");
            this.d = audioAttributesCompat;
            return this;
        }
        
        @j0
        public b d(final int i) {
            if (b(i)) {
                int a = i;
                if (Build$VERSION.SDK_INT < 19 && (a = i) == 4) {
                    a = 2;
                }
                this.a = a;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Illegal audio focus gain type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @j0
        public b e(@j0 final AudioManager$OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener) {
            return this.f(audioManager$OnAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }
        
        @j0
        public b f(@j0 final AudioManager$OnAudioFocusChangeListener b, @j0 final Handler c) {
            if (b == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (c != null) {
                this.b = b;
                this.c = c;
                return this;
            }
            throw new IllegalArgumentException("Handler must not be null");
        }
        
        @j0
        public b g(final boolean e) {
            this.e = e;
            return this;
        }
    }
    
    private static class c implements Handler$Callback, AudioManager$OnAudioFocusChangeListener
    {
        private static final int e = 2782386;
        private final Handler c;
        private final AudioManager$OnAudioFocusChangeListener d;
        
        c(@j0 final AudioManager$OnAudioFocusChangeListener d, @j0 final Handler handler) {
            this.d = d;
            this.c = new Handler(handler.getLooper(), (Handler$Callback)this);
        }
        
        public boolean handleMessage(final Message message) {
            if (message.what == 2782386) {
                this.d.onAudioFocusChange(message.arg1);
                return true;
            }
            return false;
        }
        
        public void onAudioFocusChange(final int n) {
            final Handler c = this.c;
            c.sendMessage(Message.obtain(c, 2782386, n, 0));
        }
    }
}
