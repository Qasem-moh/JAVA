package com.KMC.uploadimgaws.fileStore;

import com.amazonaws.services.appstream.model.AmazonAppStreamException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

public class FileStore {
    private final AmazonS3 s3;

    @Autowired
    public FileStore(AmazonS3 s3) {
        this.s3 = s3;
    }


    public void save(String path,
                     String fileName,
                     Optional<Map<String, String>> optionalMetadata,
                     InputStream inputStream) {
        ObjectMetadata metadata = new ObjectMetadata();
        optionalMetadata.ifPresent(map -> {
            if (!map.isEmpty()) {
                map.forEach(metadata::addUserMetadata);
            }
        });
        try {
            s3.putObject(path, fileName, inputStream, metadata);
        }catch (AmazonAppStreamException e){
            throw new IllegalStateException("Failed to save file to S3", e);
        }
    }

}















