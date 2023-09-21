package serivce;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controller.memberController;
import domain.MemberVO;
import domain.PagingVO;
import repository.MemberDAO;
import repository.MemberDAOImpl;

public class MemberServiceImpl implements MerberService {
	//로그 객체
	private static final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	//MemberDAO interface
	private MemberDAO mdao;
	
	public MemberServiceImpl() {
		mdao = new MemberDAOImpl();	
	}

	//login
	public MemberVO getLoginMvo(MemberVO mvo) {
		log.info("login service ok");
		return mdao.getLoginMvo(mvo);
	}

	//join
	public int join(MemberVO mvo) {
		log.info("join service ok");
		return mdao.join(mvo);
	}

	//logout
	public int logout(String id) {
		log.info("logout service ok");
		return mdao.logout(id);
	}

	//remove
	public int remove(String id) {
		log.info("remove service ok");
		return mdao.remove(id);
	}

	//detail
	public MemberVO getDetail(String id) {
		log.info("detail service ok");
		return mdao.detail(id);
	}

	//memberTotalCnt
	public int getMemberTotalCnt(PagingVO pgv) {
		log.info("memberTotalCnt service ok");
		return mdao.getMemberTotalCnt(pgv);
	}

	//getList
	public List<MemberVO> getList(PagingVO pgv) {
		log.info("getList service ok");
		return mdao.getList(pgv);
	}
	
}
