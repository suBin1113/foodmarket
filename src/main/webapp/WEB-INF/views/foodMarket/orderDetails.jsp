<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="hero-wrap hero-bread"
	style="background-image: url('../resources/images/bg_1.jpg');">
	<div class="container">
		<div
			class="row no-gutters slider-text align-items-center justify-content-center">
			<div class="col-md-9 ftco-animate text-center">
				<p class="breadcrumbs">
					<span class="mr-2"><a href="index.html">Home</a></span> <span>Order
						Details</span>
				</p>
				<h1 class="mb-0 bread">Order Details</h1>
			</div>
		</div>
	</div>
</div>
<form
	class="form-inline col-md-12 mt-5 align-items justify-content-center"
	action="/foodMarket/orderDetails">
	<input type="text" class="form-control col-md-4 mr-2"
		placeholder="Order Number.." name="orderId" method="post"
		oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		required>
	<button type="submit" id="submit" class="btn btn-primary py-3 px-4">Submit</button>
</form>
<section class="ftco-section ftco-cart">
	<div class="container">
		<div class="row">
			<div class="col-md-12 ftco-animate">
				<div class="cart-list">
					<table class="table">
						<thead class="thead-primary">
							<tr class="text-center">
								<th>&nbsp;</th>
								<th>Product name</th>
								<th>Price</th>
								<th>Quantity</th>
								<th>Total</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${ orderList }" var="list">
								<tr class="text-center">
									<td class="image-prod"><div class="img"
											style="background-image: url(../resources/images/${list.pimg});"></div></td>
									<td class="product-name">
										<h3>${ list.pname }</h3>
									</td>
									<td class="price">${ list.pprice }</td>
									<td class="price">${ list.pcount }</td>
									<td class="total">${ list.totalPrice }</td>
								</tr>
							</c:forEach>
							<tr>
							<c:if test="${checkout.psum<30000}">
								<td colspan="5" style="color: #000; font-size: 2em;">물품 총 구매가격 : ${checkout.psum} + 배송비 : 3000 = 총 구매가격 : ${ checkout.psum + 3000 }</td>
							</c:if>
							<c:if test="${checkout.psum>=30000}">
								<td colspan="5" style="color: #000; font-size: 2em;">물품 총 구매가격 : ${checkout.psum}</td>
							</c:if>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row justify-content-end">
			<div class="col-lg-4 mt-5 cart-wrap ftco-animate">
				<div class="cart-total mb-3">
					<h3>Order Details</h3>
					<p class="d-flex">
						<span>Order Number</span> <span>${ checkout.orderId }</span>
					</p>
					<p class="d-flex">
						<span>name</span> <span>${ checkout.name }</span>
					</p>
					<p class="d-flex">
						<span>Address</span> <span>${ checkout.address }</span>
					</p>
					<p class="d-flex">
						<span>ZIP</span> <span>${ checkout.zip }</span>
					</p>
					<p class="d-flex">
						<span>Order Date</span> <span><fmt:formatDate
								pattern="yyyy-MM-dd" value="${ checkout.orderDate }" /></span>
					</p>
				</div>
				<form action="/foodMarket/checkout/remove" method="post">
					<input type="hidden" name="orderId" value="${ checkout.orderId }">
					<p>
						<input type="submit" class="btn btn-primary py-3 px-4"
							id="submitButton" value="주문 취소">
					</p>
				</form>
			</div>
		</div>
	</div>
</section>

<%@ include file="../includes/footer.jsp"%>
<script>
	$(function() {
		var result = "${result}";
		var orderId = $(location).attr("search");
		checkModal(result);
		
		
		if("${orderList}" == "[]") {
			$("section").hide();
			$(".mouse").hide();
		}
		
		if(orderId != "") {
			if ("${orderList}" == "[]") {
				alert("유효하지 않은 주문번호입니다. 주문번호를 확인해주세요.");
			} else {
				$("section").show();
				$(".mouse").show();
			}
		}

		history.replaceState({}, null, null);

		function checkModal(result) {
			if (result === '' || history.state) {
				return;
			}

			if (result === 'success') {
				alert("정상적으로 처리되었습니다.");
			} else if (parseInt(result) > 0) {
				alert("주문번호 " + parseInt(result) + "번으로 주문되었습니다.");
			}
		}
	});
</script>