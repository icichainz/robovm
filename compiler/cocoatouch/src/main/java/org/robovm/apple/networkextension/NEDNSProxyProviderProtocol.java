/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.networkextension;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEDNSProxyProviderProtocol/*</name>*/ 
    extends /*<extends>*/NEVPNProtocol/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEDNSProxyProviderProtocolPtr extends Ptr<NEDNSProxyProviderProtocol, NEDNSProxyProviderProtocolPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEDNSProxyProviderProtocol.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEDNSProxyProviderProtocol() {}
    protected NEDNSProxyProviderProtocol(Handle h, long handle) { super(h, handle); }
    protected NEDNSProxyProviderProtocol(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "providerConfiguration")
    public native NSDictionary<NSString, ?> getProviderConfiguration();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setProviderConfiguration:")
    public native void setProviderConfiguration(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "providerBundleIdentifier")
    public native String getProviderBundleIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setProviderBundleIdentifier:")
    public native void setProviderBundleIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
