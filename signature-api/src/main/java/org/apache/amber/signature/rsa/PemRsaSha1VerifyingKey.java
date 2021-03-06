/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.amber.signature.rsa;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.security.interfaces.RSAPublicKey;

import org.apache.amber.signature.SignatureException;
import org.apache.amber.signature.VerifyingKey;

/**
 * 
 *
 * @version $Id$
 */
public final class PemRsaSha1VerifyingKey
        extends AbstractRsaSha1Key<RSAPublicKey>
        implements VerifyingKey {

    public PemRsaSha1VerifyingKey(File certificateFileLocation)
            throws SignatureException {
        super(certificateFileLocation);
    }

    public PemRsaSha1VerifyingKey(String certificateClasspathLocation)
            throws SignatureException {
        super(certificateClasspathLocation);
    }

    public PemRsaSha1VerifyingKey(URL certificateURL) throws SignatureException {
        super(certificateURL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected RSAPublicKey readCertificate(InputStream input) throws Exception {
        PemCertificateParser pemCertificateParser = new PemCertificateParser(input);
        return pemCertificateParser.parsePublicCertificate();
    }

}
