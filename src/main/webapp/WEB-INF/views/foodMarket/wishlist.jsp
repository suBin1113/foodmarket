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
					<span class="mr-2"><a href="index.html">Home</a></span> <span>Wishlist</span>
				</p>
				<h1 class="mb-0 bread">My Wishlist</h1>
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
								<th>Product List</th>
								<th>&nbsp;</th>
								<th>Price</th>
								<th>Quantity</th>
								<th>Total</th>
							</tr>
						</thead>
						<tbody>
							<c:set var="sum" value="0" />
							<c:forEach items="${wishlist}" var="wishlist">
								<tr class="text-center">
									<td class="product-remove"><a href="#"><span
											class="ion-ios-close"></span></a></td>

									<td class="image-prod"><div class="img"
											style="background-image: url(../resources/images/${wishlist.pimg}.jpg);"></div></td>

									<td class="product-name">
										<h3>${wishlist.pname}</h3>
										<p>${wishlist.pcontent}</p>
									</td>

									<td class="price"><div class="input-group mb-3">
											<input type="text" name="quantity" id="pprice"
												class="quantity form-control input-number pricecart"
												value="${wishlist.pprice}" readonly>
										</div></td>

									<td class="quantity"><div class="input-group mb-3">
											<input type="text" name="quantity" id="count"
												class="quantity form-control input-number countcart"
												value="${wishlist.pcount}" readonly>
										</div></td>
									<c:set var="pricesum"
										value="${wishlist.pcount * wishlist.pprice}" />
									<td class="total"><input type="text" id="totalprice"
										name="total"
										class="quantity form-control input-number totalprices"
										value="${pricesum}" readonly></td>
								</tr>
								<!-- END TR-->
								<c:set var="sum"
									value="${sum + (wishlist.pprice * wishlist.pcount)}" />

								<c:set var="delivery" value="0" />
								<c:if test="${sum > 30000}">
									<c:set var="delivery" value="3000" />
								</c:if>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</section>
<script type="text/javascript">
	$(function() {
		$('.btn_delete').on("click", function(e) {
			e.preventDefault();
			var wno = $(this).data("cartwno");
			$(".delete_cartwno").val(wno);
			$(".delete_form").submit();
		});
	});
</script>
<%@ include file="../includes/footer.jsp"%>