package com.rayonit.CamerasProject.Datas;

import com.rayonit.CamerasProject.model.Camera;

import java.util.Optional;

public class CameraRepository {

    private ICameraRepository cameraRepository;

    public CameraRepository(ICameraRepository cameraRepository) {
        this.cameraRepository = cameraRepository;
    }

    public Optional<Camera> findById(String id){
        return cameraRepository.findById(id);
    }
}
