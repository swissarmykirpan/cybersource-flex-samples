/**
* Copyright (c) 2016 by CyberSource
* Governing licence: https://github.com/CyberSource/cybersource-flex-samples/blob/master/LICENSE.md
*/

package com.cybersource.flex.models;

import java.io.Serializable;

public class KeyParameters implements Serializable {

    private String profileId;
    private String encryptionType;

    public String getProfileId() {
        return profileId;
    }
    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getEncryptionType() {
        return encryptionType;
    }
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

}
