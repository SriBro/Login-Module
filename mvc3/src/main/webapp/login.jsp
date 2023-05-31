<!-- Dependency for mysql server and servlet api and driver for selenium -->
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Ubuntu&display=swap" rel="stylesheet">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
body{
font-family:'Ubuntu',sans-serif; 
font-size:30px;
background-color:#FF8C00;
font-weight:bolder;
}
</style>
</head>
<body>

	<div class="container">
		<div class="row justify-content-center mt-5">
			<div class="col-md-6">
				<div class="card">
					<div class="card-header">
						<h4>Login</h4>
					</div>
					<div class="card-body">
						<form action="login" method="post">
							<div class="form-group">
								<label for="username">Username</label> <input type="text"
									class="form-control" id="username" name="username" required>
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									class="form-control" id="password" name="password" required>
							</div>
							<input type="submit" name="submit" class="btn btn-primary">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
