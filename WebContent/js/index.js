$(function(){
	$('#bestbook-list').on('mouseover','.list',function(){
		$(this).addClass('list-now').siblings().removeClass('list-now');
	});

	$('.publish-btn').on('click',function(){
		$('#publishModal').modal('show');
	});
});