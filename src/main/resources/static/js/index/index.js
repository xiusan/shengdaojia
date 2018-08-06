var chargingStationNameList = [];
var equipmentData = {};
var bootstrapTableOption = {
    url: 'getShengDaoJiaList',
    queryParams: function (params) {
        return {
            pageNum: params.pageNumber,// 每页要显示的数据条数
            pageSize: params.pageSize,// 每页显示数据的开始行号
            equipmentID: $('#equipmentID').val() && $('#equipmentID').val().replace("ALL", ""),
            chargingStationID: $('#chargingStationID').val(),
        }
    },
    columns: [ // 显示一个勾选框
        {title: '商品展示页...', formatter:function (value, row, index) {
            return ["<div   style='height: 200px; width: auto;background: #1cc09f;'>"+
                    "<div style='height: 180px;width: 200px;float:left; '>"+
                        "<img src='"+row.smallImages+"' alt='...' class='img-rounded'/>  "+
                    "</div>"+
                    "<div  style='height: 200px;width: 594px; float:left;background: #00a300;'>"+
                    "  <div style='height: 50px; width: auto;'>我是头哈哈哈哈哈哈哈或或水电费付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付付或或或或或或或或部</div>"+
                    "   <div style='height: 100px; width: auto;'>这里已经自适应 到底部</div>"+
                    "<div style='height: 50px; width: auto;'>"+
                        " <div  style='float: left'>"+
                        "硕大的撒所大所多撒"+
                        " </div>"+
                        "<div  style='float: right'>"+
                        "       奥术大师大所多所"+
                        "</div>"+
                    "</div>"+
                    "</div>"+
                    "</div>"].join('');
          }






        }
    ],
    responseHandler: function (data) {
        equipmentData = data.list;
        return data;
    }
};

$(document).ready(function() {
    setBootstrapTable('#shengdaojiaTable', bootstrapTableOption);
});

function search() {
    operateBootstrapTable('#equipmentTable', 'selectPage', 1);
}
