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
			id="chkoutForm">
			<div class="row justify-content-center">
				<div class="col-xl-7 ftco-animate">
					<h3 class="mb-4 billing-heading">Billing Details</h3>
					<div class="row align-items-end">
						<div class="col-md-6">
							<div class="form-group">
								<label for="firstname">Name</label> <input type="text"
									class="form-control" name="name">
							</div>
						</div>
						<div class="w-100"></div>
						<div class="col-md-12">
							<div class="form-group">
								<label for="streetaddress">Address</label> <input type="text"
									class="form-control" placeholder="House number and street name"
									name="address">
							</div>
						</div>
						<div class="w-100"></div>
						<div class="col-md-6">
							<div class="form-group">
								<label for="postcodezip">Postcode / ZIP *</label> <input
									type="text" class="form-control" name="zip">
							</div>
						</div>
					</div>
				</div>
				<!-- 아이템 삽입 -->
				<div class="itemsDiv"></div>
				<div class="col-xl-5">
					<div class="row mt-5 pt-3">
						<div class="col-md-12 d-flex mb-5">
							<div class="cart-detail cart-total p-3 p-md-4">
								<h3 class="billing-heading mb-4">Cart Total</h3>
								<p class="d-flex">
									<span>Subtotal</span> <span>$20.60</span>
								</p>
								<p class="d-flex">
									<span>Delivery</span> <span>$0.00</span>
								</p>
								<!-- <p class="d-flex">
									<span>Discount</span> <span>$3.00</span>
								</p> -->
								<hr>
								<p class="d-flex total-price">
									<span>Total</span> <span>$17.60</span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="cart-detail p-3 p-md-4">
								<p>
									<button type="submit" class="btn btn-primary py-3 px-4">Place
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
	$(function() {
		var str = "";
		
		// 더미 값
		for(var i=0; i<=4; i++) {
			str += '<input type="hidden" name="orders[' + i + '].pid" value="' + (i+1) + '">';
			str += '<input type="hidden" name="orders[' + i + '].pname" value="item' + (i+1) + '">';
			str += '<input type="hidden" name="orders[' + i + '].pcount" value="' + (i+1) + '">';
			str += '<input type="hidden" name="orders[' + i + '].pimg" value="product-' + (i+1) + '">';
			str += '<input type="hidden" name="orders[' + i + '].pprice" value="' + ((i+1)*1000) + '">';
		}
			
		$(".itemsDiv").html(str);
	});
</script>
<%@ include file="../includes/footer.jsp"%>