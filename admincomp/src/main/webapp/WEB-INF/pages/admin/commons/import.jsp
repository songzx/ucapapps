<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta content="ucap sytem v1.0" name="description" />
<meta content="ucap" name="author" />
<link href="<c:url value="/admin/media/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/bootstrap-responsive.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/style-metro.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/style.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/style-responsive.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/default.css"/>" rel="stylesheet" type="text/css" id="style_color" />
<link href="<c:url value="/admin/media/css/uniform.default.css"/>" rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="<c:url value="/admin/media/css/jquery.gritter.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/daterangepicker.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/fullcalendar.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/admin/media/css/jqvmap.css"/>" rel="stylesheet" type="text/css" media="screen" />
<link href="<c:url value="/admin/media/css/jquery.easy-pie-chart.css"/>" rel="stylesheet" type="text/css" media="screen" />
<!-- END PAGE LEVEL STYLES -->
<link rel="shortcut icon" href="<c:url value="/admin/media/image/favicon.ico"/>" />
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<script src="<c:url value="/admin/media/js/jquery-1.10.1.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery-migrate-1.2.1.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery-ui-1.10.1.custom.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/bootstrap.min.js"/>" type="text/javascript"></script>
<!--[if lt IE 9]>
	<script src="<c:url value="/admin/media/js/excanvas.min.js"/>"></script>
	<script src="<c:url value="/admin/media/js/respond.min.js"/>"></script>  
	<![endif]-->
<script src="<c:url value="/admin/media/js/jquery.slimscroll.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.blockui.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.cookie.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.uniform.min.js"/>" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="<c:url value="/admin/media/js/jquery.vmap.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.vmap.russia.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.vmap.world.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.vmap.europe.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.vmap.germany.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.vmap.usa.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.vmap.sampledata.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.flot.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.flot.resize.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.pulsate.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/date.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/daterangepicker.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.gritter.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/fullcalendar.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.easy-pie-chart.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/jquery.sparkline.min.js"/>" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="<c:url value="/admin/media/js/app.js"/>" type="text/javascript"></script>
<script src="<c:url value="/admin/media/js/index.js"/>" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script type="text/javascript">
	jQuery(document).ready(function() {
		App.init(); // initlayout and core plugins
		Index.init();
		Index.initJQVMAP(); // init index page's custom scripts
		Index.initCalendar(); // init index page's custom scripts
		Index.initCharts(); // init index page's custom scripts
		Index.initChat();
		Index.initMiniCharts();
		Index.initDashboardDaterange();
		Index.initIntro();
	});
	var _gaq = _gaq || [];
	_gaq.push([ '_setAccount', 'UA-37564768-1' ]);
	_gaq.push([ '_setDomainName', 'keenthemes.com' ]);
	_gaq.push([ '_setAllowLinker', true ]);
	_gaq.push([ '_trackPageview' ]);
	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://'
				: 'http://')
				+ 'stats.g.doubleclick.net/dc.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
</script>