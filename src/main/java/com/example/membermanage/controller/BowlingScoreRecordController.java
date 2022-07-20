package com.example.membermanage.controller;

import com.example.membermanage.config.auth.PrincipalDetails;
import com.example.membermanage.entity.Member;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BowlingScoreRecordController {


    @GetMapping("/bowling/scoreRecord/dailyScoreWrite")
    public String memberList(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {


        return "dailyScoreWrite";
    }
}
