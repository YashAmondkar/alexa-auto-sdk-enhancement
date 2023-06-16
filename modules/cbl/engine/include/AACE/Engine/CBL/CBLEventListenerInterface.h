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

#ifndef AACE_ENGINE_CBL_CBL_EVENT_LISTENER_INTERFACE_H
#define AACE_ENGINE_CBL_CBL_EVENT_LISTENER_INTERFACE_H

#include <string>

namespace aace {
namespace engine {
namespace cbl {

class CBLEventListenerInterface {
public:
    virtual ~CBLEventListenerInterface() = default;

    virtual void onCBLCode(const std::string& url, const std::string& code) = 0;
};

}  // namespace cbl
}  // namespace engine
}  // namespace aace

#endif  // AACE_ENGINE_CBL_CBL_EVENT_LISTENER_INTERFACE_H