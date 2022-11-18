<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>

<div class="hero-wrap hero-bread" style="background-image: url('../resources/images/bg_1.jpg');">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs">
          		<span class="mr-2">
          			<a href="/foodMarket/main">Home</a>
          		</span> 
          		<span>Products</span>
          	</p>
            <h1 class="mb-0 bread">PRODUCT DETAIL</h1>
          </div>
        </div>
      </div>
    </div>
<section class="ftco-section">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 mb-5 ftco-animate">
				<a href="../resources/images/${product.pimg}" class="image-popup"><img
					src="../resources/images/${product.pimg}" class="img-fluid"
					alt="Colorlib Template"></a>
			</div>
			<div class="col-lg-6 product-details pl-md-5 ftco-animate">
				<h3>${product.pname}</h3>
				<p class="price">
					<span>${product.pprice}</span>
				</p>
				<p>${product.pcontent}</p>
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