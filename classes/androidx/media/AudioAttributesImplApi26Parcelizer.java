// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class AudioAttributesImplApi26Parcelizer
{
    public static AudioAttributesImplApi26 read(final e e) {
        final AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = e.W(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = e.M(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }
    
    public static void write(final AudioAttributesImplApi26 audioAttributesImplApi26, final e e) {
        e.j0(false, false);
        e.X0((Parcelable)audioAttributesImplApi26.a, 1);
        e.M0(audioAttributesImplApi26.b, 2);
    }
}
