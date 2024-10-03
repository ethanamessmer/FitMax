package com.fitmax.backend.Controllers.Exercise;

import com.fitmax.backend.Entities.ExerciseEntity;
import com.fitmax.backend.Repos.ExerciseRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseCRUDController {

    @Autowired
    protected ExerciseRepository exerciseRepository;

    @PostMapping(path = "excercise")
    public @ResponseBody ExerciseEntity createExercise(@RequestBody ExerciseEntity exercise){

        return exercise;
    }

    @GetMapping(path = "excercise/{id}")
    public @ResponseBody ExerciseEntity getExercise(@PathVariable Long id ){
        ExerciseEntity get = exerciseRepository.findById(id).get();
        return get;
    }



}
