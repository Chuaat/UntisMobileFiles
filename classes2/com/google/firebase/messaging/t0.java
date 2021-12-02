// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.Locale;

public final class t0 extends Exception
{
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    public static final int K = 3;
    public static final int L = 4;
    private final int G;
    
    t0(final String message) {
        super(message);
        this.G = this.b(message);
    }
    
    private int b(String lowerCase) {
        if (lowerCase == null) {
            return 0;
        }
        lowerCase = lowerCase.toLowerCase(Locale.US);
        int n = 0;
        Label_0143: {
            switch (lowerCase.hashCode()) {
                case -95047692: {
                    if (lowerCase.equals("missing_to")) {
                        n = 1;
                        break Label_0143;
                    }
                    break;
                }
                case -617027085: {
                    if (lowerCase.equals("messagetoobig")) {
                        n = 2;
                        break Label_0143;
                    }
                    break;
                }
                case -920906446: {
                    if (lowerCase.equals("invalid_parameters")) {
                        n = 0;
                        break Label_0143;
                    }
                    break;
                }
                case -1290953729: {
                    if (lowerCase.equals("toomanymessages")) {
                        n = 4;
                        break Label_0143;
                    }
                    break;
                }
                case -1743242157: {
                    if (lowerCase.equals("service_not_available")) {
                        n = 3;
                        break Label_0143;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        if (n != 4) {
            return 0;
        }
        return 4;
    }
    
    public int a() {
        return this.G;
    }
}
