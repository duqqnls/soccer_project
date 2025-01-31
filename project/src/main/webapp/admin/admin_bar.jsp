<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
LocalDate curDate = LocalDate.now();
LocalDate monthAgo = curDate.minusMonths(1);
%>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<link href="../css/dashboard.css" rel="stylesheet" type="text/css">
<div class="top_bar">
    <img src="../images/k_emblem02.png" alt="K LEAGUE" class="logo">
</div>
<div class="side_bar">
<!-- <span><//%=get.Name() %></span> -->
<br>
<div class="profile">
    <img src="../images/profile.png" alt="프로필 사진" class="profile-img">
    <%--<a href="editProfile.jsp" style="color: gray; text-align: center; font-size: 14px">회원 정보 수정</a> --%>
    관리자
   	<br>
    <a href="logout.jsp" style="color: #171717; text-align: center; font-size: 13px;">로그아웃</a>
</div>
    <br>
    <div>
        <nav>
            <ul class="home">
                <li>
                    <a href="dashboard.jsp" class="home-link">HOME</a>
                </li>
            </ul>
        </nav>
    </div>
    <nav>
        <p class="section-title">재정관리</p>
        <ul>
            <li class="list"><a href="income_info.jsp">수입정보</a></li>
            <li class="list"><a href="expend_info.jsp">지출정보</a></li>
            <li class="list"><a href="statement.jsp">수입지출내역서</a></li>
        </ul>
    </nav>
    <nav>
        <p class="section-title">인적/물적자원</p>
        <ul>
            <li class="list"><a href="coachInfo.jsp">코치정보</a></li><!-- 선수, 코치(스태프) 분리하기 -->
            <li class="list"><a href="staffinfo.jsp">스태프정보</a></li>
            <li class="list"><a href="playerInfo.jsp">선수정보</a></li>
            <li class="list"><a href="injuryInfo.jsp">부상현황</a></li>
            <li class="list"><a href="#">시설</a></li>
            <li class="list"><a href="#">훈련</a></li>
        </ul>
    </nav>
    <nav>
        <p class="section-title">통계</p>
        <ul>
            <li class="list"><a href="statistic.jsp?start_date=1900-01-01&end_date=<%=curDate %>&sort=asc&column=stat_code&page=1">통계정보</a></li>
            <li class="list"><a href="#">경기정보</a></li>
        </ul>
    </nav>
    <br>
    <nav>
        <p class="section-title">커뮤니티</p>
        <ul>
            <li class="list"><a href="#">게시판</a></li>
        </ul>
    </nav>
</div>
