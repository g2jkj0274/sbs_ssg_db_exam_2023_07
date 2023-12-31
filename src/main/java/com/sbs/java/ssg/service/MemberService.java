package com.sbs.java.ssg.service;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.dao.MemberDao;
import com.sbs.java.ssg.dto.Member;
public class MemberService {
	private MemberDao memberDao;

	public MemberService() {
		memberDao = Container.memberDao;
	}
	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}
	public int join(String loginId, String loginPw, String name) {
		Member member = new Member(loginId, loginPw, name);
		return memberDao.join(member);
	}

	public String getMemberByNameId(int memberId) {
		return null;
	}
}
