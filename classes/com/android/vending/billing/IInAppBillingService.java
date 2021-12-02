// 
// Decompiled by Procyon v0.5.36
// 

package com.android.vending.billing;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import java.util.List;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;

public interface IInAppBillingService extends IInterface
{
    int consumePurchase(final int p0, final String p1, final String p2) throws RemoteException;
    
    Bundle getBuyIntent(final int p0, final String p1, final String p2, final String p3, final String p4) throws RemoteException;
    
    Bundle getBuyIntentExtraParams(final int p0, final String p1, final String p2, final String p3, final String p4, final Bundle p5) throws RemoteException;
    
    Bundle getBuyIntentToReplaceSkus(final int p0, final String p1, final List<String> p2, final String p3, final String p4, final String p5) throws RemoteException;
    
    Bundle getPurchaseHistory(final int p0, final String p1, final String p2, final String p3, final Bundle p4) throws RemoteException;
    
    Bundle getPurchases(final int p0, final String p1, final String p2, final String p3) throws RemoteException;
    
    Bundle getSkuDetails(final int p0, final String p1, final String p2, final Bundle p3) throws RemoteException;
    
    int isBillingSupported(final int p0, final String p1, final String p2) throws RemoteException;
    
    int isBillingSupportedExtraParams(final int p0, final String p1, final String p2, final Bundle p3) throws RemoteException;
    
    int stub(final int p0, final String p1, final String p2) throws RemoteException;
    
    public static class Default implements IInAppBillingService
    {
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public int consumePurchase(final int n, final String s, final String s2) throws RemoteException {
            return 0;
        }
        
        @Override
        public Bundle getBuyIntent(final int n, final String s, final String s2, final String s3, final String s4) throws RemoteException {
            return null;
        }
        
        @Override
        public Bundle getBuyIntentExtraParams(final int n, final String s, final String s2, final String s3, final String s4, final Bundle bundle) throws RemoteException {
            return null;
        }
        
        @Override
        public Bundle getBuyIntentToReplaceSkus(final int n, final String s, final List<String> list, final String s2, final String s3, final String s4) throws RemoteException {
            return null;
        }
        
        @Override
        public Bundle getPurchaseHistory(final int n, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
            return null;
        }
        
        @Override
        public Bundle getPurchases(final int n, final String s, final String s2, final String s3) throws RemoteException {
            return null;
        }
        
        @Override
        public Bundle getSkuDetails(final int n, final String s, final String s2, final Bundle bundle) throws RemoteException {
            return null;
        }
        
        @Override
        public int isBillingSupported(final int n, final String s, final String s2) throws RemoteException {
            return 0;
        }
        
        @Override
        public int isBillingSupportedExtraParams(final int n, final String s, final String s2, final Bundle bundle) throws RemoteException {
            return 0;
        }
        
        @Override
        public int stub(final int n, final String s, final String s2) throws RemoteException {
            return 0;
        }
    }
    
    public abstract static class Stub extends Binder implements IInAppBillingService
    {
        private static final String DESCRIPTOR = "com.android.vending.billing.IInAppBillingService";
        static final int TRANSACTION_consumePurchase = 5;
        static final int TRANSACTION_getBuyIntent = 3;
        static final int TRANSACTION_getBuyIntentExtraParams = 8;
        static final int TRANSACTION_getBuyIntentToReplaceSkus = 7;
        static final int TRANSACTION_getPurchaseHistory = 9;
        static final int TRANSACTION_getPurchases = 4;
        static final int TRANSACTION_getSkuDetails = 2;
        static final int TRANSACTION_isBillingSupported = 1;
        static final int TRANSACTION_isBillingSupportedExtraParams = 10;
        static final int TRANSACTION_stub = 6;
        
        public Stub() {
            this.attachInterface((IInterface)this, "com.android.vending.billing.IInAppBillingService");
        }
        
        public static IInAppBillingService asInterface(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface != null && queryLocalInterface instanceof IInAppBillingService) {
                return (IInAppBillingService)queryLocalInterface;
            }
            return new Proxy(binder);
        }
        
        public static IInAppBillingService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
        
        public static boolean setDefaultImpl(final IInAppBillingService sDefaultImpl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (sDefaultImpl != null) {
                Proxy.sDefaultImpl = sDefaultImpl;
                return true;
            }
            return false;
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
            if (n != 1598968902) {
                final Bundle bundle = null;
                Bundle bundle2 = null;
                final Bundle bundle3 = null;
                final Bundle bundle4 = null;
                switch (n) {
                    default: {
                        return super.onTransact(n, parcel, parcel2, n2);
                    }
                    case 10: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        n = parcel.readInt();
                        final String string = parcel.readString();
                        final String string2 = parcel.readString();
                        Bundle bundle5 = bundle4;
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                        }
                        n = this.isBillingSupportedExtraParams(n, string, string2, bundle5);
                        break;
                    }
                    case 9: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        n = parcel.readInt();
                        final String string3 = parcel.readString();
                        final String string4 = parcel.readString();
                        final String string5 = parcel.readString();
                        Bundle bundle6 = bundle;
                        if (parcel.readInt() != 0) {
                            bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                        }
                        final Bundle purchaseHistory = this.getPurchaseHistory(n, string3, string4, string5, bundle6);
                        parcel2.writeNoException();
                        if (purchaseHistory != null) {
                            parcel2.writeInt(1);
                            purchaseHistory.writeToParcel(parcel2, 1);
                        }
                        else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    }
                    case 8: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        n = parcel.readInt();
                        final String string6 = parcel.readString();
                        final String string7 = parcel.readString();
                        final String string8 = parcel.readString();
                        final String string9 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                        }
                        final Bundle buyIntentExtraParams = this.getBuyIntentExtraParams(n, string6, string7, string8, string9, bundle2);
                        parcel2.writeNoException();
                        if (buyIntentExtraParams != null) {
                            parcel2.writeInt(1);
                            buyIntentExtraParams.writeToParcel(parcel2, 1);
                        }
                        else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    }
                    case 7: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        final Bundle buyIntentToReplaceSkus = this.getBuyIntentToReplaceSkus(parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (buyIntentToReplaceSkus != null) {
                            parcel2.writeInt(1);
                            buyIntentToReplaceSkus.writeToParcel(parcel2, 1);
                        }
                        else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    }
                    case 6: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        n = this.stub(parcel.readInt(), parcel.readString(), parcel.readString());
                        break;
                    }
                    case 5: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        n = this.consumePurchase(parcel.readInt(), parcel.readString(), parcel.readString());
                        break;
                    }
                    case 4: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        final Bundle purchases = this.getPurchases(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (purchases != null) {
                            parcel2.writeInt(1);
                            purchases.writeToParcel(parcel2, 1);
                        }
                        else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    }
                    case 3: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        final Bundle buyIntent = this.getBuyIntent(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (buyIntent != null) {
                            parcel2.writeInt(1);
                            buyIntent.writeToParcel(parcel2, 1);
                        }
                        else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    }
                    case 2: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        n = parcel.readInt();
                        final String string10 = parcel.readString();
                        final String string11 = parcel.readString();
                        Bundle bundle7 = bundle3;
                        if (parcel.readInt() != 0) {
                            bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                        }
                        final Bundle skuDetails = this.getSkuDetails(n, string10, string11, bundle7);
                        parcel2.writeNoException();
                        if (skuDetails != null) {
                            parcel2.writeInt(1);
                            skuDetails.writeToParcel(parcel2, 1);
                        }
                        else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    }
                    case 1: {
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        n = this.isBillingSupported(parcel.readInt(), parcel.readString(), parcel.readString());
                        break;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(n);
                return true;
            }
            parcel2.writeString("com.android.vending.billing.IInAppBillingService");
            return true;
        }
        
        private static class Proxy implements IInAppBillingService
        {
            public static IInAppBillingService sDefaultImpl;
            private IBinder mRemote;
            
            Proxy(final IBinder mRemote) {
                this.mRemote = mRemote;
            }
            
            public IBinder asBinder() {
                return this.mRemote;
            }
            
            @Override
            public int consumePurchase(int n, final String s, final String s2) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        n = Stub.getDefaultImpl().consumePurchase(n, s, s2);
                        return n;
                    }
                    obtain2.readException();
                    n = obtain2.readInt();
                    return n;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public Bundle getBuyIntent(final int n, final String s, final String s2, final String s3, final String s4) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    obtain.writeString(s4);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBuyIntent(n, s, s2, s3, s4);
                    }
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public Bundle getBuyIntentExtraParams(final int n, final String s, final String s2, final String s3, final String s4, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    obtain.writeString(s4);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    try {
                        if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                            final Bundle buyIntentExtraParams = Stub.getDefaultImpl().getBuyIntentExtraParams(n, s, s2, s3, s4, bundle);
                            obtain2.recycle();
                            obtain.recycle();
                            return buyIntentExtraParams;
                        }
                        obtain2.readException();
                        Bundle bundle2;
                        if (obtain2.readInt() != 0) {
                            bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                        }
                        else {
                            bundle2 = null;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return bundle2;
                    }
                    finally {}
                }
                finally {}
                obtain2.recycle();
                obtain.recycle();
            }
            
            @Override
            public Bundle getBuyIntentToReplaceSkus(final int n, final String s, final List<String> list, final String s2, final String s3, final String s4) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeStringList((List)list);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    obtain.writeString(s4);
                    try {
                        if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                            final Bundle buyIntentToReplaceSkus = Stub.getDefaultImpl().getBuyIntentToReplaceSkus(n, s, list, s2, s3, s4);
                            obtain2.recycle();
                            obtain.recycle();
                            return buyIntentToReplaceSkus;
                        }
                        obtain2.readException();
                        Bundle bundle;
                        if (obtain2.readInt() != 0) {
                            bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                        }
                        else {
                            bundle = null;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return bundle;
                    }
                    finally {}
                }
                finally {}
                obtain2.recycle();
                obtain.recycle();
            }
            
            public String getInterfaceDescriptor() {
                return "com.android.vending.billing.IInAppBillingService";
            }
            
            @Override
            public Bundle getPurchaseHistory(final int n, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPurchaseHistory(n, s, s2, s3, bundle);
                    }
                    obtain2.readException();
                    Bundle bundle2;
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle2 = null;
                    }
                    return bundle2;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public Bundle getPurchases(final int n, final String s, final String s2, final String s3) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPurchases(n, s, s2, s3);
                    }
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public Bundle getSkuDetails(final int n, final String s, final String s2, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSkuDetails(n, s, s2, bundle);
                    }
                    obtain2.readException();
                    Bundle bundle2;
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle2 = null;
                    }
                    return bundle2;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int isBillingSupported(int n, final String s, final String s2) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        n = Stub.getDefaultImpl().isBillingSupported(n, s, s2);
                        return n;
                    }
                    obtain2.readException();
                    n = obtain2.readInt();
                    return n;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int isBillingSupportedExtraParams(int n, final String s, final String s2, final Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        n = Stub.getDefaultImpl().isBillingSupportedExtraParams(n, s, s2, bundle);
                        return n;
                    }
                    obtain2.readException();
                    n = obtain2.readInt();
                    return n;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public int stub(int n, final String s, final String s2) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        n = Stub.getDefaultImpl().stub(n, s, s2);
                        return n;
                    }
                    obtain2.readException();
                    n = obtain2.readInt();
                    return n;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
