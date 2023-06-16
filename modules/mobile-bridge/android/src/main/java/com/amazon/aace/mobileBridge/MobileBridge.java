/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.aace.mobileBridge;

import com.amazon.aace.core.PlatformInterface;

abstract public class MobileBridge extends PlatformInterface {
    public MobileBridge() {}

    public final void start(int tunFd) {
        start(getNativeRef(), tunFd);
    }

    public final void stop() {
        stop(getNativeRef());
    }

    // NativeRef implementation
    final protected long createNativeRef() {
        return createBinder();
    }

    final protected void disposeNativeRef(long nativeRef) {
        disposeBinder(nativeRef);
    }

    // Native Engine JNI methods
    private native long createBinder();
    private native void disposeBinder(long nativeRef);

    private native void start(long nativeRef, int tunFd);
    private native void stop(long nativeRef);
}

// END OF FILE
