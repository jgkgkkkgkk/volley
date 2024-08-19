package com.volley.controller;

import com.volley.entities.Member;
import com.volley.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/save")
    public void insertMember(@RequestBody Member member) {
        memberService.createNewMember(member);
    }


    @GetMapping("/list")
    public List<Member> findAllMembers() {
        return memberService.getAllMembers();
    }
}
