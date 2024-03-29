
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>

<head>
<!-- Basic -->
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<!-- Site Metas -->
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="author" content="" />
<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">

<title>Giftos</title>

<!-- slider stylesheet -->
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />

<!-- bootstrap core css -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet" />
<!-- responsive style -->
<link href="css/responsive.css" rel="stylesheet" />
</head>

<body>
	<div class="hero_area">
		<jsp:include page="header-section.jsp"></jsp:include>



	</div>
	<!-- end hero area -->

	<!-- shop section -->

	<section class="shop_section layout_padding">
		<div class="container">
			<div class="heading_container heading_center">
				<h2>Cart's Details</h2>
			</div>
			<div class="row">


				<div class="col-sm-9 col-md-6 col-lg-12">
					<c:if test="${empty sessionScope.cart}">

						<p>Cart is empty</p>

					</c:if>

					<c:if test="${not empty sessionScope.cart}">
					
					<c:set var="totalPrice" value="0"> </c:set>

						<c:forEach items="${sessionScope.cart.items}" var="cartItem">

							<strong>${cartItem.key.name }</strong> - Quantity: ${cartItem.value } -
				
				 			 Price: $${cartItem.key.price}  - Sub Total Price : $${cartItem.key.price * cartItem.value}
				  
					<br>
					
						<c:set var="totalPrice" value="${totalPrice + (cartItem.key.price * cartItem.value)}"></c:set>
					
						</c:forEach>
					
						<p>  <strong>Total Price:</strong>$${totalPrice } </p>

					</c:if>
					
					<a href="Checkout"><button>Checkout
						</button>
					
					</a>
					
				</div>


			</div>
		</div>

	</section>

	<div class="carousel-item">
		<div class="box">
			<div class="client_info">
				<div class="client_name">
					<h5>Rochak</h5>
					<h6>Default model text</h6>
				</div>
				<i class="fa fa-quote-left" aria-hidden="true"></i>
			</div>
			<p>Variouseditors now use Lorem Ipsum as their default model
				text, and a search for 'lorem ipsum' will uncover many web sites
				still in their infancy. Variouseditors now use Lorem Ipsum as their
				default model text, and a search for 'lorem ipsum' will uncover many
				web sites still in their infancy. editors now use Lorem Ipsum as
				their default model text, and a search for 'lorem ipsum' will
				uncover many web sites still in their infancy.</p>
		</div>
	</div>
	<div class="carousel-item">
		<div class="box">
			<div class="client_info">
				<div class="client_name">
					<h5>Brad Johns</h5>
					<h6>Default model text</h6>
				</div>
				<i class="fa fa-quote-left" aria-hidden="true"></i>
			</div>
			<p>Variouseditors now use Lorem Ipsum as their default model
				text, and a search for 'lorem ipsum' will uncover many web sites
				still in their infancy, editors now use Lorem Ipsum as their default
				model text, and a search for 'lorem ipsum' will uncover many web
				sites still in their infancy. Variouseditors now use Lorem Ipsum as
				their default model text, and a search for 'lorem ipsum' will
				uncover many web sites still in their infancy. Various</p>
		</div>
	</div>
	</div>
	<div class="carousel_btn-box">
		<a class="carousel-control-prev" href="#customCarousel2" role="button"
			data-slide="prev"> <i class="fa fa-angle-left" aria-hidden="true"></i>
			<span class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#customCarousel2"
			role="button" data-slide="next"> <i class="fa fa-angle-right"
			aria-hidden="true"></i> <span class="sr-only">Next</span>
		</a>
	</div>
	</div>
	</div>
	</section>
	<!-- end client section -->

	<!-- info section -->

	<section class="info_section  layout_padding2-top">
		<div class="social_container">
			<div class="social_box">
				<a href=""> <i class="fa fa-facebook" aria-hidden="true"></i>
				</a> <a href=""> <i class="fa fa-twitter" aria-hidden="true"></i>
				</a> <a href=""> <i class="fa fa-instagram" aria-hidden="true"></i>
				</a> <a href=""> <i class="fa fa-youtube" aria-hidden="true"></i>
				</a>
			</div>
		</div>
		<div class="info_container ">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-lg-3">
						<h6>ABOUT US</h6>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
							sed doLorem ipsum dolor sit amet, consectetur adipiscing elit,
							sed doLorem ipsum dolor sit amet,</p>
					</div>
					<div class="col-md-6 col-lg-3">
						<div class="info_form ">
							<h5>Newsletter</h5>
							<form action="#">
								<input type="email" placeholder="Enter your email">
								<button>Subscribe</button>
							</form>
						</div>
					</div>
					<div class="col-md-6 col-lg-3">
						<h6>NEED HELP</h6>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
							sed doLorem ipsum dolor sit amet, consectetur adipiscing elit,
							sed doLorem ipsum dolor sit amet,</p>
					</div>
					<div class="col-md-6 col-lg-3">
						<h6>CONTACT US</h6>
						<div class="info_link-box">
							<a href=""> <i class="fa fa-map-marker" aria-hidden="true"></i>
								<span> Gb road 123 london Uk </span>
							</a> <a href=""> <i class="fa fa-phone" aria-hidden="true"></i> <span>+01
									12345678901</span>
							</a> <a href=""> <i class="fa fa-envelope" aria-hidden="true"></i>
								<span> demo@gmail.com</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- footer section -->
		<footer class=" footer_section">
			<div class="container">
				<p>
					&copy; <span id="displayYear"></span> All Rights Reserved By <a
						href="https://html.design/">Free Html Templates</a>
				</p>
			</div>
		</footer>
		<!-- footer section -->

	</section>

	<!-- end info section -->


	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
		
	</script>
	<script src="js/custom.js"></script>

</body>

</html>