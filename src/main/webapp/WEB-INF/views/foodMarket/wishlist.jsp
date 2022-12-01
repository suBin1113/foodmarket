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
				<a href="/foodMarket/shop" class="btn btn-black py-3 px-5"
					data-oper="back">Back to the Shop</a>
				<div class="cart-list">
					<p></p>
					<table class="table">
						<thead class="thead-primary">
							<tr class="text-center">
								<th>&nbsp;</th>
								<th>Product List</th>
								<th>Product Name</th>
								<th>Price</th>
								<th>Detail</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${wishlist}" var="wishlist">

								<!-- 삭제 폼 -->
								<form action="/foodMarket/wishListdelete" class="delete_form"
									method="post">
									<input type="hidden" name="wno" class="delete_wishlistwno">
								</form>

								<tr class="text-center wishlist_info">
									<td class="product-remove">
										<button class="btn_delete ion-ios-close"
											data-wishlistwno="${wishlist.wno}"
											style="width: 35px; height: 35px !important"></button>
									</td>

									<td class="image-prod"><div class="img"
											style="background-image: url(../resources/images/${wishlist.pimg});"></div></td>

									<td class="product-name">
										<h3>${wishlist.pname}</h3>
										<p>${wishlist.pcontent}</p>
									</td>

									<td class="price"><div class="input-group mb-3">
											<input type="text" name="quantity" id="pprice"
												class="quantity form-control input-number pricecart"
												value="${wishlist.pprice}" readonly>
										</div></td>

									<td class="quantity"><a href="/foodMarket/detail?pid=${wishlist.pid}&pageKind=null">상품정보</a></td>
								</tr>
								<!-- END TR-->

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
			var wno = $(this).data("wishlistwno");
			$(".delete_wishlistwno").val(wno);
			alert("리스트에서 삭제되었습니다.");
			$(".delete_form").submit();
		});
	});
</script>
<%@ include file="../includes/footer.jsp"%>