package com.volley.dto;

import com.volley.entities.Member;
import com.volley.entities.Team;
import lombok.Data;

@Data
public class CreateMemberDto {

    private String firstName;
    private String lastName;
    private String age;
    private int height;
    private String email;
    private int teamId;

    public Member buildMember(Team team) {
        Member newMember = new Member();
        newMember.setFirstName(this.firstName);
        newMember.setLastName(this.lastName);
        newMember.setAge(this.age);
        newMember.setHeight(this.height);
        newMember.setEmail(this.email);
        newMember.setTeam(team);
        return newMember;
    }
}
