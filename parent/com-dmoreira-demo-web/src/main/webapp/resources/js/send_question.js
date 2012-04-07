//var answer = null;
//var onComplete = function(resp) {
//	if (resp.answer != answer) {
//		$("#test").fadeOut(function() {
//			$("#test").html(resp.answer);
//		});
//		$("#test").fadeIn("slow");
//	}
//	
//	answer = resp.answer;
//};
// 
//var start = function() {
//	setInterval(function() {
//		$.post('/com-dmoreira-demo-web/answer', {}, onComplete, 'json');
//	}, 5000); 
//};
// 
//$(document).ready(start);

function sendQuestion() {
	$.post('/com-dmoreira-demo-web/question/auth/create', $("#send-question").serialize());
	return false;
}