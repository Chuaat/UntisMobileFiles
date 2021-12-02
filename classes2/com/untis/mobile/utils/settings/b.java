// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings;

import java.security.PublicKey;
import java.security.Key;
import kotlin.text.f;
import javax.crypto.Cipher;
import android.util.Base64;
import java.security.cert.Certificate;
import java.security.PrivateKey;
import android.security.KeyPairGeneratorSpec;
import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import android.security.KeyPairGeneratorSpec$Builder;
import androidx.annotation.p0;
import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyPairGenerator;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.os.Build$VERSION;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.security.KeyStore;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/utils/settings/b;", "", "Lkotlin/j2;", "a", "b", "c", "", "f", "", "plainString", "e", "encrypted", "d", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Ljava/security/KeyStore;", "Ljava/security/KeyStore;", "keyStore", "<init>", "(Landroid/content/Context;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final a c;
    @e
    private static final String d = "untis.mobile";
    @e
    private static final String e = "AndroidKeyStore";
    @e
    private static final String f = "RSA";
    @e
    private static final String g = "RSA/ECB/PKCS1Padding";
    @e
    private final Context a;
    @e
    private final KeyStore b;
    
    static {
        c = new a(null);
    }
    
    public b(@e final Context a) {
        k0.p(a, "context");
        this.a = a;
        final KeyStore instance = KeyStore.getInstance("AndroidKeyStore", "AndroidKeyStore");
        k0.o(instance, "getInstance(PROVIDER, PROVIDER)");
        (this.b = instance).load(null);
        if (!this.f()) {
            this.a();
        }
    }
    
    private final void a() {
        if (Build$VERSION.SDK_INT >= 23) {
            this.b();
        }
        else {
            this.c();
        }
    }
    
    @p0(23)
    private final void b() {
        final KeyGenParameterSpec build = new KeyGenParameterSpec$Builder("untis.mobile", 3).setBlockModes(new String[] { "ECB" }).setEncryptionPaddings(new String[] { "PKCS1Padding" }).build();
        k0.o(build, "Builder(\n                ALIAS,\n                KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT\n        )\n                .setBlockModes(KeyProperties.BLOCK_MODE_ECB)\n                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_RSA_PKCS1)\n                .build()");
        final KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        instance.initialize((AlgorithmParameterSpec)build);
        instance.genKeyPair();
    }
    
    private final void c() {
        final KeyPairGeneratorSpec build = new KeyPairGeneratorSpec$Builder(this.a).setAlias("untis.mobile").setSubject(new X500Principal("CN=untis.mobile CA Certificate")).setSerialNumber(BigInteger.ONE).build();
        k0.o(build, "Builder(context)\n                .setAlias(ALIAS)\n                .setSubject(X500Principal(\"CN=$ALIAS CA Certificate\"))\n                .setSerialNumber(BigInteger.ONE)\n                .build()");
        final KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        instance.initialize((AlgorithmParameterSpec)build);
        instance.genKeyPair();
    }
    
    private final boolean f() {
        if (!(this.b.getKey("untis.mobile", null) instanceof PrivateKey)) {
            return false;
        }
        final Certificate certificate = this.b.getCertificate("untis.mobile");
        return certificate != null && certificate.getPublicKey() != null;
    }
    
    @e
    public final String d(@e final String s) {
        k0.p(s, "encrypted");
        final Key key = this.b.getKey("untis.mobile", null);
        final byte[] decode = Base64.decode(s, 0);
        final Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(2, key);
        final byte[] doFinal = instance.doFinal(decode);
        k0.o(doFinal, "cipher.doFinal(encryptedBytes)");
        return new String(doFinal, kotlin.text.f.a);
    }
    
    @e
    public final String e(@e String encodeToString) {
        k0.p(encodeToString, "plainString");
        final PublicKey publicKey = this.b.getCertificate("untis.mobile").getPublicKey();
        final Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, publicKey);
        final byte[] bytes = encodeToString.getBytes(kotlin.text.f.a);
        k0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        encodeToString = Base64.encodeToString(instance.doFinal(bytes), 0);
        k0.o(encodeToString, "encodeToString(cipher.doFinal(plainString.toByteArray()), Base64.DEFAULT)");
        return encodeToString;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/utils/settings/b$a", "", "", "ALGORITHM", "Ljava/lang/String;", "ALIAS", "PROVIDER", "TRANSFORMATION_ASYMMETRIC", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
