/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.amber.signature.rsa;

import org.apache.amber.signature.AbstractMethodTestCase;
import org.junit.Test;

/**
 * 
 *
 * @version $Id$
 */
public final class RsaSha1MethodTestCase extends AbstractMethodTestCase {

    // TODO delete me once next test will be re-enabled
    @Test
    public void doNothing() {
        // do nothing
    }

    // TODO test disabled, expected signature has to be calculated
    public void verifyRsaSha1MethodAlgorithm() throws Exception {
        this.verifySignature(new PemRsaSha1VerifyingKey("kd94hf93k423kf44"),
                new RsaSha1Method(),
                "kd94hf93k423kf44&pfkkdhi9sl3r4s00");
    }

}
