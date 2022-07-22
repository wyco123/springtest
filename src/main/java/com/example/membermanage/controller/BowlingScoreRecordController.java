package com.example.membermanage.controller;

import com.example.membermanage.config.auth.PrincipalDetails;
import com.example.membermanage.entity.BowlingScore;
import com.example.membermanage.entity.Member;
import com.example.membermanage.service.BowlingScoreRecordService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BowlingScoreRecordController {

    private BowlingScoreRecordService bowlingScoreRecordService;


    @GetMapping("/bowling/scoreRecord/dailyScoreWrite")
    public String dailyScoreWrite(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {
        return "dailyScoreWrite";
    }

    @PostMapping("/bowling/scoreRecord/writing")
    public String dailyScoreWriting(BowlingScore bowlingScore) {




        return "redirect:/member/list";
    }
}
