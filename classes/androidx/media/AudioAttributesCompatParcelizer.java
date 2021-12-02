// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import androidx.versionedparcelable.h;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final e e) {
        final AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = e.h0(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final e e) {
        e.j0(false, false);
        e.m1(audioAttributesCompat.a, 1);
    }
}
