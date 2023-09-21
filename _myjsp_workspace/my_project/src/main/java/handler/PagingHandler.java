package handler;

import domain.PagingVO;

public class PagingHandler {
	private int startPagination;//현재 화면에서 보여지는 시작 페이지네이션 번호
	private int endPagination;//현재 화면에 보여지는 끝 페이지네이션 번호
	private int realEndPagination;//실제 마지막 페이지네이션 번호
	private boolean prev,next;//이전, 다음페이지 존재여부(있거나, 없거나임)
	private int paginationCnt=10; //한 화면에 보이는 페이지네이션 갯수(10개로 고정)
	
	private PagingVO pgv; //현재 페이지네이션 번호, 한 페이지의 게시물 수
	private int totalCnt;//전체 게시글 수
	
	public PagingHandler(PagingVO pgv, int totalCnt) {
		this.pgv=pgv;
		this.totalCnt=totalCnt;
		
		//paginaionNo => PageIndexStart 
		//1 => 0 부터 10개(paginationCnt)
		//2 => 10
		//3 => 20
		this.endPagination=
				(int)Math.ceil(pgv.getpaginaionNo()/(double)paginationCnt)*paginationCnt;
				
		this.startPagination=
				this.endPagination-9;
		
		this.realEndPagination=(int)Math.ceil(this.totalCnt/(double)pgv.getQty());
	
		if(this.endPagination>this.realEndPagination) {
			this.endPagination=this.realEndPagination;
		}
		
		//startPagination는 1,11,22,33(1이 아니라는건 최소 11이라는거)
		this.prev=this.startPagination>1;
		this.next=this.endPagination<this.realEndPagination;
	}

	public int getStartPagination() {
		return startPagination;
	}

	public void setStartPagination(int startPagination) {
		this.startPagination = startPagination;
	}

	public int getEndPagination() {
		return endPagination;
	}

	public void setEndPagination(int endPagination) {
		this.endPagination = endPagination;
	}

	public int getRealEndPagination() {
		return realEndPagination;
	}

	public void setRealEndPagination(int realEndPagination) {
		this.realEndPagination = realEndPagination;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getPaginationCnt() {
		return paginationCnt;
	}

	public void setPaginationCnt(int paginationCnt) {
		this.paginationCnt = paginationCnt;
	}

	public PagingVO getPgv() {
		return pgv;
	}

	public void setPgv(PagingVO pgv) {
		this.pgv = pgv;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

}
