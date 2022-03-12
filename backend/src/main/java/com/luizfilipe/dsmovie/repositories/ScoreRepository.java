package com.luizfilipe.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfilipe.dsmovie.entities.Score;
import com.luizfilipe.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
