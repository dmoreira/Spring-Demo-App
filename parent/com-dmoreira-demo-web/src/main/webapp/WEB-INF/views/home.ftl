<#import "spring.ftl" as spring />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="<@spring.url "/resources/css/style.css" />" rel="stylesheet" type="text/css" media="screen" />
<script src="<@spring.url "/resources/js/jquery.min.js" />" type="text/javascript"></script>
<script src="<@spring.url "/resources/js/send_question.js" />" type="text/javascript"></script>
<title>Web App test page</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>
				Ask Me! demo application
			</h1>
			<div id="logo">
				<h1>&lt; ? &gt;</h1>
			</div>
		</div>
		<div id="content">
			<form id="login-form" name="login-form" method="post">
				<!-- div class="page-input">
					<label for="question">ask something</label>
					<textarea cols="" rows="" id="question" name="question"></textarea>
				</div -->
					
				<div class="page-input floatleft">
					<label for="username">your email</label>
					<input type="text" name="username" id="username" />
					<span id="message"></span>
				</div>
				
				
				<div class="page-input floatright">
					<label for="password">password</label>
					<input type="password" name="password" id="password" />
					<span id="message2"></span>
				</div>
				
				<div class="clear"></div>
				
				<div class="question-submit">
					<input name="-send-button" id="send-button" type="submit" value="Please sign in" onclick="sendQuestion(); return false;" />
				</div>
				
				<div class="page-register">
					<a href="#">Register here</a>
				</div>
	
			</form>
		</div>
		<div id="footer">
			<p>
				a spring framework demo application more info can be found <a href="#">here</a><br />
				<a href="http://dmsolutions.cloudfoundry.com/">dm solutions</a>
			</p>
		</div>
	</div>
</body>
</html>

