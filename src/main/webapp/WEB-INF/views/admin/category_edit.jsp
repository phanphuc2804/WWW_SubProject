<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Sửa ${title}</title>
<body>
	<div class="ts-main-content">
		<%@include file="/WEB-INF/views/layouts_master/admin/admin_menu.jsp"%>
		<div class="content-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12">
						<h2 class="page-title">Sửa ${title}</h2>
						<div class="row">
							<div class="col-md-1"></div>
							<div class="col-md-10">
								<div class="panel panel-default">
									<div class="panel-heading">Sửa ${title}</div>
									<div class="panel-body">
										<form:form method="POST" action="edit" modelAttribute="category" class="form-horizontal">
											<div class="form-group">
												<label class="col-sm-2 control-label">Mã Danh Mục:</label>
												<div class="col-sm-10">
													<form:input readonly="true" value="${categoryInDB.categoryID}" path="categoryID" placeholder="Mã Danh Mục" class="form-control"/>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">Tên Danh Mục:</label>
												<div class="col-sm-10">
													<form:input path="categoryName" value="${categoryInDB.categoryName}" placeholder="Tên Danh Mục" class="form-control"/>
													<form:errors path="categoryName" cssClass="text-danger" htmlEscape="false"/>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-8 col-sm-offset-2">
													<button class="btn btn-primary" type="submit" style="font-size: 14px">CẬP NHẬT</button>
												</div>
											</div>
										</form:form>

									</div>
								</div>
							</div>
							<div class="col-md-1"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

