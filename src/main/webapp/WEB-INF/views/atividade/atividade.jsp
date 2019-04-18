<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Atividades</h1>
    </div>
    <div class="card-body text-left">
        <a class="btn btn-primary btn-sm" href="atividade_form.html" role="button"><i class="fa fa-plus"
                aria-hidden="true"></i>
        </a><br /><br />

        <table class="table">
            <tr>
                <th>Sede</th>
                <th>Título</th>
                <th>Descrição</th>
                <th>Data início</th>
                <th>Data fim</th>
                <th>Ações</th>
            </tr>
            <c:forEach items="${atividade}" var="rep">
                <tr>
                    <td>${rep.getSede().getNome_fantasia()}</td>
                    <td>${rep.getTitulo()}</td>
                    <td>${rep.getDescricao()}</td>
                    <td>${rep.getData_inicio()}</td>
                    <td>${rep.getData_fim()}</td>                                     
                    <td>
                        <a class="btn btn-info btn-sm" href="#" role="button">
                            <i class="far fa-edit"></i>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="card-footer text-muted text-right">
        Atividades
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />