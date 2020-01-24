<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/right.css" />
<title></title>
</head>
<body>
<!-- 右侧边栏START -->
<div class="right text-left">
                <aside class="widget tag-cloud">
                    <h3 class="widget-title">标签 <span>分类</span></h3>
                    <a href="#" class="tags">文学类</a>
                    <a href="#" class="tags">教育类</a>
                    <a href="#" class="tags">名著类</a>
                    <a href="#" class="tags">小说类</a>
                    <a href="#" class="tags">散文诗集</a>
                    <a href="#" class="tags">漫画类</a>
                    <a href="#" class="tags">少儿类</a>
                    <a href="#" class="tags">幼儿类</a>
                    <a href="#" class="tags">报刊杂志</a>
                </aside>
                <aside class="widget">
                    <h3 class="widget-title">图书 <span>推荐</span></h3>
                    
                    <article class="widget-post">
                        <h5>《明朝那些事儿》</h5><br>
                        <a href="detail.action?bookid=7">本书对明朝十七帝和其他王公权贵和小人物的命运进行全景展示，尤其对官场政治、战争、帝王心术着墨最多，并加入对当时政治经济制度、人伦道德的演义。</a>
                    </article>
                    <article class="widget-post">
                        <h5>《你是人间四月天》</h5><br>
                        <a href="detail.action?bookid=29">《你是人间四月天》收录了林徽因几乎所有的诗歌、散文、小说。</a>
                    </article>
                    <article class="widget-post">
                        <h5>《傅雷家书》</h5><br>
                        <a href="detail.action?bookid=40">本书以最小最精之篇幅反映《傅雷家书》全貌，再现傅氏兄弟成长的家教背景，全面展示傅雷家风。</a>
                    </article>
                    <article class="widget-post">
                        <img src="images/header/turn_book.gif" style="width: 200px;height:130px;margin-top: 30px;margin-bottom: 30px;"/>
                        <a href="detail.jsp">其他好书推荐~</a>
                    </article>
                </aside>
            
</div>
			<!-- 右侧边栏END -->
<%-- 
	<div class="right_box">
	
		<div class="title"><span class="title_icon"><img src="images/bullet4.gif"/></span>优惠促销</div>
		
		<s:iterator var="special" value="saleList">
			<div class="new_prod_box"> <a href="detail.action?bookid=${id}">${name}</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="images/promo_icon.gif"/></span> 
					<a href="detail.action?bookid=${id}"><img src="../${cover}" class="thumb" border="0" /></a>
				</div>
			</div>
		</s:iterator>

	</div>


	<div class="right_box">
	
		<div class="title"><span class="title_icon"><img src="images/bullet5.gif"/></span>图书分类</div>
		<ul class="list">
			<s:iterator var="category" value="categoryList">
				<li><a href="category.action?categoryid=<s:property value="id"/>"><s:property value="name"/></a></li>
			</s:iterator>
		</ul>
		
	</div>
</div>--%>
    
</body>
</html>