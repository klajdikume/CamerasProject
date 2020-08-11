package com.rayonit.CamerasProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("Camera")
public class Camera {

    @Id
    @MongoId(value = FieldType.OBJECT_ID)
    @Indexed(name = "id_index", direction = IndexDirection.ASCENDING)
    private String id;
    private String name;

    private String model;
    private String resolution;
    private String ip;

    public Camera() {
    }

    public Camera(String id, String name, String model, String resolution, String ip) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.resolution = resolution;
        this.ip = ip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResolution() {
        return this.resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
