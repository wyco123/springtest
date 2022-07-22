package com.example.membermanage.service;

import com.example.membermanage.entity.BowlingScore;
import com.example.membermanage.repository.BowlingScoreRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BowlingScoreRecordService {

    @Autowired
    private BowlingScoreRecordRepository bowlingScoreRecordRepository;


    public void write(BowlingScore bowlingScore) {
        bowlingScoreRecordRepository.save(bowlingScore);
    }

}
