// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import com.google.android.gms.internal.base.a;

public abstract class g extends a implements d
{
    public g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }
    
    @Override
    protected final boolean x2(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                this.I1(com.google.android.gms.internal.base.d.a(parcel, h.CREATOR));
                break;
            }
            case 8: {
                this.a2(com.google.android.gms.internal.base.d.a(parcel, n.CREATOR));
                break;
            }
            case 7: {
                this.U(com.google.android.gms.internal.base.d.a(parcel, Status.CREATOR), com.google.android.gms.internal.base.d.a(parcel, GoogleSignInAccount.CREATOR));
                break;
            }
            case 6: {
                this.b2(com.google.android.gms.internal.base.d.a(parcel, Status.CREATOR));
                break;
            }
            case 4: {
                this.N(com.google.android.gms.internal.base.d.a(parcel, Status.CREATOR));
                break;
            }
            case 3: {
                this.Z1(com.google.android.gms.internal.base.d.a(parcel, c.CREATOR), com.google.android.gms.internal.base.d.a(parcel, com.google.android.gms.signin.internal.c.CREATOR));
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
