<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Trang Chủ</title>
<body>

	<section id="slider">
		<!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0"
								class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>

						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1>
										<span>Milk</span>-SHOP
									</h1>
									<h2>Nơi Cung Cấp Sữa Sạch Cho Bé</h2>
									<p>Với hơn 30 nghiên cứu lâm sàng trong suốt 45 năm. Sữa
										bột của chúng tôi là nguồn dinh dưỡng đầy đủ và cân đối, được
										chứng minh giúp đáp ứng nhu cầu dinh dưỡng cho người lớn tuổi,
										hỗ trợ tăng cường sức khỏe, thể chất và chất lượng cuộc sống.</p>
									<a href="<c:url value="/product/all-products/1"/>"
										type="button" class="btn btn-default get">Khám Phá Ngay
										Nào!</a>
								</div>
								<div class="col-sm-6">
									<img src="<c:url value="/assets/user/images/home/img1.png"/>"
										class="girl img-responsive" alt="" />
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Milk</span>-SHOP
									</h1>
									<h2>Nguồn sữa tươi sạch tốt cho sức khoẻ</h2>
									<p>Với nguồn sữa tươi từ hệ thống trang trại chuẩn quốc tế
										trải dài khắp Việt Nam, sản phẩm Sữa tươi cao cấp mới trọn vẹn
										vị sữa tươi thơm ngon và thuần khiết từ thiên nhiên, cung cấp
										nguồn dinh dưỡng chất lượng cao cho cả gia đình.</p>
									<a href="<c:url value="/product/all-products/1"/>"
										type="button" class="btn btn-default get">Khám Phá Ngay
										Nào!</a>
								</div>
								<div class="col-sm-6">
									<img src="<c:url value="/assets/user/images/home/img2.png"/>"
										class="girl img-responsive" alt="" />
								</div>
							</div>



						</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs"
							data-slide="prev"> <i class="fa fa-angle-left"></i>
						</a> <a href="#slider-carousel"
							class="right control-carousel hidden-xs" data-slide="next"> <i
							class="fa fa-angle-right"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/slider-->

	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<%@include
						file="/WEB-INF/views/layouts_master/user/categories_brands.jsp"%>
				</div>
				<div class="col-sm-9 padding-right" style="margin-bottom: 25px">
					<div class="features_items">
						<!--features_items-->
						<br/>
						<h2 class="title text-center">SẢN PHẨM NỔI BẬT</h2>
						<c:forEach items="${listProductsByNumber}" var="productItem">
							<div class="col-sm-4">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">

											<a
												href="<c:url value="/product/product-detail?productID=${productItem.productID}"/>"><img
												src="<c:url value="/assets/user/images/product_image/${productItem.listImages[0]}"/>"
												alt="" /></a>
											<!-- <h2><fmt:parseNumber var = "productUnitPrice" integerOnly = "true" type = "number" value = "${productItem.unitPrice}"/><c:out value="${productUnitPrice}"/> VNĐ</h2> -->
											<h2>
												<fmt:formatNumber type="number" maxFractionDigits="3"
													value="${productItem.unitPrice}" />
												đ
											</h2>
											<p>
												<c:out value="${productItem.productName}" />
											</p>
											<a
												href="<c:url value="/cart/add?productID=${productItem.productID}"/>"
												class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>

					</div>
					<div align="center">
						<a href="<c:url value="/product/all-products/1"/>"
							style="padding: 7px 10px; border: 1px solid #B3AFA8">Tất Cả
							Sản Phẩm</a>
					</div>
					<!--features_items-->
				</div>

			</div>
		</div>
	</section>
</body>
