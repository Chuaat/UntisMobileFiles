// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import androidx.annotation.r;
import android.media.AudioFocusRequest;
import androidx.annotation.p0;
import androidx.annotation.b0;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.media.AudioManager;

public final class b
{
    private static final String a = "AudioManCompat";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    
    private b() {
    }
    
    public static int a(@j0 final AudioManager audioManager, @j0 final androidx.media.a a) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (a == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return androidx.media.b.a.a(audioManager, a.c());
        }
        return audioManager.abandonAudioFocus(a.f());
    }
    
    @b0(from = 0L)
    public static int b(@j0 final AudioManager audioManager, final int n) {
        return audioManager.getStreamMaxVolume(n);
    }
    
    @b0(from = 0L)
    public static int c(@j0 final AudioManager audioManager, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return androidx.media.b.b.a(audioManager, n);
        }
        return 0;
    }
    
    public static int d(@j0 final AudioManager audioManager, @j0 final androidx.media.a a) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (a == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return androidx.media.b.a.b(audioManager, a.c());
        }
        return audioManager.requestAudioFocus(a.f(), a.b().a(), a.e());
    }
    
    @p0(26)
    private static class a
    {
        @r
        static int a(final AudioManager audioManager, final AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        
        @r
        static int b(final AudioManager audioManager, final AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }
    
    @p0(28)
    private static class b
    {
        @r
        static int a(final AudioManager audioManager, final int n) {
            return audioManager.getStreamMinVolume(n);
        }
    }
}
