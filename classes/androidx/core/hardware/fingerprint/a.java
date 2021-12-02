// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.hardware.fingerprint;

import javax.crypto.Mac;
import javax.crypto.Cipher;
import java.security.Signature;
import androidx.annotation.s0;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.os.c;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager$CryptoObject;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.hardware.fingerprint.FingerprintManager;
import androidx.annotation.j0;
import android.content.Context;

@Deprecated
public class a
{
    private final Context a;
    
    private a(final Context a) {
        this.a = a;
    }
    
    @j0
    public static a b(@j0 final Context context) {
        return new a(context);
    }
    
    @k0
    @p0(23)
    private static FingerprintManager c(@j0 final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT != 23 && (sdk_INT <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
            return null;
        }
        return (FingerprintManager)context.getSystemService((Class)FingerprintManager.class);
    }
    
    @p0(23)
    static d f(final FingerprintManager$CryptoObject fingerprintManager$CryptoObject) {
        d d = null;
        if (fingerprintManager$CryptoObject == null) {
            return null;
        }
        if (fingerprintManager$CryptoObject.getCipher() != null) {
            return new d(fingerprintManager$CryptoObject.getCipher());
        }
        if (fingerprintManager$CryptoObject.getSignature() != null) {
            return new d(fingerprintManager$CryptoObject.getSignature());
        }
        if (fingerprintManager$CryptoObject.getMac() != null) {
            d = new d(fingerprintManager$CryptoObject.getMac());
        }
        return d;
    }
    
    @p0(23)
    private static FingerprintManager$AuthenticationCallback g(final b b) {
        return new FingerprintManager$AuthenticationCallback() {
            public void onAuthenticationError(final int n, final CharSequence charSequence) {
                b.a(n, charSequence);
            }
            
            public void onAuthenticationFailed() {
                b.b();
            }
            
            public void onAuthenticationHelp(final int n, final CharSequence charSequence) {
                b.c(n, charSequence);
            }
            
            public void onAuthenticationSucceeded(final FingerprintManager$AuthenticationResult fingerprintManager$AuthenticationResult) {
                b.d(new c(androidx.core.hardware.fingerprint.a.f(fingerprintManager$AuthenticationResult.getCryptoObject())));
            }
        };
    }
    
    @p0(23)
    private static FingerprintManager$CryptoObject h(final d d) {
        FingerprintManager$CryptoObject fingerprintManager$CryptoObject = null;
        if (d == null) {
            return null;
        }
        if (d.a() != null) {
            return new FingerprintManager$CryptoObject(d.a());
        }
        if (d.c() != null) {
            return new FingerprintManager$CryptoObject(d.c());
        }
        if (d.b() != null) {
            fingerprintManager$CryptoObject = new FingerprintManager$CryptoObject(d.b());
        }
        return fingerprintManager$CryptoObject;
    }
    
    @s0("android.permission.USE_FINGERPRINT")
    public void a(@k0 final d d, final int n, @k0 final androidx.core.os.c c, @j0 final b b, @k0 final Handler handler) {
        if (Build$VERSION.SDK_INT >= 23) {
            final FingerprintManager c2 = c(this.a);
            if (c2 != null) {
                CancellationSignal cancellationSignal;
                if (c != null) {
                    cancellationSignal = (CancellationSignal)c.b();
                }
                else {
                    cancellationSignal = null;
                }
                c2.authenticate(h(d), cancellationSignal, n, g(b), handler);
            }
        }
    }
    
    @s0("android.permission.USE_FINGERPRINT")
    public boolean d() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b2;
        final boolean b = b2 = false;
        if (sdk_INT >= 23) {
            final FingerprintManager c = c(this.a);
            b2 = b;
            if (c != null) {
                b2 = b;
                if (c.hasEnrolledFingerprints()) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @s0("android.permission.USE_FINGERPRINT")
    public boolean e() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b2;
        final boolean b = b2 = false;
        if (sdk_INT >= 23) {
            final FingerprintManager c = c(this.a);
            b2 = b;
            if (c != null) {
                b2 = b;
                if (c.isHardwareDetected()) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public abstract static class b
    {
        public void a(final int n, final CharSequence charSequence) {
        }
        
        public void b() {
        }
        
        public void c(final int n, final CharSequence charSequence) {
        }
        
        public void d(final c c) {
        }
    }
    
    public static final class c
    {
        private final d a;
        
        public c(final d a) {
            this.a = a;
        }
        
        public d a() {
            return this.a;
        }
    }
    
    public static class d
    {
        private final Signature a;
        private final Cipher b;
        private final Mac c;
        
        public d(@j0 final Signature a) {
            this.a = a;
            this.b = null;
            this.c = null;
        }
        
        public d(@j0 final Cipher b) {
            this.b = b;
            this.a = null;
            this.c = null;
        }
        
        public d(@j0 final Mac c) {
            this.c = c;
            this.b = null;
            this.a = null;
        }
        
        @k0
        public Cipher a() {
            return this.b;
        }
        
        @k0
        public Mac b() {
            return this.c;
        }
        
        @k0
        public Signature c() {
            return this.a;
        }
    }
}
