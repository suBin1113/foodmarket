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
		placeholder="Order Number.." name="orderId">
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
											style="background-image: url(../resources/images/product-3.jpg);"></div></td>
									<td class="product-name">
										<h3>${ list.pname }</h3>
									</td>
									<td class="price">${ list.pprice }</td>
									<td class="price">${ list.pcount }</td>
									<td class="total">${ list.pprice * list.pcount }</td>
								</tr>
							</c:forEach>
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

<div class="modal fade in" id="myModal" tabindex="-1" role="dialog">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				<!-- <button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button> -->
			</div>
			<div class="modal-body">lorem</div>
			<div class="modal-footer">
				<!-- <button type="button" class="btn btn-primary">Save changes</button> -->
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>

<%@ include file="../includes/footer.jsp"%>
<script>
	$(function() {
		var result = '${result}';

		//$("#myModal").modal("show");

		checkModal(result);

		history.replaceState({}, null, null);

		function checkModal(result) {
			if (result === '' || history.state) {
				return;
			}

			if (result === 'success') {
				$(".modal-title").html("주문 취소")
				$(".modal-body").html("정상적으로 처리되었습니다.");
			} else if (parseInt(result) > 0) {
				$(".modal-title").html("주문 완료")
				$(".modal-body").html(
						"주문번호 " + parseInt(result) + "번으로 주문되었습니다.");
			}

			$("#myModal").modal("show");
		}
	});
</script>