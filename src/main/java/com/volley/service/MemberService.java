package com.volley.service;

import com.volley.entities.Member;
import com.volley.exceptions.EmailAlreadyExist;
import com.volley.repo.MemberRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class MemberService {
    private final MemberRepo memberRepo;

        public List<Member> getAllMembers() {
        return memberRepo.findAll();


    }

    public void createNewMember(Member member){
            Optional<Member> dbMember=memberRepo.findByEmail(member.getEmail());
        if(dbMember.isPresent()){
            throw new EmailAlreadyExist("this Email already exist!,Please create new");
        }
        memberRepo.save(member);
    }
}
