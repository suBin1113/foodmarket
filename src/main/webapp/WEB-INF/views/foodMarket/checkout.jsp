<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>

<div class="hero-wrap hero-bread"
	style="background-image: url('../resources/images/bg_1.jpg');">
	<div class="container">
		<div
			class="row no-gutters slider-text align-items-center justify-content-center">
			<div class="col-md-9 ftco-animate text-center">
				<p class="breadcrumbs">
					<span class="mr-2"><a href="index.html">Home</a></span> <span>Checkout</span>
				</p>
				<h1 class="mb-0 bread">Checkout</h1>
			</div>
		</div>
	</div>
</div>

<section class="ftco-section">
	<div class="container">
		<form action="/foodMarket/checkout" class="billing-form" method="post"
			id="chkForm">
			<div class="row justify-content-center">
				<div class="col-xl-7 ftco-animate">
					<h3 class="mb-4 billing-heading">Billing Details</h3>
					<div class="row align-items-end">
						<div class="col-md-6">
							<div class="form-group">
								<label for="firstname">Name</label> <input type="text"
									class="form-control" name="name" required>
							</div>
						</div>
						<div class="w-100"></div>
						<div class="col-md-12">
							<div class="form-group">
								<label for="streetaddress">Address</label> <input type="text"
									class="form-control" placeholder="" name="address" required>
							</div>
						</div>
						<div class="w-100"></div>
						<div class="col-md-6">
							<div class="form-group">
								<label for="postcodezip">Postcode / ZIP *</label> <input
									type="text" class="form-control" name="zip" id="zipInput"
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									pattern="[0-9]{5}" required title="정확한 우편번호를 입력해주세요.">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<label for="emailaddress">Email Address</label> <input
									type="email" name="email" class="form-control" placeholder="">
							</div>
						</div>
					</div>
				</div>
				<!--
				<div class="itemsDiv"></div> // 아이템 삽입
				-->
				<div class="col-xl-5">
					<div class="row mt-5 pt-3">
						<div class="col-md-12 d-flex mb-5">
							<div class="cart-detail cart-total p-3 p-md-4">
								<h3 class="billing-heading mb-4">Cart Total</h3>
								<c:forEach items="${cart}" var="cart">
									<c:set var="sum" value="${sum + (cart.pprice * cart.pcount)}" />
								</c:forEach>
								<c:if test="${sum<30000}">
									<c:set var="delivery" value="3000" />
								</c:if>
								<c:if test="${sum>=30000}">
									<c:set var="delivery" value="0" />
								</c:if>
								<p class="d-flex">
									<span>Subtotal</span> <span>${sum}원</span>
								</p>
								<p class="d-flex">
									<span>Delivery</span> <span>${delivery}원</span>
								</p>
								<!-- <p class="d-flex">
									<span>Discount</span> <span>$3.00</span>
								</p> -->
								<hr>
								<p class="d-flex total-price">
									<span>Total</span> <span>${sum+delivery}원</span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="cart-detail p-3 p-md-4">
								<div class="form-group">
									<div class="col-md-12">
										<div class="checkbox">
											<label><input type="checkbox" name="emailChk"
												id="emailChk" class="mr-2">주문내역을 이메일로 수신하시겠습니까?</label>
										</div>
									</div>
								</div>
								<p>
									<button onclick="submitFnc()" class="btn btn-primary py-3 px-4">Place
										an order</button>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</section>
<!-- .section -->

<script>
	/*$(function() {
		var str = "";

		// 더미 값
		for (var i = 0; i <= 4; i++) {
			str += '<input type="hidden" name="orders[' + i + '].pid" value="'
					+ (i + 1) + '">';
			str += '<input type="hidden" name="orders[' + i
					+ '].pname" value="item' + (i + 1) + '">';
			str += '<input type="hidden" name="orders[' + i
					+ '].pcount" value="' + (i + 1) + '">';
			str += '<input type="hidden" name="orders[' + i
					+ '].pimg" value="product-' + (i + 1) + '">';
			str += '<input type="hidden" name="orders[' + i
					+ '].pprice" value="' + ((i + 1) * 1000) + '">';
		}

		$(".itemsDiv").html(str);
	});*/

	$(function() {
		$("#emailChk").on("click", function() {
			if ($("#emailChk").is(":checked") == true) {
				console.log("check!");
				$("input[name=email]").attr("required", true);
			} else {
				console.log("uncheck!");
				$("input[name=email]").attr("required", false);
			}
		});
	});
</script>
<%@ include file="../includes/footer.jsp"%>