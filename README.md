# Catch Takza <img src="https://github.com/dev-hooon/catchtable/assets/54973090/0d4ebc7d-0ee8-4275-b1a9-45be69ed8d86" align=left width=100>
> 캐치테이블 클론 프로젝트 (2023.12 ~ 2024.1)
<br>

### 🎯 프로젝트 목표
1. 캐치테이블 클론 코딩을 통해 도메인&요구사항 분석 능력 향상
2. 모든 기능에 대한 테스트 코드 작성 및 CI 검증을 통한 안정화
3. 코드 리뷰를 통한 코드 이해도 향상 및 코드 품질 개선

### 🌟 담당 구현 기능
- [Redis를 list 자료구조 활용해 대기열 구현](https://hyun-deving.tistory.com/27)
  
  | 기능       | 구현 방식                                                         |
  |------------|--------------------------------------------------------------|
  | 대기 생성  | 비관적 락을 사용해 대기 생성 시 동시성 이슈 처리               |
  | 대기 취소  | 매일 자정 스케줄러를 돌려 Redis를 비우고, [bulk update 호출해 대기 상태 변경](https://hyun-deving.tistory.com/30) |
  | 대기 조회  | fetch join을 활용해 DB 접근 최소화                            |
- [RestDocs를 활용한 API 명세](https://hyun-deving.tistory.com/25)

<br>

## 🛠️ 기술 스택
<img src="https://img.shields.io/badge/java%2017-262261?style=for-the-badge&logo=openjdk&logoColor=white"> <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"><img src="https://img.shields.io/badge/Spring%20Boot%203.2-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=Spring%20JPA&logoColor=white">  <img src="https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=Spring%20Security&logoColor=white"><br>
<img src="https://img.shields.io/badge/QueryDsl-4169E1?style=for-the-badge&logo=QueryDsl&logoColor=white"> <img src="https://img.shields.io/badge/mysql%208.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=redis&logoColor=white"> <img src="https://img.shields.io/badge/GitHub%20Actions-2088FF?style=for-the-badge&logo=GitHub%20Actions&logoColor=white"> <img src="https://img.shields.io/badge/spring%20rest%20docs-6DB33F?style=for-the-badge&logo=spring&logoColor=white">

<br>

## 📁 ERD ([상세보기](https://www.erdcloud.com/d/JM2dKzW2P69EuAWGf))
<img width="1000" alt="Untitled" src="https://github.com/dev-hooon/catchtable/assets/102799700/310f45e9-404d-44e8-b664-32148b69e27b">

## 👥 팀원 구성

| SM | PO | Dev |
|:--:|:--:|:--:|
| [김강훈](https://github.com/kkangh00n) | [최인준](https://github.com/dlswns2480) | [손가현](https://github.com/hyun2371) |
| <img width="80" src="https://avatars.githubusercontent.com/u/102799700?v=4"> | <img width="80" src="https://avatars.githubusercontent.com/u/54973090?v=4"> | <img width="80" src="https://avatars.githubusercontent.com/u/77109954?v=4"> |
