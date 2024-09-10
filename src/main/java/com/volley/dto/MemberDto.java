package com.volley.dto;

import com.volley.entities.Member;
import com.volley.entities.Team;
import lombok.Data;

@Data
public class MemberDto {

    public MemberDto() {
    }

    public MemberDto(int id, String firstname, String lastname, String age, int height, String email, int teamId) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.email = email;
        this.teamId = teamId;
    }

    private int id;
    private String firstname;
    private String lastname;
    private String age;
    private int height;
    private String email;
    private int teamId;

    public Member buildMember(Team team) {
        Member newMember = new Member();
        newMember.setFirstname(this.firstname);
        newMember.setLastname(this.lastname);
        newMember.setAge(this.age);
        newMember.setHeight(this.height);
        newMember.setEmail(this.email);
        newMember.setTeam(team);
        return newMember;
    }
}
