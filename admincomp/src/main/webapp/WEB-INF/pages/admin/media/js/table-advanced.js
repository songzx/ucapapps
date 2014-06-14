var TableAdvanced = function() {
	var initTable1 = function() {
		/* Formating function for row details */
		function fnFormatDetails(oTable, nTr) {
			var aData = oTable.fnGetData(nTr);
			var sOut = '<table>';
			sOut += '<tr><td>Platform(s):</td><td>' + aData[2] + '</td></tr>';
			sOut += '<tr><td>Engine version:</td><td>' + aData[3] + '</td></tr>';
			sOut += '<tr><td>CSS grade:</td><td>' + aData[4] + '</td></tr>';
			sOut += '<tr><td>Others:</td><td>Could provide a link here</td></tr>';
			sOut += '</table>';
			return sOut;
		}
		/*
		 * Insert a 'details' column to the table
		 */
		var nCloneTh = document.createElement('th');
		var nCloneTd = document.createElement('td');
		
		$('#sample_1 thead tr').each(function() {
			this.insertBefore(nCloneTh, this.childNodes[0]);
		});
		$('#sample_1 tbody tr').each(function() {
			this.insertBefore(nCloneTd.cloneNode(true), this.childNodes[0]);
		});
		/*
		 * Initialse DataTables, with no sorting on the 'details' column
		 */
		var oTable = $('#sample_1').dataTable(
				/*{
			"aoColumnDefs" : [ {
				"bSortable" : false,
				"aTargets" : [ 0 ]
			} ],
			"aaSorting" : [ [ 1, 'asc' ] ],
			"aLengthMenu" : [ [ 5, 15, 20, -1 ], [ 5, 15, 20, "All" ] // change
			// per
			// page
			// values
			// here
			],
			// set the initial value
			"iDisplayLength" : 10,
		}*/);
		$('#sample_1').on('click', ' tbody td .row-details', function() {
			var nTr = $(this).parents('tr')[0];
			if (oTable.fnIsOpen(nTr)) {
				/* This row is already open - close it */
				$(this).addClass("row-details-close").removeClass("row-details-open");
				oTable.fnClose(nTr);
			} else {
				/* Open this row */
				$(this).addClass("row-details-open").removeClass("row-details-close");
				oTable.fnOpen(nTr, fnFormatDetails(oTable, nTr), 'details');
			}
		});
	}
	return {
		init : function() {
			if (!jQuery().dataTable) {
				return;
			}
			initTable1();
		}
	};
}();