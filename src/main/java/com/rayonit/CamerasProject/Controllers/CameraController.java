package com.rayonit.CamerasProject.Controllers;

import com.rayonit.CamerasProject.Datas.ICameraRepository;
import com.rayonit.CamerasProject.model.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/api/cameras")
public class CameraController {


    private final ICameraRepository repo;

    @Autowired
    public CameraController(ICameraRepository repo) {
        this.repo = repo;
    }


    @PostMapping
    public void createCamera(@RequestBody Camera camera){
        repo.save(camera);
    }

    @GetMapping
    public List<Camera> getCameras(){
        return repo.findAll();
    }


    // @GetMapping("/cameraId/{id}")
    @RequestMapping(value = "/camera", method = RequestMethod.GET)
    public Camera getCameraById(@RequestParam("id") String Id){
        Camera camera = this.repo.findCameraById(Id);

        return camera;
    }


    @RequestMapping(value = "/cameraForDelete", method = RequestMethod.DELETE)
    public void deleteCameraById(@RequestParam("id") String Id){
        repo.deleteById(Id);
    }

    @RequestMapping(value = "/IpAddressExists", method = RequestMethod.GET)
    public boolean checkIfIpAddressExists(@RequestParam("ipAddress") String ipAddress){
        return repo.existsByIpIs(ipAddress);
    }

    @RequestMapping(value = "/resolutions", method = RequestMethod.GET)
    public int getCamerasResolution(@RequestParam("resolution") String resolution){
        return repo.countCamerasByResolution(resolution);
    }

    @RequestMapping(value = "/camerasPage", method = RequestMethod.GET)
    public Page<Camera> getPaginatedCameras(Pageable pagination){

        // int totalCount = repo.countCameras();

        return repo.findAll(pagination);
    }
/*
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Optional<Camera> updateCamera(@PathVariable Long id, @RequestBody Camera camera){
        Optional<Camera> existingCamera = repo.findById(id);
        BeanUtils.copyProperties(camera, existingCamera, "Id");
        repo.save(existingCamera);

    }
*/
    /*
    //Mongo Template
    private final ICameraService cameraService;
    @GetMapping("cameraId/{id}")
    public Camera getCameraById(@PathVariable("id") String id){
        return cameraService.findById(id);
    }
*/


}
