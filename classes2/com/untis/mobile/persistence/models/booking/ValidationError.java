// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.booking;

import android.os.Parcel;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ValidationError<Source extends Parcelable> implements Parcelable
{
    public static final Parcelable$Creator<ValidationError> CREATOR;
    @j0
    public String code;
    @j0
    public BookingErrorData data;
    @j0
    public String details;
    @k0
    public Source source;
    @j0
    public String title;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ValidationError>() {
            public ValidationError createFromParcel(final Parcel parcel) {
                return new ValidationError(parcel);
            }
            
            public ValidationError[] newArray(final int n) {
                return new ValidationError[n];
            }
        };
    }
    
    public ValidationError() {
        this.code = "";
        this.title = "";
        this.details = "";
        this.data = new BookingErrorData();
    }
    
    protected ValidationError(final Parcel parcel) {
        this.code = parcel.readString();
        this.title = parcel.readString();
        this.details = parcel.readString();
        this.data = (BookingErrorData)parcel.readParcelable(this.getClass().getClassLoader());
        this.source = (Source)parcel.readParcelable(this.getClass().getClassLoader());
    }
    
    public ValidationError(@j0 final String code, @j0 final String title, @j0 final String details, @j0 final BookingErrorData data, final Source source) {
        this.code = code;
        this.title = title;
        this.details = details;
        this.data = data;
        this.source = source;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @j0
    public String getCode() {
        return this.code;
    }
    
    @j0
    public BookingErrorData getData() {
        return this.data;
    }
    
    @j0
    public String getDetails() {
        return this.details;
    }
    
    @k0
    public Source getSource() {
        return this.source;
    }
    
    @j0
    public String getTitle() {
        return this.title;
    }
    
    public void setCode(@j0 final String code) {
        this.code = code;
    }
    
    public void setData(@j0 final BookingErrorData data) {
        this.data = data;
    }
    
    public void setDetails(@j0 final String details) {
        this.details = details;
    }
    
    public void setSource(@k0 final Source source) {
        this.source = source;
    }
    
    public void setTitle(@j0 final String title) {
        this.title = title;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.code);
        parcel.writeString(this.title);
        parcel.writeString(this.details);
        parcel.writeParcelable((Parcelable)this.data, n);
        parcel.writeParcelable((Parcelable)this.source, n);
    }
}
