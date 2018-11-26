package com.bizpoll.shop_CSone.dto;

// 검색기준 또는 분류기준
public class CriteriaDTO {
	private int page; // 페이지번호(하단의 번호들 클릭)
	private int perPageNum; // 한 페이지에 보여줄 게시글 수
	private String keyword; // 검색 키워드
	private String flag; // 검색 타입
	private String code; // 정렬 타입
	
	public CriteriaDTO() {
		this.page = 1;
		this.perPageNum = 10;
		this.code = "new";
	}

	public CriteriaDTO(int page, int perPageNum, String keyword) {
		super();
		this.page = page;
		this.perPageNum = perPageNum;
		this.keyword = keyword;
	}
	
	public CriteriaDTO(int page, int perPageNum, String keyword, String flag, String code) {
		super();
		this.page = page;
		this.perPageNum = perPageNum;
		this.keyword = keyword;
		this.flag = flag;
		this.code = code;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) { // page = 2
		if(page <= 0 ) { // page가 1보다 높기 때문에 if문 타지 않음
			this.page = 1;
			return;
		}
		this.page = page;
	} // 호출한 곳으로 돌아감

	// method for MyBatis SQL Mapper: 조회 시작 row 취득하는 메서드
	public int getPageStart() {
		return(((this.page-1)*perPageNum)+1);
	}
	
	// method for MyBatis SQL Mapper: 조회 마지막 row 취득하는 메서드
	public int getPerPageNum() {
		return this.page *perPageNum;
		// 2페이지 * 10 = 20번 게시글까지 출력
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "CriteriaDTO [page=" + page + ", perPageNum=" + perPageNum + ", keyword=" + keyword + ", flag=" + flag
				+ ", code=" + code + "]";
	}

	
 	
}
