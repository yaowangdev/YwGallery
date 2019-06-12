package com.appdev.gallery.lib;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaFile implements Parcelable {
    private int id;              //文件id
    private String uuid;            //唯一标识id
    private String name;            //文件名
    private String shotName;        //截图文件名(视频)
    private String thumbName;       //缩略图文件名(视频，图片)
    private String path;            //文件路径
    private String shotPath;        //截图路径(视频)
    private String thumbPath;       //缩略图(视频，图片)
    private long size;              //文件大小，单位为byte
    private long timeInterval;      //时长，单位为毫秒(视频，音频)
    private String mimeType;        //文件的类型
    private long createTime;        //创建时间
    private boolean isOriginal;     //是否是原图(图片)
    private int icon;               //图标

    public MediaFile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShotName() {
        return shotName;
    }

    public void setShotName(String shotName) {
        this.shotName = shotName;
    }

    public String getThumbName() {
        return thumbName;
    }

    public void setThumbName(String thumbName) {
        this.thumbName = thumbName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getShotPath() {
        return shotPath;
    }

    public void setShotPath(String shotPath) {
        this.shotPath = shotPath;
    }

    public String getThumbPath() {
        return thumbPath;
    }

    public void setThumbPath(String thumbPath) {
        this.thumbPath = thumbPath;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(long timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    public void setOriginal(boolean original) {
        isOriginal = original;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.uuid);
        dest.writeString(this.name);
        dest.writeString(this.shotName);
        dest.writeString(this.thumbName);
        dest.writeString(this.path);
        dest.writeString(this.shotPath);
        dest.writeString(this.thumbPath);
        dest.writeLong(this.size);
        dest.writeLong(this.timeInterval);
        dest.writeString(this.mimeType);
        dest.writeLong(this.createTime);
        dest.writeByte(this.isOriginal ? (byte) 1 : (byte) 0);
        dest.writeInt(this.icon);
    }

    protected MediaFile(Parcel in) {
        this.id = in.readInt();
        this.uuid = in.readString();
        this.name = in.readString();
        this.shotName = in.readString();
        this.thumbName = in.readString();
        this.path = in.readString();
        this.shotPath = in.readString();
        this.thumbPath = in.readString();
        this.size = in.readLong();
        this.timeInterval = in.readLong();
        this.mimeType = in.readString();
        this.createTime = in.readLong();
        this.isOriginal = in.readByte() != 0;
        this.icon = in.readInt();
    }

    public static final Parcelable.Creator<MediaFile> CREATOR = new Parcelable.Creator<MediaFile>() {
        @Override
        public MediaFile createFromParcel(Parcel source) {
            return new MediaFile(source);
        }

        @Override
        public MediaFile[] newArray(int size) {
            return new MediaFile[size];
        }
    };
}
