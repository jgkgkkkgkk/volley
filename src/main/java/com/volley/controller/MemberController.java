package com.volley.controller;

import com.volley.dto.MemberDto;
import com.volley.entities.Hollyday;
import com.volley.entities.Member;
import com.volley.entities.Team;
import com.volley.exceptions.NotFoundException;
import com.volley.repo.MemberRepo;
import com.volley.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberRepo memberRepo;

    @PostMapping("/save")
    public void insertMember(@RequestBody MemberDto member) {
        memberService.createNewMember(member);
    }

//    public Member getMemberById(Integer id) {
//        return memberRepo.findById(id).orElseThrow(NotFoundException::new);
//    }
    @PutMapping("/{id}")
    public Member updateMemberById(@PathVariable Integer id, @RequestBody MemberDto memberDto) {
        return memberService.updateMemberById(id, memberDto);
    }

    @GetMapping("/list")
    public List<MemberDto> findAllMembers() {

        List<Member> memberList = memberService.getAllMembers();

        return memberList.stream().map(o -> (new MemberDto(o.getId(), o.getFirstname(),
                o.getLastname(), o.getAge(), o.getHeight(),
                o.getEmail(), o.getTeam().getId()))).toList();

    }

    @DeleteMapping("/{id}")
    public void deleteMemberById(@PathVariable Integer id) {
        memberService.deleteMemberById(id);
    }

}
