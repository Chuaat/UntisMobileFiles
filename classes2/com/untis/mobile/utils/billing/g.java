// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

import android.text.TextUtils;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import java.security.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import android.util.Log;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;

public class g
{
    private static final String a = "IABUtil/Security";
    private static final String b = "RSA";
    private static final String c = "SHA1withRSA";
    
    public static PublicKey a(final String s) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(s, 0)));
        }
        catch (InvalidKeySpecException cause) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(cause);
        }
        catch (NoSuchAlgorithmException cause2) {
            throw new RuntimeException(cause2);
        }
    }
    
    public static boolean b(final PublicKey publicKey, final String s, final String s2) {
        try {
            final byte[] decode = Base64.decode(s2, 0);
            String s3;
            try {
                final Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(s.getBytes());
                if (!instance.verify(decode)) {
                    Log.e("IABUtil/Security", "Signature verification failed.");
                    return false;
                }
                return true;
            }
            catch (SignatureException ex) {
                s3 = "Signature exception.";
            }
            catch (InvalidKeyException ex2) {
                s3 = "Invalid key specification.";
            }
            catch (NoSuchAlgorithmException ex3) {
                s3 = "NoSuchAlgorithmException.";
            }
            Log.e("IABUtil/Security", s3);
            return false;
        }
        catch (IllegalArgumentException ex4) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            return false;
        }
    }
    
    public static boolean c(final String s, final String s2, final String s3) {
        if (s2 == null) {
            Log.e("IABUtil/Security", "data is null");
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence)s3) && !b(a(s), s2, s3)) {
            Log.w("IABUtil/Security", "signature does not match data.");
        }
        return true;
    }
}
