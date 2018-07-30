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
        {title: '操作', formatter:function (value, row, index) {
            return ["<div   style='height: 200px; width: auto;background: #1cc09f;'>"+
            "<div style='height: 180px;width: 200px;float:left; background: #802420;'>"+
            "<img src='"+row.smallImages+"' alt='...' class='img-rounded'/>  "+
            " </div>"+
            " <div  style='height: 200px;width: auto; float:left;background: #00a300;'>"+
            "  <div style='height: 50px; width: auto;'>我是头部</div>"+
            "   <div style='height: 100px; width: auto;'>这里已经自适应dddddddddddddddddddddddddddddddd到底部</div>"+
            "    <div style='height: 50px; width: auto;'>"+
            "   <div  style='float: left'>"+
            "       wwwssssssssssssss"+
            "       </div>"+
                "      <div  style='float: right'>"+
                "       wwwrerr"+
                "   </div>"+
                "     </div>"+
                "      </div>"+
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
