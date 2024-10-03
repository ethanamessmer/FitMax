package com.fitmax.backend.Repos;

import com.fitmax.backend.Entities.ExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<ExerciseEntity,Long> {
}
