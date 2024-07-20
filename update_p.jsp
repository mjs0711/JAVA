<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%@ include file="layout/db_connect.jsp" %>
<%
try {
   request.setCharacterEncoding("UTF-8");
   
   String sql="insert into member_tbl_02 values(?. ?. ?. ?. ?. ?. ?)";
   PreparedStatement pstmt = conn.prepareStatement(sql);
   

   pstmt.setInt(1, Integer.parseInt(request.getParameter("custno")));
   pstmt.setString(2, request.getParameter("custname"));
   pstmt.setString(
