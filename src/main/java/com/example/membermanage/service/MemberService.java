package com.example.membermanage.service;

import com.example.membermanage.entity.Member;
import com.example.membermanage.repository.MemberRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    // 회원정보 작성 및 저장
    public void write(Member member) {

        memberRepository.save(member);
    }


    // 회원 리스트 모두 불러오기
    public List<Member> memberList() {
        return memberRepository.findAll();
    }


    // 특정 회원 정보 불러오기
    public Member memberView(Integer id) {

        return memberRepository.findById(id).get();
    }


    // 특정 게시글 삭제
    public void memberDelete(Integer id) {

        memberRepository.deleteById(id);
    }


    ///////////////////////////////////////////////
    // 기능 구현 함수들 //

    public Member setBeforeWriting(Member member) {
        // 신청일자 셋팅
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        if ("".equalsIgnoreCase(member.getJoinDate())) {
            String dateString = format.format(date);
            member.setJoinDate(dateString); // 비어 있는 경우 오늘 날짜 insert
        }
        else {
            member.setJoinDate(member.getJoinDate());
        }
        return member;
    }




    public Member setBeforeUpdating(Member member, Member update) {

        update.setGrade(member.getGrade());
        update.setName(member.getName());
        update.setPeriod(member.getPeriod());
        update.setJoinDate(member.getJoinDate());
        update.setAddress(member.getAddress());
        update.setPhone(member.getPhone());

        return update;
    }

}

