package com.KMC.uploadimgaws.bucket;

public enum BucketName {
    PROFILE_IMAGE("kms-upload-image-aws");

    private String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
