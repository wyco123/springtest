package com.example.membermanage.repository;

import com.example.membermanage.entity.BowlingScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BowlingScoreRecordRepository extends JpaRepository<BowlingScore, Integer> {
}
