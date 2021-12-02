// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006#" }, d2 = { "Lcom/untis/mobile/api/common/MobileDeviceDTO;", "", "", "component1", "component2", "component3", "component4", "component5", "deviceOs", "deviceId", "fcmToken", "environment", "product", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFcmToken", "()Ljava/lang/String;", "setFcmToken", "(Ljava/lang/String;)V", "getProduct", "setProduct", "getEnvironment", "setEnvironment", "getDeviceId", "setDeviceId", "getDeviceOs", "setDeviceOs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MobileDeviceDTO
{
    @e
    private String deviceId;
    @e
    private String deviceOs;
    @e
    private String environment;
    @e
    private String fcmToken;
    @e
    private String product;
    
    public MobileDeviceDTO() {
        this(null, null, null, null, null, 31, null);
    }
    
    public MobileDeviceDTO(@e final String deviceOs, @e final String deviceId, @e final String fcmToken, @e final String environment, @e final String product) {
        k0.p(deviceOs, "deviceOs");
        k0.p(deviceId, "deviceId");
        k0.p(fcmToken, "fcmToken");
        k0.p(environment, "environment");
        k0.p(product, "product");
        this.deviceOs = deviceOs;
        this.deviceId = deviceId;
        this.fcmToken = fcmToken;
        this.environment = environment;
        this.product = product;
    }
    
    @e
    public final String component1() {
        return this.deviceOs;
    }
    
    @e
    public final String component2() {
        return this.deviceId;
    }
    
    @e
    public final String component3() {
        return this.fcmToken;
    }
    
    @e
    public final String component4() {
        return this.environment;
    }
    
    @e
    public final String component5() {
        return this.product;
    }
    
    @e
    public final MobileDeviceDTO copy(@e final String s, @e final String s2, @e final String s3, @e final String s4, @e final String s5) {
        k0.p(s, "deviceOs");
        k0.p(s2, "deviceId");
        k0.p(s3, "fcmToken");
        k0.p(s4, "environment");
        k0.p(s5, "product");
        return new MobileDeviceDTO(s, s2, s3, s4, s5);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MobileDeviceDTO)) {
            return false;
        }
        final MobileDeviceDTO mobileDeviceDTO = (MobileDeviceDTO)o;
        return k0.g(this.deviceOs, mobileDeviceDTO.deviceOs) && k0.g(this.deviceId, mobileDeviceDTO.deviceId) && k0.g(this.fcmToken, mobileDeviceDTO.fcmToken) && k0.g(this.environment, mobileDeviceDTO.environment) && k0.g(this.product, mobileDeviceDTO.product);
    }
    
    @e
    public final String getDeviceId() {
        return this.deviceId;
    }
    
    @e
    public final String getDeviceOs() {
        return this.deviceOs;
    }
    
    @e
    public final String getEnvironment() {
        return this.environment;
    }
    
    @e
    public final String getFcmToken() {
        return this.fcmToken;
    }
    
    @e
    public final String getProduct() {
        return this.product;
    }
    
    @Override
    public int hashCode() {
        return (((this.deviceOs.hashCode() * 31 + this.deviceId.hashCode()) * 31 + this.fcmToken.hashCode()) * 31 + this.environment.hashCode()) * 31 + this.product.hashCode();
    }
    
    public final void setDeviceId(@e final String deviceId) {
        k0.p(deviceId, "<set-?>");
        this.deviceId = deviceId;
    }
    
    public final void setDeviceOs(@e final String deviceOs) {
        k0.p(deviceOs, "<set-?>");
        this.deviceOs = deviceOs;
    }
    
    public final void setEnvironment(@e final String environment) {
        k0.p(environment, "<set-?>");
        this.environment = environment;
    }
    
    public final void setFcmToken(@e final String fcmToken) {
        k0.p(fcmToken, "<set-?>");
        this.fcmToken = fcmToken;
    }
    
    public final void setProduct(@e final String product) {
        k0.p(product, "<set-?>");
        this.product = product;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MobileDeviceDTO(deviceOs=");
        sb.append(this.deviceOs);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", fcmToken=");
        sb.append(this.fcmToken);
        sb.append(", environment=");
        sb.append(this.environment);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(')');
        return sb.toString();
    }
}
