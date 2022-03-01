package com.KMC.uploadimgaws.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private UUID userProfileId;
    private String userName;
    private String userProfileImagelink; //s3 key

    public UserProfile(UUID userProfileId,
                       String userName,
                       String userProfileImagelink) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        this.userProfileImagelink = userProfileImagelink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Optional<String> getUserProfileImagelink() {
        return Optional.ofNullable( userProfileImagelink);
    }

    public void setUserProfileImagelink(String userProfileImagelink) {
        this.userProfileImagelink = userProfileImagelink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId,that.userProfileId) &&
               Objects.equals(userName,that.userName)
                && Objects.equals(userProfileImagelink,that.userProfileImagelink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, userName, userProfileImagelink);
    }
}
