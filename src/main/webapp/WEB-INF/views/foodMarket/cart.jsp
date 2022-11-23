<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../includes/header.jsp"%>

<div class="hero-wrap hero-bread"
	style="background-image: url('../resources/images/bg_1.jpg');">
	<div class="container">
		<div
			class="row no-gutters slider-text align-items-center justify-content-center">
			<div class="col-md-9 ftco-animate text-center">
				<p class="breadcrumbs">
					<span class="mr-2"><a href="index.html">Home</a></span> <span>Cart</span>
				</p>
				<h1 class="mb-0 bread">My Cart</h1>
			</div>
		</div>
	</div>
</div>

<section class="ftco-section ftco-cart">
	<div class="container">
		<div class="row">
			<div class="col-md-12 ftco-animate">
				<div class="cart-list">
					<table class="table">
						<thead class="thead-primary">
							<tr class="text-center">
								<th>&nbsp;</th>
								<th>&nbsp;</th>
								<th>Product name</th>
								<th>Price</th>
								<th>Quantity</th>
								<th>Total</th>
							</tr>
						</thead>
						<tbody>
							<c:set var="sum" value="0" />
							<c:forEach items="${cart}" var="cart">
								<tr class="text-center cart_info">
									<!-- 삭제 폼 -->
									<form action="/foodMarket/delete" class="delete_form"
										method="post">
										<input type="hidden" name="cno" class="delete_cartcno">
									</form>

									<!-- 삭제 버튼 구현 -->
									<div>
										<td class="product-remove">
											<button class="ion-ios-close" id="btn_delete"
												data-cartcno="${cart.cno}" style="width: 35px; height: 35px !important">
												<span></span>
											</button>
										</td>
									</div>

									<td class="image-prod"><div class="img"
											style="background-image: url(../resources/images/${cart.pimg});"></div></td>

									<td class="product-name">
										<h3>${cart.pname}</h3>
										<p>${cart.pcontent}</p>
									</td>

									<td class="price"><div class="input-group mb-3">
											<input type="text" name="quantity" id="pprice"
												class="quantity form-control input-number pricecart"
												value="${cart.pprice}" readonly>
										</div></td>

									<td class="quantity">
										<div class="input-group mb-3">
											<input type="text" name="quantity" id="count"
												class="quantity form-control input-number countcart"
												value="${cart.pcount}" readonly>
										</div>
									</td>
									<c:set var="pricesum" value="${cart.pcount * cart.pprice}" />
									<td class="total"><input type="text" id="totalprice"
										name="total"
										class="quantity form-control input-number totalprices"
										value="${pricesum}" readonly></td>
								</tr>
								<!-- END TR-->
								<c:set var="sum" value="${sum + (cart.pprice * cart.pcount)}" />

								<c:set var="delivery" value="0" />
								<c:if test="${sum < 30000}">
									<c:set var="delivery" value="3000" />
								</c:if>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row justify-content-end">

			<div class="col-lg-4 mt-5 cart-wrap ftco-animate">
				<div class="cart-total mb-3">
					<h3>Cart Totals</h3>
					<p class="d-flex">
						<span>Product</span> <span>${sum}</span>
					</p>
					<p class="d-flex delivery">
						<span>Delivery Fee</span> <span>${delivery}</span>
					</p>

					<hr>
					<p class="d-flex total-price finaltotal">
						<span>Total</span> <span>${sum+delivery}</span>
					</p>
				</div>
				<p>
					<a href="checkout.html" class="btn btn-primary py-3 px-4">Proceed
						to Checkout</a>
				</p>
			</div>
		</div>
	</div>
</section>

<script type="text/javascript">
	$(function() {
		$('#btn_delete').on("click", function(e) {
			e.preventDefault();
			var cno = $(this).data("cartcno");
			$(".delete_cartcno").val(cno);
			$(".delete_form").submit();
		});
	});
</script>

<%@ include file="../includes/footer.jsp"%>