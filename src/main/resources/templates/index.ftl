<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<script type="text/javascript" src="../static/js/jquery-1.11.1.min.js" ></script>
	<script type="text/javascript" src="../static/js/jquery.min.js" ></script>
	<script type="text/javascript" src="../static/js/new_file.js" ></script>
	<link rel="stylesheet" href="../static/css/new_file.css" />
	<body>
		
		<!---------头部--------->
		
		<div class="top-1"> 
			
			<div class="logo"></div>
			
			<span class="text-1">航多知识管理系统 - 管理后台</span>
			
			
			<div class="div-dakuang-1">
				<div id="Name"> 
				<p id="nameid" onclick="">[   ]&nbsp账户设置</p>
				</div>
				<div id="stopName">  
				<p id="nameid" onclick="">[   ]&nbsp退出登录</p>
				</div>
				
				
			</div>
			
		</div>
		
		
		<!---------右边--------->
		
		<div class="dakuang-da">
		
		<div class="right-neirong-1">
	    	
	    	<div class="faguiguanli">
	    		<span>法规管理</span>
	    	</div>
	    	
	        <div class="nei-1 name1">
	    		<span>法则列表</span>
	    	</div>
	    	
	    	<div class="nei-1">
	    		<span>新增法则</span>
	    	</div>
	    	
	    	<div class="nei-1">
	    		<span>法规目录管理</span>
	    	</div>
	    	
	    	<div class="nei-1">
	    		<span>条款列表</span>
	    	</div>
	    	
	    	<div class="nei-1"style="margin-bottom: 10px;">
	    		<span>新增条款</span>
	    	</div>
	    	
	    </div> 
	    
	    
	    
	    <div class="right-neirong-2">
	    	
	    	<div class="faguiguanli2">
	    		<span>用户管理</span>
	    	
	    	
	    	</div>
	    	
	    	<div class="nei-1"style="margin-bottom: 10px;">
	    		<span>用户列表</span>
	    	</div>
	    	
	    	
	    	
	    </div> 
	    
	    
	    <div class="right-neirong-3">
	    	
	    	<div class="faguiguanli3">
	    		<span>咨询管理</span>
	    	</div>
	    	
	    	<div class="nei-1"style="margin-bottom: 10px;">
	    		<span>资讯列表</span>
	    	</div>
	    	
	    	
	    	
	    </div> 
	    
	    
	    
	    <div class="right-neirong-4">
	    	
	    	<div class="faguiguanli4">
	    		<span>设置</span>
	    	</div>
	    	
	    	<div class="nei-1">
	    		<span>网站设置</span>
	    	</div>
	    	
	    	<div class="nei-1">
	    		<span>邮件SMTP设置</span>
	    	</div>
	    	
	    	<div class="nei-1">
	    		<span>短信设置</span>
	    	</div>
	    	<div class="nei-1">
	    		<span>管理员管理</span>
	    	</div>
	    	<div class="nei-1"style="margin-bottom: 10px;">
	    		<span>意见反馈列表</span>
	    	</div>
	    	
	    	
	    </div> 
	    
	    <!--------- 中间 ---------->
	   
	    <div class="ssss">
	    
	    <!---------------------法规列表--------------------------->
	     <div class="ssyouyong">
	    
	    <div class="dakuang-1 e">
        
        <span class="text-2">法规管理&nbsp;/&nbsp;法规列表</span>
        <p style="font-size: 20px;margin-left: 10px;margin-top: 25px;">法规列表</p>
        
        <!--------------------下拉菜单------------------------->
        <div style="margin-top: 20px;">
        <span style="font-size: 14px;margin-left: 60px;">法规：</span>
        <select name="statute"style="width: 288px;height: 22px;">
        	<option value="one">请选择</option>
        	<option value="CCAR-21"selected="selected">CCAR-21-R4 民用航空产品和零部件合格审核规定</option>
        	<option value="CCAR-21"selected="selected">CCAR-23-R3 正常类、实用类、特技类、通勤类飞机师航标准</option>
        	<option value="CCAR-21"selected="selected">CCAR-21-R4 民用航空产品和零部件合格审核规定</option>
        	<option value="CCAR-21"selected="selected">CCAR-21-R4 民用航空产品和零部件合格审核规定</option>
        	<option value="CCAR-21"selected="selected">CCAR-21-R4 民用航空产品和零部件合格审核规定</option>
        	<option value="CCAR-21"selected="selected">CCAR-21-R4 民用航空产品和零部件合格审核规定</option>
        </select>
        </div>
        
        
        <!-------------------法制编号----------------------->
        <div style="margin-left: 40px;margin-top: 16px;width: 330px;">
         	<span style="font-size: 14px;">*条款号： </span>
         	<input type="text" name="bianhao" id="bianhao" style="width: 243px;height: 25px;"/>
        </div>
        
         <!-------------------法制名称----------------------->
       
        <div style="margin-left: 40px;margin-top: 20px;width: 330px;position: relative;top: -49px;left: 380px;">
         	<span style="font-size: 14px;">*关键词： </span>
         	<input type="text" name="mingcheng" id="mingcheng" style="width: 243px;height: 25px;"/>
        </div>
        
       
        <!----------------------搜索-----------------------> 
         
           <input style="float: right; border: 1px solid #666;background-color: white; height: 30px; cursor: pointer;  margin-top: -78px;z-index: 99; margin-right: 230px; width: 97px;" type="submit" name="sousuo" id="sousuo" value="搜索" />
       
       
        <!-----------------------查询的东西---------------------------------->
        
        
        <div style="background-color: #eee;margin-top: -40px; height: 630px;overflow: hidden;">
        	
        	<div style="width: 1072px;margin: 0 auto;margin-top: 20px;height: 590px;background-color: white; border: 1px solid #666666;">
        	
        	
        		
        		
        	<!----------------查询------------------->
        	
        	
        	<input type="submit" name="Newly added" id="Newly added" value="新增法规" style="cursor: pointer; width: 140px;height: 40px;border-radius:10px 10px 10px 10px ;background: rgba(22, 155, 213, 1);border: 0px;color: white;float: right;margin-top: 20px;margin-right:20px ;"/>
        		
        		
        		<table style="margin: 80px auto;" border="1px " cellspacing="0px" cellpadding="0px" >
        			<tr><th>条款号</th>
        				<th>条款号别名</th>
        				<th style="padding-left:90px;padding-right:90px ;">条款标题</th>
        				<th style="padding-left:110px;padding-right:110px ;">所属法规名称</th>
        				<th style="padding-left:30px;padding-right:30px ;">前台显示</th>
        				<th style="padding-left:70px;padding-right:70px ;">操作</th>
        			</tr>
        			<tr><td>id</td>
        				<td>name</td>
        				<td>username</td>
        				<td>Data</td>
        				<td>Data</td>
        				<td>
        					<button type="submit"style="margin-left: 10px;  border: 0px;background-color: white;cursor: pointer;">编制</button>
        					<button type="submit"style="margin-left: 50px; border: 0px;background-color: white;cursor: pointer;">删除</button>
        				</td>
        			</tr>
        		</table>
        		
        		
        	</div>
        	
        	
        </div>
        
       
       
	    </div>
	    
	    
	    
	    <div>
	   2 	
	    	
	    </div>
	    
	    <div>
	    3	
	    	
	    </div>
	    
	    <div>
	    4	
	    	
	    </div>
	    
	    <div>
	    5	
	    	
	    </div>
	    
	    <div>
	    6	
	    	
	    </div>
	    
	    <div>
	    7	
	    	
	    </div>
	    
	    <div>
	    8	
	    	
	    </div>
	    
	    <div>
	    9	
	    	
	    </div>
	    
	    <div>
	    10	
	    	
	    </div>
	    
	    <div >
	    11	
	    	
	    </div>
	    
	    <div>
	    12	
	    	
	    </div>
	    
	    </div>
	    </div>
	    
	  </div>		
	    <!--<iframe class="ddaa" src="fazeliebiao.html" width="1000px" height="800px"></iframe>-->
	    
	    
	
	
	</body>
</html>

