var chargingStationNameList = [];
var equipmentData = {};
var bootstrapTableOption = {
    url: 'getDiagnosishistoryList',
    queryParams: function(params) {
        return {
            pageNum: params.pageNumber,// 每页要显示的数据条数
            pageSize: params.pageSize,// 每页显示数据的开始行号
            equipmentid: $('#DiagnosisHistoryID').val() && $('#DiagnosisHistoryID').val().replace("ALL", ""),
            chargingstationid: $('#chargingStationID').val(),
        }
    },

    columns: [

        {title: '序号', align: 'center', formatter: 'increases'},

        { field: 'diagnosistime', title: '诊断时间'},
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

        {title: '操作', formatter:function (value, row, index) {
            return ['<a class="update" href="javascript:;" onclick="detailAction(\'' + row.equipmentid +'\''+','+'\''+row.diagnosistime+ '\''+','+'\''+row.equipmentName+'\''+')" data-toggle="tooltip" data-placement="top" title="详情">详情</i></a>' ].join('');
        }
        }

       /* {
         field: 'size',
         title: '操作',
         formatter: 'actionFormatter',
         }*/
    ],
    responseHandler: function (data) {
        equipmentData = data.list;
        return data;
    }
};

$(document).ready(function() {
	$('title', parent.document).html($('title').text());
    $("#DiagnosisHistoryIDDiv").hide();
    getChargingStationName("#chargingStationID");
    setBootstrapTable('#diagnosisHistoryTable', bootstrapTableOption);  //初始化页面table
});

function getChargingStationName(id) {
    changeSelectpicker(id, 'destroy');
    $(id).empty();
    if (chargingStationNameList && chargingStationNameList.length > 0) {
        setChargingStationName(id, chargingStationNameList);
    } else {
        $ajax("getDiagnosisHistoryName", setChargingStationName, '', id, "get");
    }
};
function setChargingStationName(id, data) {
    var length = data.length;
    chargingStationNameList = data;
    for (var i = 0; i < length; i++) {
        $(id).append("<option value ='" + data[i].diagnosisHistoryID + "'>" + data[i].diagnosisHistoryName + "</option>");
    }
    changeSelectpicker(id, 'refresh');
    $(id).selectpicker('setStyle', 'select', 'add');
    if (length > 5) {
        setSelectpicker(id);
    }
};
//获取输入框详情
function getDiagnosisHistoryName(value, id) {
    $ajax("getChargingPileName?chargingstationid=" + value, setEquipmentName, '', id, "get");
};

function setEquipmentName(id, data) {
    var length = data.length;
    $(id).append("<option value='ALL'>全部桩</option>");
    for (var i = 0; i < length; i++) {
        $(id).append("<option value ='" + data[i].equipmentID + "'>" + data[i].equipmentName + "</option>");
    }
    changeSelectpicker(id, 'refresh');
    $(id).selectpicker('setStyle', 'select', 'add');
    if (length > 5) {
        setSelectpicker(id);
    }
};


function change(changeID, linkID, callback) {
    if (changeID && linkID) {
        var changeValue = $(changeID).val();
        $(linkID).empty();
        changeSelectpicker(linkID, 'destroy');
        if (changeValue) {
            $(linkID + "Div").show();
            if (callback && typeof callback === 'function') {
                callback(changeValue, linkID);
            }
        } else {
            $(linkID + "Div").hide();
        }
    }
};

//重置
function searchReset() {
    $("#DiagnosisHistoryID").empty();
    $("#DiagnosisHistoryIDDiv").hide();
    changeSelectpicker('#DiagnosisHistoryID', 'destroy');
    $('#chargingStationID')[0].selectedIndex = 0;
    changeSelectpicker('#chargingStationID', 'refresh');
};
//查询
function search() {
    operateBootstrapTable('#diagnosisHistoryTable', 'selectPage', 1);
}

/*table内部操作*/

// 格式化操作按钮

function detailAction(id, time,name) {

    window.parent.test("goDiagnosisDetail?id=" + id+"&time="+time, 10, name + "充电桩详情");
}