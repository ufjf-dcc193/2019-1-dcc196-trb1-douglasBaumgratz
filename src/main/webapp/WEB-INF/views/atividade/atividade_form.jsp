<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Atividades</h1>
    </div>
    <div class="card-body text-left">
        <form class="text-left" method="POST">
            <label>Sede:</label>
            <select name="sede" class="form-control form-group">
                <option value="">...</option>
                <c:forEach var="rep" items="${sede}">
                    <option value="${rep.getNome_fantasia()}">
                        ${rep.getNome_fantasia()}
                    </option>
                </c:forEach>
            </select>
            <label>Título:</label>
            <input type="text" name="titulo" class="form-control form-group">
            <label>Descrição:</label>
            <input type="text" name="descricao" class="form-control form-group">
            <label>Data início:</label>
            <input name="data_inicio" type="text" class="form-control form-group datepicker">
            <label>Data fim:</label>
            <input name="data_fim" type="text" class="form-control form-group datepicker">
            <div class="text-right"><br />
                <button type="submit" class="btn btn-primary btm-sm">OK</button>
                <a class="btn btn-danger" href="atividade.html">Cancelar</a>
            </div>
        </form>
    </div>
    <div class="card-footer text-muted text-right">
        Atividades
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />