/**
 * Copyright 2017 Comcast Cable Communications Management, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author Alexander Binkovsky (abinkovski@productengine.com)
 */

package com.comcast.redirector.api.redirector.service.pending;

import com.comcast.redirector.api.ApplicationStatusMode;
import com.comcast.redirector.api.model.offlinemode.OperationResult;

public interface IPendingEntityWriteService<T> {
    void cancel(String appName, String id, int version);
    OperationResult cancel(String appName, String id, ApplicationStatusMode mode);
    void approve(String appName, String id, int version);
    OperationResult approve(String appName, String id, ApplicationStatusMode mode);
    OperationResult save(String appName, String id, T pending, T current, ApplicationStatusMode mode);
    void save(String appName, String id, T pending, T current);
}
