package com.rayonit.CamerasProject.Datas;

import com.rayonit.CamerasProject.model.Camera;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ICameraRepository extends MongoRepository<Camera, String>, PagingAndSortingRepository<Camera, String> {
    boolean existsByIpIs(String ip);
    Camera findCameraById(String id);
    int countCamerasByResolution(String resolution);
    // int countCameras();
    Page<Camera> findAll(Pageable pageable);
}
