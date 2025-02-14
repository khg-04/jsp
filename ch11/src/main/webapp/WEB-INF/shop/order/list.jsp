<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>order::list</title>
</head>
<body>
	<h3>주문목록</h3>
	<a href="/ch11/shop">메인이동</a>
	<a href="/ch11/shop/product/list.jsp">상품목록</a>
	
	<table border="1">
		<tr>
			<th>주문번호</th>
			<th>주문상품</th>
			<th>주문수량</th>
			<th>제조사</th>
			<th>주문자</th>
			<th>휴대폰</th>
			<th>주문일자</th>
		</tr>
		<% for(Order order : orders){ %>
		<tr>
			<td><%= order.getOrderNo() %></td>
			<td><%= order.getProduct().getProdName() %></td>
			<td><%= order.getOrderCount() %></td>
			<td><%= order.getProduct().getCompany() %></td>
			<td><%= order.getCustomer().getName() %></td>
			<td><%= order.getCustomer().getHp() %></td>
			<td><%= order.getOrderDate() %></td>
		</tr>
		<% } %>
	</table>
	
</body>
</html>










