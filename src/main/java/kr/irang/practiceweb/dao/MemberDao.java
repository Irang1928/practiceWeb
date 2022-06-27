package kr.irang.practiceweb.dao;

import kr.irang.practiceweb.dto.Member;

import java.util.List;

public interface MemberDao {
    public List<Member> selectAll();
}
