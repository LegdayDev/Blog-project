<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/update" method="post">
		<div class="mb-3 mt-3">
			<input
				type="text" class="form-control"
				placeholder="Enter email" name="email">
		</div>
		<div class="mb-3">
			<input
				type="password" class="form-control" 
				placeholder="Enter password" name="password">
		</div>
		<button type="submit" class="btn btn-primary">수정하기</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>
