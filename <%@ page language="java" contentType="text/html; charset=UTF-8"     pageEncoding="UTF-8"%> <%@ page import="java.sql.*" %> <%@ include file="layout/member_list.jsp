<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file="layout/db_connect.jsp" %>
<%
String sql="select custno, custname, phone, address, "
         +" to_char(joindate,'yyyy-mm-dd') joindate, "
         +" case when grade = 'A' then 'VIP' "
         +"      when grade = 'B' then '일반' "
         +"      else '직원' end grade, city "
         +" from member_tbl_02 order by custno asc";
         
PreparedStatement p
