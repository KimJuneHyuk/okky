<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<div id="headerWrap">
    <header id="header">
        <div class="left-nav">
            <h1><a href="index.jsp">로고</a></h1>
            <nav>
                <h2 class="hidden">주요이용메뉴</h2>
                <ul class="gnb">
                    <li><a href="../articles/QandA.jsp">Q&A</a></li>
                    <li class="left-line"><a href="../articles/community.jsp">커뮤니티</a></li>
                    <li class="left-line"><a href="../articles/notice.jsp">공지사항</a></li>
                </ul>
            </nav>
        </div>
        <nav class="right-nav">
            <h2 class="hidden">계정관련이용메뉴</h2>
            <ul class="gnb">
                <li class="search">
                    <form>
                        <label>
                            <button type="submit">
                                <i class="fa fa-light fa-magnifying-glass"></i>
                            </button>
                            <input type="search" placeholder="검색"/>
                        </label>
                    </form>
                </li>
                <li class="login admin"><a href="./members/userLogin.jsp">로그인</a></li>
                <li class="join admin"><a href="./members/userRegister.jsp">회원가입</a></li>
            </ul>
        </nav>
    </header>
</div>