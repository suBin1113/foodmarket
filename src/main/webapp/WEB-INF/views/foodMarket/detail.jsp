<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>

<section class="ftco-section">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 mb-5 ftco-animate">
				<a href="../resources/images/product-1.jpg" class="image-popup"><img
					src="../resources/images/product-1.jpg" class="img-fluid"
					alt="Colorlib Template"></a>
			</div>
			<div class="col-lg-6 product-details pl-md-5 ftco-animate">
				<h3>Bell Pepper</h3>
				<p class="price">
					<span>$120.00</span>
				</p>
				<p>A small river named Duden flows by their place and supplies
					it with the necessary regelialia. It is a paradisematic country, in
					which roasted parts of sentences fly into your mouth. Text should
					turn around and return to its own, safe country. But nothing the
					copy said could convince her and so it didn’t take long until.</p>
				<div class="row mt-4">
					<div class="w-100"></div>
					<div class="input-group col-md-6 d-flex mb-3">
						<span class="input-group-btn mr-2">
							<button type="button" class="quantity-left-minus btn"
								data-type="minus" data-field="">
								<i class="ion-ios-remove"></i>
							</button>
						</span> <input type="text" id="quantity" name="quantity"
							class="form-control input-number" value="1" min="1" max="100">
						<span class="input-group-btn ml-2">
							<button type="button" class="quantity-right-plus btn"
								data-type="plus" data-field="">
								<i class="ion-ios-add"></i>
							</button>
						</span>
					</div>
					<div class="w-100"></div>
				</div>
				<p>
					<a href="/foodMarket/shop" class="btn btn-black py-3 px-5">Back to the Shop</a>
					<a href="/foodMarket/cart" class="btn btn-black py-3 px-5">Add to Cart</a>
				</p>
			</div>
		</div>
	</div>
</section>

<%@ include file="../includes/footer.jsp"%>