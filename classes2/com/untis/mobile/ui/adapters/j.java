// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import androidx.annotation.j0;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.utils.time.a;
import org.joda.time.c;
import android.os.Parcel;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.exam.Exam;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;

public class j extends r
{
    public j(final FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    
    public int getCount() {
        return 0;
    }
    
    public Fragment getItem(final int n) {
        return null;
    }
    
    public static class a implements Parcelable
    {
        public static final Parcelable$Creator<a> CREATOR;
        private String G;
        private Exam H;
        private HomeWork I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                public a a(final Parcel parcel) {
                    return new a(parcel);
                }
                
                public a[] b(final int n) {
                    return new a[n];
                }
            };
        }
        
        protected a(final Parcel parcel) {
            this.H = (Exam)parcel.readParcelable(Exam.class.getClassLoader());
            this.I = (HomeWork)parcel.readParcelable(HomeWork.class.getClassLoader());
            this.G = parcel.readString();
        }
        
        public a(final HomeWork i, final String g) {
            this.I = i;
            this.G = g;
        }
        
        public a(final Exam h, final String g) {
            this.H = h;
            this.G = g;
        }
        
        public a(final String g) {
            this.G = g;
        }
        
        public String a() {
            if (this.j()) {
                return this.c().getName();
            }
            if (this.k()) {
                return this.d().getText();
            }
            return "";
        }
        
        public c b() {
            if (this.k()) {
                return this.d().getEnd();
            }
            if (this.j()) {
                return this.c().getEnd();
            }
            return com.untis.mobile.utils.time.a.a();
        }
        
        public Exam c() {
            return this.H;
        }
        
        public HomeWork d() {
            return this.I;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public long e() {
            if (this.j()) {
                return this.c().getId();
            }
            if (this.k()) {
                return this.d().getId();
            }
            return 0L;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean equals = true;
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final a a = (a)o;
                final Exam h = this.H;
                Label_0064: {
                    if (h != null) {
                        if (h.equals(a.H)) {
                            break Label_0064;
                        }
                    }
                    else if (a.H == null) {
                        break Label_0064;
                    }
                    return false;
                }
                final HomeWork i = this.I;
                final HomeWork j = a.I;
                if (i != null) {
                    equals = i.equals(j);
                }
                else if (j != null) {
                    equals = false;
                }
                return equals;
            }
            return false;
        }
        
        public String f() {
            return this.G;
        }
        
        public c g() {
            if (this.k()) {
                return this.d().getStart();
            }
            if (this.j()) {
                return this.c().getStart();
            }
            return com.untis.mobile.utils.time.a.a();
        }
        
        @j0
        public Long h() {
            long l;
            if (this.j() && this.H.getEntityType().equals(EntityType.STUDENT)) {
                l = this.c().getEntityId();
            }
            else if (this.k() && this.I.getEntityType().equals(EntityType.STUDENT)) {
                l = this.d().getEntityId();
            }
            else {
                l = 0L;
            }
            return l;
        }
        
        @Override
        public int hashCode() {
            final Exam h = this.H;
            int hashCode = 0;
            int hashCode2;
            if (h != null) {
                hashCode2 = h.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final HomeWork i = this.I;
            if (i != null) {
                hashCode = i.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        public EntityType i() {
            if (this.j()) {
                return EntityType.EXAM;
            }
            if (this.k()) {
                return EntityType.HOMEWORK;
            }
            return EntityType.NONE;
        }
        
        public boolean j() {
            return this.H != null;
        }
        
        public boolean k() {
            return this.I != null;
        }
        
        public void l(final String g) {
            this.G = g;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable((Parcelable)this.H, n);
            parcel.writeParcelable((Parcelable)this.I, n);
            parcel.writeString(this.G);
        }
    }
}
