$(function() {

	var $tb_departments = $('#tb_departments');
	$tb_departments.bootstrapTable({
		url: 'faultFile/getFaultFilesByDiagnosishistory',
		queryParams: function(params) {
			return {
				offset: params.offset,
				limit: params.limit,
				e_id: $('#equipment').find("option:selected").attr('id'),
				c_id: $('#chargingstation').find("option:selected").attr('id'),
			}
		},

		columns: [

		{

			title: '序号',
			formatter: 'IndexFormatter'
		},

		{
			field: 'diagnosistime',
			title: '诊断时间',
			formatter: DateFormatter
		},
		{
			field: 'diagnosismethod',
			title: '诊断方法'
		},
		{
			field: 'chargingstationName',
			title: '充电站'
		},
		{
			field: 'equipmentName',
			title: '充电桩'
		},
		{
			field: 'diagnosisstatus',
			title: '诊断结果',
			formatter: function(value, row, index) {

				if (value == 0) {

					return "正常"

				} else if (value == 1) {

					return "故障";

				} else  {

					return "-";

				}
			}

		},

		{
        				field: 'size',
        				title: '操作',
        				formatter: 'actionFormatter',


        }

		],
		paginationLoop: false,
		//设置为 true 启用分页条无限循环的功能
		striped: true,
		pagination: true,
		sidePagination: 'server',
		pageSize: 10,
		pageList: [5, 10, 25, 50, 100],
		paginationPreText: "上一页",
		paginationNextText: "下一页",

	});

})

// 格式化操作按钮
function actionFormatter(value, row, index) {
return ['<a class="update" href="javascript:;" onclick="detailAction(\'' + row.equipmentid +'\''+','+'\''+row.diagnosistime+ '\''+','+'\''+row.equipmentName+'\''+')" data-toggle="tooltip" data-placement="top" title="详情">详情</i></a>' ].join('');
}

function detailAction(id, time,name) {

	window.parent.test("goDiagnosisDetail?id=" + id+"&time="+time, 10, name + "充电桩详情");
}