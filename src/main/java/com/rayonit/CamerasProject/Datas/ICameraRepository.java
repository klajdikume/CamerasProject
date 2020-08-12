package com.rayonit.CamerasProject.Datas;

import com.rayonit.CamerasProject.model.Camera;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Repository
public interface ICameraRepository extends MongoRepository<Camera, String> {
    boolean existsByIpIs(String ip);
    Camera findCameraById(String id);
    int countCamerasByResolution(String resolution);
}
