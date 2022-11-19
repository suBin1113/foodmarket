<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<section class="ftco-section">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-xl-12">
				<div class="row col-md-12">
					<label for="cno">Order Number</label>
					<form class="form-inline col-md-12"
						action="/foodMarket/orderDetails" method="post">
						<input type="text" class="form-control col-md-10 mr-2"
							placeholder="" name="orderId">
						<button type="submit" class="btn btn-primary py-3 px-4">Submit</button>
					</form>
				</div>
				<div class="row mt-5 pt-3">
					<div class="col-md-12 d-flex mb-5">
						<div class="cart-detail cart-total p-3 p-md-4">
							<h3 class="billing-heading mb-4">Order Items</h3>
							<c:forEach items="${ orderList }" var="list">
								<p class="d-flex">
									<span>${ list.pname }</span>
									<span>${ list.pcount }</span>
									<span>${ list.pprice }</span>
								</p>
							</c:forEach>
						</div>
					</div>
				</div>
				<div class="row mt-5 pt-3">
					<div class="cart-detail cart-total p-3 p-md-4">
						<h3 class="billing-heading mb-4">Order Details</h3>
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
							<span>Order Date</span> <span>${ checkout.orderDate }</span>
						</p>
					</div>
				</div>
			</div>
			<!-- .col-md-8 -->
		</div>
	</div>
</section>
<!-- .section -->

<%@ include file="../includes/footer.jsp"%>