package com.volley.service;

import com.volley.dto.MemberDto;
import com.volley.entities.Member;
import com.volley.entities.Team;
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
    private final TeamService teamService;

    public List<Member> getAllMembers() {return memberRepo.findAll();}

    public void createNewMember(MemberDto createMemberDto) {
        Optional<Member> dbMember = memberRepo.findByEmail(createMemberDto.getEmail());
        if (dbMember.isPresent()) {
            throw new EmailAlreadyExist("This Email already exist, please create new.");
        }
        Team team = teamService.getTeamById(createMemberDto.getTeamId());
        memberRepo.save(createMemberDto.buildMember(team));
    }

    public void deleteMemberById(Integer id) {
        memberRepo.deleteById(id);
    }
}
