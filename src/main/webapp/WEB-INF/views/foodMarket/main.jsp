<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
	.product img{
		width: 500px;
		height: 180px;
	}
</style>
<%@ include file="../includes/header.jsp"%>

<section id="home-section" class="hero">
	<div class="home-slider owl-carousel">
		<div class="slider-item" style="background-image: url(../resources/images/bg_1.jpg);">
	      	<div class="overlay">
	      	</div>
	        <div class="container">
	          	<div class="row slider-text justify-content-center align-items-center" data-scrollax-parent="true">
	            	<div class="col-md-12 ftco-animate text-center">
	              		<h1 class="mb-2">We serve Fresh Vegestables &amp; Fruits</h1>
	              		<h2 class="subheading mb-4">We deliver organic vegetables &amp; fruits</h2>
	            	</div>
	          	</div>
	       	</div>
		</div>
	    <div class="slider-item" style="background-image: url(../resources/images/bg_2.jpg);">
	      	<div class="overlay"></div>
	        <div class="container">
	          	<div class="row slider-text justify-content-center align-items-center" data-scrollax-parent="true">

	            	<div class="col-sm-12 ftco-animate text-center">
	              		<h1 class="mb-2">100% Fresh &amp; Organic Foods</h1>
	              		<h2 class="subheading mb-4">We deliver organic vegetables &amp; fruits</h2>
	            	</div>

	          	</div>
	        </div>
		</div>
	</div>
</section>

<section class="ftco-section">
	<div class="container">
		<div class="row no-gutters ftco-services">
          <div class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
            <div class="media block-6 services mb-md-0 mb-4">
              <div class="icon bg-color-1 active d-flex justify-content-center align-items-center mb-2">
            		<span class="flaticon-shipped"></span>
              </div>
              <div class="media-body">
                <h3 class="heading">Free Shipping</h3>
                <span>30,000원 이상 주문 시 무료 배송</span>
              </div>
            </div>      
          </div>
          <div class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
            <div class="media block-6 services mb-md-0 mb-4">
              <div class="icon bg-color-2 d-flex justify-content-center align-items-center mb-2">
            		<span class="flaticon-diet"></span>
              </div>
              <div class="media-body">
                <h3 class="heading">Always Fresh</h3>
                <span>잘 포장된 상품</span>
              </div>
            </div>    
          </div>
          <div class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
            <div class="media block-6 services mb-md-0 mb-4">
              <div class="icon bg-color-3 d-flex justify-content-center align-items-center mb-2">
            		<span class="flaticon-award"></span>
              </div>
              <div class="media-body">
                <h3 class="heading">Superior Quality</h3>
                <span>양질의 상품</span>
              </div>
            </div>      
          </div>
          <div class="col-md-3 text-center d-flex align-self-stretch ftco-animate">
            <div class="media block-6 services mb-md-0 mb-4">
              <div class="icon bg-color-4 d-flex justify-content-center align-items-center mb-2">
            		<span class="flaticon-customer-service"></span>
              </div>
              <div class="media-body">
                <h3 class="heading">Support</h3>
                <span>연중무휴</span>
              </div>
            </div>      
          </div>
        </div>
	</div>
</section>

<section class="ftco-section ftco-category ftco-no-pt">
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-6 order-md-last align-items-stretch d-flex">
						<div class="category-wrap-2 ftco-animate img align-self-stretch d-flex" style="background-image: url(../resources/images/category.jpg);">
							<div class="text text-center">
								<h2>Vegetables</h2>
								<p>모든 가정의 건강을 보호합니다.</p>
								<p><a href="/foodMarket/shop" class="btn btn-primary">Shop now</a></p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="category-wrap ftco-animate img mb-4 d-flex align-items-end" style="background-image: url(../resources/images/category-1.jpg);">
							<div class="text px-3 py-1">
								<h2 class="mb-0">
									<a href="/foodMarket/shop_fruit">Fruits</a>
								</h2>
							</div>
						</div>
						<div class="category-wrap ftco-animate img d-flex align-items-end" style="background-image: url(../resources/images/category-2.jpg);">
							<div class="text px-3 py-1">
								<h2 class="mb-0">
									<a href="/foodMarket/shop_vegetable">Vegetables</a>
								</h2>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="category-wrap ftco-animate img mb-4 d-flex align-items-end" style="background-image: url(../resources/images/category-3.jpg);">
					<div class="text px-3 py-1">
						<h2 class="mb-0">
							<a href="/foodMarket/shop_juice">Juices</a>
						</h2>
					</div>
				</div>
				<div class="category-wrap ftco-animate img d-flex align-items-end" style="background-image: url(../resources/images/category-4.jpg);">
					<div class="text px-3 py-1">
						<h2 class="mb-0">
							<a href="/foodMarket/shop_dried">Dried</a>
						</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="ftco-section">
	<div class="container">
		<div class="row justify-content-center mb-3 pb-3">
        	<div class="col-md-12 heading-section text-center ftco-animate">
          		<span class="subheading">Featured Products</span>
            	<h2 class="mb-4">Our Products</h2>
            	<p>신상품을 확인해 보세요.</p>
          	</div>
        </div>   		
    </div>
    <div class="container">
    	<div class="row">
    	<c:forEach items="${productList}" var="productList">
    		<div class="col-md-6 col-lg-3 ftco-animate">
    			<div class="product">
    				<a href="/foodMarket/detail?pid=${productList.pid}&pageKind=main" class="img-prod">
    					<img class="img-fluid" src="../resources/images/${productList.pimg}" alt="Colorlib Template">
    					<div class="overlay"></div>
    				</a>
    				<div class="text py-3 pb-4 px-3 text-center">
    					<h3><a href="/foodMarket/detail?pid=${productList.pid}&pageKind=main">${productList.pname}</a></h3>
    					<div class="d-flex">
    						<div class="pricing">
		    					<p class="price"><span>${productList.pprice}원</span></p>
		    				</div>
	    				</div>
    				</div>
    			</div>
    		</div>
    	</c:forEach>
    	
    	</div>
   	</div>
</section>

<%@ include file="../includes/footer.jsp"%>