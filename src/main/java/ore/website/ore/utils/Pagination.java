package ore.website.ore.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pagination {
    private int pageNo; // 현재 페이지
    private int pageSize = 5; // 한 페이지당 글 목록 개수
    private int totalCount; // 전체 글 개수
    private int startNo; // 현재 페이지 글 목록의 시작 번호
    private int endNo; // 마지막 번호
    private int startPage; // 페이지 이동 버튼의 시작 번호
    private int endPage; // 마지막 번호
    private int totalPage;
    private int noticeNo; // 게시물 번호

    public Pagination(int pageNo, int totalCount) {

        this.totalCount = totalCount;

        // 페이지 개수
        totalPage = (totalCount - 1) / pageSize + 1;

        // 1보다 작거나 totalPage보다 큰 값이 전달 되었을 경우
        this.pageNo = (pageNo < 1) ? 1 : pageNo;
        this.pageNo = (pageNo > totalPage) ? totalPage : pageNo;

        startNo = (this.pageNo - 1) * pageSize + 1;
        endNo = startNo + (pageSize - 1);
        this.endNo = this.endNo > totalCount ? totalCount : this.endNo;

        startPage = (this.pageNo - 1) / pageSize * pageSize + 1;
        endPage =  startPage + pageSize - 1;
        this.endPage = this.endPage > totalPage ? totalPage : this.endPage;



    }


}
